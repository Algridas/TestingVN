package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class SelectOption {


    WebDriver driver;
    @BeforeClass

    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test

    void SelectOption(){

        driver.get("https://the-internet.herokuapp.com/dropdown");
       WebElement ddown= driver.findElement(By.id("dropdown"));
       Select select = new Select(ddown);

//       select.selectByValue("1");

       select.selectByVisibleText("Option 2");

        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Option 2", "Option 1 is not selected");

        sleepInSecond(5);

//       select.selectByIndex(1);

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
