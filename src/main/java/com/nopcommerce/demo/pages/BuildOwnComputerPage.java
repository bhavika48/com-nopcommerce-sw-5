package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildOwnComputerPage extends Utility {
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement pageTitleText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor2;

    @CacheLookup
    @FindBy(id = "product_attribute_2")
    WebElement Ram8gb;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'400 GB [+$100.00]')]")
    WebElement hddBy400GbRadioButton;

    @CacheLookup
    @FindBy(xpath = " //label[contains(text(),'Vista Premium [+$60.00]')]")
    WebElement vistaPremiumRadioButton;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Total Commander [+$5.00]')]")
    WebElement softwareByTotalCommanderButton;

    @CacheLookup
    @FindBy(xpath = "//span[@id='price-value-1']")
    WebElement priceText;

    @CacheLookup
    @FindBy(id = "add-to-cart-button-1")
    WebElement addToCartButton;

    @CacheLookup
    @FindBy(xpath = "//p[@class='content']")
    WebElement productBeenAddedToYourCartText;

    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[@class='cart-label']")
    WebElement shoppingCartMouse;

    @CacheLookup
    @FindBy(xpath = "//button[text()='Go to cart']")
    WebElement goToCartButton;


    public String getPageTitle() {
        Reporter.log("Get page title  " + pageTitleText.toString());
        String message= getTextFromElement(pageTitleText);
        CustomListeners.test.log(Status.PASS, "get model");
        return message;
    }

    public void selectProcessorBy2_2() {
        Reporter.log("Clicking on update Button " + processor2.toString());
        selectByVisibleTextFromDropDown(processor2, "2.2 GHz Intel Pentium Dual-Core E2200");
        CustomListeners.test.log(Status.PASS, "Click on ProcessorBy2_2");
    }


    public void selectRamBy8GB() {
        selectByVisibleTextFromDropDown(By.id("product_attribute_2"), "8GB [+$60.00]");
    }

    public void selectHddBy320GB() {

    }


    public void selectHddBy400GB() {
        Reporter.log("Clicking on hddBy400GbRadio Button " + hddBy400GbRadioButton.toString());
        clickOnElement(hddBy400GbRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on update radio Button");

    }

    public void selectOSByVistaHome() {

    }

    public void selectOSByVistaPremium() {
        Reporter.log("Clicking on VistaPremium " + vistaPremiumRadioButton.toString());
        clickOnElement(vistaPremiumRadioButton);
        CustomListeners.test.log(Status.PASS, "Click on vista radio Button");
    }

    public void selectSoftwareByTotalCommander() {
        Reporter.log("Clicking on SoftwareByTotalCommander " + softwareByTotalCommanderButton.toString());
        clickOnElement(softwareByTotalCommanderButton);
        CustomListeners.test.log(Status.PASS, "Click on software ByTotalCommander Button");
    }


    public String getPrice() {
        Reporter.log("Get Total  " + priceText.toString());
        String message = getTextFromElement(priceText);
        CustomListeners.test.log(Status.PASS, " price");
        return message;

    }


    public void clickOnAddToCart() {
        Reporter.log("Clicking on update Button " + addToCartButton.toString());
        clickOnElement(addToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to cart Button");
    }


    public String getTextProductBeenAddedToYourCart() {
        Reporter.log("Get Success Modified Message  " + productBeenAddedToYourCartText.toString());
        String message= getTextFromElement(productBeenAddedToYourCartText);
        CustomListeners.test.log(Status.PASS, "text products added to cart");
        return message;
    }


    public void clickOnCloseMessage() {
        Reporter.log("Clicking on update Button " + closeMessage.toString());
        clickOnElement(closeMessage);
        CustomListeners.test.log(Status.PASS, "Click on close Button");
    }

    public void mouseHoverShoppingCart() {
        Reporter.log("Clicking on update Button " + shoppingCartMouse.toString());
        mouseHoverToElement(shoppingCartMouse);
        CustomListeners.test.log(Status.PASS, "Click on shopping cart Button");
    }


    public void clickOnGoToCart() {
        Reporter.log("Clicking on update Button " + shoppingCartMouse.toString());
        clickOnElement(goToCartButton);
        CustomListeners.test.log(Status.PASS, "Click on add to cart Button");
    }


}
