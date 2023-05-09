package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ShoppingCartPage extends Utility {

    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement titleText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityButton;

    @CacheLookup
    @FindBy(id = "updatecart")
    WebElement shoppingCartButton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'I agree with the terms of service and I adhere to ')]")
    WebElement termsAndConditionButton;

    @CacheLookup
    @FindBy(id = "checkout")
    WebElement checkOutButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement updateQuantityButton;

    public String getTitle() {
        Reporter.log("Get Products added successfully message  " + titleText.toString());
        return getTextFromElement(titleText);
    }


    public void addQuantityBy2() {
        sendTextToElement(quantityButton, "2");
    }


    public void updateShoppingCart() {
        Reporter.log("Clicking  cart button " + shoppingCartButton.toString());
        clickOnElement(shoppingCartButton);
        CustomListeners.test.log(Status.PASS, "Click on continue Button");
    }


    public void acceptTermsAndCondition() {
        Reporter.log("Clicking  cart button " + termsAndConditionButton.toString());
        clickOnElement(termsAndConditionButton);
        CustomListeners.test.log(Status.PASS, "Click on accept Terms And Condition");
    }

    public void checkOut() {
        Reporter.log("Clicking  cart button " + checkOutButton.toString());
        clickOnElement(checkOutButton);
        CustomListeners.test.log(Status.PASS, "Click on checkout");
    }

    public String getTotalPrice() {
        Reporter.log("Get Products added successfully message  " + titleText.toString());
        return getTextFromElement(totalPriceText);
    }

    public void updateQuantity() {
        Reporter.log("Update quantity " + updateQuantityButton.toString());
        sendTextToElement(updateQuantityButton, "2");
        CustomListeners.test.log(Status.PASS, "Click update quantity ");

    }


}


