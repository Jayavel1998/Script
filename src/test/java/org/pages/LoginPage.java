package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//input[@id='UserName']")
	private WebElement Username;


	@FindBy(xpath="//input[@id='Password']")
	private WebElement Password;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement butLogin;

	@FindBy(xpath="//p[text()='Total No Of Asset']")
	private WebElement txtVerify;
//===================================================

	@FindBy(xpath="//span[contains(text(),'Invalid')]")
	private WebElement ErrMessage;
	
	//RememberMe
	@FindBy(id="RememberMe")
	private WebElement rememberMe;
	
	//Logout
	
	/*@FindBy(xpath="//input[@value='Login']")
	private WebElement loginButtonVerify;*/
	
	
	@FindBy(xpath="//span[@class='caret']")
	private WebElement logoutMenu;
	
	@FindBy(xpath="//a[@onclick='clearlocal()']")
	private WebElement logoutClick;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	




	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getButLogin() {
		return butLogin;
	}

	public WebElement getTxtVerify() {
		return txtVerify;
	}
	public WebElement getErrMessage() {
		return ErrMessage;
	}

	
	public WebElement getRememberMe() {
		return rememberMe;
	}
	
	
	
	
	//logout
	

	public WebElement getLogoutMenu() {
		return logoutMenu;
	}



	public WebElement getLogoutClick() {
		return logoutClick;
	}
	
	
	
	
	
	
	
	
	
	

	public void loginVaild(String UserName,String Password) {
		
		sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		click(getButLogin());
		
	}
	
	
	public  String dashboard() throws Exception {
		sleep(2000);
		
		jsHighlight(getTxtVerify());

		String gettxt = getText(getTxtVerify());
		//System.err.println(gettxt);
		return gettxt;
	}
	
	public void invaildUser(String InUserName,String InPassword) {
		sendKeys(getUsername(), InUserName);
		sendKeys(getPassword(), InPassword);
		click(getButLogin());
	
	}
	public String errmsg() {
		String errMsg = getText(getErrMessage());
		System.err.println(errMsg);
      return errMsg;

	}
	
//FASTCLM-08
	public void alphaNumeric(String UserName,String Password) {

		sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		
		System.out.println(getAttribute(getUsername())+"=="+getAttribute(getPassword()));
		
		
	
	}
	
	public String alphaNumericUsername() throws InterruptedException { 
		
		sleep(5000);
		System.out.println(getAttribute(getUsername()));
		
	String username = getAttribute(getUsername());
	
		
      return username;

	}
	public String alphaNumericPassword() throws InterruptedException { 
		sleep(3000);
		String password = getAttribute(getPassword());
		//======================================================================
		click(getButLogin());
	      return password;

		}
	


	//FASTCLM-11
	public void blankPassword(String UserName) {
		
		sendKeys(getUsername(), UserName);
		click(getButLogin());
	}
	
//FASTCLM-09
	public boolean rememberMeClicked(String UserName,String Password) {
		
		sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		click(getRememberMe());

		boolean selected = getRememberMe().isSelected();
		System.out.println(selected);
		return selected;
		
	}
	
	
	//FASTCLM-10
	
public boolean rememberMeNotClicked(String UserName,String Password) {
		
		sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		click(getRememberMe());
		click(getRememberMe());

		boolean notSelected = getRememberMe().isSelected();
		System.out.println(notSelected);
		return notSelected;
		
	}
	
	//FASTCLM-14

	public void vaildUsername(String UserName,String Password) {
		
		sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		click(getRememberMe());
		click(getButLogin());
		

	}
	
	//FASTCLM-15
	
	public void enterButton() {
		
		roboEnter();
		
	
	}
	
	
	//@FASTCLM-17
	
	public void logoutCheck() {
		
		/*sendKeys(getUsername(), UserName);
		sendKeys(getPassword(), Password);
		click(getButLogin());*/
try {
	sleep(4000);
	click(getLogoutMenu());
	sleep(2000);
	click(getLogoutClick());

} catch (Exception e) {
	System.out.println("catch in logout ");
}
		
	
	}
	
	public String logoutTextVerify() {
		jsHighlight(getButLogin());
		String attribute = getAttribute(getButLogin());
      return attribute;

	}
	
	//@FASTCLM-12
	
public void blankUserName(String Password) {
		
		sendKeys(getUsername(), Password);
		click(getButLogin());
	}
	
	
	
	
	
	
	
}
