package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    // Fields
    private WebDriver driver;
    private By chooseFileButton = By.id("file-upload");
    private By uploadButton = By.id("file-submit");
    private By uploadedFile = By.id("uploaded-files");


    // Constructor
    public FileUploadPage(WebDriver driver){
        this.driver = driver;
    }
    // Methods
    public void uploadFile(String absoluteFilePath){
        driver.findElement(chooseFileButton).sendKeys(absoluteFilePath);
    }
    public void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }
    public String getUploadedFile(){
        return driver.findElement(uploadedFile).getText();
    }

}
