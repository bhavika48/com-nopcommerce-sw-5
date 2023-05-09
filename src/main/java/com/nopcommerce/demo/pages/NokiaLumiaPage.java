package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class NokiaLumiaPage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement nokiaLumiaText;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-20']")
    WebElement nokiaLumiaPrice;

    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement quantityButton;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-20']")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement nokiaLumiaTitleText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartMouseHover;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCartButton;


    public String getTitleNokiaLumia() {
        Reporter.log("Get Products added successfully message  " + nokiaLumiaText.toString());
        String message = getTextFromElement(nokiaLumiaText);
        CustomListeners.test.log(Status.PASS, "success message ");
        return message;
    }


    public String getPriceOfNokiaLumia() {
        Reporter.log("Get Products added successfully message  " + nokiaLumiaPrice.toString());
        String message = getTextFromElement(nokiaLumiaPrice);
        CustomListeners.test.log(Status.PASS, "success message ");
        return message;
    }

    public void addQuantity() {
        Reporter.log(" Add quantity " + quantityButton.toString());
        sendTextToElement(quantityButton, "2");
        CustomListeners.test.log(Status.PASS, "add quantity");
    }


    public void selectAddToCart() {
        Reporter.log("Clicking on Add to cart button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to cart");
    }


    public String getTitleMessageOfNokiaLumia() {
        Reporter.log("Get Products added successfully message  " + nokiaLumiaPrice.toString());
        String message = getTextFromElement(nokiaLumiaPrice);
        CustomListeners.test.log(Status.PASS, "success message ");
        return message;
    }


    public void closeTab() {
        Reporter.log("Clicking on close button " + closeButton.toString());
        clickOnElement(closeButton);
        CustomListeners.test.log(Status.PASS, "Click on close button");
    }

    public void mouseHoverToShoppingCartAnd() {
        Reporter.log("mouseHover to cart button " + shoppingCartMouseHover.toString());
        mouseHoverToElement(shoppingCartMouseHover);
        CustomListeners.test.log(Status.PASS, "mouseHover to cart button");
    }

    public void selectGoToCart() {
        Reporter.log("Clicking  cart button " + goToCartButton.toString());
        clickOnElement(goToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on Go to cart");
    }


}
