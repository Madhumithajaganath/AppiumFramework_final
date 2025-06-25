package com.GroceryStore;

import static org.testng.Assert.assertFalse;

import org.testng.annotations.Test;

import com.GrocerStore.objectRepo.CartPage;
import com.GrocerStore.objectRepo.CheckOutPage;
import com.GrocerStore.objectRepo.HomePage;
import com.GrocerStore.objectRepo.OrderConfirmationPage;
import com.GrocerStore.objectRepo.PaymentPage;
import com.GrocerStore.objectRepo.PlaceOrderPage;
import com.GrocerStore.objectRepo.ProductDetailPage;
import com.GrocerStore.objectRepo.ProductsPage;

import Utilities.AndroidUtility;
import Utilities.BaseClass;
import Utilities.GestureUtility;

public class AddToCart extends BaseClass{

	@Test
	public void addToCart() throws Exception {
		hp = new HomePage(driver);
		prdp = new ProductsPage(driver);
		pdp = new ProductDetailPage(driver);
		cp = new CartPage(driver);
		cop = new CheckOutPage(driver);
		andUtil = new AndroidUtility(driver);
		
		andUtil.implicitWait(20);
		hp.getShopNow().click();
		assertFalse(false);
		hp.getCartBtn().click();
		cp.getBackBtn().click();
		
	}
}
