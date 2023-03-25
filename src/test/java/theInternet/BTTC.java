package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class BTTC {


    WebDriver driver;

    @BeforeClass
    public void beforeClass() {
//		System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");

         driver = new ChromeDriver();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
//		driver.get("https://alada.vn/");

    }

    @Test
    void loginSuccessfullyWithValidCredentials(){
        driver.get("https://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class = 'radius']")).click();
        driver.findElement(By.xpath("//a[@class = 'button secondary radius']")).click();
        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/login");
    }

    @AfterClass
    public void afterClass() {
//	System.setProperty("webdriver.chrome.driver", "C:\\browserdrivers\\chromedriver.exe");
////ss
        driver.close();
    }

}
