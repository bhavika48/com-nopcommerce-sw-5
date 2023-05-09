package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class TopMenuPage extends Utility {
    @CacheLookup
    @FindBy(linkText = "Log in")
    WebElement loginLink;
    @CacheLookup
    @FindBy(linkText = "Computers")
    WebElement computersLink;

    @CacheLookup
    @FindBy(linkText = "Electronics")
    WebElement electronicsLink;

    @CacheLookup
    @FindBy(linkText = "Desktops")
    WebElement desktopsLink;

    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement registerLink;

    @CacheLookup
    @FindBy(linkText = "Cell phones")
    WebElement cellPhoneLink;

    public void clickOnLoginLink() {
        Reporter.log("Clicking on Login Link " + loginLink.toString());
        clickOnElement(loginLink);
        CustomListeners.test.log(Status.PASS, "Click on login link");
    }

    public void clickOnRegisterLink() {
        Reporter.log("Clicking on Register Link " + registerLink.toString());
        clickOnElement(registerLink);
        CustomListeners.test.log(Status.PASS, "Click on Register Link");
    }

    public void clickOnComputersMenu() {
        Reporter.log("Clicking on ComputersMenu " + computersLink.toString());
        clickOnElement(computersLink);
        CustomListeners.test.log(Status.PASS, "Click on ComputersMenu");
    }

    public void clickOnElectronicsMenu() {
        Reporter.log("Clicking on ElectronicsMenu " + electronicsLink.toString());
        clickOnElement(electronicsLink);
        CustomListeners.test.log(Status.PASS, "Click on ElectronicsMenu");
    }

    public void mouseHoverOnComputersMenu() {
        Reporter.log("Clicking on ComputersMenu " + computersLink.toString());
        mouseHoverToElement(computersLink);
        CustomListeners.test.log(Status.PASS, "Click on ComputersMenu");
    }

    public void clickOnDesktopsSubMenu() {
        Reporter.log("Clicking on DesktopsSubMenu" + desktopsLink.toString());
        clickOnElement(desktopsLink);
        CustomListeners.test.log(Status.PASS, " click on DesktopsSubMenu");
    }


    public void mouseHoverOnElectronicsMenu() {
        Reporter.log(" MouseHover On ElectronicsMenu" + electronicsLink.toString());
        mouseHoverToElement(electronicsLink);
        CustomListeners.test.log(Status.PASS, "MouseHover on ElectronicsMenu");
    }

    public void mouseHoverAndClickOnCellPhonesMenu() {
        Reporter.log(" MouseHover And Click On CellPhonesMenu" + cellPhoneLink.toString());
        mouseHoverToElementAndClick(cellPhoneLink);
        CustomListeners.test.log(Status.PASS, "MouseHover and click on cell phone");
    }

}
