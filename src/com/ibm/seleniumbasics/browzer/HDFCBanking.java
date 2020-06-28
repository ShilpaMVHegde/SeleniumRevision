package com.ibm.seleniumbasics.browzer;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HDFCBanking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,30);
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.switchTo().frame("footer");
		driver.findElement(By.partialLinkText("Terms and Conditions")).click();
		driver.switchTo().defaultContent();
		
		String Parent = driver.getWindowHandle();
		Set<String> winids = driver.getWindowHandles();
		
		driver.switchTo().window((String) winids.toArray()[1]);
		driver.findElement(By.partialLinkText("HDFC Ltd")).click();
		driver.close();
		
		Set<String> winids1 = driver.getWindowHandles();
		driver.switchTo().window((String) winids1.toArray()[1]);
		driver.findElement(By.xpath("//*[@id=\"HomepageModalVideo\"]/div/div/div[1]/button")).click();
		
		
		driver.quit();
		
	}

}
