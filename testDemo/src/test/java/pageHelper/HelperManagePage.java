package pageHelper;

import org.apache.log4j.Logger;
import page.PageDelete;
import page.PageManage;
import util.SeleniumUtil;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class HelperManagePage {

    public static Logger logger = Logger.getLogger(SeleniumUtil.class);

    //点击管理中心链接
    public static void clickManageLink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_MANAGE_LINK);
    }
    //输入管理员密码
    public static void inputManagerPwd(SeleniumUtil seleniumUtil,String password){
        seleniumUtil.sendKeys(PageManage.INPUT_MANAGER_PWD,password);
    }
    //点击登录
    public static void clickManageBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_MANAGE_BTN);
    }
    //点击论坛选项
    public static void clickManageBbs(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_MANAGE_BBS);
    }
    //点击添加新板块
    public static void clickLinkAdd(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_LINK_ADD);
    }
    //输入新板块名称
    public static void inputNewPartName(SeleniumUtil seleniumUtil,String partname){
        seleniumUtil.sendKeys(PageManage.INPUT_NEW_PARTNAME,partname);
    }
    //点击提交
    public static void clickSubBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_SUB_BTN);
    }
    //退出管理员
    public static void clickManagerLogout(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageManage.CLICK_MANAGER_LOGOUT);
    }

    //重构一个方法
    public static void addNewPart(SeleniumUtil seleniumUtil,String password,String partname) throws InterruptedException {
        clickManageLink(seleniumUtil);
        Thread.sleep(5000);
        seleniumUtil.exchangeHandle();
        inputManagerPwd(seleniumUtil,password);
        Thread.sleep(3000);

        clickManageBtn(seleniumUtil);
        Thread.sleep(3000);

        clickManageBbs(seleniumUtil);
        Thread.sleep(3000);

        clickLinkAdd(seleniumUtil);
        Thread.sleep(3000);
        inputNewPartName(seleniumUtil,partname);
        clickSubBtn(seleniumUtil);
        Thread.sleep(3000);
        clickManagerLogout(seleniumUtil);

    }
}
