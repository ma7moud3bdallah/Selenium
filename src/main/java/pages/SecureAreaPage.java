package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {
    // Fields
    private WebDriver driver;
    private By secureMessage = By.id("flash");

    // Constructor
    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public String getSecureMessage(){
        return driver.findElement(secureMessage).getText();
    }
}
