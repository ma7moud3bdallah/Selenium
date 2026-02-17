package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {
    // Fields
    private WebDriver driver;
    private By body = By.tagName("body");

    // Constructor
    public NestedFramesPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public String getLeftFrameText(){
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-left");
        String leftText =  driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return leftText;
    }
    public String getBottomFrameText(){
        driver.switchTo().frame("frame-bottom");
        String bottomText =  driver.findElement(body).getText();
        driver.switchTo().defaultContent();
        return bottomText;
    }
}
