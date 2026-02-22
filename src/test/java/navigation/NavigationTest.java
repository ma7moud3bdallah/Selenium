package navigation;

import base.BaseTest;
import org.testng.annotations.Test;
import utilities.WindowManager;

public class NavigationTest extends BaseTest {
    @Test
    public void testNavigation(){
        homePage.clickDynamicLoadingLink().clickEx1Link();
        WindowManager windowManager = new WindowManager(driver);
        windowManager.goBack();
        windowManager.refresh();
        windowManager.goForward();
        windowManager.goTo("https://www.google.com/");
    }
}
