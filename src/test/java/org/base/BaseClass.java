package org.base;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author JAYAVEL
 * @description To maintain the reusable codes 
 * @CreationDate 24/116/2022
 *
 */

public class BaseClass {


	public	static WebDriver driver;

	/**
	 * 
	 * @param browserType
	 * @description To launch the particular browser by given parameter
	 * 
	 */


	public static void getDriver(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;


		case "IE":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;


		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;


		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			break;
		}

	}
	/*public static void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}*/

/**
 * chrome options
 * 
 */
	public void chromeOptions() {
		ChromeOptions options = new ChromeOptions();

		options.addExtensions(new File("/path/to/extension.crx"));

	 driver = new ChromeDriver(options);
		
	/*	MutableCapabilities capabilities = new MutableCapabilities();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");  // ChromeOptions for starting chrome in incognito mode

		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		// other capability declarations
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("browserVersion", "latest");
		HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
		browserstackOptions.put("os", "Windows");
		browserstackOptions.put("osVersion", "10");
		capabilities.setCapability("bstack:options", browserstackOptions);
		public static final String URL = "https://YOUR_USERNAME:YOUR_ACCESS_KEY@hub-cloud.browserstack.com/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(URL), capabilities);*/
	
	}
	
	
	

	/**
	 * 
	 * @param key
	 * @return String
	 * @throws IOException
	 */


	public String getPropertyFileValue(String key) throws IOException {
		Properties properties = new Properties();
		//	File file = new File(System.getProperty("user.dir")+"\\config.properties");
		//	FileInputStream fileInputStream = new FileInputStream(file);
		//	properties.load(fileInputStream);
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\config.properties"));
		Object object = properties.get(key);
		String value = (String)object;
		return value;
	}

