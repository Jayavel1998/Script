package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ParentChildAssetPage extends BaseClass{

	
	public ParentChildAssetPage() {
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;
	
	@FindBy(xpath="(//span[text()='Asset'])[1]")
	private WebElement assetMove1;
	
	@FindBy(xpath="//span[text()='Parent/ Child  Asset']")
	private WebElement parentChildAssetClick;
	
	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;

	
	//==============================================
	
	public WebElement getMaster() {
		return master;
	}
	
	public WebElement getAssetMove1() {
		return assetMove1;
	}
	
	public WebElement getParentChildAssetClick() {
		return parentChildAssetClick;
	}
	
	public WebElement getVerifyText() {
		return verifyText;
	}
	
	//================================
	
	public void parentChildAssetClick() {
		moveToElement(getMaster());
		try {
			sleep(5000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		moveToElement(getAssetMove1());
		jsHighlight(getParentChildAssetClick());
		jsClick(getParentChildAssetClick());
	
	
	}
	
	public String verifyParentChildAssetTitle() {
		String gettxt = getText(getVerifyText());
		return gettxt;				
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
