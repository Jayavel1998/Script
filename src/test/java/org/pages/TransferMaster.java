package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TransferMaster extends BaseClass{

	public TransferMaster() {
	PageFactory.initElements(driver, this);
	
	}
	
	
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;
	
	@FindBy(xpath="//span[text()='Transfer Type']")
	private WebElement transferMaster;
	
	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;
	//==============================

	public WebElement getMaster() {
		return master;
	}

	public WebElement getTransferMaster() {
		return transferMaster;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}
	
	public void transferMaster() {
		
		jsHighlight(getMaster());
		moveToElement(getMaster());
		try {
			sleep(2000);
			jsHighlight(getTransferMaster());
			click(getTransferMaster());
		} catch (Exception e) {
		System.out.println("catch on transfer master");
		}
		
		}
	
	public String verifyTransfer() {
		jsHighlight(getVerifyText());
	   String gettxt = getText(getVerifyText());
	   return gettxt;

	}
	
	
	
	
}
