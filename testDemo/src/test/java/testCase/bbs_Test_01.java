package testCase;

import org.testng.annotations.Test;
import pageHelper.HelperLoginPage;
import pageHelper.HelperLogoutPage;
import pageHelper.HelperPostPage;
import pageHelper.HelperReplayPage;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class bbs_Test_01 extends BasicTestCase{
    @Test
    public void testCase_1() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
        HelperPostPage.post(seleniumUtil,"登鹳雀楼—白居易","白日依山尽，黄河入海流。欲穷千里目，更上一层楼。");
        Thread.sleep(2000);
        HelperReplayPage.replay(seleniumUtil,"写得好！");
        HelperLogoutPage.logout(seleniumUtil);
    }
}
