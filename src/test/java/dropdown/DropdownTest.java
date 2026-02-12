package dropdown;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

public class DropdownTest extends BaseTests {
    @Test
    public void testSelectOption(){
        DropdownPage dropdownPage = homePage.clickDropdownLink();
        dropdownPage.selectFromDropdown("Option 1");
        Assert.assertEquals(dropdownPage.getSelectedOptions().size(),1,"Incorrect number of options");
        Assert.assertEquals(dropdownPage.getSelectedOptions().get(0),"Option 1","The option was not selected");
    }
}
