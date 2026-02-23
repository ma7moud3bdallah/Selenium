package navigation;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NewWindowPage;
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
    @Test
    public void testSwitchToTab(){
        NewWindowPage newWindowPage = homePage.clickMultipleWindowsLink().clickLink();
        WindowManager windowManager = new WindowManager(driver);
        windowManager.switchToTab("New Window");
        Assert.assertEquals(newWindowPage.getHeaderText(),"New Window","You are in the wrong context");
    }
}
