package theInternet;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import org.testng.annotations.Test;

public class DynamicWait {
    WebDriver driver;

    @Test
    void waitForElementPresentAfterLoadingSuccess() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");

        driver.findElement(By.xpath("//button[.='Start']")).click();

//        Thread.sleep(5000);// Implicit wait
//        String finishContent = driver.findElement(By.cssSelector("#finish h4")).getText();

        // Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        String finishContent =  wait
                .until(
                        ExpectedConditions
                                .visibilityOfElementLocated(By.xpath("//div[@id='finish']")))
                .getText();
        Assert.assertEquals(finishContent,"Hello World!");

    }
}

