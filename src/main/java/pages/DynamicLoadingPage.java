package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {
    // Fields
    private WebDriver driver;
    private By example1 = By.partialLinkText("Example 1");

    // Constructor
    public DynamicLoadingPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public DynamicLoadingEx1Page clickEx1Link(){
        driver.findElement(example1).click();
        return new DynamicLoadingEx1Page(driver);
    }
}
