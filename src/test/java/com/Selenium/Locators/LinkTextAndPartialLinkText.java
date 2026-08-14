package com.Selenium.Locators;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinkTextAndPartialLinkText {
    WebDriver driver;

    @BeforeTest
    public void Setup() throws Exception {
        driver = new ChromeDriver();
        driver.get("https://www.hollandandbarrett.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        try {
            driver.findElement(By.xpath("//div[@class='SlimGlobalBannerWidget-module_wrapper__BgXag']")).click();
            System.out.println("Banner closed");
        } catch (Exception e) {
            System.out.println("Banner not found");
        }
    }

    @Test
    public void linkTest() throws Exception {
        driver.findElement(By.partialLinkText("Vitamins")).click();
        System.out.println("Clicked on Vitamins link");
        List<WebElement> links = driver.findElements(By.xpath("//a"));
        int nolinks = links.size();
        System.out.println("No.of Links in holland&barrett Application: " + nolinks);
        for (int i = 0; i < links.size(); i++) {
            String str = links.get(i).getText();
            System.out.println(str);
            if (str.equals("Vitamins")) {
                System.out.println("Found Vitamins link again, clicking...");
                driver.findElement(By.linkText("Vitamins")).click();
            }
        }
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
