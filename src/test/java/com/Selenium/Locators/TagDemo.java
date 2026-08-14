package com.Selenium.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagDemo {
	String baseurl = "https://www.hollandandbarrett.com/";
	 @Test(priority = 0)
	    public void ChromeCaseStudy() throws InterruptedException {
	        WebDriver driver = new ChromeDriver();
	        driver.navigate().to(baseurl);
	        driver.manage().window().maximize();

	        driver.findElement(By.id("name")).sendKeys("student");
	        driver.findElement(By.id("email")).sendKeys("student@test.com");
	        driver.findElement(By.id("password")).sendKeys("Password123"); 
	        String URL = driver.getTitle();
	        System.out.println(URL);

	        String pageSource = driver.getPageSource();
	        int leni = pageSource.length();
	        System.out.println(leni);

	        Thread.sleep(2000);
	        driver.quit();
	    }
}
