package NopCommerceAutomation;

import org.openqa.selenium.By;

public class ShippingMethod extends Utils
{
    LoadProp loadProps = new LoadProp();
    public void shippingAndPaymentCustomerProductMethod()
    {
        clickElement(By.xpath("//input[@value=\"Next Day Air___Shipping.FixedByWeightByTotal\"]"));
        clickElement(By.xpath("//div[@id=\"shipping-buttons-container\"] //input[@type=\"button\"]"));
        clickElement(By.id("paymentmethod_1"));
        clickElement(By.xpath("//div[@id=\"payment-method-buttons-container\"] //input[@type=\"button\"]"));
        selectByVisibleValue(By.id("CreditCardType"), "MasterCard");
        enterText(By.id("CardholderName"), "Samantha Edwards");
        enterText(By.id("CardNumber"), "516789992019203");
        selectByVisibleValue(By.id("ExpireMonth"), "12");
        selectByVisibleValue(By.id("ExpireYear"), "2030");
        enterText(By.name("CardCode"), "450");
        clickElement(By.xpath("//div[@id='payment-info-buttons-contains'] //input[@type=\"button\"]"));
        clickElement(By.xpath("//div[@id=\"confirm-order-buttons-container\"] //input[@type=\"button\"]"));

    }
}
