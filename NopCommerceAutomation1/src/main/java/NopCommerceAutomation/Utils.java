package NopCommerceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    //Clicking Element
    public static void clickElement(By by)
    {
        driver.findElement(by).click();
    }

    //generating random dates for tests
    public static String randomDate()
    {
        DateFormat format = new SimpleDateFormat("ddMMyyHHmmSS");
        return format.format(new Date());
    }
    //Entering Text
    public static void enterText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //Getting text from Element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //assert URL Method
    public void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }
    //assert equals method
    public void assertExpectedActual(String expected, String actual, String text)
    {
        Assert.assertEquals(expected,actual,text);
    }
    //Select By Visible Text Drop Down
    public static void selectByVisibleText(By by, String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(text);
    }
    //Selects By Visible Value Drop Down
    public static void selectByVisibleValue(By by, String value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
        select.getFirstSelectedOption();
    }

    //Selects by Index Value Drop Down
    public static void selectByIndexValue(By by, int value)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(value);
    }

}
