package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class BTCCheckbox1 {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    void checkbox(){

        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1= driver.findElement(By.xpath("//form[@id = 'checkboxes']//input[1]"));
        WebElement checkbox2= driver.findElement(By.xpath("//form[@id = 'checkboxes']//input[2]"));

        if(!checkbox1.isSelected()){
            checkbox1.click();
        }
        Assert.assertTrue(checkbox1.isSelected());

        if(!checkbox2.isSelected()){
            checkbox2.click();
        }
        Assert.assertTrue(checkbox2.isSelected());

//        Assert.assertTrue(checkbox2.isSelected());
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
