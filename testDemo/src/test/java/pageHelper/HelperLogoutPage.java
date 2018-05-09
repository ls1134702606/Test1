package pageHelper;

import page.PageLogout;
import util.SeleniumUtil;
import org.apache.log4j.Logger;


/**
 * Created by TracyOto on 2018/5/8.
 */
public class HelperLogoutPage {
    public static Logger logger = Logger.getLogger(HelperLogoutPage.class);

    public static void clickLogoutBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogout.LOGOUT_BTN);
    }

    //重构一个方法
    public static void logout(SeleniumUtil seleniumUtil) throws InterruptedException {
        Thread.sleep(2000);
        clickLogoutBtn(seleniumUtil);
    }
}
