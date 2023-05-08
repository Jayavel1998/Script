package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CategoryPage extends BaseClass {


	
	
	
	public CategoryPage() {

		PageFactory.initElements(driver, this);

	}	


	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;

	@FindBy(xpath="//span[text()='Category']")
	private WebElement category;

	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;

	/*@FindBy(xpath="//i[@class='fa fa-home']")
	private WebElement removeMouseOver;
	 */

	//view
	@FindBy(xpath="//input[@id='View']")
	private WebElement buttonView;









	//============================================

	//span[text()='Test Category']/..//span[@class='k-icon k-i-expand']





	@FindBy(xpath="//span[text()='Test Category']/..//span[@class='k-icon k-i-expand']")
	private WebElement parentClick;

	//@FASCMTC-07
	@FindBy(id="search-term")
	private WebElement searchCategory;

	//@FASCMTC-11
	@FindBy(id="Button1")
	private WebElement exprotButton;

	//FASCMTC-12
	@FindBy(xpath="//span[@aria-label='select']")
	private WebElement exportDrowDown;

	
	

	@FindBy(xpath="//li[text()='Export To Excel']")
	private WebElement excelFormat;

	//@FASCMTC-13
	@FindBy(xpath="//li[text()='Export To PDF']")
	private WebElement pdfFormat;

	//@FASCMTC-14
	@FindBy(xpath="//li[text()='Export To Csv']")
	private WebElement csvFormat;

	//@FASCMTC-15
	@FindBy(xpath="//li[text()='Export To XML']")
	private WebElement xmlFormat;

	//creat category
	@FindBy(id="create")
	private WebElement creatButton;

	////input[@id='CategoryCode']
	//(id="CategoryCode")
	@FindBy(xpath="//input[@id='CategoryCode']")
	private WebElement txtCategoryCode;

	
	//id="EntityDescription_1"
	
	@FindBy(xpath="//input[@id='EntityDescription_1']")
	private WebElement txtDescription;

	@FindBy(xpath="//span[@aria-controls='DepreciationClassID_listbox']")
	private WebElement ddDepreciationClass;

	@FindBy(xpath="//input[@value='Save']")
	private WebElement creatSaveButton;

	//creat child
	@FindBy(xpath="//span[text()='Selenium']")
	private WebElement clickParent;

	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement alertOkButton;

	@FindBy(xpath="//div[@data-role='alert']")
	private WebElement verifyAlertText;

	//errormsg

	@FindBy(xpath="//span[@for='CategoryCode']")
	private WebElement errCategoryCode;

	@FindBy(xpath="//span[@for='EntityDescription_1']")
	private WebElement errDescription;

	/**
	 * 
	 * 20-2-23
	 * @FASCMTC-33
	 * 
	 */
	@FindBy(xpath="//span[text()='dtest 400']")
	private WebElement parentDateCheck;


	@FindBy(xpath="(//td[@class='editor-field'])[7]")
	private WebElement lastModifyBY;

	@FindBy(xpath="(//td[@class='editor-field'])[8]")
	private WebElement lastModifyDate;


	/**
	 * 41
	 * //span[text()='Selenium']
	 * @return
	 */
	@FindBy(xpath=("//span[text()='Selenium']"))
	private WebElement clickCategory;
	
	
//35
	
	@FindBy(id=("Edit"))
	private WebElement buttonEdit;

	@FindBy(id=("delete"))
	private WebElement buttonDelete;
	
	//37
	
	@FindBy(xpath="//a[text()='Category Audit Log']")
	private WebElement buttonLocationAuditLog;


//38

	@FindBy(id="Edit")
	private WebElement editButton;

	//input[@value='Cancel']
	@FindBy(xpath="//input[@value='Cancel']")
	private WebElement cancelButton;


//39
	//d     Negative,Decimal values,20Values,alphanumeric, Check Edit, Delete
	@FindBy(xpath="//span[text()='Delete']")
	private WebElement deleteCategory;


	@FindBy(xpath="//button[text()='OK']")
	private WebElement deleteOkButton;


//@FASCMTC-30
	
	










	//============================



















	public WebElement getMaster() {
		return master;
	}

	public WebElement getCategory() {
		return category;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}

	/*public WebElement getRemoveMouseOver() {
		return removeMouseOver;
	}
	 */

	public WebElement getButtonView() {
		return buttonView;
	}


	public WebElement getParentClick() {
		return parentClick;
	}

	public WebElement getSearchCategory() {
		return searchCategory;
	}
	public WebElement getExprotButton() {
		return exprotButton;
	}

	public WebElement getExportDrowDown() {
		return exportDrowDown;
	}

	public WebElement getExcelFormat() {
		return excelFormat;
	}

	public WebElement getPdfFormat() {
		return pdfFormat;
	}
	//@FASCMTC-14
	public WebElement getCsvFormat() {
		return csvFormat;
	}

	public WebElement getXmlFormat() {
		return xmlFormat;
	}

	//creat 

	public WebElement getCreatButton() {
		return creatButton;
	}

	public WebElement getTxtCategoryCode() {
		return txtCategoryCode;
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
	//child
	public WebElement getClickParent() {
		return clickParent;
	}
	public WebElement getAlertOkButton() {
		return alertOkButton;
	}
	public  WebElement getVerifyAlertText() {
		return verifyAlertText;
	}

	//err msg
	public WebElement getErrCategoryCode() {
		return errCategoryCode;
	}

	public WebElement getErrDescription() {
		return errDescription;
	}
	//==========================

	/**
	 * @FASCMTC-33
	 * 20-2-23
	 * 
	 */

	public WebElement getParentDateCheck() {
		return parentDateCheck;
	}
	public WebElement getLastModifyBY() {
		return lastModifyBY;
	}

	public WebElement getLastModifyDate() {
		return lastModifyDate;
	}


	//41

	public WebElement getClickCategory() {
		return clickCategory;
	}

//35

	public WebElement getButtonEdit() {
		return buttonEdit;
	}

	public WebElement getButtonDelete() {
		return buttonDelete;
	}
//37

	public WebElement getButtonLocationAuditLog() {
		return buttonLocationAuditLog;
	}

//38

	public WebElement getEditButton() {
		return editButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

//39

	public WebElement getDeleteCategory() {
		return deleteCategory;
	}

	public WebElement getDeleteOkButton() {
		return deleteOkButton;
	}






	//==============================================================
	/**
	 * alertMessage
	 * 
	 */

	public static String alertMessage;
	public static CategoryPage categoryPage ;
	String successAlert;
	
	public String verifySuccessAlert() {

		sleep(2000);
		try {
			successAlert = getText(getVerifyAlertText());


			System.out.println(successAlert +"="+"successAlert text");

		} catch (Exception e) {

			System.out.println(successAlert +"="+"Saved text");
		}	
		jsHighlight(getAlertOkButton());
		click(getAlertOkButton());


		return successAlert;
	}

	
	public  String alertMessageGet(String successAlert) {
		switch (successAlert) {
		
		case "Category  Code  Already  Exists":

			System.out.println("Category  Code  Already  Exists");
			;
			categoryPage =new CategoryPage();
				click(categoryPage.getAlertOkButton());

			break;


		case "Record Saved Successfully. ":

			System.out.println("Record Saved Successfully.");
			categoryPage =new CategoryPage();
			click(categoryPage.getAlertOkButton());
			break;


		case "Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate":

			System.out.println("Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate");
			categoryPage =new CategoryPage();
			click(categoryPage.getAlertOkButton());
			break;


		case "edge":
			System.out.println("Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate");
			categoryPage =new CategoryPage();
			alertMessage = getText(categoryPage.getVerifyAlertText());
			click(categoryPage.getAlertOkButton());
			break;

		default:
			break;
		}
return successAlert;

	}













	public void category() {
		jsHighlight(getMaster());
		sleep(2000);
		moveToElement(getMaster());
		sleep(3000);


		click(getCategory());
		sleep(3000);

		roboEscap();
		sleep(2000);


	}



	public String verifyCategory() {
		jsHighlight(getVerifyText());
		String gettxt = getText(getVerifyText());
		return gettxt;

	}
	//@FASCMTC-03
	public void parentAssetClick() {
		sleep(2000);
		try {

			click(getParentClick());

		} catch (Exception e) {
			jsClick(getParentClick());
			System.out.println("@FASCMTC-03 jsClick is working");
		}
	}

	//FASCMTC-06
	// need a devlopment
	public void parentAssectReturnClick() {
		sleep(2000);
		try {

			click(getParentClick());
		} catch (Exception e) {
			jsClick(getParentClick());
			System.out.println("FASCMTC-06  jsClick is working");
		}

		sleep(2000);
		try {

			click(getParentClick());
		} catch (Exception e) {
			jsClick(getParentClick());
			System.out.println("FASCMTC-06  jsClick is working");
		}
		sleep(2000);

	}

	//@FASCMTC-07
	public void searchCategory(String Category) {

		sendKeys(getSearchCategory(), Category);
		roboEnter();

	}
	//@FASCMTC-08
	public void searchIncorrectCatrgory(String InCategory) {

		sendKeys(getSearchCategory(), InCategory);
		roboEnter();

	}
	//removing the category name on search
	//FASCMTC-09

	public void removeCategory(String Category) {

		sleep(5000);
		sendKeys(getSearchCategory(), Category);
		sleep(2000);
		clearText(getSearchCategory());
		roboEnter();

	}

	//@FASCMTC-11

	public void exportNull() {

		click(getExprotButton());

	}

	public String exportNullAlert() {

		String alertGetText = alertGetText();

		accept();
		return alertGetText;
	}

	//FASCMTC-12

	public void excelFormat() {

		click(getExportDrowDown());
		click(getExcelFormat());
		click(getExprotButton());
	}
	//download is pending 


	//@FASCMTC-13
	public void pdfFormat() {

		click(getExportDrowDown());
		click(getPdfFormat());
		click(getExprotButton());


	}
	//download is pending 

	/**
	 * @FASCMTC-14
	 * download is pending 
	 */
	public void csvFormat() {
		click(getExportDrowDown());
		click(getCsvFormat());
		click(getExprotButton());

	}

	/**
	 * @FASCMTC--15 
	 * download is pending 
	 */
	public void xmlFormat() {
		sleep(2000);
		click(getExportDrowDown());
		try {
			click(getXmlFormat());
		} catch (Exception e) {

			jsClick(getXmlFormat());
			System.out.println("catch on xml format");

		}

		click(getExprotButton());

	}
	//==========================================================================================================================

	/**
	 * 
	 * @param CategoryCode
	 * @param Description
	 */
	public void creatCategory(String CategoryCode,String Description) {


		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}

	String creatCategoryText;
	public String verifyCreatCategoryText() {

		sleep(2000);
		try {
			creatCategoryText = getText(getVerifyAlertText());


			System.out.println(creatCategoryText +"="+"Saved text");

		} catch (Exception e) {

			System.out.println(creatCategoryText +"="+"Saved text");
		}	
		click(getAlertOkButton());


		return creatCategoryText;
	}







	/**
	 * 	//craet child
	 * @param CategoryCode
	 * @param Description
	 */

	public void creatChildCategory(String CategoryCode,String Description) {


		sleep(5000);
		click(getClickParent());
		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());



	}

	String savedText;
	public String verifySaveText() {

		sleep(2000);
		try {
			savedText = getText(getVerifyAlertText());


			System.out.println(savedText +"="+"Saved text");

		} catch (Exception e) {

			System.out.println(savedText +"="+"Saved text");
		}	
		click(getAlertOkButton());


		return savedText;
	}


	/**
	 * @FASCMTC-19
	 * 
	 */
	public void nullCategoryCreate() {
		sleep(5000);
		click(getClickParent());
		click(getCreatButton());


		click(getCreatSaveButton());


	}


	public String errCategoryMsg() {
		String categoryCode = getText(getErrCategoryCode());
		return categoryCode;
	}

	public String errDescriptionMsg() {
		String descriptionMsg = getText(getErrDescription());
		return descriptionMsg;
	}

	//FASCMTC-21
	/**
	 * 
	 * @param CategoryCode
	 * @param Description
	 */
	public void duplicateCode(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}

	String duplicateCodeText;
	public String verifyDuplicateText() {

		sleep(2000);
		try {
			jsHighlight(getVerifyAlertText());
			duplicateCodeText = getText(getVerifyAlertText());


			System.out.println(duplicateCodeText +"="+"Saved text");

		} catch (Exception e) {

			System.err.println(duplicateCodeText +"="+"catch on FASCMTC-21 ");
		}	
		sleep(2000);
		click(getAlertOkButton());


		return duplicateCodeText;
	}


	/**
	 * //@FASCMTC-25
	 * When entering the category code value -1
	 * 
	 */

	public void negativeCode(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}

	String negativeCode;
	public String negativeCodeText() {

		sleep(2000);
		try {
			jsHighlight(getVerifyAlertText());
			negativeCode = getText(getVerifyAlertText());


			System.out.println(negativeCode +"="+"Saved text");

		} catch (Exception e) {

			System.err.println(negativeCode +"="+"catch on FASCMTC-21 ");
		}	
		sleep(2000);
		click(getAlertOkButton());


		return negativeCode;
	}


	public void decimalCode(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());


	}

	/**
	 * 
	 * @FASCMTC-27
	 * 
	 */

	public void greaterTwentyValue(String CategoryCode,String Description) {
		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}
	public String greaterTwentyValue() {

		String enteredCategory = getAttribute(getTxtCategoryCode());

		return enteredCategory;
	}


	/**
	 * FASCMTC-28
	 * morethan 100 letters 
	 * description
	 */

	public void greaterHundredValue(String CategoryCode,String Description) {
		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
		//DD is missing
		click(getCreatSaveButton());

	}

	public String greaterHundredValue() {

		String enteredDescription = getAttribute(getTxtDescription());

		return enteredDescription;
	}

	/**
	 * @FASCMTC-29
	 * blank Description
	 */

	public void blankDescription(String CategoryCode) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);

		click(getCreatSaveButton());
	}
	
	String descriptionMsg;
	public String blankDescription() {
		
		try {
			 descriptionMsg = getText(getErrDescription());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return descriptionMsg;
	}

	/**
	 * @FASCMTC-30
	 * min 1 letter discription
	 * 
	 */

	public void minOneLetter(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);
sleep(3000);
		System.out.println(getTxtCategoryCode()+"="+getTxtDescription());

	}

	//=======================================================================================
	public static String enteredDescription;
	public static 	String enteredCategory;


	public String enteredCategory() {
		try {
			sleep(3000);
			jsHighlight(getTxtCategoryCode());
			enteredCategory = getAttribute(getTxtCategoryCode());


		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("catch  at  enteredCategory ");
		}

		return enteredCategory;
	}

	public String enteredDescription() {
		try {
			sleep(3000);
		//	jsHighlight(getTxtDescription());
			
			enteredDescription = getAttribute(getTxtDescription());
			sleep(5000);
			
			System.out.println("getCreatSaveButton() is working on Description");
			try {
				click(getCreatSaveButton());
				
			} catch (Exception e) {
				
				//e.printStackTrace();
				System.err.println("inner catch os click save button");
				
			}
			

		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("catch  at  enteredDescription ");
		}
		
		//click(getCreatSaveButton());
		return enteredDescription;
	}

	//
	public void clickAlertOk() {

		click(getAlertOkButton());

	}

	
	
	
	//delete the same asset 30
