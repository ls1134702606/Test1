package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class PageManage {
    //定位管理中心
    public static final By CLICK_MANAGE_LINK = By.xpath("//*[@id=\"um\"]/p[1]/a[6]");
    //登录管理中心
    //找到密码输入框
    public static final By INPUT_MANAGER_PWD = By.xpath("//*[@id=\"loginform\"]/p[4]/input");
    //找到提交按钮
    public static final By CLICK_MANAGE_BTN = By.xpath("//*[@id=\"loginform\"]/p[9]/input");
    //找到论坛项目
    public static final By CLICK_MANAGE_BBS = By.id("header_forum");
    //找到添加新板块
    public static final By CLICK_LINK_ADD = By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr/td[2]/div/a");
    //新板块名称
    public static final By INPUT_NEW_PARTNAME = By.xpath("//*[@id=\"cpform\"]/table/tbody[3]/tr[1]/td[3]/div/input");
    //找到提交按钮
    public static final By CLICK_SUB_BTN = By.id("submit_editsubmit");
    //管理员退出按钮
    public static final By CLICK_MANAGER_LOGOUT = By.xpath("//*[@id=\"frameuinfo\"]/p[1]/a");


}
