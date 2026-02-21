package waits;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DynamicLoadingEx1Page;
import pages.DynamicLoadingEx2Page;

public class WaitTest extends BaseTest {
    @Test
    public void testWait1(){
        DynamicLoadingEx1Page dynamicLoadingEx1Page = homePage.clickDynamicLoadingLink().clickEx1Link();
        dynamicLoadingEx1Page.clickStartButton();
        Assert.assertEquals(dynamicLoadingEx1Page.getLoadedTextWithJS(),"Hello World!","The text is incorrect");
    }
    @Test
    public void testWait2(){
        DynamicLoadingEx2Page dynamicLoadingEx2Page = homePage.clickDynamicLoadingLink().clickEx2Link();
        dynamicLoadingEx2Page.clickStartButton();
        Assert.assertEquals(dynamicLoadingEx2Page.getLoadedText(),"Hello World!","The text is incorrect");
    }
}
