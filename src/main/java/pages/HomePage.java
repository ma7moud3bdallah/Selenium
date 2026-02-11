package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // Fields
    private WebDriver driver;
    private By formAuthenticationLink = By.linkText("Form Authentication");

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public LoginPage clickFormAuthentication(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }
}
