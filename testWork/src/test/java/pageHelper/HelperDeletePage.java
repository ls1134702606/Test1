package pageHelper;

import org.apache.log4j.Logger;
import page.PageDelete;
import page.PagePost;
import util.SeleniumUtil;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class HelperDeletePage {
    public static Logger logger = Logger.getLogger(HelperDeletePage.class);

    public static void clickPostLink(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PagePost.CLICK_POST_LINK);
    }

    public static void clickSelectPost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.SELECT_POST);
    }

    public static void clickDeletePost(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.DELETE_POST);
    }

    public static void clickConfirmDelete(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageDelete.CONFIRM_DELETE);
    }


    public static void delete(SeleniumUtil seleniumUtil) throws InterruptedException {

        clickPostLink(seleniumUtil);
        Thread.sleep(4000);
        clickSelectPost(seleniumUtil);
        Thread.sleep(4000);
        clickDeletePost(seleniumUtil);
        Thread.sleep(4000);
        clickConfirmDelete(seleniumUtil);

    }
}
