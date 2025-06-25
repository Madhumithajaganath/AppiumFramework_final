package com.GrocerStore.objectRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PaymentPage {

	AndroidDriver driver;
	public PaymentPage(AndroidDriver driver) {
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/cash")
	private WebElement cash;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/card")
	private WebElement card;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/netBanking")
	private WebElement netBanking;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/pay_button")
	private WebElement paymentBtn;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/mock_cards_toggle")
	private WebElement mockCards;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/card_number")
	private WebElement cardNo;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/card_expiry")
	private WebElement expDate;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/card_cvv")
	private WebElement cvv;
	
	@AndroidFindBy(id = "com.frontendsource.grocerystore:id/mock_cards_button")
	private WebElement predefinedCards;
	public AndroidDriver getDriver() {
		return driver;
	}

	public WebElement getCash() {
		return cash;
	}

	public WebElement getCard() {
		return card;
	}

	public WebElement getNetBanking() {
		return netBanking;
	}

	public WebElement getPaymentBtn() {
		return paymentBtn;
	}

	public WebElement getMockCards() {
		return mockCards;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getExpDate() {
		return expDate;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getPredefinedCards() {
		return predefinedCards;
	}
	
}
