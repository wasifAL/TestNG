package org.example;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.fail;

import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
public class TestNG {

    private static final WebElement OK = null;
    private static final Object Dynamicmsg = null;
    public String baseUrl = "http://120.50.6.187:7000/LogIn.aspx";
    String driverPath = "C:\\Users\\user\\Desktop\\geckodriver.exe";
    public WebDriver driver;
    private String string;

    public static void main(String[] args) throws InterruptedException {
        TestNG testNG= new TestNG();
        testNG.verifyHomepageTitle();
    }
    @Test // HomePage TITLE
    public void verifyHomepageTitle() throws InterruptedException {

        System.out.println("WELCOME TO VAT PROMPT TITLE");
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new FirefoxDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome to Automated VAT Management";
        String actualTitle = driver.getTitle();
        AssertJUnit.assertEquals(actualTitle, expectedTitle);
    }

    @Test(priority = 1) // LOGIN
    public void login() throws InterruptedException {

        System.out.println("WELCOME TO VAT PROMPT LOGIN PAGE");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("http://120.50.6.187:7000/LogIn.aspx");
        Thread.sleep(300);
        WebElement username = driver.findElement(By.id("ContentPlaceHolder1_txtUserId"));
        WebElement password = driver.findElement(By.id("ContentPlaceHolder1_txtPassword"));
        WebElement login = driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnLogin\"]"));
        username.sendKeys("test");
        password.sendKeys("123");
        login.click();
        String actualUrl = "http://120.50.6.187:7000/Bss_unt.aspx";
        String expectedUrl = driver.getCurrentUrl();
        AssertJUnit.assertEquals(expectedUrl, actualUrl);
        if (actualUrl.equalsIgnoreCase(expectedUrl)) {
            System.out.println("LOGIN PASSED");
        } else {
            System.out.println("LOGIN FAILED");
        }
        Thread.sleep(300);
        Thread.sleep(300);
        Thread.sleep(300);
        Thread.sleep(300);

        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_drpSchema\"]")).click();
        Select dropdown = new Select(driver.findElement(By.id("ContentPlaceHolder1_drpSchema")));
        dropdown.selectByVisibleText("Bangladesh Thai Aluminium Ltd.");
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_drpBusinessUnitBranch\"]")).click();
        Select dropdown1 = new Select(driver.findElement(By.id("ContentPlaceHolder1_drpBusinessUnitBranch")));
        dropdown1.selectByVisibleText("Head Office");
        // Thread.sleep(300);
        driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_btnBusinessUnit\"]")).click();
        Thread.sleep(300);
        Thread.sleep(300);}
    @Test(priority = 3) // Local
    public void Local_purchase() throws InterruptedException {
        driver.get("http://120.50.6.187:7000/UI/Purchase/Purchase_Challan_11.aspx");
        Thread.sleep(300);
        Thread.sleep(300);

        int count = driver.findElements(By.cssSelector("#MainContent_gvItem .grid_row_style ")).size();

        while (true) {
            driver.findElement(By.id("select2-MainContent_drpItem-container")).click();
            WebElement dropdown299 = driver.findElement(By.id("select2-MainContent_drpItem-container"));
            driver.findElement(By.className("select2-search__field")).sendKeys("NAPA-" + Keys.ENTER);
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtQuantity")).sendKeys("10000");
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtPurchaseUnitPrice")).sendKeys("100");
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtTotalPrice")).click();
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_btnAdd")).click();
            Thread.sleep(300);
            Thread.sleep(300);
            ////////////////////////////////////////////
            driver.findElement(By.id("select2-MainContent_drpItem-container")).click();
            WebElement dropdown999 = driver.findElement(By.id("select2-MainContent_drpItem-container"));
            driver.findElement(By.className("select2-search__field")).sendKeys("RAPID-" + Keys.ENTER);
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtQuantity")).sendKeys("10000");
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtPurchaseUnitPrice")).sendKeys("100");
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtTotalPrice")).click();
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_btnAdd")).click();
            Thread.sleep(300);
            Thread.sleep(300);

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


            driver.findElement(By.id("select2-MainContent_drpItem-container")).click();
            WebElement dropdown99 = driver.findElement(By.id("select2-MainContent_drpItem-container"));
            driver.findElement(By.className("select2-search__field")).sendKeys("RAPID PLUS-" + Keys.ENTER);
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtQuantity")).sendKeys("10000");
            Thread.sleep(300);
            Thread.sleep(300);
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtPurchaseUnitPrice")).sendKeys("100");
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_txtTotalPrice")).click();
            Thread.sleep(300);
            driver.findElement(By.id("MainContent_btnAdd")).click();
            Thread.sleep(300);
            Thread.sleep(300);

            //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            ///////////////////////////////////////////////////////////////////////////////////

            break;
        }

        if (count < driver.findElements(By.cssSelector("#MainContent_gvItem .grid_row_style")).size()) {
            count++;
            System.out.println("Number of ROW Inserted: " + count);
        }

        else {
            System.out.println(count);
        }

        driver.findElement(By.id("select2-MainContent_drpRegType-container")).click();
        WebElement dropdown33 = driver.findElement(By.id("select2-MainContent_drpRegType-container"));
        driver.findElement(By.className("select2-search__field")).sendKeys("Regular Registered (VAT)" + Keys.ENTER);
        Thread.sleep(300);
        Thread.sleep(300);
        Thread.sleep(300);

        driver.findElement(By.id("select2-MainContent_drpParty-container")).click();
        WebElement dropdown34 = driver.findElement(By.id("select2-MainContent_drpParty-container"));
        driver.findElement(By.className("select2-search__field")).sendKeys("WZ SUNAN" + Keys.ENTER);
        Thread.sleep(300);
        Thread.sleep(300);
        Thread.sleep(300);
        driver.findElement(By.id("MainContent_txtChallanNo")).sendKeys("Z-1");
        Thread.sleep(300);
        Thread.sleep(300);

        //driver.findElement(By.id("MainContent_btnAdd")).click();//add item
        //Thread.sleep(300); Thread.sleep(300);
        driver.findElement(By.id("MainContent_ClientButton")).click(); // add client
        WebElement option2 = driver.findElement(By.xpath("//*[@id=\"MainContent_chkBkash\"]")); // Check bKash
        Thread.sleep(300);
        option2.click();
        Thread.sleep(300);
        Thread.sleep(300); //
        driver.findElement(By.id("MainContent_txtbKashAmount")).clear(); // Click Bkash Amount
        Thread.sleep(3000); //
        driver.findElement(By.id("MainContent_txtbKashAmount")).sendKeys("100"); // Enter Bkash Amount
        Thread.sleep(3000);
        driver.findElement(By.id("MainContent_OKButton")).click(); // Confirm
        Thread.sleep(3000);
        Alert simpleAlert = driver.switchTo().alert(); // Alert BOX
        simpleAlert.accept();
        Thread.sleep(300); Thread.sleep(300);
        driver.findElement(By.id("MainContent_btnSave")).click();
        Thread.sleep(300);
        string = driver.findElement(By.cssSelector("#MainContent_msgBox_grvMsg tr:last-child td:last-child")).getText();
        driver.findElement(By.id("MainContent_msgBox_btnOK")).click();
        System.out.println();
        System.out.println(string);
        System.out.println();
        Thread.sleep(300);
        //string = driver.findElement(By.id("MainContent_drpParty")).getText();
        if (string.indexOf("Purchase Information Successfully Saved.") >= 0) {
            System.out.println("Local Purchase Passed");
            System.out.println();
        } else {
            System.out.println("Local Purchase Failed");System.out.println();}
    }
}
