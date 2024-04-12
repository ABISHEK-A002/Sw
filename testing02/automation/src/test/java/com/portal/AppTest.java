package com.portal;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest 
{
    @Test
    public void portal() throws InterruptedException
    {
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get("https://skct892.examly.io");
       driver.manage().window().maximize();
       Thread.sleep(3000);
       driver.findElement(By.id("email")).sendKeys("22ads.abishek.a@skct.edu.in");
       Thread.sleep(3000);
       driver.findElement(By.cssSelector(".t-bg-primary")).click(); 
       Thread.sleep(10000);
       driver.findElement(By.id("password")).sendKeys("AB@150604");
       Thread.sleep(5000);
       driver.findElement(By.cssSelector(".t-bg-primary")).click(); 
       Thread.sleep(5000);
       driver.findElement(By.cssSelector(". t-py-20 ")).click(); 
       Thread.sleep(5000);
       driver.findElement(By.cssSelector(".t-to-primary/10")).click(); 
       Thread.sleep(5000);
    }
}
