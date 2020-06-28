package com.ibm.seleniumbasics.browzer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Initialize {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://Magneto.com");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if(url.startsWith("http"))
		{
			System.out.println("Secured");
		}
		if(url.equals("http://magneto.com/"))
		{
			System.out.println("As Expected");
		}
		
		System.out.println(driver.getCurrentUrl());
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.manage().window().fullscreen();
		//driver.navigate().back();
		//driver.navigate().refresh();
//		driver.close();
//		driver.quit();
	}

}
