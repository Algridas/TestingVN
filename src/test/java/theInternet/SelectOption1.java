package theInternet;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
public class SelectOption1 {


    WebDriver driver;

    @Test

    void SelectOption1(){
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dropdown");
        WebElement ddown= driver.findElement(By.id("dropdown"));
        Select select = new Select(ddown);
        select.selectByVisibleText("Option 1");
        String selectedOption = select.getFirstSelectedOption().getText();
        Assert.assertEquals(selectedOption, "Option 1");
    }
}
