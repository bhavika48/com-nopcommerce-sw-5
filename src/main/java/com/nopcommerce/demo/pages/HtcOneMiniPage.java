package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HtcOneMiniPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='HTC One Mini Blue']")
    WebElement htcOneMiniTitle;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-19']")
    WebElement addToCartHtc;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeButton;




    public String getHtcTitle(){
        Reporter.log("Get htc title  " + htcOneMiniTitle.toString());
        String message = getTextFromElement(htcOneMiniTitle);
        CustomListeners.test.log(Status.PASS, "success message ");
        return message;
    }

    public void clickOnAddToCart(){
        Reporter.log("click on add to cart" +addToCartHtc.toString());
        clickOnElement(addToCartHtc);
        CustomListeners.test.log(Status.PASS, "Click on add to cart");
    }

    public void clickOnCloseButton(){
        Reporter.log("click on close button" +closeButton.toString());
        clickOnElement(closeButton);
        CustomListeners.test.log(Status.PASS, "Click on close button");
    }


}
