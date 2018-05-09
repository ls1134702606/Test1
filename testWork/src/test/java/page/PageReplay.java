package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class PageReplay {
    //找到回复输入框
    public static final By INPUT_REPLAY = By.xpath("//*[@id=\"fastpostmessage\"]");
    //找到发表回复按钮
    public static final By CLICK_REPLAY_BTN = By.id("fastpostsubmit");
}
