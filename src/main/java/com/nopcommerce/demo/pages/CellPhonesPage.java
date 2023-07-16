package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CellPhonesPage extends Utility {
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement title;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='List']")
    WebElement cellPhonesListView;

    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement nokiaLumia1020Product;

    @CacheLookup
    @FindBy(linkText ="HTC One Mini Blue" )
    WebElement htcOneMiniBlue;


    public String getTitle() {
        Reporter.log("Get title  " + title.toString());
        String message = getTextFromElement(title);
        CustomListeners.test.log(Status.PASS, "get title");
        return message;
    }

    public void checkListViewOfCellPhones() {
        Reporter.log("Clicking on update Button " + cellPhonesListView.toString());
        clickOnElement(cellPhonesListView);
        CustomListeners.test.log(Status.PASS, "Click on cell phone Button");
    }


    public void selectproductNameByNokiaLumia1020() {
        Reporter.log("Clicking on update Button " + nokiaLumia1020Product.toString());
        clickOnElement(nokiaLumia1020Product);
        CustomListeners.test.log(Status.PASS, "Click on Nokia lumia1020 Button");
    }
    public void selectProductNameByHTCOneMini() {
        Reporter.log("Clicking on htc one title " + htcOneMiniBlue.toString());
        clickOnElement(htcOneMiniBlue);
        CustomListeners.test.log(Status.PASS, "Click on htc one mini blue");
    }

}



