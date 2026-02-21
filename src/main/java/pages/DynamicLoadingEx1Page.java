package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingEx1Page {
    // Fields
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadingIndicator = By.id("loading");
    private By loadedText = By.cssSelector("#finish > h4");

    // Constructor
    public DynamicLoadingEx1Page(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void clickStartButton(){
        driver.findElement(startButton).click();
        //Static Wait
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        //Explicit Wait
//      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//      wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
        // Fluent Wait
//        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
    public String getLoadedTextWithJS(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        return (String)js.executeScript("return arguments[0].textContent;",driver.findElement(loadedText));
    }
}
