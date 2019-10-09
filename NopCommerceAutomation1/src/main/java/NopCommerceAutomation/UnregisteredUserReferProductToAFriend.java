package NopCommerceAutomation;

import org.openqa.selenium.By;

public class UnregisteredUserReferProductToAFriend extends Utils
{
    LoadProp loadProps = new LoadProp();
    public void unregisteredUserShouldNotBeAbleToReferAProductToAFriend()
    {
        enterText(By.xpath("//input[@class=\"friend-email\"]"), "friend1"+randomDate()+"@test.com");
        enterText(By.className("your-email"), "ownemail"+randomDate()+"@test.com");
        enterText(By.id("PersonalMessage"),loadProps.getProperty("messageForFriend"));
        clickElement(By.name("send-email"));
        assertExpectedActual(loadProps.getProperty("expectedText4"), getTextFromElement(By.xpath("//li[text()='Only registered customers can use email a friend feature']")), "Unregistered User is not able to refer product");
    }

}
