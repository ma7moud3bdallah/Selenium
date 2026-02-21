package js;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LargeAndDeepDomPage;

public class JavaScriptTest extends BaseTest {
    @Test
    public void testScrollIntoTable(){
        LargeAndDeepDomPage largeAndDeepDomPage = homePage.clickLargeAndDeepDomLink();
        largeAndDeepDomPage.scrollToTable();
    }
}
