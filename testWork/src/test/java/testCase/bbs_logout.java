package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperLogoutPage;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class bbs_logout extends  BasicTestCase {
    @Test
    public void logout() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
        HelperLogoutPage.logout(seleniumUtil);
    }
}

