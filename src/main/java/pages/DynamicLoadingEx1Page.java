package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingEx1Page {
    // Fields
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
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
    }
    public String getLoadedText(){
        return driver.findElement(loadedText).getText();
    }
}
