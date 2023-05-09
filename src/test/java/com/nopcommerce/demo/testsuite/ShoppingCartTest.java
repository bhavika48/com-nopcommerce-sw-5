package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;

import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ShoppingCartTest extends BaseTest {
    TopMenuPage topMenuPage ;
    DesktopsPage desktopsPage;
    BuildOwnComputerPage buildOwnComputerPage ;
    ShoppingCartPage shoppingCartPage ;
    LoginPage loginPage ;
    CheckoutPage checkoutPage ;


    @BeforeMethod
    public void inIt(){
        topMenuPage=new TopMenuPage();
        shoppingCartPage=new ShoppingCartPage();
        loginPage =new LoginPage();
        checkoutPage=new CheckoutPage();
        buildOwnComputerPage=new BuildOwnComputerPage();


    }

    @Test(groups = {"Sanity" , "Regression"})
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        desktopsPage.selectProductsByAscendingOrder();
        Thread.sleep(3000);
        desktopsPage.clickOnBuildYourOwnComputer();
        // 2.5 Verify the Text "Build your own computer"
        String expectedTitle = "Build your own computer";
        String actualTitle = buildOwnComputerPage.getPageTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        // 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        buildOwnComputerPage.selectProcessorBy2_2();
        buildOwnComputerPage.selectRamBy8GB();
        buildOwnComputerPage.selectHddBy400GB();
        buildOwnComputerPage.selectOSByVistaPremium();
        Thread.sleep(2000);
        buildOwnComputerPage.selectSoftwareByTotalCommander();
        Thread.sleep(2000);
        // 2.11 Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        String actualPrice = buildOwnComputerPage.getPrice();
        Assert.assertEquals(actualPrice, expectedPrice);
        buildOwnComputerPage.clickOnAddToCart();
        // 2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedText = "The product has been added to your shopping cart";
        String actualText = buildOwnComputerPage.getTextProductBeenAddedToYourCart();
        Assert.assertEquals(actualText, expectedText);
        buildOwnComputerPage.clickOnCloseMessage();
        //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        buildOwnComputerPage.mouseHoverShoppingCart();
        buildOwnComputerPage.clickOnGoToCart();
        Thread.sleep(3000);

        // shopping cart
        // 2.15 Verify the message "Shopping cart"
        String expMessage4 = "Shopping cart";
        String actMessage4 = shoppingCartPage.getTitle();
        Assert.assertEquals(actMessage4, expMessage4);
        //2.16 Change the Qty to "2" and Click on "Update shopping cart"
        shoppingCartPage.addQuantityBy2();
        shoppingCartPage.updateShoppingCart();
        // 2.17 Verify the Total"$2,950.00"
        String expectedPrice1 = "$2,950.00";
        String actualPrice1 = shoppingCartPage.getTotalPrice();
        Assert.assertEquals(actualPrice1, expectedPrice1);
        //2.18 click on checkbox “I agree with the terms of service”
        shoppingCartPage.acceptTermsAndCondition();
        shoppingCartPage.checkOut();

        //login page
        //  2.20 Verify the Text “Welcome, Please Sign In!”
        String expMessage5 = "Welcome, Please Sign In!";
        String actMessage5 = loginPage.getWelcomeText();
        Assert.assertEquals(actMessage5, expMessage5);
        // 2.21Click on “CHECKOUT AS GUEST” Tab
        loginPage.checkOutAsGuest();

        // checkout page
        // 2.22 Fill the all mandatory field
        checkoutPage.enterFirstNameAndLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterBillingAddress();
        checkoutPage.billingSaveAndContinue();
        //shipping
        checkoutPage.selectShippingByNextDayAir();
        checkoutPage.shippingSaveAndContinue();
        //payment method
        checkoutPage.selectPaymentMethodByCreditCard();
        checkoutPage.paymentMethodSaveAndContinue();
        checkoutPage.selectCreditCardByMasterCard();

        //payment information
        //2.28 Fill all the details
        checkoutPage.enterCreditCardDetails();
        checkoutPage.paymentMethodSaveAndContinue();
        // 2.30 Verify “Payment Method” is “Credit Card”
        String expMessage6 = "Credit Card";
        String actMessage6 = checkoutPage.getPaymentMethod();
        Assert.assertEquals(actMessage6, expMessage6);

        //2.32 Verify “Shipping Method” is “Next Day Air”
        String expMessage7 = "Next Day Air";
        String actMessage7 = checkoutPage.getShippingMethod();
        Assert.assertEquals(actMessage7, expMessage7);
        //2.33 Verify Total is “$2,950.00”
        String expectedPrice2 = "$2,950.00";
        String actualPrice2 = checkoutPage.getTotalPrice();
        Assert.assertEquals(actualPrice2, expectedPrice2);
        // 2.34 Click on “CONFIRM”
        checkoutPage.selectConfirm();
        // 2.35 Verify the Text “Thank You”
        String expectedMessage9 = "Thank you";
        String actualMessage9 = checkoutPage.getThankYouMessage();
        Assert.assertEquals(actualMessage9, expectedMessage9);
        // 2.36 Verify the message “Your order has been successfully processed!”
        String expectedMessage11 = "Your order has been successfully processed!";
        String actualMessage11 = checkoutPage.getOrderMessage();
        Assert.assertEquals(actualMessage11, expectedMessage11);
        //2.37 Click on “CONTINUE”
        checkoutPage.selectContinue();
        //  2.37 Verify the text “Welcome to our store”
        String expectedMessage12 = "Welcome to our store";
        String actualMessage12 = checkoutPage.getWellComeToOurStore();
        Assert.assertEquals(actualMessage12, expectedMessage12);

    }
}
