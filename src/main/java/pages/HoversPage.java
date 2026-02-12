package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    // Fields
    private WebDriver driver;
    private By figureBox = By.cssSelector("div[class='figure']");

    // Constructor
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(figureBox).get(index)).perform();
    }

    // Inner class
    public class FigureCaption{
        private WebElement caption;
    }
}
