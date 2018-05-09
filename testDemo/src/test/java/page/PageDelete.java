package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/8.
 */
public class PageDelete {

    public static final By CLICK_POST_LINK = By.xpath("//*[@id=\"category_1\"]/table/tbody/tr[1]/td[2]/h2/a");
    //找到选择框
    public static final By SELECT_POST = By.name("moderate[]");

    public static final By DELETE_POST = By.xpath("//*[@id=\"mdly\"]/p[1]/strong[1]/a");

    public static final By CONFIRM_DELETE = By.id("modsubmit");
}
