package com.GroceryStore;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.GrocerStore.objectRepo.HomePage;
import com.GrocerStore.objectRepo.ProductDetailPage;

import Utilities.AndroidUtility;
import Utilities.BaseClass;
import io.appium.java_client.android.nativekey.AndroidKey;

@Listeners(Utilities.ListernerImplementation.class)
public class SearchProductTest extends BaseClass{

	@Test
	public void searchProduct() throws Exception {
		hp = new HomePage(driver);
		pdp = new ProductDetailPage(driver);
		andUtil = new AndroidUtility(driver);
		hp.getSearchBtn().click();
		hp.getSearchField().sendKeys("tomato");
		andUtil.searchAction();
//		hp.getProdSuggestion().click();
		String productName = pdp.getProdName().getText();
		pdp.getBackBtn();
		hp.getClearbtn().click();
		
	}
}
