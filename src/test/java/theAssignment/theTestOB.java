package theAssignment;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.VNExpress;

public class theTestOB {


   static WebDriver driver = null;

    @BeforeClass
    public void beforeClass(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);

        driver.manage().window().maximize();
        driver.get("https://vnexpress.net/trong-tre-du-co-ve-lam-to-4545196.html");

    }

    @Test
    void WebSiteNav() throws InterruptedException {

        //Find the navigation logo element
        WebElement nav_logo = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='logo']"));
        // Verify that the navigation logo is displayed on the top of the page
        try {
            Assert.assertTrue(nav_logo.isDisplayed(), "Navigation logo is not displayed on the top of the page");
            System.out.println("Navigation logo is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }


        //Find the navigation latest news element
        WebElement nav_latest = driver.findElement(By.xpath("//header[@class='section top-header']//a[@class='btn24hqua ']"));
        try {
            Assert.assertTrue(nav_latest.isDisplayed(), "Navigation latest news is not displayed on the top of the page");
            System.out.println("Navigation latest news is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());
        }
//Find the navigation search header element

//        Thread.sleep(100000);
        WebElement nav_search = driver.findElement(By.xpath("//header[@class='section top-header']//form[@id='formSearchHeader']"));
        try {
            Assert.assertTrue(nav_search.isDisplayed(), "Navigation search is not displayed on the top of the page");
            System.out.println("Navigation search is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_home = driver.findElement(By.xpath("//li[@class='home']"));
        try {
            Assert.assertTrue(nav_home.isDisplayed(), "Navigation home is not displayed on the top of the page");
            System.out.println("Navigation home is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_thoisu = driver.findElement(By.xpath("//li[@class='thoisu active']"));
        try {
            Assert.assertTrue(nav_thoisu.isDisplayed(), "Navigation thoisu is not displayed on the top of the page");
            System.out.println("Navigation thoisu is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_gocnhin = driver.findElement(By.xpath("//li[@class='gocnhin']"));
        try {
            Assert.assertTrue(nav_gocnhin.isDisplayed(), "Navigation gocnhin is not displayed on the top of the page");
            System.out.println("Navigation gocnhin is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_thegioi = driver.findElement(By.xpath("//li[@class='thegioi']"));
        try {
            Assert.assertTrue(nav_thegioi.isDisplayed(), "Navigation thegioi is not displayed on the top of the page");
            System.out.println("Navigation thegioi is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_video = driver.findElement(By.xpath("//li[@class='video']"));
        try {
            Assert.assertTrue(nav_video.isDisplayed(), "Navigation video is not displayed on the top of the page");
            System.out.println("Navigation video is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_podcasts = driver.findElement(By.xpath("//li[@class='podcasts']"));
        try {
            Assert.assertTrue(nav_podcasts.isDisplayed(), "Navigation podcasts is not displayed on the top of the page");
            System.out.println("Navigation podcasts is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_kinhdoanh = driver.findElement(By.xpath("//li[@class='kinhdoanh']"));
        try {
            Assert.assertTrue(nav_kinhdoanh.isDisplayed(), "Navigation kinhdoanh is not displayed on the top of the page");
            System.out.println("Navigation kinhdoanh is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_khoahoc = driver.findElement(By.xpath("//li[@class='khoahoc']"));
        try {
            Assert.assertTrue(nav_khoahoc.isDisplayed(), "Navigation khoahoc is not displayed on the top of the page");
            System.out.println("Navigation khoahoc is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_giaitri = driver.findElement(By.xpath("//li[@class='giaitri']"));
        try {
            Assert.assertTrue(nav_giaitri.isDisplayed(), "Navigation giaitri is not displayed on the top of the page");
            System.out.println("Navigation giaitri is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_thethao = driver.findElement(By.xpath("//li[@class='thethao']"));
        try {
            Assert.assertTrue(nav_thethao.isDisplayed(), "Navigation thethao is not displayed on the top of the page");
            System.out.println("Navigation thethao is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_phapluat = driver.findElement(By.xpath("//li[@class='phapluat']"));
        try {
            Assert.assertTrue(nav_phapluat.isDisplayed(), "Navigation phapluat is not displayed on the top of the page");
            System.out.println("Navigation phapluat is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_giaoduc = driver.findElement(By.xpath("//li[@class='giaoduc']"));
        try {
            Assert.assertTrue(nav_giaoduc.isDisplayed(), "Navigation giaoduc is not displayed on the top of the page");
            System.out.println("Navigation giaoduc is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_suckhoe = driver.findElement(By.xpath("//li[@class='suckhoe']"));
        try {
            Assert.assertTrue(nav_suckhoe.isDisplayed(), "Navigation suckhoe is not displayed on the top of the page");
            System.out.println("Navigation suckhoe is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_doisong = driver.findElement(By.xpath("//li[@class='doisong']"));
        try {
            Assert.assertTrue(nav_doisong.isDisplayed(), "Navigation doisong is not displayed on the top of the page");
            System.out.println("Navigation doisong is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_dulich = driver.findElement(By.xpath("//li[@class='dulich']"));
        try {
            Assert.assertTrue(nav_dulich.isDisplayed(), "Navigation dulich is not displayed on the top of the page");
            System.out.println("Navigation dulich is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_xe = driver.findElement(By.xpath("//li[@class='xe']"));
        try {
            Assert.assertTrue(nav_xe.isDisplayed(), "Navigation xe is not displayed on the top of the page");
            System.out.println("Navigation xe is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_sohoa = driver.findElement(By.xpath("//li[@class='sohoa']"));
        try {
            Assert.assertTrue(nav_sohoa.isDisplayed(), "Navigation sohoa is not displayed on the top of the page");
            System.out.println("Navigation sohoa is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_ykien = driver.findElement(By.xpath("//li[@class='ykien']"));
        try {
            Assert.assertTrue(nav_ykien.isDisplayed(), "Navigation ykien is not displayed on the top of the page");
            System.out.println("Navigation ykien is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_tamsu = driver.findElement(By.xpath("//li[@class='tamsu']"));
        try {
            Assert.assertTrue(nav_tamsu.isDisplayed(), "Navigation tamsu is not displayed on the top of the page");
            System.out.println("Navigation tamsu is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }
        WebElement nav_cuoi = driver.findElement(By.xpath("//li[@class='cuoi']"));
        try {
            Assert.assertTrue(nav_cuoi.isDisplayed(), "Navigation cuoi is not displayed on the top of the page");
            System.out.println("Navigation cuoi is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_hamburger = driver.findElement(By.xpath("//li[@class='all-menu has_transition']"));
        try {
            Assert.assertTrue(nav_hamburger.isDisplayed(), "Navigation hamburger is not displayed on the top of the page");
            System.out.println("Navigation hamburger is displayed on the top of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

        WebElement nav_botlogo = driver.findElement(By.xpath("//div[@class='copyright width_common']//img[contains(@alt,'VnExpress')]"));
        try {
            Assert.assertTrue(nav_botlogo.isDisplayed(), "Navigation bottom logo is not displayed on the top of the page");
            System.out.println("Navigation bottom logo is displayed under the bottom of the page");
        } catch (AssertionError e) {
            System.out.println(e.getMessage());  //wrong
        }

    }

    @Test
    void NavClick(){

//        By logoXpath = By.xpath("//header[@class='section top-header']//a[@class='logo']");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement logoElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.logoXpath(driver)));
        logoElement.click();

        wait.until(ExpectedConditions.urlToBe("https://vnexpress.net/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://vnexpress.net/");
        driver.navigate().back();



//        By buttonXpath = By.xpath("//header[@class='section top-header']//a[@class='btn24hqua ']");
//        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30));
        sleepInSecond(5);
        WebElement buttonElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.buttonXpath(driver)));
        buttonElement.click();

        wait.until(ExpectedConditions.urlToBe("https://vnexpress.net/tin-tuc-24h"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://vnexpress.net/tin-tuc-24h");

        driver.navigate().back();

        wait.until(ExpectedConditions.stalenessOf(buttonElement));


        sleepInSecond(5);
        Actions actions = new Actions(driver);
        actions
                .moveToElement(driver.findElement(By.xpath("//span[@class='txt-area']")))
                .perform();



//        By linkXpath = By.xpath("//a[@data-medium='Item-TinKhuVuc_HaNoi']");
//        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement linkElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.linkXpath(driver)));
        linkElement.click();

        wait.until(ExpectedConditions.urlToBe("https://vnexpress.net/topic/ha-noi-26482"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://vnexpress.net/topic/ha-noi-26482");
        driver.navigate().back();


        sleepInSecond(5);
        Actions actions1 = new Actions(driver);
        actions1
                .moveToElement(driver.findElement(By.xpath("//span[@class='txt-area']")))
                .perform();

//        By linkXpath1 = By.xpath("//a[@data-medium='Item-TinKhuVuc_TPHoChiMinh']");
//        WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement linkElement1 = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.linkXpath1(driver)));
        linkElement1.click();

        wait.until(ExpectedConditions.urlToBe("https://vnexpress.net/topic/tp-ho-chi-minh-26483"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://vnexpress.net/topic/tp-ho-chi-minh-26483");
        driver.navigate().back();


//        By Inter = By.xpath("//a[@class='evne']");
//        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(30));
        sleepInSecond(5);
        WebElement InterElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.Inter(driver)));
        InterElement.click();

        wait.until(ExpectedConditions.urlToBe("https://e.vnexpress.net/"));
        Assert.assertEquals(driver.getCurrentUrl(), "https://e.vnexpress.net/");
        driver.navigate().back();


//        By input = By.xpath("//input[@id='keywordHeader']");
//        By button = By.xpath("//button[@type='submit']");


        WebElement inputElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.textbox_search(driver)));
        inputElement.sendKeys("Gruzia");

//        VNExpress.textbox_search(driver)


        WebElement thebuttonElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.button_search(driver)));
        thebuttonElement.click();
        String originalWindow = driver.getWindowHandle();
        sleepInSecond(5);
        driver.switchTo().window(originalWindow);


//        By Login = By.xpath("//a[@class='log_txt myvne_login_button']");
        WebElement LoginElement = wait.until(ExpectedConditions.elementToBeClickable(VNExpress.Login(driver)));
        LoginElement.click();

        // Wait for the login pop-up iframe to load

        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.className("iframe_guest")));

// Find the username field using its XPath and enter the username
//        WebElement usernameField = driver.findElement(By.xpath("//input[@class='input_form has_transition']"));
        VNExpress.usernameField(driver).sendKeys("leetaekyung1997@gmail.com");

// Enter the password in the password field (assuming the password field has a different XPath)
        WebElement passwordField = driver.findElement(By.xpath("//input[@class='input_form has_transition input_pass']"));
        passwordField.sendKeys("ka1le577");

// Click the login button to submit the login credentials
        WebElement loginButton = driver.findElement(By.xpath("//button[@id='myvne_button_login']"));
        loginButton.click();
// Switch back to the main window
        driver.switchTo().defaultContent();


        sleepInSecond(7);

        driver.findElement(By.xpath("//div[@class='box-area-input width_common']//textarea[@id='txtComment']")).sendKeys("hello");
        driver.findElement(By.xpath("//div[@class='right block_btn_send']//button[@type='button']")).click();
        sleepInSecond(5);
        driver.findElement(By.xpath("//div[@class='myvne_container']//li[@class='myvne_user']")).click();
        driver.findElement(By.xpath("//a[@id='myvne_logout_link']")).click();


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
