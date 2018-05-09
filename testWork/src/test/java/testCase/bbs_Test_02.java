package testCase;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.xml.sax.SAXException;
import pageHelper.HelperDeletePage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagePage;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class bbs_Test_02 extends BasicTestCase {
    @Test
    public void testCase_2() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
        HelperDeletePage.delete(seleniumUtil);
        HelperManagePage.addNewPart(seleniumUtil,"1234","part_2");


    }
}
