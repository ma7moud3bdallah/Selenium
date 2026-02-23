package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewWindowPage {
    // Fields
    private WebDriver driver;
    private By newWindowHeader = By.tagName("h3");

    // Constructor
    public NewWindowPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public String getHeaderText(){
       return driver.findElement(newWindowHeader).getText();
    }
}
