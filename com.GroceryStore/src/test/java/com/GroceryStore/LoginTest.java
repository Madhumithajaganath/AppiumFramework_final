package com.GroceryStore;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.GrocerStore.objectRepo.LoginPage;
import com.GrocerStore.objectRepo.WelcomePage;

import Utilities.BaseClass;

public class LoginTest extends BaseClass{

	@Test
	public void loginTest() throws Exception {
		wp = new WelcomePage(driver);
		lp = new LoginPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(wp.getSkipbtn()));
		wp.getSkipbtn().click();
		lp.login();
	}
}
