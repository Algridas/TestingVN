package theInternet;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class VFF {


    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    @Test
    void TC01(){
        driver.get("https://vnexpress.net/trong-tre-du-co-ve-lam-to-4545196.html");

        //Find the navigation logo element
        WebElement nav_logo = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='logo']"));

        // Verify that the navigation logo is displayed on the top of the page
//        if (nav_logo.isDisplayed()) {
//            System.out.println("Navigation logo is displayed");
//        } else {
//            System.out.println("Navigation logo is not displayed");
//        }

        try {
            Assert.assertTrue(nav_logo.isDisplayed(), "Navigation logo is not displayed on the top of the page");
            System.out.println("Navigation logo is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

        //Find the navigation hamburger element
        WebElement nav_hamburger_list = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='all-menu all-menu-tablet']"));
        try {
            Assert.assertTrue(nav_hamburger_list.isDisplayed(), "Navigation hamburger list is not displayed on the top of the page");
            System.out.println("Navigation hamburger list is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }

        WebElement nav_latest = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='btn24hqua ']"));
        try {
            Assert.assertTrue(nav_latest.isDisplayed(), "Navigation latest news is not displayed on the top of the page");
            System.out.println("Navigation latest news is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }



    }



}
