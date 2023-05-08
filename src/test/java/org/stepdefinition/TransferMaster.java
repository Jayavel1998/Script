package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TransferMaster {

	PageObjectManager transPOM = new PageObjectManager();
			
	@When("User should click Transfer Type on Master")
	public void userShouldClickTransferTypeOnMaster() {
	   transPOM.getTransferMaster().transferMaster();
	}

	@Then("User should verify the Transfer Type list page and title of  {string}")
	public void userShouldVerifyTheTransferTypeListPageAndTitleOf(String string) {
	 
		String verifyTransfer = transPOM.getTransferMaster().verifyTransfer();
		assertEquals(verifyTransfer, string);;
	}
	
	
	
	
	
	
}
