package utilities;

import org.openqa.selenium.WebDriver;
import java.util.Set;

public class WindowManager {
    // Fields
    private WebDriver driver;

    // Constructor
    public WindowManager(WebDriver driver){
        this.driver = driver;
    }

    // Methods
    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }
    public void switchToTab(String tabTitle){
        Set<String> windowHandles = driver.getWindowHandles();
        for(String windowHandle:windowHandles){
            driver.switchTo().window(windowHandle);
            if(driver.getTitle().equals(tabTitle)){
                break;
            }
        }
    }
}
