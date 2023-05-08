package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LocationStep {



	PageObjectManager locPom = new PageObjectManager();


	@When("User should click Location on Master")
	public void userShouldClickLocationOnMaster() {

		locPom.getLocationPage().location();

	}

	@Then("User should verify the Location list page and title of  {string}")
	public void userShouldVerifyTheLocationListPageAndTitleOf(String string) {
		String verifyLocation = locPom.getLocationPage().verifyLocation();
		assertEquals(verifyLocation, string);
	}

	/**
	 * @FASLocMTC-03
	 */

	@When("User should  click on the parent Location  and its should show all the list of child Location")
	public void userShouldClickOnTheParentLocationAndItsShouldShowAllTheListOfChildLocation() {

		locPom.getLocationPage().parentIconClick();

	}

	/**
	 * @FASLocMTC-04
	 * 
	 */
	@When("User should  click on the Location and its details of Location")
	public void userShouldClickOnTheLocationAndItsDetailsOfLocation() {

		locPom.getLocationPage().parentClick();

	}


	/**
	 * 
	 * @FASLocMTC-06
	 */

	@When("User should  click on the close icon and its should close the Parent location directory")
	public void userShouldClickOnTheCloseIconAndItsShouldCloseTheParentLocationDirectory() {

		try {

			locPom.getLocationPage().returnParentIconClick();
		} catch (Exception e) {
			System.out.println("catch at @FASLocMTC-06");
		}


	}

	//@FASLocMTC-07

	@When("User should  type the Location on  {string} , it should show the Location on the tree structure")
	public void userShouldTypeTheLocationOnItShouldShowTheLocationOnTheTreeStructure(String string) {

		locPom.getLocationPage().searchLocation(string);
	}

	//FASLocMTC-08
	@When("User should  type the incorrect Location on  {string} and show location should blank")
	public void userShouldTypeTheIncorrectLocationOnAndShowLocationShouldBlank(String string) {

		locPom.getLocationPage().inCorrectSearchLocation(string);
	}

	//FASLocMTC-09
	@When("User should  type the Location on  {string}, After removing the location name on search and show all location on the tree structure")
	public void userShouldTypeTheLocationOnAfterRemovingTheLocationNameOnSearchAndShowAllLocationOnTheTreeStructure(String string) {

		locPom.getLocationPage().removeSearchText(string);

	}


	//@FASLocMTC-17
	@When("User should click parent Location,then click create and fill the details {string} and {string}")
	public void userShouldClickParentLocationThenClickCreateAndFillTheDetailsAnd(String string, String string2) throws Exception{

		locPom.getLocationPage().creatChildLocation(string, string2);
	}

	@Then("User should verify the created child Location is present or not")
	public void userShouldVerifyTheCreatedChildLocationIsPresentOrNot() throws Exception{

		String verifyCreateLocationText = locPom.getLocationPage().verifyCreateLocationText();
		//locPom.getLocationPage().alertMessageGet(verifyCreateLocationText);
		//locPom.getLocationPage().getAlertOkButton();


	}

	//@FASLocMTC-19

	@When("User should click parent Location,then click create and not any fill the details")
	public void userShouldClickParentLocationThenClickCreateAndNotAnyFillTheDetails() {

		locPom.getLocationPage().nullLocationCreate();

	}
	@Then("User should verify Location page error messege of {string} and {string}")
	public void userShouldVerifyLocationPageErrorMessegeOfAnd(String string, String string2) {

		String errLocationMsg = locPom.getLocationPage().errLocationMsg();
		assertEquals(string, errLocationMsg);

		String errDescriptionMsg = locPom.getLocationPage().errDescriptionMsg();
		assertEquals(string2, errDescriptionMsg);
	}

	/**
	 * @FASLocMTC-20
	 * @param string
	 */

	@Then("User should verify Success alert {string}")
	public void userShouldVerifySuccessAlert(String string) {


		try {

			String verifyCreateLocationText = locPom.getLocationPage().verifyCreateLocationText();

			assertEquals(string, verifyCreateLocationText, "@FASLocMTC-20");
		} catch (Exception e) {

		}

	}




	/**
	 * FASLocMTC-22
	 * 
	 * 	
	 * @param string
	 */

	@When("User should click create and fill only the details {string}")
	public void userShouldClickCreateAndFillOnlyTheDetails(String string) {


		locPom.getLocationPage().onlyDescription(string);
	}

	@Then("User should verify Location error messege of {string}")
	public void userShouldVerifyLocationErrorMessegeOf(String string) {

		try {

			String errLocationMsg = locPom.getLocationPage().errLocationMsg();
			assertEquals(string, errLocationMsg, "FASLocMTC-22");
		} catch (Exception e) {
			System.out.println("@FASLocMTC-23");
		}
	}	


	/**
	 * 
	 * @FASLocMTC-24
	 */


	@Then("User should verify error Alert")
	public void userShouldVerifyErrorAlert() {

		try {
			String verifyCreateLocationText = locPom.getLocationPage().verifyCreateLocationText();
			locPom.getLocationPage().alertMessageGet(verifyCreateLocationText);


		} catch (Exception e) {
			System.out.println("LocationStep.userShouldVerifyErrorAlert()"+"="+"@FASLocMTC-24");
		}

	}

	/**
	 * 
	 * 26
	 */
	@Then("User should verify that enter Location code value in field is {string} without any additional value")
	public void userShouldVerifyThatEnterLocationCodeValueInFieldIsWithoutAnyAdditionalValue(String string) {


		String textLocationCode = locPom.getLocationPage().getTextLocationCode();
		assertEquals(string, textLocationCode, "FASLocMTC-26");

	}



	/**
	 * 28
	 * @param string
	 */


	@When("User should click parent Location,then click create and fill the details {string}")
	public void userShouldClickParentLocationThenClickCreateAndFillTheDetails(String string) {
		locPom.getLocationPage().onlyLocationCode(string);


	}

	@Then("User should verify Description error messege of {string}")
	public void userShouldVerifyDescriptionErrorMessegeOf(String string) {

		String textDescription = locPom.getLocationPage().getErrorDescription();
		assertEquals(textDescription, string, "FASLocMTC-26");


	}

	/*
	 * @FASLocMTC-29
	 * 
	 */

	@When("User should create the Location with minimum one letter description {string} and {string}")
	public void userShouldCreateTheLocationWithMinimumOneLetterDescriptionAnd(String string, String string2) {

		locPom.getLocationPage().minimumOneLetter(string, string2);



	}

	@Then("User should verify that enter Location code  and Description value in field is same {string} and {string}")
	public void userShouldVerifyThatEnterLocationCodeAndDescriptionValueInFieldIsSameAnd(String string, String string2) {

		String textLocationCode = locPom.getLocationPage().getTextLocationCode();
		assertEquals(string, textLocationCode, "FASLocMTC-29");

		String textDescription = locPom.getLocationPage().getTextDescription();

		System.err.println(textLocationCode+"=FASLocMTC-29+"+textDescription);

		assertEquals(string2, textDescription, "FASLocMTC-29");

	}


	/**
	 * 
	 *  @FASLocMTC-30
	 */


	@When("User should create the Location code with alphanumeric {string} and {string}")
	public void userShouldCreateTheLocationCodeWithAlphanumericAnd(String string, String string2) {

		locPom.getLocationPage().minimumOneLetter(string, string2);

	}

	@Then("User should verify that enter Location code in field is same {string} and {string}")
	public void userShouldVerifyThatEnterLocationCodeInFieldIsSameAnd(String string, String string2) {

		String textLocationCode = locPom.getLocationPage().getTextLocationCode();
		assertEquals(string, textLocationCode, "FASLocMTC-29");

		String textDescription = locPom.getLocationPage().getTextDescription();

		System.err.println(textLocationCode+"=FASLocMTC-29+"+textDescription);

		assertEquals(string2, textDescription, "FASLocMTC-30");

	}

	//@@FASLocMTC-31
	@When("User should create the Location code with special characters {string} and {string}")
	public void userShouldCreateTheLocationCodeWithSpecialCharactersAnd(String string, String string2) {
		locPom.getLocationPage().specialCharacters(string, string2);

	}

	@Then("User should verify that enter Location code in field is same  {string}")
	public void userShouldVerifyThatEnterLocationCodeInFieldIsSame(String string) {

		String textDescription = locPom.getLocationPage().getTextDescription();

		System.err.println(textDescription+"=FASLocMTC-31="+textDescription);

		assertEquals(string, textDescription, "FASLocMTC-31");


	}
	/**
	 * @FASLocMTC-32
	 * @param string
	 */

	@When("User should  type the Location on  {string} and  Check last modify date and last modify by are blank")
	public void userShouldTypeTheLocationOnAndCheckLastModifyDateAndLastModifyByAreBlank(String string) {

		locPom.getLocationPage().lastModify(string);

	}


	/**
	 * @FASLocMTC-33
	 * 
	 */

	@When("User should create the Location code with {string} and {string}")
	public void userShouldCreateTheLocationCodeWithAnd(String string, String string2) {


		locPom.getLocationPage().childCategoryEdit(string, string2);

	}

	/**
	 * 
	 * @param string
	 * @param string2
	 */


	@When("User should update the Location code with {string} and {string}")
	public void userShouldUpdateTheLocationCodeWithAnd(String string, String string2) {

		locPom.getLocationPage().childCategoryEdit(string, string2);


	}

	@When("User should  type the Location on  {string} and  Check last modify date and last modify")
	public void userShouldTypeTheLocationOnAndCheckLastModifyDateAndLastModify(String string) {

		locPom.getLocationPage().lastModify(string);

	}

	/**
	 * Location Audit Log
	 * @param string
	 */

	@When("User should  type the Location on  {string} and click Location audit log on next tab")
	public void userShouldTypeTheLocationOnAndClickLocationAuditLogOnNextTab(String string) {


		locPom.getLocationPage().searchLocationAndClick(string);
	}






	@Then("User should click edit and click cancel button")
	public void userShouldClickEditAndClickCancelButton() {
		locPom.getLocationPage().editAndCancel();

	}
	/**
	 * 
	 * FASLocMTC-38
	 * @param string
	 */


	@When("User should  type the Location on  {string} and click delete")
	public void userShouldTypeTheLocationOnAndClickDelete(String string) {

		try {

			locPom.getLocationPage().deleteLocation(string);
		} catch (Exception e) {
			System.out.println("catch at FASLocMTC-38");
		}

	}

	@Then("User should verify delete messege of {string}")
	public void userShouldVerifyDeleteMessegeOf(String string) {

		String deleteText = locPom.getLocationPage().deleteText();
		assertEquals(string, deleteText);

	}

	/*
	 * 39
	 * 
	 * 
	 */
	@When("User should click the parent location and try to delete the location")
	public void userShouldClickTheParentLocationAndTryToDeleteTheLocation() {


		locPom.getLocationPage().parentDelete();

	}

	@Then("User should verify reference messege of {string}")
	public void userShouldVerifyReferenceMessegeOf(String string) {

		String referenceText = locPom.getLocationPage().referenceText();
		assertEquals(string, referenceText, "39");

	}
	
	/**
	 * 40
	 * 
	 */

	@When("User should click the parent location and click view")
	public void userShouldClickTheParentLocationAndClickView() {

locPom.getLocationPage().parentClick();

	}

	@Then("User should verify the field {string}")
	public void userShouldVerifyTheField(String string) {

String verifyView = locPom.getLocationPage().verifyView();
assertEquals(string, verifyView, "40");

	}




















}