/*	
	public void deleteCategory30() {

		sendKeys(getSearchCategory(), enteredCategory);
		roboEnter();

		sleep(3000);
		
		  click(getDeleteCategory());
			sleep(3000);
		    
		    click(getButtonDelete());
		    
		    
		    
		    sleep(3000);
			 click(getDeleteOkButton());
		       String deleteAlertText = getText(getVerifyAlertText());
		sleep(2000);
		  click(getDeleteOkButton());
	}*/
	
	
	
/*	public void deleteLocation30() {


		
		  click(getDeleteCategory());
			sleep(3000);
		    
		    click(getButtonDelete());
		   
		    
		}
		public String  deleteText30() {

			 click(getDeleteOkButton());
		       String deleteAlertText = getText(getVerifyAlertText());
		sleep(2000);
		  click(getDeleteOkButton());
		   return deleteAlertText;
		}

*/
	
	
	
	
	
	
	
	

	//=======================================================================================


	
	

	/**
	 * @FASCMTC-31
	 * Category code with alphanumeric
	 */


	public void alphanumeric(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);


	}


	/**
	 * @FASCMTC-33
	 * 20-2-23
	 * 
	 */

	public void lastModify(String Category) {

		try {
			sendKeys(getSearchCategory(), Category);
			roboEnter();
			click(getParentDateCheck());
			jsHighlight(getLastModifyBY());
			String modifyBY = getText(getLastModifyBY());
			String modifyDate = getText(getLastModifyDate());


			boolean blankBy = modifyBY.isEmpty();
			boolean blankDate = modifyDate.isEmpty();

			System.out.println(blankDate+"===="+blankBy);

		} catch (Exception e) {
			System.out.println("lastModify catch is working");
		}

	}

	/**
	 * FASCMTC-34
	 * 
	 * 
	 */

	public void childCategoryEdit(String CategoryCode,String Description) {

		click(getCreatButton());
		sendKeys(getTxtCategoryCode(), CategoryCode);
		sendKeys(getTxtDescription(), Description);

	}
	public void alertHandle() {
		try {
			accept();

		} catch (Exception e) {
			System.out.println("childCategoryEdit catch");

		}

	}


	/**
	 * FASCMTC-41
	 * 
	 * 
	 * 
	 */


	public void clickParent() {
		click(getClickParent());
	}

	public void categoryViewButton() {

		click(getButtonView());

	}



