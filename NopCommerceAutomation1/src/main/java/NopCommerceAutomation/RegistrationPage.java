package NopCommerceAutomation;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class RegistrationPage extends Utils
{
    LoadProp loadProps = new LoadProp();

    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");

//    private static String timestamp = randomDate();
//
//    public void verifyUserIsOnRegistrationPage()
//    {
//        SoftAssert softAssert = new SoftAssert();
//        String actualText = driver.getCurrentUrl();
//        softAssert.assertEquals(actualText, "https://demo.nopcommerce.com/register?returnUrl=%2F", "URL match");
//        softAssert.assertAll();
//    }
    public void userEnterRegistrationDetails()
    {
        enterText(_firstName, loadProps.getProperty("firstName"));
        enterText(_lastName, loadProps.getProperty("lastName"));

        enterText(_email, "leia"+randomDate()+"@test.com");
        enterText(_password, "LeiaWars123");
        enterText(_confirmPassword, "LeiaWars123");
        clickElement(_registerButton);
    }




}
