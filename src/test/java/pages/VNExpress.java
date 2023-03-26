package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VNExpress {

    private static WebElement element = null;


    public static WebElement textbox_search(WebDriver driver){
         element = driver.findElement(By.xpath("//input[@id='keywordHeader']"));
        return element;
    }

    public static WebElement button_search(WebDriver driver){
        element = driver.findElement(By.xpath("//button[@type='submit']"));
        return element;
    }

    public static WebElement logoXpath(WebDriver driver){
        element = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='logo']"));
        return element;
    }
    public static WebElement buttonXpath(WebDriver driver){
        element = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='btn24hqua ']"));
        return element;
    }

    public static WebElement linkXpath(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@data-medium='Item-TinKhuVuc_HaNoi']"));
        return element;
    }
    public static WebElement linkXpath1(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@data-medium='Item-TinKhuVuc_TPHoChiMinh']"));
        return element;
    }

    public static WebElement Inter(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@class='evne']"));
        return element;
    }
    public static WebElement Login(WebDriver driver){
        element = driver.findElement(By.xpath("//a[@class='log_txt myvne_login_button']"));
        return element;
    }
    public static WebElement usernameField(WebDriver driver){
        element = driver.findElement(By.xpath("//input[@class='input_form has_transition']"));
        return element;
    }


}
