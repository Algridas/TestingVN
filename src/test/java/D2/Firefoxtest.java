package D2;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Firefoxtest {

    @Test

    public static void validatepageURL() {
        WebDriver driver = new FirefoxDriver();

        driver.get("https://selenium.dev");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.selenium.dev/");

        driver.quit();
    }
    @Test
    public static void validatePageUrlWithHeadlessMode() {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--headless");
        WebDriver driver = new FirefoxDriver(firefoxOptions);
        driver.get("https://selenium.dev");
        Assert.assertTrue(driver.getCurrentUrl().contains("selenium.dev"));
        driver.quit();
    }


}
