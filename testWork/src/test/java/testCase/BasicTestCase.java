package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.InitConfigData;
import util.LogConfiguration;
import util.SeleniumUtil;

import java.io.IOException;

/**
 * Created by TracyOto on 2018/5/7.
 */
public class BasicTestCase {
    public WebDriver driver;
    public SeleniumUtil seleniumUtil;
    InitConfigData properties = null;


    @BeforeMethod
    public void initTest() throws IOException, InterruptedException {
        System.setProperty("webdriver.chrome.driver",".\\Tools\\chromedriver.exe");
        //加载日志文件的配置
        LogConfiguration logconfig=new LogConfiguration();
        logconfig.initLog();
        seleniumUtil=new SeleniumUtil();
        properties=new InitConfigData();
        String dType=properties.readBrowser();
        driver=seleniumUtil.getDriver(dType);
        String URL=properties.URL;
        seleniumUtil.url(URL);
        driver.manage().window().maximize();
    }

   /* @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }*/


}
