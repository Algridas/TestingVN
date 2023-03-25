package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class forAutomationtesting {

    @Test
    void loginSuccessfullyWithValidCredentials(){

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);


        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.xpath("//button[@class= 'radius']")).click();
        String successMessage= driver.findElement(By.className("success")).getText();
        Assert.assertTrue(successMessage.contains("You logged into a secure area"));

        Assert.assertEquals(driver.getCurrentUrl(),"https://the-internet.herokuapp.com/secure");


    }


}
