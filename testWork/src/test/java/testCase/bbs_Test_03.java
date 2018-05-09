package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperSearchPage;

/**
 * Created by TracyOto on 2018/5/9.
 */
public class bbs_Test_03 extends BasicTestCase{
    @Test
    public void sreach() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
        HelperSearchPage.search(seleniumUtil,"haotest");
        seleniumUtil.assertPage("haotest");
    }
}
