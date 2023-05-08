package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ParentChildAssetStep {

	PageObjectManager parentChildPOM = new PageObjectManager();
	
	@When("User should click Parent and Child  Asset on Master")
	public void userShouldClickParentAndChildAssetOnMaster() {
	   parentChildPOM.getParentChildAssetPage().parentChildAssetClick();
		
	}

	@Then("User should verify the Parent and Child  Asset list page and title of  {string}")
	public void userShouldVerifyTheParentAndChildAssetListPageAndTitleOf(String string) {
	 
		String verifyParentChildAssetTitle = parentChildPOM.getParentChildAssetPage().verifyParentChildAssetTitle();
		System.out.println(verifyParentChildAssetTitle+"=="+string);
		assertEquals(verifyParentChildAssetTitle, string);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
