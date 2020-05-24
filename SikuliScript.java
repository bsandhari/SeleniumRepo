package com.functions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class SikuliScript {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		System.setProperty("webdriver.chrome.driver", "D:\\EclipseWorkspace\\SeleniumImpProject\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.get("https://www.youtube.com/watch?v=cs671E8JQo0&list=RDcs671E8JQo0&start_radio=1");
		
		driver.get("https://kids.nationalgeographic.com/videos/");
		clickOn(driver, driver.findElement(By.xpath("//*[@id=\"1168987203766\"]/div[2]/div/div[2]/div/div/div/div[2]/div/a")), 50);
		Screen s =new Screen();
		
		/*Pattern pauseImg= new Pattern("ytpause.png");
		s.wait(pauseImg,5000);
		s.click();
		//s.click();
*/		
		Pattern playImg= new Pattern("ytplay1.png");
		s.wait(playImg,5000);
		s.click();
		s.click();
		
	}
	public static void clickOn(WebDriver driver, WebElement locator, int timeout) {
		new WebDriverWait(driver, timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(locator));
		locator.click();
	}
}
//*[@id="platformPlaylistVideoPlayer_69aapj_html5_api"]
