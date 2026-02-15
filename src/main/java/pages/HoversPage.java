package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    // Fields
    private WebDriver driver;
    private By figure = By.className("figure");
    private By caption = By.className("figcaption");
    private By name = By.tagName("h5");
    private By link = By.tagName("a");

    // Constructor
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public WebElement getCaption(){
        Actions actions = new Actions(driver);
        // Hover over Figure
        actions.moveToElement(driver.findElements(figure).get(0)).perform();
        // Get Caption
        return driver.findElements(figure).get(0).findElement(caption);

    }
    public boolean isCaptionDisplayed(){
        return getCaption().isDisplayed();
    }
    public String getName(){
        return getCaption().findElement(name).getText();
    }
    public String getLinkText(){
        return getCaption().findElement(link).getText();
    }
    public String getLink(){
        return getCaption().findElement(link).getAttribute("href");
    }
}
