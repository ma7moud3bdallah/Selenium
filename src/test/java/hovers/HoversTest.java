package hovers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;


public class HoversTest extends BaseTest {
    @Test
    public void testHoverOverFigure(){
        HoversPage hoversPage = homePage.clickHoversLink();
        hoversPage.getCaption();
        Assert.assertTrue(hoversPage.isCaptionDisplayed(),"The caption is not displayed");
        Assert.assertEquals(hoversPage.getName(),"name: user1","The name is incorrect");
        Assert.assertEquals(hoversPage.getLinkText(),"View profile","The link text is incorrect");
        Assert.assertTrue(hoversPage.getLink().contains("/users/1"),"The link is incorrect");
    }
}
