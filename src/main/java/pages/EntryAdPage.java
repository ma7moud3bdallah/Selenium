package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EntryAdPage {
    // Fields
    private WebDriver driver;
    private By closeButton = By.xpath("//p[text()='Close']");
    private By entryAdHeader = By.cssSelector("div[class='example'] > h3");
    private By link = By.id("restart-ad");

    // Constructor
    public EntryAdPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void closeModal(){
        driver.findElement(closeButton).click();
    }
    public String getHeaderText(){
        return driver.findElement(entryAdHeader).getText();
    }
    public void clickLink(){
        driver.findElement(link).click();
    }
}
