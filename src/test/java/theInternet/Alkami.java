package theInternet;

import java.util.concurrent.TimeUnit;
import java.lang.Thread;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Alkami {

    Alkami(){
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver_110.exe");
    }

    WebDriver driver;


    @BeforeClass
    public void beforeClass() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//        driver.get("https://alkami-bank-dev.unifimoney.net/UnifiMoney");

    }

    @Test
    public void TC_01_Login_into_unifi() {
        driver.get("https://alkami-bank-dev.unifimoney.net");
        driver.findElement(By.id("username")).sendKeys("mike.brady");
        driver.findElement(By.id("password")).sendKeys("12345");
        driver.findElement(By.xpath("//button[@class= 'irisv-button irisv-button--highEmphasis irisv-button--onLight irisv-button--full-width text--none']")).click();
        try {
            Thread.sleep(60000); // 60 seconds in milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//button[@class= 'irisv-button irisv-button--highEmphasis irisv-button--onLight text--none']")).click();
        driver.findElement(By.xpath("//input[@class= 'irisv-display-input-field-specified__input sr-only']")).sendKeys("560142");
        driver.findElement(By.xpath("//button[@class= 'irisv-button irisv-button--highEmphasis irisv-button--onLight text--none']")).click();
        driver.findElement(By.xpath("//button[@style= 'width:210px; background-color: #1fa11f;height: 40px;color: white;border-color: #1fa11f;cursor: pointer;font-size: 15px;']")).click();
//        driver.findElement(By.xpath("//button[@style= 'width:210px; background-color: #1fa11f;height: 40px;color: white;border-color: #1fa11f;cursor: pointer;font-size: 15px;']")).click();
        driver.findElement(By.xpath("//button[@class= 'ant-btn ant-btn-primary']")).click();
        driver.findElement(By.xpath("//div[@class= 'profile-wrapper']")).click();
        driver.findElement(By.xpath("//a[@title= 'Log Out']")).click();





    }


}

