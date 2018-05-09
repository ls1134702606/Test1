package pageHelper;

import org.apache.log4j.Logger;
import page.PageReplay;
import util.SeleniumUtil;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class HelperReplayPage {

    public static Logger logger = Logger.getLogger(HelperReplayPage.class);

    public static void inputReplay(SeleniumUtil seleniumUtil,String replay){
        seleniumUtil.sendKeys(PageReplay.INPUT_REPLAY,replay);
    }

    public static void clickReplayBtn(SeleniumUtil seleniumUtil){
        seleniumUtil.click(PageReplay.CLICK_REPLAY_BTN);
    }

    //重构一个方法
    public static void replay(SeleniumUtil seleniumUtil,String replay) throws InterruptedException {
        inputReplay(seleniumUtil,replay);
        Thread.sleep(2000);

        clickReplayBtn(seleniumUtil);
    }
}
