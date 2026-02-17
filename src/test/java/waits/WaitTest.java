package waits;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingEx1Page;

public class WaitTest extends BaseTest {
    @Test
    public void testWait1(){
        DynamicLoadingEx1Page dynamicLoadingEx1Page = homePage.clickDynamicLoadingLink().clickEx1Link();
        dynamicLoadingEx1Page.clickStartButton();
        Assert.assertEquals(dynamicLoadingEx1Page.getLoadedText(),"Hello World!","The text is incorrect");
    }
}
