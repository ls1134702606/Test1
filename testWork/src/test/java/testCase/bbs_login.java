package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class bbs_login extends BasicTestCase {
    @Test
    public void login() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
    }
}
