package NopCommerceAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class RegistrationResultPage extends Utils
{
    public void verifyUserIsAbleToSeeRegistrationSuccessMessage()
    {
        assertExpectedActual("Your registration completed", getTextFromElement(By.xpath("//div[@class='result']")), "Matches!");
    }

    public void verifyUserIsOnRegistrationPage()
    {
        assertURL("register");
    }
//        SoftAssert softAssert = new SoftAssert();
//        String expectedText1 = "Your registration completed";
//        String actualText1 = getTextFromElement(By.className("result"));
//        softAssert.assertEquals(actualText1,expectedText1, " results matched!");
//        softAssert.assertAll();

    public void userShouldBeAbleToContinueAndSeeTheHomePage()
    {
        clickElement(By.name("register-continue"));
//        String actualText2 =  getTextFromElement(By.name("register-continue"));
//        String expectedText2 = "register-continue";
//        Assert.assertEquals(actualText2, expectedText2);
    }
}
