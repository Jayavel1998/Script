package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssetPage extends BaseClass{
	
	public AssetPage() {
	
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;
	
	@FindBy(xpath="(//span[text()='Asset'])[1]")
	private WebElement assetMove1;
	
	@FindBy(xpath="(//span[text()='Asset'])[2]")
	private WebElement assetMove2;
	
	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;
	//========================================

	public WebElement getMaster() {
		return master;
	}

	public WebElement getAssetMove1() {
		return assetMove1;
	}

	public WebElement getAssetMove2() {
		return assetMove2;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}
	
	
	
	
	public void assetClick() throws InterruptedException {
		impWait();
		
		jsHighlight(getMaster());
		moveToElement(getMaster());
		sleep(2000);
		moveToElement(getAssetMove1());
		sleep(2000);
		click(getAssetMove2());
	
	}
	public String verifyAssetTitle() {
		String gettxt = getText(getVerifyText());
		return gettxt;				
		
	}
	
	
	
	
	
	
	
}
