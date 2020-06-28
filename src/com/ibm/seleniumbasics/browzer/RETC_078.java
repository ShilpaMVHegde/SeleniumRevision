package com.ibm.seleniumbasics.browzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RETC_078 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				//FirefoxDriver driver = new FirefoxDriver();
				ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				WebDriverWait wait = new WebDriverWait(driver,30);
				driver.get("http://realty-real-estatem1.upskills.in/admin");
				
				//Login to Real estate site as admin
				driver.findElement(By.id("user_login")).clear();
				driver.findElement(By.id("user_login")).sendKeys("admin");
				
				driver.findElement(By.id("user_pass")).clear();
				driver.findElement(By.id("user_pass")).sendKeys("admin@123");
				
				driver.findElement(By.name("login")).click();
				
				//Click on Users link 
				driver.findElement(By.id("menu-users")).click();
				System.out.println("Users link clicked");
				
				//Click on Add New link 
				driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/a")).click();
				System.out.println("Add New button clicked");
				
				//Provide username 
				driver.findElement(By.id("user_login")).clear();
				driver.findElement(By.id("user_login")).sendKeys("SillyLilly");
				System.out.println("Username provided");
				
				//Provide on Email link 
				driver.findElement(By.id("email")).clear();
				driver.findElement(By.id("email")).sendKeys("SillyLilly");
				System.out.println("Email provided");
				
				//firstname provided 
				driver.findElement(By.id("first_name")).clear();
				driver.findElement(By.id("first_name")).sendKeys("SillyLilly");
				System.out.println("Firstname provided");
				
				//lastname provided 
				driver.findElement(By.id("last_name")).clear();
				driver.findElement(By.id("last_name")).sendKeys("SillyLilly");
				System.out.println("Lastname provided");
				
				//URL detail provided 
				driver.findElement(By.id("url")).clear();
				driver.findElement(By.id("url")).sendKeys("SillyLilly.com");
				System.out.println("URL provided");
				
				//Click Show Password
				driver.findElement(By.xpath("//*[@id=\"createuser\"]/table/tbody/tr[6]/td/button")).click();
				System.out.println("Clicked Show Password");
				
				//Enter Password
				driver.findElement(By.id("pass1-text")).clear();
				driver.findElement(By.id("pass1-text")).sendKeys("SillyLilly123.com");
				System.out.println("Password provided");
				
				Select role = new Select(driver.findElement(By.id("role")));
				role.selectByValue("agent");
				
				
				//Click Add New User
				driver.findElement(By.id("createusersub")).click();
				System.out.println("Clicked Add New User");
				
				//Capture Error
				String Error = driver.findElement(By.xpath("//*[@id=\"wpbody-content\"]/div[3]/div[2]/p/strong")).getText();
				System.out.println("Error displayed :  *"+Error+"*");
				
				String Expected = "ERROR";
				System.out.println("Expected displayed : *"+Expected+"*");
				if(Error==Expected)
					System.out.println("Error displayed and RETC_078 TC is PASSED");
				else
					System.out.println("Error displayed and RETC_078 TC is FAILED");
	
	}
}
