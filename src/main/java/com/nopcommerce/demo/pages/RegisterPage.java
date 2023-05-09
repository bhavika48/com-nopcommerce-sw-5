package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class RegisterPage extends Utility {
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement titleText;


    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField;

    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;

    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;

    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;

    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;

    @CacheLookup
    @FindBy(id = "register-button")
    WebElement registerLink;

    @CacheLookup
    @FindBy(xpath = "//div[@class='result']")
    WebElement registrationText;

    @CacheLookup
    @FindBy(xpath = "//a[@class='button-1 register-continue-button']")
    WebElement registerSaveAndContinueButton;


    public String getTitle() {
        Reporter.log("Get Products added successfully message  " + titleText.toString());
        String message = getTextFromElement(titleText);
        CustomListeners.test.log(Status.PASS, "text title ");
        return message;
    }


    public void enterRegistrationDetails() {
        sendTextToElement(firstNameField, "Ann");
        sendTextToElement(lastNameField, "Martin");
        sendTextToElement(emailField, "ann456@gmail.com");
        sendTextToElement(passwordField, "ann123");
        sendTextToElement(confirmPasswordField, "ann123");

    }


    public void registerButton() {
        Reporter.log("Clicking on register link " + registerLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on register link");

    }


    public String getRegistrationMessage() {
        Reporter.log("Get Products added successfully message  " + registrationText.toString());
        String message = getTextFromElement(registrationText);
        CustomListeners.test.log(Status.PASS, "success message ");
        return message;
    }


    public void selectRegisterSaveAndContinue() {
        Reporter.log("Clicking on Add to cart button " + registrationText.toString());
        clickOnElement(registrationText);
        CustomListeners.test.log(Status.PASS, "Click on save and continue");
    }
}
