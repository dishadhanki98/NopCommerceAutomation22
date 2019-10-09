package NopCommerceAutomation;

import org.openqa.selenium.By;

public class OnePageCheckout extends Utils
{
    LoadProp loadProps = new LoadProp();

    public void userIsAbleToCheckoutAProductAsAGuest()
    {
        enterText(By.xpath("//input[@id=\"BillingNewAddress_FirstName\"]"),loadProps.getProperty("firstName"));
        enterText(By.xpath("//input[@id=\"BillingNewAddress_LastName\"]"), loadProps.getProperty("lastName"));
        enterText(By.xpath("//input[@id=\"BillingNewAddress_Email\"]"), "leia"+randomDate()+"@hotmail.com");
        selectByVisibleValue(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]"), "1");
        selectByVisibleValue(By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]"), "47");
        enterText(By.xpath("//input[@id=\"BillingNewAddress_City\"]"), "LA");
        enterText(By.xpath("//input[@id=\"BillingNewAddress_Address1\"]"), "90 Mullinger, Castille");
        enterText(By.xpath("//input[@id=\"BillingNewAddress_ZipPostalCode\"]"), "35100");
        enterText(By.xpath("//input[@id=\"BillingNewAddress_PhoneNumber\"]"), "+19902938402");
        clickElement(By.xpath("//div[@id=\"billing-buttons-container\"]"));
    }

}
