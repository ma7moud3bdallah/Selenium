package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JavaScriptAlertsPage {
    // Fields
    private WebDriver driver;
    private By triggerAlertButton = By.xpath("//button[contains(text(),'Alert')]");
    private By triggerConfirmButton = By.xpath("//button[contains(text(),'Confirm')]");
    private By triggerPromptButton = By.xpath("//button[contains(text(),'Prompt')]");
    private By resultText = By.id("result");

    // Constructor
    public JavaScriptAlertsPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void clickAlertButton(){
        driver.findElement(triggerAlertButton).click();
    }
    public void clickConfirmButton(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void clickPromptButton(){
        driver.findElement(triggerPromptButton).click();
    }
    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alert_setText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public String alert_getText(){
        return driver.switchTo().alert().getText();
    }
    public String getResultText(){
        return driver.findElement(resultText).getText();
    }
}
