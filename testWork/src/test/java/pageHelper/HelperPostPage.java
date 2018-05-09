package pageHelper;

import org.apache.log4j.Logger;
import page.PagePost;
import util.SeleniumUtil;


/**
 * Created by TracyOto on 2018/5/8.
 */
public class HelperPostPage {
    public static Logger logger = Logger.getLogger(HelperPostPage.class);

    public static void clickPostLink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePost.CLICK_POST_LINK);
    }

    public static void inputPostTitle(SeleniumUtil seleniumUtil,String title){
        seleniumUtil.sendKeys(PagePost.INPUT_TITLE,title);
    }

    public static void inputPost(SeleniumUtil seleniumUtil,String post){
        seleniumUtil.sendKeys(PagePost.INPUT_POST,post);
    }

    public static void clickPublishBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePost.CLICK_PUBLISH_BTN);
    }

    //重构一个方法
    public static void post(SeleniumUtil seleniumUtil,String title,String post) throws InterruptedException {
        clickPostLink(seleniumUtil);
        Thread.sleep(2000);

        inputPostTitle(seleniumUtil,title);
        inputPost(seleniumUtil,post);

        Thread.sleep(1000);
        clickPublishBtn(seleniumUtil);
    }

}
