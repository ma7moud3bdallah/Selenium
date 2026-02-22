package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    // Fields
    private WebDriver driver;
    private By paragraph = By.className("jscroll-added");

    // Constructor
    public InfiniteScrollPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public int getNumberOfParagraphs(){
        return driver.findElements(paragraph).size();
    }
    public void scrollIntoParagraph(int index){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        while(getNumberOfParagraphs()<index){
            js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
        }
    }
}
