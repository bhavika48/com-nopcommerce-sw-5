package com.nopcommerce.demo.pages;


import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    public void selectProductsByDescendingOrder() {
        //Select Sort By position "Name: Z to A"
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: Z to A");
    }

    public void selectProductsByAscendingOrder() {
        //Select Sort By position "Name: A to Z"
        selectByVisibleTextFromDropDown(By.id("products-orderby"), "Name: A to Z");
    }

    public ArrayList<String> getProductsNameByDescendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        Collections.reverse(products);
        return products;
    }

    public ArrayList<String> getProductsNameByAscendingOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        Collections.sort(products);
        return products;
    }

    public ArrayList<String> getProductsNameByOriginalOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        return products;
    }

    public ArrayList<String> getActualProductsNameByOrder() {
        ArrayList<String> products = getListOfTextByElement(By.xpath("//h2//a"));
        return products;
    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(By.linkText("Build your own computer"));
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }



}
