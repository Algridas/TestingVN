package theInternet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class dashboard {


    dashboard(){
        System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver_110.exe");
    }

    WebDriver driver;


    @BeforeClass
    public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//		driver.get("https://alada.vn/");

    }

    @Test
    public void TC_01_Login_into_unifi() {

        driver.get("https://platform-qa.unifimoney.net/login");
        driver.findElement(By.id("phone")).sendKeys("(832) 200-5734");
        driver.findElement(By.id("password")).sendKeys("123456789aA@");
        driver.findElement(By.xpath("//button[@class= 'ant-btn ant-btn-block styles_primary___VpRg undefined']")).click();
        driver.findElement(By.xpath("//input[@aria-label='Please enter verification code. Digit 1']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@aria-label='Digit 2']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@aria-label='Digit 3']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@aria-label='Digit 4']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@aria-label='Digit 5']")).sendKeys("1");
        driver.findElement(By.xpath("//input[@aria-label='Digit 6']")).sendKeys("1");
        driver.findElement(By.xpath("//button[@class='ant-btn ant-btn-block styles_primary___VpRg styles_button_next__D0FHw']")).click();
        sleepInSecond(30);

//		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//a[text()='Account']")).click();

        sleepInSecond(10);

        driver.findElement(By.xpath("//span[text()='Log out']")).click();
        sleepInSecond(5);
        driver.findElement(By.xpath("//div[@class='ant-col ant-col-xs-12 ant-col-sm-12 ant-col-md-12 ant-col-lg-12']//button[@class='ant-btn ant-btn-block styles_primary___VpRg undefined']")).click();

        sleepInSecond(5);





    }

    @AfterClass
    public void afterClass() {
//	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
////ss
        driver.close();
    }


    public void sleepInSecond(long timeoutInSecond) {
        try {
            Thread.sleep(timeoutInSecond * 1000);
        } catch (InterruptedException e) {
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}

