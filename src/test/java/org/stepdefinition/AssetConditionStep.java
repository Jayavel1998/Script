package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AssetConditionStep {

	PageObjectManager conditionPOM = new PageObjectManager();
	
	@When("User should click Asset Condition on Master")
	public void userShouldClickAssetConditionOnMaster() {
	  conditionPOM.getAssetCondition().conditionClick();
		
	}

	@Then("User should verify the Asset Condition list page and title of  {string}")
	public void userShouldVerifyTheAssetConditionListPageAndTitleOf(String string) {
	   
		String verifyAssetConditionTitle = conditionPOM.getAssetCondition().verifyAssetConditionTitle();
		assertEquals(verifyAssetConditionTitle, string);
	}

}
