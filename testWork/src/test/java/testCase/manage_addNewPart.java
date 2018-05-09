package testCase;

import org.testng.annotations.Test;
import page.PageManage;
import pageHelper.HelperLoginPage;
import pageHelper.HelperManagePage;
import util.SeleniumUtil;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class manage_addNewPart extends BasicTestCase {
    @Test
    public void managerAddPart() throws InterruptedException {
        HelperLoginPage.login(seleniumUtil,"admin","1234");
        seleniumUtil.click(PageManage.CLICK_MANAGE_LINK);
        //seleniumUtil.sendKeys(PageManage.INPUT_MANAGER_PWD,"1234");
        seleniumUtil.exchangeHandle();
        HelperManagePage.inputManagerPwd(seleniumUtil,"1234");
        HelperManagePage.addNewPart(seleniumUtil,"1234","part_2");
    }


}
