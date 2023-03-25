package theInternet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TableTest {



    @Test
    void validlargestDueperson(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://the-internet.herokuapp.com/tables");

        List<WebElement> rows = driver.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
        List<Person> persons = rows.stream().map(row ->
        {
            List<WebElement> cells = row.findElements(By.tagName("td"));
            String firstName = cells.get(1).getText();
            String lastName = cells.get(0).getText();
            double due = Double.parseDouble(cells.get(3).getText().replace("$", ""));
             return new Person(firstName,lastName,due);
        }).collect(Collectors.toList());
        persons.stream().max(Comparator.comparing(Person::getDue)).orElseThrow().getFullname();


    }


}
