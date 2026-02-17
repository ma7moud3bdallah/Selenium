package frames;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.NestedFramesPage;

public class FramesTest extends BaseTest {
    @Test
    public void testFrames(){
        NestedFramesPage nestedFramesPage = homePage.clickFramesLink().clickNestedFrames();
        Assert.assertEquals(nestedFramesPage.getLeftFrameText(),"LEFT","You are in the wrong frame");
        Assert.assertEquals(nestedFramesPage.getBottomFrameText(),"BOTTOM","You are in the wrong frame");
    }
}
