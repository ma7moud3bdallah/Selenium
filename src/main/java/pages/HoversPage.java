package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    // Fields
    private WebDriver driver;
    private By figureCaption= By.cssSelector("div[class='figcaption']");

    // Constructor
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public FigureCaption hoverOverFigure(int index){
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElements(figureCaption).get(index)).perform();
        return new FigureCaption(driver.findElements(figureCaption).get(index).findElement(figureCaption));
    }



    // Inner class
    public class FigureCaption{
        // Fields
        private WebElement caption;

        // Constructor
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }
    }
}
