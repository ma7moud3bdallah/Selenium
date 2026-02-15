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
    private By dropDownMenu = By.id("dropdown");

    // Constructor
    public DropdownPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void selectFromDropdown(String option){
        Select select = new Select(driver.findElement(dropDownMenu));
        select.selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        Select select = new Select(driver.findElement(dropDownMenu));
        List<WebElement> selectedElements = select.getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElements){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }
}
