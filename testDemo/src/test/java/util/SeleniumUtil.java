package util;

import org.apache.log4j.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;


/**
 * Created by TracyOto on 2018/5/7.
 */
public class SeleniumUtil {
    //类属性
    private static Logger logger = Logger.getLogger(SeleniumUtil.class);
    //实例属性
    public WebDriver driver;

    //加载驱动
    public WebDriver getDriver(String driverType)  {

        if ("Chrome".equals(driverType)) {
            System.setProperty("webdriver.chrome.driver", ".\\Tools\\chromedriver.exe");
            driver = new ChromeDriver();
            logger.info("加载驱动");
        }else if ("Firefox".equals(driverType)){
            System.setProperty("webdriver.firefox.driver",".\\Tools\\geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("加载驱动");
        }else {
            logger.error("不识别的浏览器");
        }
        return driver;
    }


    //打开网址
    public void url(String url){
        driver.get(url);
        logger.info("打开的网址为：" + url);
    }

    //返回元素对应的定位值
    public String getLocatorByElement(WebElement element, String exceptText){
        String text = element.toString();
        String except = null;
        try{
            except = text.substring(text.indexOf(exceptText) + 1 ,
                    text.length() - 1 );
        }catch (Exception e){
            e.printStackTrace();
            logger.error("faild to find the String :" + exceptText);
        }
        return except;
    }


    //识别一个元素
    public WebElement findElement(By by){
        WebElement element = null;
        try{
            element = driver.findElement(by);
            logger.info("查找到相应元素" + getLocatorByElement(element,">"));
            return element;
        }catch(NoSuchElementException e){
            logger.info("no found specifed Element");
            return null;
        }
    }
    //识别一组元素
    public List<WebElement> findElements(By by){
        logger.info("返回一组元素");
        return driver.findElements(by);
    }

    /*清空元素上内容*/
    public void clear(By by){
        WebElement webElement=findElement(by);
        webElement.clear();
        logger.info("清空元素：" + getLocatorByElement(webElement, ">") + "上的内容");
    }

    /*文本框中输入内容*/
    public void sendKeys(By by, String txt){
        WebElement webElement=findElement(by);
        clear(by);
        webElement.sendKeys(txt);
        logger.info("在元素"+getLocatorByElement(webElement,">")+"上输入内容：" + txt);
    }
    /*对元素做点击操作*/
    public void click(By by){
        WebElement webElement=findElement(by);
        webElement.click();
        logger.info("对元素：" + getLocatorByElement(webElement, ">") + "做点击操作");
    }


    /*获取元素上内容*/
    public String getText(By by){
        WebElement webElement=findElement(by);
        String text=webElement.getText();
        logger.info("获取元素内容,元素的内容是："+text);
        return text;
    }

    /*校验元素是否存在*/
    public boolean isExist(By element){
        try{
            driver.findElement(element);
            return true;
        } catch (NoSuchElementException e){
            //如果输出一个对象 toString
            logger.info(element.toString()+"元素不存在");
        }
        return false;
    }

    /**根据顶部title判断当前页面是否是预期页面*/
    public void assertPage(String expected){
        String actual =driver.getTitle();
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
            Assert.fail("预期文字是：["+expected+"],但实际文字是: ["+actual+"]");
        }
        logger.info("找到了对应title，当前页面正确：【"+actual+"】");
    }

    /**校验文本是否与预期一致*/
    public void assertForText(String actual, String expected){
        try{
            Assert.assertEquals(actual, expected);
        } catch (AssertionError e){
            logger.error("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
            Assert.fail("期望的文字是 [" + expected + "] 但是找到了 [" + actual + "]");
        }
        logger.info("找到了期望的文字: [" + expected + "]");
    }

    /**设置显示等待元素*/
    public void waitForElementLoad(final By by, int timeOut){
        logger.info("开始查找元素："+by);
        try{
            WebDriverWait wait = new WebDriverWait(driver, timeOut, 1000);
            wait.until(new ExpectedCondition<Boolean>() {

                public Boolean apply(WebDriver driver) {
                    WebElement element = driver.findElement(by);
                    return element.isDisplayed();
                }
            });
        } catch (TimeoutException e){
            logger.error("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
            Assert.fail("超时!! " + timeOut + " 秒之后还没找到元素 [" + by + "]");
        }
        logger.info("找到了元素 [" + by + "]");
    }




    /**设置显示等待元素,默认10秒*/
    public void waitForElementLoad(By by){
        waitForElementLoad(by, 10);
    }


    //切换句柄
    public void exchangeHandle(){
        String homeHandle = driver.getWindowHandle();
        for (String newHandle:driver.getWindowHandles()){
            if (newHandle.equals(homeHandle)){
                continue;
            }
            driver.switchTo().window(newHandle);
            break;
        }
    }

    //切换iframe

}
