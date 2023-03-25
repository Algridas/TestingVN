package theInternet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class JavaScriptExecutor {

    WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    void JavaScriptExecutor(){
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
        JavascriptExecutor js = (JavascriptExecutor) driver;

        //print the title of the page
        String script = "return document.title;";
        String title = (String) js.executeScript(script);
        System.out.println(title);


        //CLick the button

        driver.switchTo().frame("iframeResult");
        js.executeScript("myFunction()");
        sleepInSecond(10);
        driver.switchTo().alert().accept();

        //highlighting the button



        WebElement button = driver.findElement(By.xpath("/html/body/button"));
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", button);
        sleepInSecond(10);

        //scroll
        driver.navigate().to("https://www.w3schools.com/");
        WebElement certifiedbutton = driver.findElement(By.xpath("//*[@id=\"main\"]/div[5]/div/div[1]/a[3]"));
        js.executeScript("arguments[0].scrollIntoView(true);", certifiedbutton);








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
