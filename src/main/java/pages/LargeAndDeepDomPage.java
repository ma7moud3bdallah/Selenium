package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;;

public class LargeAndDeepDomPage {
    // Fields
    private WebDriver driver;
    private By table = By.id("large-table");

    // Constructor
    public LargeAndDeepDomPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void scrollToTable(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(table));
    }
}
