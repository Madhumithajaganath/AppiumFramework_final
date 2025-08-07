package Utilities;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import com.GrocerStore.objectRepo.CartPage;
import com.GrocerStore.objectRepo.CheckOutPage;
import com.GrocerStore.objectRepo.HomePage;
import com.GrocerStore.objectRepo.LoginPage;
import com.GrocerStore.objectRepo.NavigationDrawerPage;
import com.GrocerStore.objectRepo.OTPPage;
import com.GrocerStore.objectRepo.OrderConfirmationPage;
import com.GrocerStore.objectRepo.PaymentPage;
import com.GrocerStore.objectRepo.PlaceOrderPage;
import com.GrocerStore.objectRepo.ProductDetailPage;
import com.GrocerStore.objectRepo.ProductsPage;
import com.GrocerStore.objectRepo.SearchPage;
import com.GrocerStore.objectRepo.SignUpPage;
import com.GrocerStore.objectRepo.WelcomePage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public AppiumDriverLocalService service;
	public AndroidDriver driver;
	static public AndroidDriver sdriver;
	public CartPage cp;
	public CheckOutPage cop;
	public HomePage hp;
	public LoginPage lp;
	public NavigationDrawerPage ndp;
	public OrderConfirmationPage ocp;
	public OTPPage otp;
	public PaymentPage pp;
	public PlaceOrderPage pop;
	public ProductDetailPage pdp;
	public ProductsPage prdp;
	public SearchPage sp;
	public SignUpPage sup;
	public WelcomePage wp;
	public ExcelUtility exUtil;
	public AndroidUtility andUtil;
	public GestureUtility gUtil;
	public FileUtility fUtil = new FileUtility(); 
	@Parameters({"deviceName, UDID"})
	@BeforeSuite(groups = {"smoke","regression"})
	public void startServer() {
		
		File f = new File("C:\\Users\\User\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		service = new AppiumServiceBuilder().
		withAppiumJS(f).withIPAddress("127.0.0.1").usingAnyFreePort().
		withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
	}
	
	@BeforeClass(groups = {"smoke","regression"})
	public void launchApp(String deviceName, String UDID, int port) throws IOException {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", fUtil.dataFromPropertiesFile("platformName"));
		dc.setCapability("automationName", fUtil.dataFromPropertiesFile("automationName"));
//		dc.setCapability("deviceName", fUtil.dataFromPropertiesFile("deviceName"));
//		dc.setCapability("Udid", fUtil.dataFromPropertiesFile("udid"));
		dc.setCapability("udid",UDID );
		dc.setCapability("deviceName",deviceName );

		dc.setCapability("appPackage", fUtil.dataFromPropertiesFile("appPackage"));
		dc.setCapability("appActivity", fUtil.dataFromPropertiesFile("appActivity"));
		
		driver = new AndroidDriver(new URL("http://localhost:4723"),dc);
		sdriver=driver;
		UtilityClassObject.setDriver(driver);
//		UiAutomator2Options op = new UiAutomator2Options();
	}
	
	@BeforeMethod(groups = {"smoke","regression"})
	public void login() throws EncryptedDocumentException, IOException, InterruptedException {
		wp = new WelcomePage(driver);
		Thread.sleep(5000);
		lp = new LoginPage(driver);
		andUtil = new AndroidUtility(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//		wait.until(ExpectedConditions.elementToBeClickable(wp.getSkipbtn()));
//		wp.getSkipbtn().click();
		lp.login();
		String actResult=andUtil.toast();
		String expResult = "Login Successfully";
		
		assertEquals(actResult, expResult);
	}
	
	@AfterMethod(groups = {"smoke","regression"})
	public void logout() throws InterruptedException {
		Thread.sleep(5000);
		hp = new HomePage(driver);
		ndp = new NavigationDrawerPage(driver);
		hp.getHamBurgerBtn().click();
		Thread.sleep(3000);
		ndp.getLogoutBtn().click();
		
	}
	
	@AfterClass(groups = {"smoke","regression"})
	public void closeApp() throws IOException {
		andUtil = new AndroidUtility(driver);
		andUtil.closeApp(fUtil.dataFromPropertiesFile("appPackage"));
//		driver.terminateApp("com.frontendsource.grocerystore");
	}
	
	@AfterSuite(groups = {"smoke","regression"})
	public void stopServer() {
		service.stop();
	}

}
