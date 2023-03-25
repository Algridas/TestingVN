package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class JavaScriptAlert {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

    }

    @Test
    void JavaScriptExecutor(){
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("jsAlert()");
        driver.switchTo().alert().accept();

        String resultContent = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultContent, "You successfully clicked an alert");

    }
    @Test
    void clickForJsConfirmButton(){
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        driver.switchTo().alert().accept();

        String resultContent = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultContent, "You clicked: Ok");

    }

    @Test
    void clickForJSPrompt(){

        driver.findElement(By.xpath("//button[.='Click for JS Prompt']")).click();
        driver.switchTo().alert().sendKeys("hello");
        driver.switchTo().alert().accept();

        String resultContent = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultContent, "You entered: hello");

    }


    @Test
    void clickForJsConfirmButtonCancel(){
//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[.='Click for JS Confirm']")).click();
        driver.switchTo().alert().dismiss();
        String resultContent = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(resultContent, "You clicked: Cancel");

    }

    @AfterClass
    void tearDown(){
        driver.quit();
    }

}
