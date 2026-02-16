package javascript;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.JavaScriptAlertsPage;

public class JavascriptALertsTest extends BaseTest {
    @Test
    public void testAcceptAlert(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickAlertButton();
        javaScriptAlertsPage.alert_clickToAccept();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You successfully clicked an alert","Incorrect text");
    }
    @Test
    public void testDismissConfirm(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickConfirmButton();
        Assert.assertEquals(javaScriptAlertsPage.alert_getText(),"I am a JS Confirm","The confirm text is incorrect");
        javaScriptAlertsPage.alert_clickToDismiss();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You clicked: Ok","Incorrect text");
    }
    @Test
    public void testPrompt(){
        JavaScriptAlertsPage javaScriptAlertsPage = homePage.clickJavaScriptAlertsLink();
        javaScriptAlertsPage.clickPromptButton();
        javaScriptAlertsPage.alert_setText("Route");
        javaScriptAlertsPage.alert_clickToAccept();
        Assert.assertEquals(javaScriptAlertsPage.getResultText(),"You entered: Route","Incorrect message");
    }
}
