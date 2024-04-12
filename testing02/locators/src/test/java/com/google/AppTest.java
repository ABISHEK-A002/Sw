package com.google;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    
    @Test
    public void test() throws InterruptedException
    {
            WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
            driver.findElement(By.className("gLFyf" )).sendKeys("Selenium");
            Thread.sleep(3000);
            driver.findElement(By.className("gNO89b" )).click();
            Thread.sleep(3000);
            driver.navigate().back();
            driver.close();
    }
}
