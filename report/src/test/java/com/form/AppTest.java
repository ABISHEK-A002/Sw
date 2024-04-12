package com.form;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Unit test for simple App.
 */
public class AppTest {
    WebDriver driver;
    ExtentReports extent;

    @BeforeTest
    public void TestInit() {
        extent = new ExtentReports();
        ExtentSparkReporter reporter = new ExtentSparkReporter(
                "C:\\Users\\abish_pnsgm5q\\Desktop\\Selenium Testing Script\\report.html");
        extent.attachReporter(reporter);
        reporter.config().setTheme(Theme.STANDARD);
        reporter.config().setDocumentTitle("Test Report");
    }

    @BeforeMethod
    public void testSetup() throws Exception {        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://max-neo-selenium.netlify.app/");
        driver.manage().window().fullscreen();
    }
    @Test
    public void Test1() throws Exception {
        ExtentTest test1 = extent.createTest("Test 1");
        FileInputStream fs = new FileInputStream("C:\\Users\\abish_pnsgm5q\\Desktop\\Selenium Testing Script\\report\\logindata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
        XSSFRow row = sheet.getRow(1);
        String name = row.getCell(0).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(0).getNumericCellValue()) : row.getCell(0).getStringCellValue();
        String email = row.getCell(1).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(1).getNumericCellValue()) : row.getCell(1).getStringCellValue();
        String dob = row.getCell(2).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(2).getNumericCellValue()) : row.getCell(2).getStringCellValue();
        String rollno = row.getCell(3).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(3).getNumericCellValue()) : row.getCell(3).getStringCellValue();
        String Uname = row.getCell(4).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(4).getNumericCellValue()) : row.getCell(4).getStringCellValue();
        String Pass = row.getCell(5).getCellType() == Cell.CELL_TYPE_NUMERIC ? String.valueOf(row.getCell(5).getNumericCellValue()) : row.getCell(5).getStringCellValue();
      
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div/a[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[2]/button[4]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[1]")).sendKeys(name);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[2]")).sendKeys(email);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[3]")).sendKeys(dob);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[1]/input[4]")).sendKeys(rollno);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
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
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[1]")).sendKeys(Uname);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div/div/div/div/form/span[1]/div[2]/input[2]")).sendKeys(Pass);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='male']")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div/form/span[2]/button")).click();
        Thread.sleep(3000);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div[2]/button[1]")).click();
        Thread.sleep(3000);
        if (driver.getPageSource().contains(name)) {
            test1.log(Status.PASS, "Test 1 : Pass");
        } else {
            test1.log(Status.FAIL, "Test 1 : Fail");
        }
    }
    @Test
    public void Test2() throws Exception {        
        ExtentTest test1 = extent.createTest("Test 2");
        FileInputStream fs = new FileInputStream("C:\\Users\\abish_pnsgm5q\\Desktop\\Selenium Testing Script\\report\\logindata.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fs);
        XSSFSheet sheet = workbook.getSheet("Sheet2");
        XSSFRow row = sheet.getRow(1);
        String Uname = row.getCell(0).getStringCellValue();
        String Pass = row.getCell(1).getStringCellValue();       
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("//*[@id='root']/div[3]/div/a[1]/button")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/button[3]")).click();
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys(Uname);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys(Pass);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.findElement(By.xpath("//*[@id='root']/div/div[1]/button[1]")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        if (driver.getPageSource().contains(Uname)) {
            test1.log(Status.PASS, "Test 2 : Pass");
        } else {
            test1.log(Status.FAIL, "Test 2 : Fail");
        }
    }
    @AfterMethod
    public void testClose() {
        driver.close();
    }

    @AfterTest
    public void destTest() {
        extent.flush();
    }
}