/**
 * 
 * 35
 * 
 */
 public void editCategory() {
	click(getClickCategory());
	click(getButtonEdit());

}


public void categoryAndDescription(String CategoryCode,String Description) {
	
	clearText(getTxtCategoryCode());
	clearText(getTxtDescription());
	sendKeys(getTxtCategoryCode(), CategoryCode);
	sendKeys(getTxtDescription(), Description);
	click(getCreatSaveButton());
	
}
/**
 * 
 * 36
 * @param Category
 */


public void update(String CategoryCode,String Description) {
	
	click(getParentDateCheck());
	click(getButtonEdit());
	clearText(getTxtCategoryCode());
	clearText(getTxtDescription());
	sendKeys(getTxtCategoryCode(), CategoryCode);
	sendKeys(getTxtDescription(), Description);
	click(getCreatSaveButton());
	
	


	
	
	
}




public void lastModifyCheck() {

	try {
		
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



//37

public void audit() {
	
	
	
    click(getClickParent());
   
    click(getButtonLocationAuditLog());
    sleep(3000);
    
    
window();
	
	

}

//38

public void editAndCancel() {
	
	  click(getClickParent());
	click(getEditButton());
	sleep(2000);
	click(getCancelButton());

}

//39


public void deleteLocation() {


	
  click(getDeleteCategory());
	sleep(3000);
    
    click(getButtonDelete());
   
    
}
public String  deleteText() {

	 click(getDeleteOkButton());
       String deleteAlertText = getText(getVerifyAlertText());
sleep(2000);
  click(getDeleteOkButton());
   return deleteAlertText;
}

























}
