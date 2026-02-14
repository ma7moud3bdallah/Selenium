package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    // Fields
    private WebDriver driver;
    private By fileUploadButton = By.id("file-upload");
    private By fileSubmitButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");

    // Constructor
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void uploadFile(String absoluteFilePath){
        driver.findElement(fileUploadButton).sendKeys(absoluteFilePath);
    }
    public void clickSubmitButton(){
        driver.findElement(fileSubmitButton).click();
    }
    public String getUploadedFileName(){
        return driver.findElement(uploadedFile).getText();
    }
}
