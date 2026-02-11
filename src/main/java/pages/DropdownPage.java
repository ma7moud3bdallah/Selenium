package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
    // Fields
    private WebDriver driver;
    private By dropdownLocator = By.id("dropdown");

    // Constructor
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void selectFromDropdown(String option){
        Select dropdownElement = new Select(driver.findElement(dropdownLocator));
        dropdownElement.selectByVisibleText(option);
    }
}
