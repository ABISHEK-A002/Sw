package com.text;
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
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://max-neo-selenium.netlify.app/");
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/form/span/input[1]")).sendKeys("ABISHEK A");
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/form/span/input[2]")).sendKeys("727822tuad002@skct.edu.in");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/form/span/button")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[30]/div/button[1]")).click();
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/form/span/input[1]")).sendKeys("ABISHEK ARUMUGAM");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/form/span/input[2]")).sendKeys("abishekarumugam2004@gmail.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("/html/body/div[1]/form/span/button")).click();

    }
}
