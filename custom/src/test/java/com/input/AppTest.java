package com.input;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
    WebDriver driver=null;
    @BeforeMethod
    public void setUp() throws IOException
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://dbankdemo.com/bank/login");
    }
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException, IOException
    {
        FileInputStream fs=new FileInputStream("C:\\Book 5.xlsx");
        XSSFWorkbook workbook=new XSSFWorkbook(fs);
        XSSFSheet sheet=workbook.getSheet("Sheet1");
        XSSFRow row=sheet.getRow(1);
        String username=row.getCell(0).getStringCellValue();
        String pass=row.getCell(1).getStringCellValue();
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(username);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(pass);
        driver.findElement(By.xpath("//*[@id='submit']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains("home"));
    }
    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }
}
