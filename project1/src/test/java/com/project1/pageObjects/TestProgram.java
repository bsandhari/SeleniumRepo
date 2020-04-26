package com.project1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\GitLocalRepo\\project1\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "D:\\GitLocalRepo\\project1\\Drivers\\geckodriver.exe");
		 
		WebDriver driver1 =new ChromeDriver();
		WebDriver driver2 = new FirefoxDriver();
		driver1.get("https://www.google.com/");
		driver2.get("https://www.google.com/");
		driver1.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		driver2.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div[1]/div[1]/a")).click();
		//driver.close();

	}

}
