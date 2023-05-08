package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetCondition extends BaseClass {

	public AssetCondition() {
	
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;
	
	@FindBy(xpath="(//span[text()='Asset'])[1]")
	private WebElement assetMove1;
	
	@FindBy(xpath="//span[text()='Asset Condition']")
	private WebElement assetCondition;
	
	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;
	//========================================

	public WebElement getMaster() {
		return master;
	}

	public WebElement getAssetMove1() {
		return assetMove1;
	}

	public WebElement getAssetConditon() {
		return assetCondition;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}
	
	
	
	public void conditionClick() {
		moveToElement(getMaster());
		try {
			sleep(2000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		moveToElement(getAssetMove1());
		sleep(2000);
		click(getAssetConditon());
}
	
	public String verifyAssetConditionTitle() {
		String gettxt = getText(getVerifyText());
		return gettxt;				
		
	}
	
	
	
	
	
	
}
