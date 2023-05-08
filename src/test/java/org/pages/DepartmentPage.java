package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DepartmentPage extends BaseClass {

	public DepartmentPage() {

		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//span[text()='Master']")
	private WebElement master;

	@FindBy(xpath="//span[text()='Department']")
	private WebElement department;

	@FindBy(id="pageHeadingPortion")
	private WebElement verifyText;	


	//Drop down

	@FindBy(xpath="//span[@aria-label='select']")
	private WebElement exportDrowDown;




	@FindBy(xpath="//li[text()='Export To Excel']")
	private WebElement excelFormat;


	@FindBy(xpath="//li[text()='Export To PDF']")
	private WebElement pdfFormat;

	@FindBy(xpath="//li[text()='Export To Csv']")
	private WebElement csvFormat;


	@FindBy(xpath="//li[text()='Export To XML']")
	private WebElement xmlFormat;

	@FindBy(xpath="//a[text()='Export']")
	private WebElement exprotButton;




	/**
	 * 3-5-23
	 * @may3
	 * @FASDPMTC-08
	 * 
	 */

	@FindBy(id="createNewRecordButton")
	private WebElement createNewRecordButton;

	@FindBy(id="pageHeadingPortion")
	private WebElement verifyTextDepartmentCreate;

	@FindBy(xpath="//input[@id='DepartmentCode']")
	private WebElement textDepartmentCode;

	@FindBy(xpath="//input[@id='EntityDescription_1']")
	private WebElement textDescription;

	//savebutton
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveButton;

	@FindBy(id="//input[@value='Cancel']")
	private WebElement cancelButton;


	//err
	@FindBy(xpath="//span[@data-valmsg-for='DepartmentCode']")
	private WebElement errDepartmentcodeText;

	@FindBy(xpath="//span[@data-valmsg-for='EntityDescription_1']")
	private WebElement errDepartmentDescriptionText;

	
	@FindBy(xpath="//div[@class='k-content k-window-content k-dialog-content']")
	private WebElement alertText;

	@FindBy(xpath="//button[normalize-space()='OK']")
	private WebElement alertOkButton;

////td[normalize-space()='T']/..//child::a[@role='button']

	@FindBy(xpath="//td[normalize-space()='T']/..//child::a[@role='button']")
	private WebElement deleteDepartmetT;


	public WebElement getDeleteDepartmetT() {
		return deleteDepartmetT;
	}








	//================================




	


	public WebElement getMaster() {
		return master;
	}

	public WebElement getDepartment() {
		return department;
	}

	public WebElement getVerifyText() {
		return verifyText;
	}
	//==============
	public WebElement getExportDrowDown() {
		return exportDrowDown;
	}

	public WebElement getExcelFormat() {
		return excelFormat;
	}

	public WebElement getPdfFormat() {
		return pdfFormat;
	}

	public WebElement getCsvFormat() {
		return csvFormat;
	}

	public WebElement getXmlFormat() {
		return xmlFormat;
	}

	public WebElement getExprotButton() {
		return exprotButton;
	}


	/**
	 * 3-5-23
	 * @may3
	 * @FASDPMTC-08
	 * 
	 */
	public WebElement getCreateNewRecordButton() {
		return createNewRecordButton;
	}

	public WebElement getVerifyTextDepartmentCreate() {
		return verifyTextDepartmentCreate;
	}




	public WebElement getTextDepartmentCode() {
		return textDepartmentCode;
	}

	public WebElement getTextDescription() {
		return textDescription;
	}


	public WebElement getSaveButton() {
		return saveButton;
	}

	public WebElement getCancelButton() {
		return cancelButton;
	}

	public WebElement getErrDepartmentcodeText() {
		return errDepartmentcodeText;
	}

	public WebElement getErrDepartmentDescriptionText() {
		return errDepartmentDescriptionText;
	}

//16
	public WebElement getAlertText() {
		return alertText;
	}

	public WebElement getAlertOkButton() {
		return alertOkButton;
	}













	//===========================================================







	public void departmentClick() throws InterruptedException {
		sleep(2000);
		jsHighlight(getMaster());

		moveToElement(getMaster());
		sleep(3000);
		jsHighlight(getDepartment());
		click(getDepartment());
	}
	public String verifyDepartment() {
		jsHighlight(getVerifyText());
		String gettxt = getText(getVerifyText());
		return gettxt;

	}

	//===========================
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


	/**
	 * 3-5-23
	 * @may3
	 * @FASDPMTC-08
	 * 
	 */


	public void createNewRecord() {

		try {
			click(getCreateNewRecordButton());
			
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("Add new record button");
		}
		

	}

	public String verifyDepartmentTitle() {

		sleep(3000);
		jsHighlight(getVerifyTextDepartmentCreate());
		String veriftText = getText(getVerifyTextDepartmentCreate());
System.out.println(veriftText);
		return veriftText;
	}


	//@FASDPMTC-09 
	//blankDepartmentCodeAndDescription
	
	public void departmentSaveButton() {

		click(getSaveButton());
	}

	public String ErrDepartmentcodeText() {

		String errCode = getText(getErrDepartmentcodeText());
		
		jsHighlight(getErrDepartmentcodeText());		
		return errCode;

	}

	public String ErrDepartmentDescriptionText() {

		String errDescription = getText(getErrDepartmentDescriptionText());
		jsHighlight(getErrDepartmentDescriptionText());

		return errDescription;

	}


	//@FASDPMTC-09 
	
	public void decimalValue(String DepartmentCode,String Description) {


		sleep(2000);
		
		sendKeys(getTextDepartmentCode(), DepartmentCode);
		sleep(2000);
		
		sendKeys(getTextDescription(), Description);
		
			}

     public String enteredDepartmentCode() {
    	 
		String depCode = getAttribute(getTextDepartmentCode());
            return depCode;

	}
     

     public String enteredDepartmentDescription() {
    	 
		String depDescription = getAttribute(getTextDescription());
            return depDescription;

	}

     
     //14
     public void singleValue(String Code) {
		
    	 sendKeys(getTextDepartmentCode(), Code);

	}

     //16
     
    /* public void departmentCreate(String Code, String Description) {
 		
    	 sendKeys(getTextDepartmentCode(), Code);
    	 sendKeys(getTextDescription(), Description);
  }
     
*/
     
     public  String alertText() {
    	 
    	 sleep(5000);
    	 jsHighlight(getAlertText());
    	 String alertText = getText(getAlertText());
    	 
    	 return alertText;
       }


    public void alertOkClick() {
		
    	sleep(2000);
    	jsHighlight(getAlertOkButton());
click(getAlertOkButton());
    	
	}

public void deteleDepartment(String department) {
	
	sleep(2000);
	System.err.println("deleting the entered asset");
	deleteXpath(department);
	sleep(2000);
	System.err.println(alertGetText());
	accept();
	sleep(2000);
	System.out.println("alert accepted");
	

}



}
