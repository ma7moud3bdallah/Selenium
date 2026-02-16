package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    // Fields
    private WebDriver driver;

    // Constructor
    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    // Pre-Method
    private void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    // Methods
    public LoginPage clickFormAuthenticationLink(){
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropdownPage clickDropdownLink(){
        clickLink("Dropdown");
        return new DropdownPage(driver);
    }
    public HoversPage clickHoversLink(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickKeyPressesLink(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public FileUploadPage clickFileUploadLink(){
        driver.findElement(By.linkText("File Upload")).click();
        return new FileUploadPage(driver);
    }
    public JavaScriptAlertsPage clickJavaScriptAlertsLink(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
}