/**
	 * 
	 * @param url
	 * 
	 */
	public static void getUrl(String url) {
		driver.get(url);
	}

	public void sendKeys(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void click(WebElement element) {
		element.click();
	}

	public void getTitle() {
		driver.getTitle();
	}

	public void clearText(WebElement element) {
		element.clear();

	}

	public void close() {
		driver.close();

	}


	public static void sleep(long s)  {
		
		try {
			
			Thread.sleep(s);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("sleep is working");
		}
	}
	//navi
	public void naviUrl(String url) {
		driver.navigate().to(url);

	}
	public void forward() {
		driver.navigate().forward();
	}
	public void backward() {
		driver.navigate().back();
	}

	public void refresh() {
		driver.navigate().refresh();

	}

	public static void quit() {
		driver.quit();

	}
	public static void impWait() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	
	public static void webDriverWait() {
//		WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='module-tabs-tab']//a[text()='Scans']")));
	
	}
	
//	WebElement scanEle =new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='module-tabs-tab']//a[text()='Scans']")));
	
	
	
	
	
	/**
	 * 
	 * 
	 * @param attribute
	 * @return WebElement
	 * 
	 */



	public WebElement findByName(String attribute) {
		WebElement findElement = driver.findElement(By.name(attribute));
		return findElement;
	}

	public static WebElement findById(String attribute) {
		WebElement findElement = driver.findElement(By.id(attribute));
		return findElement;
	}

	public WebElement findByClass(String attribute) {
		WebElement findElement = driver.findElement(By.className(attribute));
		return findElement;
	}

	public WebElement findByXpath(String attribute) {
		WebElement findElement = driver.findElement(By.xpath(attribute));
		return findElement;
	}

	public WebElement findByCss(String cssSelector) {
		
		WebElement findElement = driver.findElement(By.cssSelector(cssSelector));
		return findElement;
	}
	/**
	 * Action  maximize the window
	 * 
	 * 
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}



	public static String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	// getAttribute value
	public String getAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	/**
	 * 
	 * @param element
	 * @return void
	 */

	// select
	public void selectByAttribute(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByValue(text);
	}

	public void selectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	public WebElement getFirstSelectedOption(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
		;
	}

	public void deSelectByVisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	//alert

	public static void accept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	public void dismiss() {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	public void alertSendKeys(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}	
	public String alertGetText() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}

	/**
	 * 
	 * @param element
	 * @description javaScript executor
	 * 
	 */
	
	public void jsClick(WebElement element) {
		JavascriptExecutor executor =  (JavascriptExecutor) driver;


		executor.executeScript("arguments[0].click()", element);

	}

	public void jsHighlight(WebElement element) {

		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;  
		jsExecutor.executeScript("arguments[0].style.background='yellow'", element);  
	}


	public void deleteXpath(String Delete) {
		
		//WebElement xptha = driver.findElement(By.xpath("//td[normalize-space()='"+Delete+"']/..//child::a[@role='button']"));
	
		
		findByXpath("//td[normalize-space()='"+Delete+"']/..//child::a[@role='button']").click();
		System.err.println(Delete);

	}
	
	
	
	
/*
 * javascript send keys
 * 
 */
	
	public void jsText(WebElement element, String text) {
		JavascriptExecutor executor =  (JavascriptExecutor) driver;
        
		//driver = new FirefoxDriver();
		executor.executeScript("arguments[0].setAttribute('value', '" + text +"')", element);
	}
        
	public void dragAndDrop(WebElement source,WebElement destination) {
		 Actions actions = new Actions(driver);
		 actions.dragAndDrop(source, destination);
	}
	
	
	public void moveToElement(WebElement elem) {
		 Actions actions = new Actions(driver);

		 actions.moveToElement(elem).perform();
	}
	
	public void moveToElementDecode(WebElement elem) {
		 Actions actions = new Actions(driver);

		 actions.moveToElement(elem);

	}
	
	
	public void roboEnter()  {
		try {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		


	}
	
	
	public void roboEscap()  {
		try {
			
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ESCAPE);
			robot.keyRelease(KeyEvent.VK_ESCAPE);
		} catch (Exception e) {
			e.printStackTrace();
		}
		}
	
	
	
	
	public void frame(int index) {
		driver.switchTo().frame(index);
	}
	
	
	
	/**
	 * window handle
	 */
	

	public void window() {
		driver.switchTo().defaultContent();
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}




//robot.keyPress(KeyEvent.VK_TAB);
//robot.keyRelease(KeyEvent.VK_TAB);
/*	
public void robot() throws AWTException {
	Robot robot = new Robot();
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
}*/



/*	public String getData(String sheetName, int rowNum, int cellnum) throws IOException {

		String res = null;
		File file = new File("C:\\Users\\LENOVO\\eclipse new\\testNg\\excelSheet\\TestNG.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);

		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();

		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();

			break;
		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				//java.util.Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
				res = dateFormat.format(dateCellValue);

			} else {
				double numericCellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
				res = valueOf.toString();
			}
			break;
		default:
			break;
		}

		return res;
	}

	// method 2 -------

	public void upateData(String sheetName, int rowNum, int cellnum, String oldData, String newData)
			throws IOException {

		File file = new File("C:\\Users\\LENOVO\\eclipse new\\testNg\\excelSheet\\TestNG.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);

		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellnum);
		String stringCellValue = cell.getStringCellValue();

		if (stringCellValue.equals(oldData)) {
			cell.setCellValue(newData);

		}
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);

	}

	// method 3 -------create cell

	public void writeData(String sheetName, int rowNum, int cellnum, String data) throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse new\\testNg\\excelSheet\\TestNG.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNum);
		Cell createCell = row.createCell(cellnum);
		createCell.setCellValue(data);

		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

	public void inData(String sheetName, int rowNum, int cellnum, String data) throws IOException {
		File file = new File("C:\\Users\\LENOVO\\eclipse new\\testNg\\excelSheet\\TestNG.xlsx");
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.createRow(rowNum);
		Cell createCell = row.createCell(cellnum);
		createCell.setCellValue(data);

		FileOutputStream fileOutputStream = new FileOutputStream(file);
		workbook.write(fileOutputStream);
	}

 */	