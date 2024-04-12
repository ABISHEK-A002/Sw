package com.ixigo;
import java.time.Duration;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class AppTest 
{
    @Test
	public void roundTrip() 
	{
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
		driver.get("https://www.ixigo.com/");
        driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[1]/div[1]/div/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/div[2]/input")).sendKeys("IDP");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[1]/div[3]/div[1]/li")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div[2]/input")).sendKeys("New Delhi");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/li")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[1]/div/div/div/div/p[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[18]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[2]/div[3]/div/div[1]/div[2]/div[1]/div/div/div[2]/button[21]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[1]/div[2]/div/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[2]/div[2]/div/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/div[5]/div/div[3]/p")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		driver.findElement(By.xpath("/html/body/main/div[2]/div[1]/div[3]/div[2]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
		
	}
}
