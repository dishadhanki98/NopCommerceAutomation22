package NopCommerceAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ReferAProductToAFriend extends Utils
{
    LoadProp loadProps = new LoadProp();
    private By _clickOnProductName = By.xpath("//a[text()=\"Apple MacBook Pro 13-inch\"]");
    private By _clickOnEmailAFriendButton = By.xpath("//input[@value=\"Email a friend\"]");
    private By _emailFriend = By.className("friend-email");
    private By _messageAFriend = By.id("PersonalMessage");
    private By _sendEmailButton = By.name("send-email");
    public void userIsAbleToClickOnTheProductSuccessfullyAndReferTheProductToAFriend()
    {
        clickElement(_clickOnProductName);
        clickElement(_clickOnEmailAFriendButton);
        enterText(_emailFriend, "p16167034"+randomDate()+"@dmu.ac.uk");
        enterText(_messageAFriend, loadProps.getProperty("messageForFriend"));
        clickElement(_sendEmailButton);

    }
    public void userIsAbleToSeeASuccessMessageAfterReferingProductToAFriend()
    {
        String actualText3 = driver.findElement(By.className("result")).getText();
        String expectedText3 = loadProps.getProperty("expectedText3");
        Assert.assertEquals(actualText3,expectedText3, "Message Matches!");
    }
    public void unregisteredUserIsAbleToClickOnTheProductFromHomePage()
    {
        clickElement(By.xpath("//div[@class=\"email-a-friend\"]"));
    }



}
