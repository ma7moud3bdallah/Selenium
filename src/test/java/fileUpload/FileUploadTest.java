package fileUpload;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FileUploadPage;

public class FileUploadTest extends BaseTest {
    @Test
    public void testFileUpload(){
        FileUploadPage fileUploadPage = homePage.clickFileUploadLink();
        fileUploadPage.uploadFile("D:\\Route\\6- Automation\\Selenium\\resources\\file.txt");
        fileUploadPage.clickUploadButton();
        Assert.assertEquals(fileUploadPage.getUploadedFile(),"file.txt","The file name is incorrect");
    }
}
