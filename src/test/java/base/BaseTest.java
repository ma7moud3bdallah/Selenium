package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import java.time.Duration;

public class BaseTest {
    // Fields
    private WebDriver driver;
    protected HomePage homePage;

    // Methods
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver();
        homePage = new HomePage(driver);
        //Implicit Wait
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void goHome(){
        driver.get("https://the-internet.herokuapp.com/");
    }
    @AfterClass
    public void tearDown(){
//        driver.quit();
    }
}
