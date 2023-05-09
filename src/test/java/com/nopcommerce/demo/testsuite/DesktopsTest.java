package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.DesktopsPage;
import com.nopcommerce.demo.pages.TopMenuPage;

import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.ArrayList;
@Listeners(CustomListeners.class)
public class DesktopsTest extends BaseTest {
    DesktopsPage desktopsPage ;
    TopMenuPage topMenuPage ;

    @BeforeMethod
    public void inIt(){
        desktopsPage=new DesktopsPage();
        topMenuPage=new TopMenuPage();

    }

    @Test(groups = {"sanity","regression"})
    public void verifyProductArrangeInAlphaBaticalOrder() throws InterruptedException {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        ArrayList<String> actualProducts = desktopsPage.getProductsNameByOriginalOrder();
        // select drop down
        desktopsPage.selectProductsByAscendingOrder();
        Thread.sleep(3000);

        ArrayList<String> expectedProducts = desktopsPage.getProductsNameByAscendingOrder();
        Assert.assertEquals(actualProducts,expectedProducts);
       

    }
    @Test(groups = {"Smoke","Regression"})
    public void verifyProductArrangeInDescendingOrder() throws InterruptedException {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        ArrayList<String> actualProducts = desktopsPage.getProductsNameByOriginalOrder();

        desktopsPage.selectProductsByDescendingOrder();
        Thread.sleep(3000);

        ArrayList<String> expectedProducts = desktopsPage.getProductsNameByDescendingOrder();
        Assert.assertEquals(actualProducts,expectedProducts);

    }

}
