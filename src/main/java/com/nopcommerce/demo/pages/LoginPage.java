package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void checkOutAsGuest() {
        clickOnElement(By.xpath("//button[normalize-space()='Checkout as Guest']"));
    }

    public void selectRegister() {
        clickOnElement(By.xpath("//button[normalize-space()='Register']"));
    }


}
