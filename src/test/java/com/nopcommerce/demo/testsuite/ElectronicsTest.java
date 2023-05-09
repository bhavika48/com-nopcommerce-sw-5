package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.*;

import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class ElectronicsTest extends BaseTest {
    CellPhonesPage cellPhonesPage ;
    TopMenuPage topMenuPage ;
    NokiaLumiaPage nokiaLumiaPage ;
    ShoppingCartPage shoppingCartPage ;
    LoginPage loginPage ;
    RegisterPage registerPage;
    CheckoutPage checkoutPage ;

    @BeforeMethod
    public void inIt(){
        cellPhonesPage=new CellPhonesPage();
        topMenuPage=new TopMenuPage();
        nokiaLumiaPage=new NokiaLumiaPage();
        shoppingCartPage=new ShoppingCartPage();
        loginPage =new LoginPage();
        registerPage=new RegisterPage();
        checkoutPage=new CheckoutPage();

    }

    @Test(groups = {"Smoke","Regression"})
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() {
//      2.1 Mouse Hover on “Electronics”Tab
        topMenuPage.mouseHoverOnElectronicsMenu();

//      2.2 Mouse Hover on “Cell phones” and click
        topMenuPage.mouseHoverAndClickOnCellPhonesMenu();
//      2.3 Verify the text “Cell phones”
        String expectedMessage = "Welcome to our store";
        String actualMessage = cellPhonesPage.getTitle();
        Assert.assertEquals(actualMessage, expectedMessage);

//      2.4 Click on List View Tab
        cellPhonesPage.checkListViewOfCellPhones();

//      2.5 Click on product name “Nokia Lumia 1020” link
        cellPhonesPage.selectproductNameByNokiaLumia1020();
//      2.6 Verify the text “Nokia Lumia 1020”
        String expectedMessage1 = "Nokia Lumia 1020";
        String actualMessage1 = nokiaLumiaPage.getTitleNokiaLumia();
        Assert.assertEquals(actualMessage1, expectedMessage1);

//      2.7 Verify the price “$349.00”
        String expectedMessage2 = "$349.00";
        String actualMessage2 = nokiaLumiaPage.getPriceOfNokiaLumia();
        Assert.assertEquals(actualMessage2, expectedMessage2);
//      2.8 Change quantity to 2
        nokiaLumiaPage.addQuantity();

//      2.9 Click on “ADD TO CART” tab
        nokiaLumiaPage.selectAddToCart();
//      2.10 Verify the Message "The product has been added to your shopping cart" on Top
//        green Bar
        String expectedMessage3 = "The product has been added to your shopping cart";
        String actualMessage3 = nokiaLumiaPage.getTitleMessageOfNokiaLumia();
        Assert.assertEquals(actualMessage3, expectedMessage3);

//      After that close the bar clicking on the cross button.
        nokiaLumiaPage.closeTab();

//      2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        nokiaLumiaPage.mouseHoverToShoppingCartAnd();
        nokiaLumiaPage.selectAddToCart();
//
//      2.12 Verify the message "Shopping cart"
        String expectedMessage4 = "Shopping cart";
        String actualMessage4 = nokiaLumiaPage.getTitleMessageOfNokiaLumia();
        Assert.assertEquals(actualMessage4, expectedMessage4);

//      2.13 Verify the quantity is nd Click on "Update shopping cart "
        shoppingCartPage.updateQuantity();
        shoppingCartPage.updateShoppingCart();
//      2.14 Verify the Total $698.00
        String expectedMessage5 = "$698.00";
        String actualMessage5 = shoppingCartPage.getTotalPrice();
        Assert.assertEquals(actualMessage5, expectedMessage5);

//      2.15 click on checkbox “I agree with the terms of service”
        shoppingCartPage.acceptTermsAndCondition();
//      2.16 Click on “CHECKOUT”
        shoppingCartPage.checkOut();
//      2.17 Verify the Text “Welcome, Please Sign In!”
        String expectedMessage6 = "Welcome, Please Sign In!";
        String actualMessage6 = loginPage.getWelcomeText();
        Assert.assertEquals(actualMessage6, expectedMessage6);
//        2.18 Click on “REGISTER” tab
        loginPage.selectRegister();
        // register page
//        2.19 Verify the text “Register”
        String expectedMessage7 = "Register";
        String actualMessage7 = registerPage.getTitle();
        Assert.assertEquals(actualMessage7, expectedMessage7);
//        2.20 Fill the mandatory fields
        registerPage.enterRegistrationDetails();
//        2.21 Click on “REGISTER” Button
        registerPage.registerButton();
//        2.22 Verify the message “Your registration completed”
        String expectedMessage8 = "Your registration completed";
        String actualMessage8 = shoppingCartPage.getTotalPrice();
        Assert.assertEquals(actualMessage8, expectedMessage8);
//        2.23 Click on “CONTINUE” tab
        registerPage.selectRegisterSaveAndContinue();

//        2.24 Verify the text “Shopping card”
        String expectedMessage9 = "Shopping cart";
        String actualMessage9 = shoppingCartPage.getTitle();
        Assert.assertEquals(actualMessage9, expectedMessage9);
//      2.25 click on checkbox “I agree with the terms of service”
        shoppingCartPage.acceptTermsAndCondition();
//      2.26 Click on “CHECKOUT”
        shoppingCartPage.checkOut();
        //checkout page
//      2.27 Fill the Mandatory fields
        checkoutPage.enterFirstNameAndLastName();
        checkoutPage.enterEmail();
        checkoutPage.enterBillingAddress();


//      2.28 Click on “CONTINUE”
        checkoutPage.billingSaveAndContinue();
//      2.29 Click on Radio Button “2nd Day Air ($0.00)”
        checkoutPage.selectShippingBySecondDayAir();
//      2.30 Click on “CONTINUE”
        checkoutPage.shippingSaveAndContinue();
//      2.31 Select Radio Button “Credit Card”
        checkoutPage.selectPaymentMethodByCreditCard();

//      2.32 Select “Visa” From Select credit card dropdown
        checkoutPage.selectCreditCardByVisa();
//      2.33 Fill all the details
        checkoutPage.enterCreditCardDetails();
//      2.34 Click on “CONTINUE”
        checkoutPage.paymentSaveAndContinue();
//      2.35 Verify “Payment Method” is “Credit Card”
        String expectedMessage10 = "Credit Card";
        String actualMessage10 = checkoutPage.getPaymentMethod();
        Assert.assertEquals(actualMessage10, expectedMessage10);
//      2.36 Verify “Shipping Method” is “2nd Day Air”
        String expectedMessage11 = "2nd Day Air";
        String actualMessage11 = checkoutPage.get2ndDayAirText();
        Assert.assertEquals(actualMessage11, expectedMessage11);
//      2.37 Verify Total is “$698.00”
        String expectedMessage12 = "$698.00";
        String actualMessage12 = checkoutPage.getTotalPrice();
        Assert.assertEquals(actualMessage12, expectedMessage12);
//      2.38 Click on “CONFIRM”
        checkoutPage.selectConfirm();
//      2.39 Verify the Text “Thank You”
        String expectedMessage13 = "Thank You";
        String actualMessage13 = checkoutPage.getThankYouMessage();
        Assert.assertEquals(actualMessage13, expectedMessage13);
//      2.40 Verify the message “Your order has been successfully processed!”
        String expectedMessage14 = "Your order has been successfully processed!";
        String actualMessage14 = checkoutPage.getOrderMessage();
        Assert.assertEquals(actualMessage14, expectedMessage14);
//      2.41 Click on “CONTINUE”
        checkoutPage.selectContinue();
//      2.42 Verify the text “Welcome to our store”
        String expectedMessage15 = "Welcome to our store";
        String actualMessage15 = checkoutPage.getWellComeToOurStore();
        Assert.assertEquals(actualMessage15, expectedMessage15);
//      2.43 Click on “Logout” link
        checkoutPage.selectLogOut();

    }
}
