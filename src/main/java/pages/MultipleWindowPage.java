package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowPage {
    // Fields
    private WebDriver driver;
    private By clickHereLink = By.xpath("//div[@id='content']//a");

    // Constructor
    public MultipleWindowPage(WebDriver driver){
        this.driver = driver;
    }
    // Methods
    public NewWindowPage clickLink(){
        driver.findElement(clickHereLink).click();
        return new NewWindowPage(driver);
    }
}
