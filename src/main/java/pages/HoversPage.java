package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoversPage {
    // Fields
    private WebDriver driver;
    private By figureBox = By.className("figure");
    private By caption = By.className("figcaption");

    // Constructor
    public HoversPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public FigureCaption hoverOverFigure(int index){
        WebElement figureElement = driver.findElements(figureBox).get(index);
        Actions actions = new Actions(driver);
        actions.moveToElement(figureElement).perform();
        return new FigureCaption(figureElement.findElement(caption));
    }

    // Inner class
    public class FigureCaption{
        // Fields
        private WebElement caption;
        private By name = By.tagName("h5");
        private By link = By.tagName("a");

        // Constructor
        public FigureCaption(WebElement caption){
            this.caption = caption;
        }

        // Methods
        public boolean isDisplayed(){
            return caption.isDisplayed();
        }
        public String getName(){
            return caption.findElement(name).getText();
        }
        public String getLinkText(){
            return caption.findElement(link).getText();
        }
        public String getLink(){
            return caption.findElement(link).getAttribute("href");
        }
    }
}
