package com.Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LocatersSelenium {
	String baseurl = "https://practicetestautomation.com/practice-test-login/";
	String baseBackurl = "https://www.google.com/";
	String BaseNavurl = "https://www.ajio.com/";
	
	@Test 
	public void LocatersDemo() { 
		WebDriver driver;
		driver = new ChromeDriver();
		driver.navigate().to(baseurl);
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/section/section/div[1]/button")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
				
	}

}