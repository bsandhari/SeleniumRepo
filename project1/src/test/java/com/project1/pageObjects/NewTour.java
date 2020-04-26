package com.project1.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTour {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\GitLocalRepo\\project1\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("bharath");
		driver.findElement(By.name("lastName")).sendKeys("sandhari");
		driver.findElement(By.name("phone")).sendKeys("9123456789");
		driver.findElement(By.id("userName")).sendKeys("bharath@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("HYD");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("Telangana");
		driver.findElement(By.name("postalCode")).sendKeys("500058");
		driver.findElement(By.id("email")).sendKeys("bharath");
		driver.findElement(By.name("password")).sendKeys("bharath");
		driver.findElement(By.name("confirmPassword")).sendKeys("bharath");
		driver.findElement(By.name("register")).click();
		
		driver.findElement(By.linkText("sign-in")).click();
		
		driver.findElement(By.name("userName")).sendKeys("bharath");
		driver.findElement(By.name("password")).sendKeys("bharath");
		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		driver.close();
		
		System.out.println("Registered successfully");
		

	}

}
