package com.GrocerStore.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PlaceOrderPage {

	AndroidDriver driver;
	public PlaceOrderPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/back")
	private WebElement back;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/place_order")
	private WebElement placeOrderBtn;
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getBack() {
		return back;
	}

	public WebElement getPlaceOrderBtn() {
		return placeOrderBtn;
	}
	
}
