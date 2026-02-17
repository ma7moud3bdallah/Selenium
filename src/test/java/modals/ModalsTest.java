package modals;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ModalsPage;

public class ModalsTest extends BaseTest {
    @Test
    public void testModals(){
        ModalsPage modalsPage = homePage.clickEntryAdLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        modalsPage.closeModal();
//        modalsPage.clickLink();
        Assert.assertEquals(modalsPage.getHeaderText(),"Entry Ad","Invalid header");
    }
}
