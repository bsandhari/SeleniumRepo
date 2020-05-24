package com.functions;

import java.util.List;
import java.util.concurrent.TimeUnit;

//import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsefullCode1 {

	public static void main(String[] args) {
		
// Google Search
		
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\SeleniumImpProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://google.com");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("vitech");
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbtc']"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("vitech systems asia")) {
				list.get(i).click();
				break;
				
			}
		}
		
//-------------------------Calendar----------------------------------------------------------------------------------------
	/*	String date="09-September-1999";
		String datearr[]=date.split("-");
		String year = dateArr[2];
		
		Select select1 =new Select(driver.findElement(By.id("//@id")));
		select1.selectByVisibleText(month);
		Select select1 =new Select(driver.findElement(By.id("//@id")));
		select1.selectByVisibleText(year);
		String beforexpath="//*[@id='calender']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterxpath="]/td[";
		final int totalWeekDays=7;
		boolean flag=true;
		for(int rowNum=2; rowNum<=7; rowNum++) {
			for(int colNum=1;colNum<totalWeekDays;colNum++) {
				String dayVal=driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).getText();
				System.out.println(dayVal);
				if(dayVal.equals(day)) {
					driver.findElement(By.xpath(beforexpath+rowNum+afterxpath+colNum+"]")).click();
					flag=true;
					break;
				}
			}
			if(flag) {
				break;
			}
		}
---------------------------------------------------
		public static void selectDateByJS(webDriver driver, WebElement element, String date) {
	     JavascriptExecutor js= ((JavascriptExecutor)driver);
	     js.executeScript("arguments[0].setAttribute('value','"+dateVal+"');", element)
}
-------------------------------------------------------------------------------------------------------
//https://www.youtube.com/watch?v=cs671E8JQo0&list=RDcs671E8JQo0&start_radio=1
*/	}

}
