package com.Selenium.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LocatorClassName {
	
	public void TestDemo() throws Exception() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		Thread.sleep(5000);
		
		try {
			driver.findElement(By.xpath("//img[@alt='Vitamin Drinks category product example']")).click();
			driver.findElement(By.className("")).click();		}
	}

    WebDriver driver;

    
}
