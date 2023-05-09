package com.nopcommerce.demo.testsuite;


import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.pages.CellPhonesPage;
import com.nopcommerce.demo.pages.TopMenuPage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class TopMenuTest extends BaseTest {
    TopMenuPage topMenuPage;
    CellPhonesPage cellPhonesPage;

    @BeforeMethod
    public void inIt() {
        cellPhonesPage = new CellPhonesPage();
        topMenuPage = new TopMenuPage();

    }

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void verifyUserShouldNavigateToComputerPageSuccessfully() {
        topMenuPage.clickOnComputersMenu();
        String expectedMessage = "Computers";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Computers')]"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void verifyUserShouldNavigateToElectronicsPageSuccessfully() {
        topMenuPage.clickOnElectronicsMenu();
        String expectedMessage = "Electronics";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Electronics')]"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        topMenuPage.mouseHoverOnComputersMenu();
        topMenuPage.clickOnDesktopsSubMenu();
        String expectedMessage = "Desktops";
        String actualMessage = getTextFromElement(By.xpath("//h1[normalize-space()='Desktops']"));
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @Test(groups = {"Sanity", "Smoke", "Regression"})
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        // 1.1 Mouse Hover on “Electronics”Tab
        topMenuPage.mouseHoverOnElectronicsMenu();

        // 1.2 Mouse Hover on “Cell phones” and click
        topMenuPage.mouseHoverAndClickOnCellPhonesMenu();
        //1.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = cellPhonesPage.getTitle();
        Assert.assertEquals(actualMessage, expectedMessage);

    }
}

