package NopCommerceAutomation;

import org.testng.annotations.Test;



public class TestSuite extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ReferAProductToAFriend referAProductToAFriend = new ReferAProductToAFriend();
    UnregisteredUserReferProductToAFriend unregisteredUserReferProductToAFriend = new UnregisteredUserReferProductToAFriend();
    GuestUserPurchaseProduct guestUserPurchaseProduct = new GuestUserPurchaseProduct();
    OnePageCheckout onePageCheckout = new OnePageCheckout();
    ShippingMethod shippingMethod = new ShippingMethod();


    @Test(priority = 0)
    public void userShouldBeAbleToRegisterSuccessfully()
    {
        homePage.userShouldBeAbleToClickOnRegisterButtonFromHomePage();
        registrationResultPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserIsAbleToSeeRegistrationSuccessMessage();
        registrationResultPage.userShouldBeAbleToContinueAndSeeTheHomePage();
    }
    @Test(priority = 1)
    public void userIsAbleToSelectAProductAndReferProductToFriend()
    {
        homePage.userShouldBeAbleToClickOnRegisterButtonFromHomePage();
        registrationResultPage.verifyUserIsOnRegistrationPage();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.verifyUserIsAbleToSeeRegistrationSuccessMessage();
        registrationResultPage.userShouldBeAbleToContinueAndSeeTheHomePage();
        referAProductToAFriend.userIsAbleToClickOnTheProductSuccessfullyAndReferTheProductToAFriend();
        referAProductToAFriend.userIsAbleToSeeASuccessMessageAfterReferingProductToAFriend();
    }
    @Test (priority = 2)
    public void userShouldNotBeAbleToReferProductToFriendIfUnregistered()
    {
        homePage.unregisteredUserShouldNotBeAbleToReferToFriend();
        referAProductToAFriend.unregisteredUserIsAbleToClickOnTheProductFromHomePage();
        unregisteredUserReferProductToAFriend.unregisteredUserShouldNotBeAbleToReferAProductToAFriend();
    }
    @Test (priority = 3)
    public  void userShouldBeAbleToPurchaseProductAsAGuestUser()
    {
      guestUserPurchaseProduct.guestUserShouldBeAbleToBuyProduct();
      onePageCheckout.userIsAbleToCheckoutAProductAsAGuest();
      shippingMethod.shippingAndPaymentCustomerProductMethod();
    }


}