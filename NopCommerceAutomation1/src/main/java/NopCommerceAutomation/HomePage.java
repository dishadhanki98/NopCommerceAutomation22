package NopCommerceAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utils
{
    public static void userShouldBeAbleToClickOnRegisterButtonFromHomePage()
    {
        clickElement(By.linkText("Register"));


    }
    public void unregisteredUserShouldNotBeAbleToReferToFriend()
    {
        clickElement(By.xpath("//div[@data-productid=\"1\"]//h2[@class=\"product-title\"]//a[\"Build your own computer\"]"));
    }
}
