package base;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTests {
    // Field
    private WebDriver driver;

    // Method
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
//        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(430,932));
        System.out.println(driver.getTitle());
//        driver.close();
        driver.quit();
    }

    // Main
    static void main(String[] args) {
        BaseTests base = new BaseTests();
        base.setup();
    }
}
