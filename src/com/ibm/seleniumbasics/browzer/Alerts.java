package com.ibm.seleniumbasics.browzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
//		driver.get("http://echoecho.com/javascript4.htm");
//		
//		driver.findElement(By.name("B3")).click();
//		System.out.println(driver.switchTo().alert().getText());
//		//driver.switchTo().alert().accept();
//		//Thread.sleep(3000);
//		driver.switchTo().alert().sendKeys("Hello");
//		driver.switchTo().alert().dismiss();
		
		driver.get("http://naukri.com");
		driver.findElement(By.id("wdgt-file-upload")).sendKeys("C:\\Reskill Program\\Robert_RFA.pdf");
		//driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
