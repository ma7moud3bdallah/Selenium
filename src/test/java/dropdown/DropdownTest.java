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
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        Assert.assertEquals(selectedOptions.size(),1,"Incorrect number of options");
        Assert.assertTrue(selectedOptions.contains("Option 1"),"The option was not selected");
    }
}
