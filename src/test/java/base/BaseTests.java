package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTests {
    // Field
    private WebDriver driver;
    private By linksLocator = By.tagName("a");

    // Method
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().setSize(new Dimension(430,932));
        System.out.println(driver.getTitle());
        List<WebElement> links = driver.findElements(linksLocator);
        System.out.println(links.size());
        WebElement inputsLink = driver.findElement(By.linkText("Inputs"));
        inputsLink.click();
//        driver.quit();
    }

    // Main
    static void main(String[] args) {
        BaseTests base = new BaseTests();
        base.setup();
    }
}
