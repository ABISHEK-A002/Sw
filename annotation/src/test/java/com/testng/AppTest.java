package com.testng;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest 
{
    WebDriver driver;
    @BeforeTest
    public void setUp() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
    }
    @Test
    public void Popups() 
    {
        driver = new ChromeDriver();
        driver.get("https://max-neo-selenium.netlify.app/");
        driver.manage().window().fullscreen();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div/a[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[2]/button[4]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[1]")).sendKeys("ABISHEK A");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[2]")).sendKeys("727822tuad002@skct.edu.in");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[3]")).sendKeys("15062004");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[4]")).sendKeys("727822TUAD002");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[1]/option[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[2]/option[11]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/select[2]/option[11]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[1]")).sendKeys("ABD");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[2]")).sendKeys("ABD2004");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='male']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[2]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[3]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("ABD");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("ABD2004");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
    }
    @AfterTest
    public void tearDown() {
        driver.manage().window().minimize();
        driver.quit();
    }
}
