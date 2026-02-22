package utilities;

import org.openqa.selenium.WebDriver;

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
}
