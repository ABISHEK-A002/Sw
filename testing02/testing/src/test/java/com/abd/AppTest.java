package com.abd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void test1() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.close();
    
    }
    @Test
    public void test2() throws InterruptedException
    {
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver2=new FirefoxDriver();
        driver2.get("https://www..com/");
        driver2.manage().window().maximize();
        Thread.sleep(3000);
        driver2.close();
    }
    @Test
    public void test3() throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        WebDriver driver3=new EdgeDriver();
        driver3.get("https://www.edge.com/");
        driver3.manage().window().maximize();
        Thread.sleep(3000);
        driver3.close();
    }
}
