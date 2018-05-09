package pageHelper;

import org.apache.log4j.Logger;
import page.PageLogin;
import util.SeleniumUtil;


/**
 * Created by TracyOto on 2018/5/7.
 */
public class HelperLoginPage {
    public static Logger logger = Logger.getLogger(HelperLoginPage.class);


    //输入用户名
    public static void inputLoginName(SeleniumUtil seleniumUtil,String username){
        seleniumUtil.sendKeys(PageLogin.INPUT_LOGIN_NAME,username);
    }
    //输入密码
    public static void inputLoginPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageLogin.INPUT_LOGIN_PWD,password);
    }
    //点击登录按钮
    public static void clickLoginBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageLogin.LOGIN_SUBMIT);
    }

    //重构一个方法
    public static void login(SeleniumUtil seleniumUtil,String username,String password) throws InterruptedException {
        inputLoginName(seleniumUtil,username);
        inputLoginPwd(seleniumUtil,password);
        clickLoginBtn(seleniumUtil);
        Thread.sleep(2000);
    }
}
