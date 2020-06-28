package com.ibm.seleniumbasics.browzer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("http://magento.com");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div")));
		driver.findElementByXPath("//*[@id=\"block-header\"]/ul/li[9]/a/span[1]/div").click();
			
		//wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("register")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.id("register")));
		driver.findElement(By.id("register")).click();
		
		WebElement first_name = driver.findElementById("firstname");
		first_name.clear();
		first_name.sendKeys("Silly");
		
		WebElement last_name = driver.findElementById("lastname");
		last_name.clear();
		last_name.sendKeys("Lilly");
		
		WebElement email = driver.findElementById("email_address");
		email.clear();
		email.sendKeys("silly@gmail.com");
		
		
		Select primary_comp = new Select(driver.findElement(By.id("company_type")));
		primary_comp.selectByValue("selling");
		
		Select role = new Select(driver.findElement(By.id("individual_role")));
		role.selectByValue("business/sales/marketing/merchandising");
		
		Select country = new Select(driver.findElement(By.id("country")));
		country.selectByValue("BS");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("Welcome@12345");
		
		WebElement confirm_pwd = driver.findElement(By.id("password-confirmation"));
		confirm_pwd.clear();
		confirm_pwd.sendKeys("Welcome@12345");
			
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"msp-recaptcha-d84b65fc916e7398083ea5f17089d8f1\"]/div/div/iframe")));
		driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")).click();
		driver.switchTo().defaultContent();
		
		if(!driver.findElement(By.id("agree_terms")).isSelected())
			driver.findElement(By.id("agree_terms")).click();

		
		driver.findElement(By.partialLinkText("Back")).click();
		
	}	
}
