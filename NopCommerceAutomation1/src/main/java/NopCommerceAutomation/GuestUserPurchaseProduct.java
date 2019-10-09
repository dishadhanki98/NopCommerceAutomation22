package NopCommerceAutomation;

import org.openqa.selenium.By;

public class GuestUserPurchaseProduct extends Utils
{
    LoadProp loadProps = new LoadProp();
    public void guestUserShouldBeAbleToBuyProduct()
    {
        clickElement(By.xpath("//div[@data-productid=\"18\"]"));
        clickElement(By.xpath("//input[@id=\"add-to-cart-button-18\"]"));
        clickElement(By.xpath("//span[@class=\"cart-label\"]"));
        //selectByVisibleText(By.className("country-input"), "United States");
        //enterText(By.className("zip-input"),loadProps.getProperty("zipCode"));
        clickElement(By.xpath("//input[@name=\"termsofservice\"]"));
        clickElement(By.xpath("//button[@name=\"checkout\"]"));
        clickElement(By.xpath("//input[@value=\"Checkout as Guest\"]"));

    }

}
