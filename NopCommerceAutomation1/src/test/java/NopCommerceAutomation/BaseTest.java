package NopCommerceAutomation;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils
{
    BrowserSelector browserSelector = new BrowserSelector();
    LoadProp loadProps=new LoadProp();
    //before method
    @BeforeMethod
    public void openBrowser()
    {
        browserSelector.setUpBrowser();
       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(loadProps.getProperty("URL"));

    }
    //after method
    @AfterMethod
    public void closeBrowser()
    {
       // driver.quit();
    }

//    BrowserSelector browserSelector=new BrowserSelector();
//
//    //before method
//    @BeforeMethod
//    public void openBrowser()
//    {
//        browserSelector.SetUpBrowser();
//    }
//    //after method
//    @AfterMethod
//    public void closeBrowser()
//    {
//        //screenshot
//        //takeScreenshot();
//        //quit
//        //driver.quit();
//    }
}
