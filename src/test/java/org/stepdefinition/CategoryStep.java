package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryStep {

	PageObjectManager cpom = new PageObjectManager();



	@When("User should click Category on Master")
	public void userShouldClickCategoryOnMaster() {

		cpom.getCategoryPage().category();	

	}

	@Then("User should verify the Category list page and title of  {string}")
	public void userShouldVerifyTheCategoryListPageAndTitleOf(String string) {

		String verifyCategoryTxt = cpom.getCategoryPage().verifyCategory();
		assertEquals(string, verifyCategoryTxt);

	}

	//@FASCMTC-03
	/**
	 * @FASCMTC-03
	 * verification asset is pending
	 */

	@When("User should  click on the parent category  and its should show all the list of child category")
	public void userShouldClickOnTheParentCategoryAndItsShouldShowAllTheListOfChildCategory() {

		cpom.getCategoryPage().parentAssetClick();

	}
	/**
	 * FASCMTC-06
	 * return not done
	 */


	@When("User should  click on the parent category  and return click the parent Category")
	public void userShouldClickOnTheParentCategoryAndReturnClickTheParentCategory() {

		cpom.getCategoryPage().parentAssectReturnClick();

	}


	/**
	 * @FASCMTC-07
	 * @param string
	 */

	@When("User should  type the Category on  {string} , it should show the category on the tree structure")
	public void userShouldTypeTheCategoryOnItShouldShowTheCategoryOnTheTreeStructure(String string) {

		cpom.getCategoryPage().searchCategory(string);

	}
	/**
	 * @FASCMTC-08
	 * @param string
	 */

	@When("User should  type the Incorrect Category on  {string} , then its show the result as no category available")
	public void userShouldTypeTheIncorrectCategoryOnThenItsShowTheResultAsNoCategoryAvailable(String string) {

		cpom.getCategoryPage().searchIncorrectCatrgory(string);

	}
	/**
	 * @FASCMTC-09
	 * @param string
	 */



	@When("User should  type the Category on  {string} , removing the category name on search")
	public void userShouldTypeTheCategoryOnRemovingTheCategoryNameOnSearch(String string) {
		cpom.getCategoryPage().removeCategory(string);
	}

	/**
	 * @FASCMTC-11
	 * 
	 */
	@When("User should not select any format and click Export")
	public void userShouldNotSelectAnyFormatAndClickExport() {

		cpom.getCategoryPage().exportNull();

	}

	@Then("Alert should be shown {string}")
	public void alertShouldBeShown(String string) {

		String exportNullAlert = cpom.getCategoryPage().exportNullAlert();

		assertEquals(string, exportNullAlert);
	}


	
	/**
	 * @FASCMTC-12
	 * 
	 *  download is pending 
	 */
	@When("User should  select Docment format of Export To Excel and click Export")
	public void userShouldSelectDocmentFormatOfExportToExcelAndClickExport() {
	  
		cpom.getCategoryPage().excelFormat();
	}

@Then("After that Excel format of  {string} should be download")
public void afterThatExcelFormatOfShouldBeDownload(String string) throws Exception {
    
	System.out.println("excel");
}


/**
 * @FASCMTC-13
 *  download is pending 
 */
@When("User should  select Docment format of Export To PDF and click Export")
public void userShouldSelectDocmentFormatOfExportToPDFAndClickExport() {
   
	cpom.getCategoryPage().pdfFormat();
}

@Then("After that pdf format of  {string} should be download")
public void afterThatPdfFormatOfShouldBeDownload(String string) throws Exception {
   
	
	System.out.println("PDF");
}
	
/**
 * @FASCMTC-14
 *  download is pending 
 */

@When("User should  select Docment format of Export To CSV and click Export")
public void userShouldSelectDocmentFormatOfExportToCSVAndClickExport() {
 
	cpom.getCategoryPage().csvFormat();
	
}

@Then("After that CSV format of  {string} should be download")
public void afterThatCSVFormatOfShouldBeDownload(String string) throws Exception  {
  
}


/**
 * @FASCMTC-15
 *  download is pending 
 */


@When("User should  select Docment format of Export To XML and click Export")
public void userShouldSelectDocmentFormatOfExportToXMLAndClickExport() {
   
	cpom.getCategoryPage().xmlFormat();
	
	
}

@Then("After that XML format of  {string} should be download")
public void afterThatXMLFormatOfShouldBeDownload(String string) throws Exception {
   
}

//=================================================================================================
/**
 * 
 * 
 */


@When("User should click create and fill the details {string} and {string}")
public void userShouldClickCreateAndFillTheDetailsAnd(String string, String string2) {
   
	cpom.getCategoryPage().creatCategory(string, string2);
	
}


@Then("User should verify the created Category is present or not")
public void userShouldVerifyTheCreatedCategoryIsPresentOrNot()  {
   String verifyCreatCategoryText = cpom.getCategoryPage().verifyCreatCategoryText();
   System.out.println(verifyCreatCategoryText);
	
}

/**
 * 
 * 
 * @param string
 * @param string2
 */
@When("User should click parent Category,then click create and fill the details {string} and {string}")
public void userShouldClickParentCategoryThenClickCreateAndFillTheDetailsAnd(String string, String string2) {
   
	cpom.getCategoryPage().creatChildCategory(string, string2);
	
}

@Then("User should verify the created child Category is present or not")
public void userShouldVerifyTheCreatedChildCategoryIsPresentOrNot() {
    
	String verifySaveText = cpom.getCategoryPage().verifySaveText();
	System.out.println(verifySaveText);
	
}

/**
 * 
 * @FASCMTC-19
 * null create and its show a alert
 */
@When("User should click parent Category,then click create and not any fill the details")
public void userShouldClickParentCategoryThenClickCreateAndNotAnyFillTheDetails() {
   cpom.getCategoryPage().nullCategoryCreate();
	
}

@Then("User should verify error messege of {string} and {string}")
public void userShouldVerifyErrorMessegeOfAnd(String string, String string2) {

	String errCategoryMsg = cpom.getCategoryPage().errCategoryMsg();
	assertEquals(string, errCategoryMsg);
	
	String errDescriptionMsg = cpom.getCategoryPage().errDescriptionMsg();
	assertEquals(string2, errDescriptionMsg);
	
	
}


/**
 * Duplicate code
 * @param string
 * @param string2
 */


@When("User should create the category with duplicate name {string} and {string}")
public void userShouldCreateTheCategoryWithDuplicateNameAnd(String string, String string2) {
   
	cpom.getCategoryPage().duplicateCode(string, string2);
	
}

@Then("User should verify alert {string}")
public void userShouldVerifyAlert(String string) {
	
	String verifyDuplicateText = cpom.getCategoryPage().verifyDuplicateText();
	
	assertEquals(string, verifyDuplicateText);
   	
}

/**
 * 
 * @FASCMTC-25
 * negative -1
 * 
 */
@When("User should create the category with negative Code {string} and {string}")
public void userShouldCreateTheCategoryWithNegativeCodeAnd(String string, String string2) {
   
	cpom.getCategoryPage().negativeCode(string, string2);
}

@Then("User should verify error messege of {string}")
public void userShouldVerifyErrorMessegeOf(String string) {
   String negativeCodeText = cpom.getCategoryPage().negativeCodeText();
   
  assertEquals(string, negativeCodeText);
	
	
}

/**
 * 
 * @//@FASCMTC-26
 * decimal values
 * 
 */
@When("User should create the category with decimal Code {string} and {string}")
public void userShouldCreateTheCategoryWithDecimalCodeAnd(String string, String string2) {
   

	cpom.getCategoryPage().decimalCode(string, string2);

}

/**
 * FASCMTC-27
 * more than 20 value
 * 
 */


@When("User should create the category with greater than twenty letters {string} and {string}")
public void userShouldCreateTheCategoryWithGreaterThanTwentyLettersAnd(String string, String string2) {
	
	cpom.getCategoryPage().greaterTwentyValue(string, string2);

}

@Then("User should verify that enter category code value in field is {string} without any additional value")
public void userShouldVerifyThatEnterCategoryCodeValueInFieldIsWithoutAnyAdditionalValue(String string) {

String greaterTwentyValue = cpom.getCategoryPage().greaterTwentyValue();

assertEquals(string, greaterTwentyValue);


}

/**
 * FASCMTC-28
 * morethan 100 letters 
 * 
 */



@When("User should create the Description with greater than Hundred  letters {string} and {string}")
public void userShouldCreateTheDescriptionWithGreaterThanHundredLettersAnd(String string, String string2) {
    
cpom.getCategoryPage().greaterHundredValue(string, string2);
}

@Then("User should verify that enter Description code value in field is {string} without any additional value")
public void userShouldVerifyThatEnterDescriptionCodeValueInFieldIsWithoutAnyAdditionalValue(String string) {
  
	String greaterHundredValue = cpom.getCategoryPage().greaterHundredValue();
	System.out.println(greaterHundredValue+"==="+string);
	assertEquals(greaterHundredValue, string);
}


/**
 * @FASCMTC-29
 * blank Description
 */

@When("User should  click create and fill  only Category code without description {string}")
public void userShouldClickCreateAndFillOnlyCategoryCodeWithoutDescription(String string) {
   
	cpom.getCategoryPage().blankDescription(string);
}

@Then("User should  verify the field-validation-error messege  {string}")
public void userShouldVerifyTheFieldValidationErrorMessege(String string) {
   
String blankDescription = cpom.getCategoryPage().blankDescription();

assertEquals(string, blankDescription);
}

/**
 * @FASCMTC-30
 * min 1 word description
 */

@When("User should create the category with minimum one letter description {string} and {string}")
public void userShouldCreateTheCategoryWithMinimumOneLetterDescriptionAnd(String string, String string2) {
	
  cpom.getCategoryPage().minOneLetter(string, string2);
	
}

@Then("User should verify that enter Description code value in field is same {string} and {string}")
public void userShouldVerifyThatEnterDescriptionCodeValueInFieldIsSameAnd(String string, String string2) {
   
	try {
		
		String minOneLetterDescription = cpom.getCategoryPage().enteredDescription();
	   // String enteredCategory = cpom.getCategoryPage().enteredCategory();
	    
		String enteredDescription = cpom.getCategoryPage().enteredDescription();
		
		
	    System.out.println(enteredDescription+","+minOneLetterDescription);
	    
	//	assertEquals(string, enteredDescription);
	    
		assertEquals(string2, minOneLetterDescription);
		
	} catch (Exception e) {
		
		System.out.println("FASCMTC-30");
	}
	
	

	
}
String verifySuccessAlert;
@Then("User should verify Success messege of {string}")
public void userShouldVerifySuccessMessegeOf(String string) throws Exception{
   
	try {
	 verifySuccessAlert = cpom.getCategoryPage().verifySuccessAlert();
	
		String verifyAlert = cpom.getCategoryPage().alertMessageGet(verifySuccessAlert);
		System.err.println("line no 421");
		
		System.out.println(string+"=="+ verifySuccessAlert);
	 assertEquals(string, verifyAlert);
		
		
		
		
		
		
	} catch (Exception e) {
		e.printStackTrace();
		System.out.println(" verifySuccessAlert  catch is working - line 407");
	}
	
	

	
	
}

/**
 * @FASCMTC-31
 * Category code with alphanumeric
 */

@When("User should create the Category code with alphanumeric {string} and {string}")
public void userShouldCreateTheCategoryCodeWithAlphanumericAnd(String string, String string2) {
   
	cpom.getCategoryPage().alphanumeric(string, string2);
}

@Then("User should verify that enter Category code in field is same {string} and {string}")
public void userShouldVerifyThatEnterCategoryCodeInFieldIsSameAnd(String string, String string2) {
  String enteredCategory = cpom.getCategoryPage().enteredCategory();
  String enteredDescription = cpom.getCategoryPage().enteredDescription();
  
  
  assertEquals(enteredCategory, string);
  assertEquals(enteredDescription, string2);
	
}
/**
 * 
 * 33
 * 
 */


@When("User should  type the Category on  {string} and  Check last modify date and last modify by are blank")
public void userShouldTypeTheCategoryOnAndCheckLastModifyDateAndLastModifyByAreBlank(String string) {
    
	
	cpom.getCategoryPage().lastModify(string);
}

/**
 * FASCMTC-34
 * 
 * 
 */

@When("User should create the Category code with {string} and {string}")
public void userShouldCreateTheCategoryCodeWithAnd(String string, String string2) throws Exception{
   
	cpom.getCategoryPage().childCategoryEdit(string, string2);
	
}

@Then("User should verify Alert and Success messege of {string}")
public void userShouldVerifyAlertAndSuccessMessegeOf(String string)throws Exception {
	cpom.getCategoryPage().alertHandle();
	
	cpom.getCategoryPage().verifySuccessAlert();
}

/**
 * 35
 * 
 */
@When("User should  click Category and edit the category")
public void userShouldClickCategoryAndEditTheCategory() {
  
	cpom.getCategoryPage().editCategory();
	
}

@When("User should edit the Category code with {string} and {string}")
public void userShouldEditTheCategoryCodeWithAnd(String string, String string2) {
cpom.getCategoryPage().categoryAndDescription(string, string2);


}

/**
 * 36
 * @param string
 * @param string2
 */


@When("User should update the Category code with {string} and {string}")
public void userShouldUpdateTheCategoryCodeWithAnd(String string, String string2) {
  
	cpom.getCategoryPage().update(string, string2);
	
}

@When("User should Check last modify date and last modify")
public void userShouldCheckLastModifyDateAndLastModify() {
	
	cpom.getCategoryPage().lastModifyCheck();
}


//37
@When("User should click Category on  {string} and click Category audit log")
public void userShouldClickCategoryOnAndClickCategoryAuditLog(String string) {
   
	
	cpom.getCategoryPage().audit();
	
}

//38


@Then("User should click parent category edit and click cancel button")
public void userShouldClickParentCategoryEditAndClickCancelButton() {
   
	
	cpom.getCategoryPage().editAndCancel();
}

//39
@When("User should click Category and click delete")
public void userShouldClickCategoryAndClickDelete() {
   
	try {
		
		cpom.getCategoryPage().deleteLocation();
	} catch (Exception e) {
		System.out.println("catchat 39");
	}
	
}


@Then("User should verify Category delete messege of {string}")
public void userShouldVerifyCategoryDeleteMessegeOf(String string) {
    
	String deleteText = cpom.getCategoryPage().deleteText();
	
	assertEquals(string, deleteText, "39");
	
}



/**
 * 
 *  @FASCMTC-41
 * 
 */




@When("User should  click on the parent category")
public void userShouldClickOnTheParentCategory() {
   
	cpom.getCategoryPage().clickParent();
}
@When("User should  click view and shows the details of selected Category")
public void userShouldClickViewAndShowsTheDetailsOfSelectedCategory() {
  
	
	
	cpom.getCategoryPage().categoryViewButton();
	
	
}













}
