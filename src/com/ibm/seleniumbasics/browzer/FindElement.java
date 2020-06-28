package com.ibm.seleniumbasics.browzer;


import java.io.FileOutputStream;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FindElement {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		//FirefoxDriver driver = new FirefoxDriver();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://magento.com");
//		WebElement user_icon = driver.findElementByXPath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div");
//		System.out.println(user_icon.getAttribute("Class"));
//		System.out.println(user_icon.getAttribute("Id"));
//		System.out.println(user_icon.getCssValue("background-imag"));
//		Point user_icon_Location = user_icon.getLocation();
//		System.out.println(user_icon_Location);
//		byte[] ss= user_icon.getScreenshotAs(OutputType.BYTES);
//		//FileOutputStream fos = new FileOutputStream("UserIcon.png");
//		
//		FileOutputStream fos = new FileOutputStream("UserIcon.png");
//		fos.write(ss);
		
		
		//user_icon.click();
		
		driver.findElementByXPath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div").click();
		WebElement username = driver.findElementById("email");
		username.clear();
		username.sendKeys("shilpa@gmail.com");
		
		WebElement password = driver.findElementById("pass");
		password.clear();
		password.sendKeys("welcome");
		
		driver.findElementById("send2").click();
		
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id=\"maincontent\"]/div[2]/div[2]/div/div/div"),"Invalid login or password."));
		System.out.println("As Expected");	
		
		
}
}
