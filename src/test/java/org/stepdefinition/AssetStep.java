package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssetStep {
	
	PageObjectManager pomAsset = new PageObjectManager();
	
	
	@When("User should click Asset on Master")
	public void userShouldClickAssetOnMaster() throws InterruptedException {
	   
		pomAsset.getAssetPage().assetClick();
		
	}

	@Then("User should verify the Asset list page and title of  {string}")
	public void userShouldVerifyTheAssetListPageAndTitleOf(String string) {
	  String verifyAssetTitle = pomAsset.getAssetPage().verifyAssetTitle();
	  assertEquals(string, verifyAssetTitle);
		
		
	}

	

}
