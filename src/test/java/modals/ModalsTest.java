package modals;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EntryAdPage;

public class ModalsTest extends BaseTest {
    @Test
    public void testModals(){
        EntryAdPage entryAdPage = homePage.clickEntryAdLink();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        entryAdPage.closeModal();
//        entryAdPage.clickLink();
        Assert.assertEquals(entryAdPage.getHeaderText(),"Entry Ad","Invalid header");
    }
}
