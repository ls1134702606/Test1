package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class PagePost {

    public static final By CLICK_POST_LINK = By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");

    public static final By INPUT_TITLE = By.id("subject");

    public static final By INPUT_POST = By.id("fastpostmessage");

    public static final By CLICK_PUBLISH_BTN = By.xpath("//*[@id=\"fastpostsubmit\"]");
}
