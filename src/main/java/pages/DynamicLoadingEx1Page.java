package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
//        try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIndicator));
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
