package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    // Fields
    private WebDriver driver;
    private By nestedFramesLink = By.linkText("Nested Frames");

    // Constructor
    public FramesPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public NestedFramesPage clickNestedFrames(){
        driver.findElement(nestedFramesLink).click();
        return new NestedFramesPage(driver);
    }
}
