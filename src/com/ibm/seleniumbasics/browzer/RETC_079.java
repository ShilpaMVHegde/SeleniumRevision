package com.ibm.seleniumbasics.browzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RETC_079 {

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
				
				//Click on Properties 
				driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/a/div[3]")).click();
				System.out.println("Properties link clicked");
				
				//Clcik on Features
				driver.findElement(By.xpath("//*[@id=\"menu-posts-property\"]/ul/li[4]/a")).click();
				System.out.println("Features link clicked.");
				
//				//Credentials in Name textbox
				String name = "name";
//				driver.findElement(By.id("tag-name")).sendKeys(name);
//				System.out.println("Credentials in Name textbox provided.");
//				
//				//Credentials in Slug textbox
//				driver.findElement(By.id("tag-slug")).sendKeys("Prep0");
//				System.out.println("Credentials in Slug textbox provided.");
//				
//				//Parent Feature list box
//				Select Parent = new Select(driver.findElement(By.id("parent")));
//				Parent.selectByValue("1366");
//				System.out.println("Parent Feature list box SELECTED.");
//				
//				//Description
//				driver.findElement(By.id("tag-description")).sendKeys("ajgfkjadjkL");
//				System.out.println("Description provided.");
//				
//				//Click on Add New Feature button
//				driver.findElement(By.id("submit")).click();
//				System.out.println("Add New Feature button Clicked.");
				
				//Verification of added details
				
				//Get row count
				int rowcount = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div/form/table/tbody/tr")).size();
				System.out.println("Row count is "+rowcount);
				//System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div/form/table/tbody/tr")).getText()+"***");
				//Get row count
				int colcount = driver.findElements(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div/form/table/tbody/tr[1]/td*")).size();
				System.out.println("Collumn count is "+colcount);
				//System.out.print(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div/form/table/tbody/tr[3]/td[3]")).getText()+"***");
				for(int i=0; i<rowcount; i++ ) {
					for(int j=0; j<colcount; j++) {
						String tablevalue = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/div[1]/div[3]/div[3]/div[2]/div/form/table/tbody/tr[" + i + "]/td[" + i + "]/")).getText()+"***";
						System.out.print(tablevalue);
						if(name==tablevalue)
							System.out.println("*****Name found in the table updated Successfully and RETC_79 is PASSED*****");
						else
							System.out.println("*****Name found in the table updated Successfully and RETC_79 is FAILED*****");
							
					}
					System.out.println();
				
				}
	}

}
