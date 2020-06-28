package com.ibm.seleniumbasics.browzer;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwitchWindow {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://Google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		driver.findElement(By.linkText("Sign in")).click();
		
		String Parent = driver.getWindowHandle();
		Set<String> winids = driver.getWindowHandles();
		
		driver.switchTo().window((String) winids.toArray()[1]);
		
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId")).sendKeys("shilpa@gmail.com");
		driver.findElementByXPath("//*[@id=\"identifierNext\"]/div/span/span").click();
		driver.close();
		//driver.switchTo().window(Parent);
		driver.switchTo().window((String) winids.toArray()[0]);
		
		driver.findElementByLinkText("For Work").click();
		
		String Parent1 = driver.getWindowHandle();
		Set<String> winids1 = driver.getWindowHandles();
		driver.close();
		
		driver.switchTo().window(Parent);
				
	}
}
