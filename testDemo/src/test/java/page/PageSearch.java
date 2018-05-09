package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/9.
 */
public class PageSearch {
    //找到搜索框
    public static final By INPUT_SEARCH_BOX = By.id("scbar_txt");
    //找到搜索按钮
    public static final By CLICK_SEARCH_BTN = By.id("scbar_btn");
    //找到要搜索的帖子
    public static final By CLICK_SEARCH_POST = By.linkText("haotest");
    //找到帖子的标题
    //public static final By SERCH_POST_TITLE = By.id("thread_subject");
}
