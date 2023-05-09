package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckoutPage extends Utility {
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")
    WebElement countryDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement cityDropdown;


    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement addressDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postCodeDropdown;

    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberDropdown;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")
    WebElement billingContinueButton;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Next Day Air ($0.00)']")
    WebElement shippingNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='2nd Day Air ($0.00)']")
    WebElement shippingBySecondDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")
    WebElement shippingSaveAndContinueButton;

    @CacheLookup
    @FindBy(xpath = "//label[normalize-space()='Credit Card']")
    WebElement paymentMethodByCreditCard;


    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")
    WebElement paymentMethodSaveAndContinue;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardByMasterCard;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']")
    WebElement creditCardByVisa;

    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolderNameField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']")
    WebElement cardNumberField;

    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expireMonthField;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")
    WebElement expireYearField;


    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']")
    WebElement cardCodeField;

    @CacheLookup
    @FindBy(xpath = "//li[@class='payment-method']//span[@class='value']")
    WebElement paymentText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement shippingMethodText;

    @CacheLookup
    @FindBy(xpath = "//span[@class='value-summary']//strong")
    WebElement totalPriceText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")
    WebElement confirmButton;

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Thank you']")
    WebElement thankYouText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='page checkout-page order-completed-page']")
    WebElement orderMessageText;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    WebElement continueButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Welcome to our store']")
    WebElement wellComeToOurStoreText;

    @CacheLookup
    @FindBy(xpath = "//li[@class='shipping-method']//span[@class='value']")
    WebElement secondDayAirText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Log out']")
    WebElement logOutButton;


    public void enterFirstNameAndLastName() {
        sendTextToElement(firstNameField, "Tom");
        sendTextToElement(lastNameField, "Olins");
    }

    public void enterEmail() {
        Reporter.log("Enter email " + " to email field " + emailField.toString());
        sendTextToElement(emailField, "tom123@gmail.com");
        CustomListeners.test.log(Status.PASS, "Enter EmailId ");
    }

    public void enterBillingAddress() {
        selectByVisibleTextFromDropDown(countryDropdown, "American Samoa");
        sendTextToElement(cityDropdown, "Texas");
        sendTextToElement(addressDropdown, "50 Cecli Road");
        sendTextToElement(postCodeDropdown, "Tw3 4QP");
        sendTextToElement(phoneNumberDropdown, "04562341345");

    }

    public void billingSaveAndContinue() {
        Reporter.log("Clicking on update Button " + billingContinueButton.toString());
        clickOnElement(billingContinueButton);
        CustomListeners.test.log(Status.PASS, "Click on save and contiue Button");
    }

    public void selectShippingByNextDayAir() {
        Reporter.log("Clicking on update Button " + shippingNextDayAir.toString());
        clickOnElement(shippingNextDayAir);
        CustomListeners.test.log(Status.PASS, "Click on shiping next day air Button");

    }

    public void selectShippingBySecondDayAir() {
        Reporter.log("Clicking on update Button " + shippingBySecondDayAir.toString());
        clickOnElement(shippingBySecondDayAir);
        CustomListeners.test.log(Status.PASS, "Click on shipping By SecondDayAir Button");

    }

    public void shippingSaveAndContinue() {
        Reporter.log("Clicking on update Button " + shippingSaveAndContinueButton.toString());
        clickOnElement(shippingSaveAndContinueButton);
        CustomListeners.test.log(Status.PASS, "Click on save and continue Button");


    }

    public void selectPaymentMethodByCreditCard() {
        Reporter.log("Clicking on update Button " + paymentMethodByCreditCard.toString());
        clickOnElement(paymentMethodByCreditCard);
        CustomListeners.test.log(Status.PASS, "Click on payment MethodBy CreditCard ");

    }

    public void paymentMethodSaveAndContinue() {
        Reporter.log("Clicking on update Button " + paymentMethodSaveAndContinue.toString());
        clickOnElement(paymentMethodSaveAndContinue);
        CustomListeners.test.log(Status.PASS, "Click on   save and contiue ");
    }

    public void selectCreditCardByMasterCard() {
        selectByVisibleTextFromDropDown(creditCardByMasterCard, "Master card");
        CustomListeners.test.log(Status.PASS, "Click on CreditCard by master card");
    }

    public void selectCreditCardByVisa() {
        selectByVisibleTextFromDropDown(creditCardByVisa, "Visa");
    }

    public void enterCreditCardDetails() {
        sendTextToElement(cardHolderNameField, "Tom");
        sendTextToElement(cardNumberField, "5105105105105100");
        selectByVisibleTextFromDropDown(expireMonthField, "02");
        selectByVisibleTextFromDropDown(expireYearField, "2025");
        sendTextToElement(cardCodeField, "123");
    }

    public void paymentSaveAndContinue() {
        clickOnElement(paymentMethodSaveAndContinue);
        CustomListeners.test.log(Status.PASS, "Click on payment save and contiue ");
    }

    public String getPaymentMethod() {
        Reporter.log("Get Success Modified Message  " + paymentText.toString());
        String message = getTextFromElement(paymentText);
        CustomListeners.test.log(Status.PASS, "Get PaymentMethod text ");
        return message;
    }

    public String getShippingMethod() {
        Reporter.log("Get Success Modified Message  " + shippingMethodText.toString());
        String message = getTextFromElement(shippingMethodText);
        CustomListeners.test.log(Status.PASS, "Get ShippingMethod text ");
        return message;
    }

    public String getTotalPrice() {
        Reporter.log("Get Success Modified Message  " + totalPriceText.toString());
        String message = getTextFromElement(totalPriceText);
        CustomListeners.test.log(Status.PASS, "Get total price text");
        return message;
    }

    public void selectConfirm() {
        Reporter.log("Clicking on update Button " + confirmButton.toString());
        clickOnElement(confirmButton);
    }

    public String getThankYouMessage() {
        Reporter.log("Get Success Modified Message  " + thankYouText.toString());
        String message = getTextFromElement(thankYouText);
        CustomListeners.test.log(Status.PASS, "Get Thank you message");
        return message;
    }

    public String getOrderMessage() {
        Reporter.log("Get Success Modified Message  " + orderMessageText.toString());
        String message = getTextFromElement(orderMessageText);
        CustomListeners.test.log(Status.PASS, "Get order Message");
        return message;
    }

    public void selectContinue() {
        Reporter.log("Clicking on update Button " + continueButton.toString());
        clickOnElement(continueButton);
        CustomListeners.test.log(Status.PASS, "Click on continue Button");
    }

    public String getWellComeToOurStore() {
        String message = getTextFromElement(wellComeToOurStoreText);
        CustomListeners.test.log(Status.PASS, "Get WellCome To OurStore ");
        return message;
    }

    public String get2ndDayAirText() {
        String message = getTextFromElement(secondDayAirText);
        CustomListeners.test.log(Status.PASS, "Get 2nd day Air text");
        return message;
    }

    public void selectLogOut() {
        Reporter.log("Clicking on update Button " + logOutButton.toString());
        clickOnElement(logOutButton);
        CustomListeners.test.log(Status.PASS, "Click on logout");

    }


}
