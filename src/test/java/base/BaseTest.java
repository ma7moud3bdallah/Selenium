package base;

import com.google.common.io.Files;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;
import utilities.MyListener;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

public class BaseTest {
    // Fields
    protected WebDriver driver;
    protected HomePage homePage;

    // Methods
    @BeforeClass
    public void setup(){
        driver = new ChromeDriver(getChromeOptions());
//        driver.manage().window().maximize();
        //Implicit Wait
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void goHome(){
//        WebDriverListener listener = new MyListener();
//        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        driver.get("https://the-internet.herokuapp.com/");
        setCookie();
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void takeScreenshot(ITestResult result){
        if(ITestResult.FAILURE==result.getStatus()){
            TakesScreenshot sc = (TakesScreenshot)driver;
            File screenshot = sc.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenshot,new File("resources/screenshots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @AfterClass
    public void tearDown(){
//        driver.quit();
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
//        options.addArguments("--headless");
        options.setExperimentalOption("excludeSwitches",Arrays.asList("enable-automation"));
        return options;
    }
    private void setCookie(){
        Cookie cookie = new Cookie("Route","123");
        driver.manage().addCookie(cookie);
    }
}
