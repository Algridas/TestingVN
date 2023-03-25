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
public class RightClick {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.get("https://the-internet.herokuapp.com/context_menu");
    }

    @Test
    void RightClick(){

//        driver.get("https://the-internet.herokuapp.com/context_menu");
        WebElement rectangle = driver.findElement(By.xpath("//div[@id='hot-spot']"));
        Actions action = new Actions(driver);
        action.contextClick(rectangle)
                          .perform();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent()).accept();

//        driver.switchTo().alert().accept();
//        driver.quit();



    }

    @AfterMethod
    void captureScreenWhenFail(ITestResult result){

        if(result.isSuccess()){
            System.out.println("TEST PASS");
        }else {
            System.out.println("TEST FAIL");
            File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File("./target/screenshot/"
                    +result.getName()                         //"contextClick"
                    +  "-"
                    +System.currentTimeMillis()+".png");


            try {
                FileUtils.copyFile(file, DestFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }




    }


}
