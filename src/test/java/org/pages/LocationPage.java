package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LocationPage extends BaseClass{


	public LocationPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;

	@FindBy(xpath="//span[text()='Location']")
	private WebElement location;

	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;
	//==============================


	@FindBy(xpath="//span[text()='Kuwait']/..//span[@class='k-icon k-i-expand']")
	private WebElement parentLocationIconClick;

	@FindBy(xpath="//span[text()='Kuwait']")
	private WebElement parentClick;

	@FindBy(xpath="//span[text()='Kuwait']/..//span[@class='k-icon k-i-collapse']")
	private WebElement parentReturnIconClick;

	@FindBy(id="search-term")
	private WebElement searchField;





	//create Location
	@FindBy(id="create")
	private WebElement createButton;

	@FindBy(id="LocationCode")
	private WebElement txtLocationCode;

	@FindBy(id="EntityDescription_1")
	private WebElement txtDescription;
	//summa
	@FindBy(xpath="//span[@aria-controls='DepreciationClassID_listbox']")
	private WebElement ddDepreciationClass;

	@FindBy(xpath="//input[@value='Save']")
	private WebElement creatSaveButton;

/**
	 * child create
	 * @FASLocMTC-17
	 * 
	 */
	@FindBy(xpath="//span[text()='Test Location']")
	private WebElement clickParent;

	@FindBy(xpath="//div[@data-role='alert']")
	private WebElement verifyAlertText;

	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement alertOkButton;

	//error  message
	@FindBy(xpath="//span[@for='LocationCode']")
	private WebElement errLocationCode;


	@FindBy(xpath="//span[@for='EntityDescription_1']")
	private WebElement errDescription;

	//32
	@FindBy(xpath="//span[text()='Test Location']")
	private WebElement parentDateCheck;

	


		@FindBy(xpath="(//td[@class='editor-field'])[7]")
		private WebElement lastModifyBY;

		@FindBy(xpath="(//td[@class='editor-field'])[8]")
		private WebElement lastModifyDate;

//36
		@FindBy(xpath="//a[text()='Location Audit Log']")
		private WebElement buttonLocationAuditLog;

//37
		
		@FindBy(id="Edit")
		private WebElement editButton;

		//input[@value='Cancel']
		@FindBy(xpath="//input[@value='Cancel']")
		private WebElement cancelButton;

//38
		//button[text()='OK']
		@FindBy(id="delete")
		private WebElement deleteButton;

		//input[@value='Cancel']
		@FindBy(xpath="//button[text()='OK']")
		private WebElement deleteOkButton;


		@FindBy(xpath="//div[text()='Reference  Found']")
		private WebElement deleteAlert;

		@FindBy(xpath="//span[text()='dtest 400']")
		private WebElement deleteLocation;

		
	//40
		@FindBy(id="View")
		private WebElement viewButton;
		
		
		@FindBy(xpath="//label[text()='Location Code']")
		private WebElement verifyViewText;
		
		
		
		





	


	

	//======================================================================
	public WebElement getMaster() {
		return master;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}
	/**
	 * 21/2
	 * @return
	 */
	public WebElement getParentLocationIconClick() {
		return parentLocationIconClick;
	}

	public WebElement getParentClick() {
		return parentClick;
	}

	public WebElement getParentReturnIconClick() {
		return parentReturnIconClick;
	}

	public WebElement getSearchField() {
		return searchField;
	}


	/*
	 * create location
	 * 
	 */
	public WebElement getCreateButton() {
		return createButton;
	}

	public WebElement getTxtLocationCode() {
		return txtLocationCode;
	}

	public WebElement getTxtDescription() {
		return txtDescription;
	}

	public WebElement getDdDepreciationClass() {
		return ddDepreciationClass;
	}

	public WebElement getCreatSaveButton() {
		return creatSaveButton;
	}




	//@FASLocMTC-17 child

	public WebElement getClickParent() {
		return clickParent;
	}

	public WebElement getVerifyAlertText() {
		return verifyAlertText;
	}

	public WebElement getAlertOkButton() {
		return alertOkButton;
	}


	//error  messagepublic
	WebElement getErrLocationCode() {
		return errLocationCode;
	}

	public WebElement getErrDescription() {
		return errDescription;
	}



	//32

	public WebElement getParentDateCheck() {
	return parentDateCheck;
}
	
public WebElement getLastModifyBY() {
		return lastModifyBY;
	}

	public WebElement getLastModifyDate() {
		return lastModifyDate;
	}



	//36
	public WebElement getButtonLocationAuditLog() {
		return buttonLocationAuditLog;
	}

//37

	public WebElement getEditButton() {
			return editButton;
		}

		public WebElement getCancelButton() {
			return cancelButton;
		}


//38

		public WebElement getDeleteButton() {
				return deleteButton;
			}

			public WebElement getDeleteOkButton() {
				return deleteOkButton;
			}

		public WebElement getDeleteAlert() {
				return deleteAlert;
			}


		public WebElement getDeleteLocation() {
			return deleteLocation;
		}

//40

		public WebElement getViewButton() {
				return viewButton;
			}

			public WebElement getVerifyViewText() {
				return verifyViewText;
			}

























	//--------------------------------------------------------------------------------------
	public void location() {

		jsHighlight(getMaster());
		moveToElement(getMaster());
		sleep(2000); 
		jsHighlight(getLocation());

		try {
			click(getLocation());
		} catch (Exception e) {

			jsHighlight(getLocation());
			System.out.println("Catch in location");
		}


		sleep(4000);
		roboEscap();
		sleep(2000);
	}

	public String verifyLocation() {

		jsHighlight(getVerifyText());
		String gettxt = getText(getVerifyText());
		return gettxt;

	}
	/**
	 * @FASLocMTC-03
	 * 
	 */
	public void parentIconClick() {

		click(getParentLocationIconClick());
	}

	//@FASLocMTC-05
	public void parentClick() {

		click(getParentClick());
	}
	//@FASLocMTC-06

	public void returnParentIconClick() throws Exception{

		click(getParentLocationIconClick());
		click(getParentReturnIconClick());

	}

	//@FASLocMTC-07

	public void searchLocation(String Location) {

		sendKeys(getSearchField(), Location);
		roboEnter();

	}
	//FASLocMTC-08
	public void inCorrectSearchLocation(String InLocation) {

		sendKeys(getSearchField(), InLocation);
		roboEnter();

	}

	//FASLocMTC-09
	public void removeSearchText(String Location) {

		sendKeys(getSearchField(), Location);
		clearText(getSearchField());
		roboEnter();
	}


	//FASLocMTC-17

	public void creatLocation(String LocationCode,String Description) {


		click(getCreateButton());
		sendKeys(getTxtLocationCode(), LocationCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}





	public void creatChildLocation(String LocationCode,String Description) {


		sleep(5000);
		click(getClickParent());
		click(getCreateButton());
		sendKeys(getTxtLocationCode(), LocationCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());



	}

	String creatLocationText;
	public String verifyCreateLocationText() {

		sleep(2000);
		try {
			jsHighlight(getVerifyAlertText());
			creatLocationText = getText(getVerifyAlertText());


			System.out.println(creatLocationText +"="+"Saved text");

		} catch (Exception e) {

			System.out.println(creatLocationText +"="+"Saved text");
		}	
		
		sleep(2000);
         jsHighlight(getAlertOkButton());
		click(getAlertOkButton());


		return creatLocationText;
	}



	LocationPage locationPage ;

public static void alertMessageGet(String creatLocationText) {
	switch (creatLocationText) {

	case "Category  Code  Already  Exists":

		System.out.println("Location  Code  Already  Exists");




		break;


	case "Record Saved Successfully. ":

		System.out.println("Record Saved Successfully.");


		break;


	case "Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate":

		System.out.println("Please Change The Location Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate");


		break;


	case "An error occurred while updating the entries. See the inner exception for details.":
		System.out.println("An error occurred while updating the entries. See the inner exception for details.");


		break;

	default:
		break;
	}


}


	//=============================
	////FASLocMTC-19


	public void nullLocationCreate() {
		sleep(5000);
		click(getClickParent());
		click(getCreateButton());


		click(getCreatSaveButton());


	}


	public String errLocationMsg() {
		String locationCode = getText(getErrLocationCode());
		return locationCode;
	}

	public String errDescriptionMsg() {
		String descriptionMsg = getText(getErrDescription());
		return descriptionMsg;
	}

/**
 * //FASLocMTC-20
 * 
 * 
 */


//FASLocMTC-22
	
	public void onlyDescription(String Description) {
		sleep(5000);
		click(getClickParent());
		click(getCreateButton());
		
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());


	}

//FASLocMTC-26
	
	public String getTextLocationCode() {

		String enteredLocation = getAttribute(getTxtLocationCode());

		return enteredLocation;
	}

	
	
	
	
	public String getErrorDescription() {

		
			String descriptionMsg = getText(getErrDescription());
			return descriptionMsg;
}

	public String getTextDescription() {
		
		String enteredDescription = getAttribute(getTxtDescription());

		

		
		click(getCreatSaveButton());
		return enteredDescription;

	}
	
	
//28
	public void onlyLocationCode(String Location) {
		sleep(5000);
		click(getClickParent());
		click(getCreateButton());
		
		sendKeys(getTxtLocationCode(), Location);
		//DD is missing
		click(getCreatSaveButton());


	}
	
//29
	public void minimumOneLetter(String LocationCode,String Description) {

		click(getCreateButton());
		sendKeys(getTxtLocationCode(), LocationCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		

	}
	

//30
	public void specialCharacters(String LocationCode,String Description) {

		click(getCreateButton());
		sendKeys(getTxtLocationCode(), LocationCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing

	}

//32
	public void lastModify(String Location) {

		try {
			sendKeys(getSearchField(), Location);
			roboEnter();
			click(getParentDateCheck());
			jsHighlight(getLastModifyBY());
			jsHighlight(getLastModifyDate());
			String modifyBY = getText(getLastModifyBY());
			String modifyDate = getText(getLastModifyDate());


			boolean blankBy = modifyBY.isEmpty();
			boolean blankDate = modifyDate.isEmpty();

			System.out.println(blankDate+"===="+blankBy);

		} catch (Exception e) {
			System.out.println("lastModify catch is working");
		}

	}

//33
	public void childCategoryEdit(String Location,String Description) {

		click(getCreateButton());
		sendKeys(getTxtLocationCode(), Location);
		sendKeys(getTxtDescription(), Description);

	}

//36
	
	public void searchLocationAndClick(String Location) {

		sendKeys(getSearchField(), Location);
		roboEnter();
        click(getClickParent());
       
        click(getButtonLocationAuditLog());
        sleep(3000);
        
        
    window();
        
	}

//37
	public void editAndCancel() {
		
		click(getEditButton());
		sleep(2000);
		click(getCancelButton());

	}
	
	
	//FASLocMTC-38
	

	public void deleteLocation(String Location) throws Exception {

		sendKeys(getSearchField(), Location);
		roboEnter();
      click(getDeleteLocation());
		sleep(3000);
        
        click(getDeleteButton());
       
        
	}
	
	

	public String  deleteText() {

		 click(getDeleteOkButton());
	        String deleteAlertText = getText(getDeleteAlert());
	 sleep(2000);
       click(getDeleteOkButton());
        return deleteAlertText;
	}
	
	
/**
 * 39
 * 	
 */
	public void parentDelete() {
		
		click(getParentClick());
		click(getDeleteButton());
		click(getDeleteOkButton());
}
	
	public String referenceText() {
		
		jsHighlight(getDeleteAlert());
		 String referenceAlertText = getText(getDeleteAlert());
		 sleep(2000);
	       click(getDeleteOkButton());
		return referenceAlertText;
	}
	
	//40
	
	//label[text()='Location Code']
	
	public String verifyView() {
		
jsHighlight(getVerifyViewText());
String verifyLocationCode = getText(getVerifyViewText());
		return verifyLocationCode;
		
		
	}
	


}
