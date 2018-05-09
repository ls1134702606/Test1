package pageHelper;

import org.apache.log4j.Logger;
import page.PageSearch;
import util.SeleniumUtil;

/**
 * Created by TracyOto on 2018/5/9.
 */
public class HelperSearchPage {
    public static Logger logger = Logger.getLogger(HelperSearchPage.class);

    //输入要搜索的内容
    public static void inputSearchText(SeleniumUtil seleniumUtil,String text){
        seleniumUtil.sendKeys(PageSearch.INPUT_SEARCH_BOX,text);
    }
    //点击搜索按钮
    public static void clickSearchBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearch.CLICK_SEARCH_BTN);
    }
    //点击搜索到的帖子
    public static void clickSearchPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageSearch.CLICK_SEARCH_POST);
    }

    //根据帖子标题判断是否找到要搜索的帖子

    //重构一个方法
    public static void search(SeleniumUtil seleniumUtil,String text){

        inputSearchText(seleniumUtil,text);
        clickSearchBtn(seleniumUtil);
        //切换页面
        seleniumUtil.exchangeHandle();
        clickSearchPost(seleniumUtil);
    }
}
