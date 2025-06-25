package com.GroceryStore;

import org.testng.annotations.Test;

import com.GrocerStore.objectRepo.CartPage;
import com.GrocerStore.objectRepo.CheckOutPage;
import com.GrocerStore.objectRepo.HomePage;
import com.GrocerStore.objectRepo.OrderConfirmationPage;
import com.GrocerStore.objectRepo.PaymentPage;
import com.GrocerStore.objectRepo.PlaceOrderPage;
import com.GrocerStore.objectRepo.ProductDetailPage;
import com.GrocerStore.objectRepo.ProductsPage;

import Utilities.BaseClass;
import Utilities.GestureUtility;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AddProdTest extends BaseClass{

	@Test
	public void addProdToCartTest() throws Exception {
		Thread.sleep(2000);
		hp = new HomePage(driver);
		prdp = new ProductsPage(driver);
		pdp = new ProductDetailPage(driver);
		cp = new CartPage(driver);
		cop = new CheckOutPage(driver);
		gUtil = new GestureUtility(driver);
		pp = new PaymentPage(driver);
		pop = new PlaceOrderPage(driver);
		ocp = new OrderConfirmationPage(driver);
		Thread.sleep(2000);
		hp.getVegetable().click();
		prdp.getCabbage().click();
		gUtil.scrollByText("Add to cart").click();
		pdp.getCartBtn().click();
		cp.getCheckOut().click();
		cop.getEmail().sendKeys("adb@gmail.com");
		cop.getAddress().sendKeys("katriguppe");
		cop.getPincode().sendKeys("123456");
		cop.getSaveAddressBtn().click();
		pp.getCard().click();
		pp.getPredefinedCards().click();
		pp.getPaymentBtn().click();
		pop.getPlaceOrderBtn().click();
		System.out.println(ocp.getOrderPlacedText().getText());
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
	}
}
