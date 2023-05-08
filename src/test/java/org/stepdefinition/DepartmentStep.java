package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DepartmentStep {

	PageObjectManager pomDepart = new PageObjectManager();

	@When("User should click Department on Master")
	public void userShouldClickDepartmentOnMaster() {
		try {

			pomDepart.getDepartmentPage().departmentClick();
		} catch (Exception e) {
			System.out.println("catch at userShouldClickDepartmentOnMaster");
		}
	}

	@Then("User should verify the Department list page and title of  {string}")
	public void userShouldVerifyTheDepartmentListPageAndTitleOf(String string) {

		String verifyDepartment = pomDepart.getDepartmentPage().verifyDepartment();
		assertEquals(string, verifyDepartment);

	}

	/**
	 * 27-2-23
	 * 
	 * @param string
	 */

	@When("User should not select any format and click Export in department")
	public void userShouldNotSelectAnyFormatAndClickExportInDepartment() {

		pomDepart.getDepartmentPage().exportNull();
	}

	@Then("Alert should be shown {string} in department")
	public void alertShouldBeShownInDepartment(String string) {

		String exportNullAlert = pomDepart.getDepartmentPage().exportNullAlert();
		assertEquals(string, exportNullAlert, "null Expert");

	}


	@When("User should  select Docment format of Export To Excel and click Export in department")
	public void userShouldSelectDocmentFormatOfExportToExcelAndClickExportInDepartment() {
		pomDepart.getDepartmentPage().excelFormat();


	}

	@When("User should  select Docment format of Export To PDF and click Export in department")
	public void userShouldSelectDocmentFormatOfExportToPDFAndClickExportInDepartment() {

		pomDepart.getDepartmentPage().pdfFormat();

	}

	@When("User should  select Docment format of Export To CSV and click Export in department")
	public void userShouldSelectDocmentFormatOfExportToCSVAndClickExportInDepartment() {
		pomDepart.getDepartmentPage().csvFormat();


	}

	@When("User should  select Docment format of Export To XML and click Export in department")
	public void userShouldSelectDocmentFormatOfExportToXMLAndClickExportInDepartment() {
		pomDepart.getDepartmentPage().xmlFormat();

	}

	/**
	 * 3-5-23
	 * @may3
	 * @FASDPMTC-08	
	 */
	@When("User should select the Add new record button and its should nevigate to create page")
	public void userShouldSelectTheAddNewRecordButtonAndItsShouldNevigateToCreatePage() {

		pomDepart.getDepartmentPage().createNewRecord();

	}


	@Then("After that user should verify the {string}")
	public void afterThatUserShouldVerifyThe(String string) {

		String verifyDepartmentTitle = pomDepart.getDepartmentPage().verifyDepartmentTitle();

		System.out.println(string+","+ verifyDepartmentTitle);

		Assert.assertEquals("assert at 08",string, verifyDepartmentTitle);
	}



	@When("User is leaving department code and description as blank and click save")
	public void userIsLeavingDepartmentCodeAndDescriptionAsBlankAndClickSave() {

		pomDepart.getDepartmentPage().createNewRecord();

		pomDepart.getDepartmentPage().departmentSaveButton();
	}


	@Then("Its shows the alert of {string} and {string}")
	public void itsShowsTheAlertOfAnd(String code, String Description) {

		String errDepartmentcodeText = pomDepart.getDepartmentPage().ErrDepartmentcodeText();
		String errDepartmentDescriptionText = pomDepart.getDepartmentPage().ErrDepartmentDescriptionText();

		System.out.println(errDepartmentcodeText+","+errDepartmentDescriptionText);

		Assert.assertEquals("assert at 09",code, errDepartmentcodeText );

		Assert.assertEquals("assert at 09",Description,errDepartmentDescriptionText  );
	}

	//10
	String delete;
	
	@When("User should click save , after enter the {string} and {string}")
	public void userShouldClickSaveAfterEnterTheAnd(String string, String string2) {

	  delete = string;
		pomDepart.getDepartmentPage().createNewRecord();

		
		pomDepart.getDepartmentPage().decimalValue(string, string2);

		pomDepart.getDepartmentPage().departmentSaveButton();



	}
	@Then("Verify value is {string} from department code")
	public void verifyValueIsFromDepartmentCode(String enteredCode) {

		String enteredDepartmentCode = pomDepart.getDepartmentPage().enteredDepartmentCode();

		Assert.assertEquals("assert at 10",enteredCode,enteredDepartmentCode);
	}

	//to delete

	/*@Then("Its not allow to enter decimal value and verify value is {string} from department code")
	public void itsNotAllowToEnterDecimalValueAndVerifyValueIsFromDepartmentCode(String enteredCode) {


	}*/




	//14  single value

	@When("User is enter {string} and it should accept it")
	public void userIsEnterAndItShouldAcceptIt(String string) {


		pomDepart.getDepartmentPage().createNewRecord();

		pomDepart.getDepartmentPage().singleValue(string);

		pomDepart.getDepartmentPage().departmentSaveButton();


	}

	@Then("Its shows the alert of  {string}")
	public void itsShowsTheAlertOf(String Description) {

		String errDepartmentDescriptionText = pomDepart.getDepartmentPage().ErrDepartmentDescriptionText();

		Assert.assertEquals("assert at Department 14",Description,errDepartmentDescriptionText  );
	}



	//15
	@Then("Verify value is {string} from description")
	public void verifyValueIsFromDescription(String EnteredDescription) {


		String enteredDepartmentDescription = pomDepart.getDepartmentPage().enteredDepartmentDescription();

		Assert.assertEquals("assert at 15",EnteredDescription,enteredDepartmentDescription);


	}

	//16

	@Then("User should verify {string} and department should be saved")
	public void userShouldVerifyAndDepartmentShouldBeSaved(String Alert) {

try {
	String alertGetText = pomDepart.getDepartmentPage().alertText();


	System.out.println(Alert+","+alertGetText);
	
	Assert.assertEquals("assert at 16",Alert,alertGetText);

	pomDepart.getDepartmentPage().alertOkClick();
	
	
	pomDepart.getDepartmentPage().deteleDepartment(delete);
	
	
	
	pomDepart.getDepartmentPage().alertOkClick();
	
} catch (Exception e) {
	e.printStackTrace();
	System.out.println("catch at line 225");
}
		
	}

//17
	
//18
	@Then("User should verify {string} and department should Not be saved")
	public void userShouldVerifyAndDepartmentShouldNotBeSaved(String DublicateAlert) {
	   
		
	

		try {
			String alertGetText = pomDepart.getDepartmentPage().alertText();


			System.out.println(DublicateAlert+","+alertGetText);
			
			System.out.println("@FASDPMTC-18");
			Assert.assertEquals("assert at 18",DublicateAlert,alertGetText);

			pomDepart.getDepartmentPage().alertOkClick();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("catch at line 225");
		}
	}






}
