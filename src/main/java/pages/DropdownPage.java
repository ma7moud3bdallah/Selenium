package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class DropdownPage {
    // Fields
    private WebDriver driver;
    private By dropdownLocator = By.id("dropdown");

    // Constructor
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    private Select findDropdownELement(){
        return new Select(driver.findElement(dropdownLocator));
    }
    public void selectFromDropdown(String option){
        findDropdownELement().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropdownELement().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }
}
