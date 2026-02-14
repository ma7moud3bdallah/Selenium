package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class KeyPressesPage {
    // Fields
    private WebDriver driver;
    private By inputField = By.id("target");
    private By result = By.id("result");

    // Constructor
    public KeyPressesPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void setText(String text){
        driver.findElement(inputField).sendKeys(text);
    }
    public String getText(){
        return driver.findElement(result).getText();
    }
}
