package page;

import org.openqa.selenium.By;

/**
 * Created by TracyOto on 2018/5/7.
 */
public class PageLogin {
    //
    public static final By INPUT_LOGIN_NAME = By.id("ls_username");

    public static final By INPUT_LOGIN_PWD = By.id("ls_password");

    public static final By LOGIN_SUBMIT = By.xpath("//*[@id=\"lsform\"]/div/div/table/tbody/tr[2]/td[3]/button");
}
