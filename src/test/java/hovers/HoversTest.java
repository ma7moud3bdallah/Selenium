package hovers;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HoversPage;

public class HoversTest extends BaseTest {
    @Test
    public void testHoverOverFigure(){
        HoversPage hoversPage = homePage.clickHoversLink();
        HoversPage.FigureCaption figureCaption = hoversPage.hoverOverFigure(0);
        Assert.assertTrue(figureCaption.isDisplayed(),"The caption is not displayed");
        Assert.assertEquals(figureCaption.getName(),"name: user1","The name is incorrect");
        Assert.assertEquals(figureCaption.getLinkText(),"View profile","The link text is incorrect");
        Assert.assertTrue(figureCaption.getLink().contains("/users/1"),"The link is incorrect");
    }
}
