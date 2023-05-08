package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.base.BaseClass;
import org.pagemanager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep extends BaseClass {


	PageObjectManager pomLogin =new PageObjectManager();

	@Given("User is on FASoft login page")
	public void userIsOnFASoftLoginPage() {
		/*	getDriver("chrome");
		loadUrl("http://13.71.105.174:8081/");
		impWait();
		maxi(); 
		 */
	}

	@When("User should login using {string} and {string}")
	public void userShouldLoginUsingAnd(String UserName, String Password) throws InterruptedException {

		pomLogin.getLoginPage().loginVaild(UserName, Password);


	}

	@Then("After login User should verify the total Asset on Dashboard  {string}")
	public void afterLoginUserShouldVerifyTheTotalAssetOnDashboard(String string)  {
		try {
			String txtAsset = pomLogin.getLoginPage().dashboard();
			assertEquals(string, txtAsset);
		} catch (Exception e) {

			System.out.println("catch at - After login User should verify the total Asset on Dashboard ");
		}

	}

	@When("User should login using invalid credentials {string} and {string}")
	public void userShouldLoginUsingInvalidCredentialsAnd(String InUserName, String InPassword) {

		pomLogin.getLoginPage().invaildUser(InUserName, InPassword);	

	}



	@Then("After User should verify the Error message  {string}")
	public void afterUserShouldVerifyTheErrorMessage(String string) {
		String errmsg = pomLogin.getLoginPage().errmsg();
		assertEquals(string, errmsg);
	}

	/**
	 * FASTCLM-08
	 * @param alpha,num,special character
	 * @param alpha,num,special character
	 * @throws InterruptedException 
	 */
	@When("User should login using Alphanumeric with special characters {string} and {string}")
	public void userShouldLoginUsingAlphanumericWithSpecialCharactersAnd(String string, String string2) throws InterruptedException {

		pomLogin.getLoginPage().alphaNumeric(string, string2);

		String username = pomLogin.getLoginPage().alphaNumericUsername();
		String password = pomLogin.getLoginPage().alphaNumericPassword();

		System.out.println(string+"="+username);
		System.out.println(string2+"="+password);

		assertEquals(username, string);
		assertEquals(password, string2);


	}

	/**
	 * FASTCLM-11
	 */

	@When("User should login using Alphanumeric with special characters {string}")
	public void userShouldLoginUsingAlphanumericWithSpecialCharacters(String string) {

		pomLogin.getLoginPage().blankPassword(string);

	}

	/**
	 * FASTCLM-09
	 * @param string
	 * @param string2
	 */
	@When("User should {string} and {string} click Remember Me check box and Check its clicked")
	public void userShouldAndClickRememberMeCheckBoxAndCheckItsClicked(String string, String string2) {

		pomLogin.getLoginPage().rememberMeClicked(string,string2);
	}

	/**
	 * FASTCLM-10
	 * @param string
	 * @param string2
	 */
	@When("User should {string} and {string} click Remember Me check box and Check its not clicked")
	public void userShouldAndClickRememberMeCheckBoxAndCheckItsNotClicked(String string, String string2) {

		pomLogin.getLoginPage().rememberMeNotClicked(string, string2);
	}

	/**
	 * FASTCLM-14
	 */

	@When("User should login using valid username and  invalid password  credentials {string} and {string}")
	public void userShouldLoginUsingValidUsernameAndInvalidPasswordCredentialsAnd(String string, String string2) {

		pomLogin.getLoginPage().vaildUsername(string, string2);

	}

	/**
	 * FASTCLM-15
	 */

	@When("User should click Enter button on keyboard")
	public void userShouldClickEnterButtonOnKeyboard() {

		pomLogin.getLoginPage().enterButton();


	}

	/**
	 * @FASTCLM-17
	 */

	@When("User should click Logout button in dashboard")
	public void userShouldClickLogoutButtonInDashboard() {

		pomLogin.getLoginPage().logoutCheck();
	}

	@Then("User should  redirects to login page and verify the {string} button")
	public void userShouldRedirectsToLoginPageAndVerifyTheButton(String string) {
		String logoutTextVerify = pomLogin.getLoginPage().logoutTextVerify();

		assertEquals(string, logoutTextVerify);
	}


	/**
	 * @FASTCLM-12	
	 * @param string
	 */
	@When("User should login blank username with vaild password {string}")
	public void userShouldLoginBlankUsernameWithVaildPassword(String string) {


		pomLogin.getLoginPage().blankUserName(string);



	}







}
