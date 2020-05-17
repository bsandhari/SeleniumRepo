/*package com.functions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsefullCode {

	public static void main(String[] args) throws IOException {
		
		//System.setProperty("webdriver.gecko.driver", "D:\\EclipseWorkspace\\SeleniumImpProject\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\SeleniumImpProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//----------------------------------------------------------------------------------	
		// To launch Safari browser (No driver required)
		//1. Use safari extension for selenium
		//2. Allow Remote Automation;
	//--------------------------------------------------------------------	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Explicit Wait function calling
		  clickOn(driver, driver.findElement(By.id("@id")), 30);
	//----------------------------------------------------------------------------------	
		driver.get("hhtp://google.com");
		//---------------------------------------------------------
		WebDriver driver1 = new HtmlUnitDriver();//ghost driver or headless browser
	//---------------------------------------------------------------
			// Locators: id, name, xpath, class name, linkText, partiallinkText, CSS selector,tagname 	
	//------------------------------------------------------------------------------------------
		
		Alert alert = driver.switchTo().alert();// To handle JS popups/alerts
		alert.getText();
		alert.accept();
		alert.dismiss();
	//-------------------------------------------------------------------------
		
		driver.findElement(By.xpath("xpath")).sendKeys("d://files//test.pdf");// to upload file from the browser
	//--------------------------------------------------------------------------------------------------
		driver.switchTo().frame(0);// used to handle frames(Can be int or str)
		
	//---------------------------------------------------------------------------------------------
		
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.id("@id"))).build().perform();// Mouseover movement
		
		action.clickAndHold(driver.findElement(By.id("@id"))).moveToElement(driver.findElement(By.id("@id"))).release().build().perform();
	//------------------------------------------------------------------------------------
		//Xpath variations
		//----------------------
		
		//1. //input[@class='loginbtn']
			 //input[contains(@id,'username')]
			 //a[contains(text(),'link3')]
		//2. //input[starts-with(@id,'name-')]
		//3. //input[ends-with(@id, '-page')]
	//=============================================================================================================
		driver.get("http://facebook.com");
		driver.navigate().to("www.google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//-------------------------------------------
	  File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//To take scrrenshot
	  FileUtils.copyFile(src, new File("d://images"));
//----------------------------------------------------------------------------------	  
	
	//Handling browser popup
	  
	  Set<String> handle= driver.getWindowHandles();
	  Iterator<String> it= handle.iterator();
	  it.next();
	  driver.switchTo().window("childwindowid");
	//----------------------------------------------------
// Code to use Properties file	  
	  Properties prop = new Properties();
	  FileInputStream io = new FileInputStream("d://index.doc");
	  prop.load(io);
	  prop.getProperty("URL");
	  
	//Javascript Executor
	  WebElement lgbtn=driver.findElement(By.id("@id"));
	  flash(lgbtn,driver);
	  
	    
	
	}
//===============================================================================================================	
	//Explicit Wait function	
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();	
//==============================================================================================
	//Javascript Executor
	
 public static void flash(WebElement element, WebDriver driver)	{
	 JavascriptExecutor js= ((JavascriptExecutor)driver);
	 String bgcolor = element.getCssValue("backgroundColor");
	 for(int i=0;i<100;i++) {
		 changeColor("rgb(0,200,0)",element,driver);
		 changeColor(bgcolor,element,driver);
	 }
 }	
 public static void changeColor(String color, WebElement element, WebDriver driver) {
	 JavascriptExecutor js= ((JavascriptExecutor)driver);
	 js.executeScript("argument[0].style.backgroundcolor= '" +color+ "'", element);
	 try {
		Thread.sleep(200);
	} catch (InterruptedException e) {
		
	}
 }
		
	

	}

}
*/