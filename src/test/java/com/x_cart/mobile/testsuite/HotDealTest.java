package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.CategoriesPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotDealTest extends TestBase {
    HomePage homePage=new HomePage();
    CategoriesPage categoriesPage=new CategoriesPage();
    @Test
    public void verifySaleProductsArrangeAlphabetically() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        //1.2 Mouse hover on the “Sale”  link and click
       homePage.clickOnSaleLinkFromHotDealDropDown();
        //1.3 Verify the text “Sale”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Sale";
        Assert.assertEquals(actualText,expectedText,"Verify sale text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnNameAtoZFromSortBy();
        //1.5 Verify that the product arrange alphabetically
        Thread.sleep(2000);
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Name A - Z";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify Dropdown Text");
    }
    @Test
    public void verifySaleProductsPriceArrangeLowToHigh() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        //2.2 Mouse hover on the “Sale”  link and click
        homePage.clickOnSaleLinkFromHotDealDropDown();
        //2.3 Verify the text “Sale”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Sale";
        Assert.assertEquals(actualText,expectedText,"Verify sale text");
        //2.4 Mouse hover on “Sort By” and select “Price Low-High”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnNamePriceLowHighFromDropDown();
        //2.5 Verify that the product’s price arrange Low to High
        Thread.sleep(2000);
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Price Low - High";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify product price low to high");
    }
    @Test
    public void verifySaleProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        //3.2 Mouse hover on the “Sale”  link and click
        homePage.clickOnSaleLinkFromHotDealDropDown();
        //3.3 Verify the text “Sale”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Sale";
        Assert.assertEquals(actualText,expectedText,"Verify sale text");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnRatesFromDropDown();
        // 3.5 Verify that the product’s arrange Rates
        Thread.sleep(2000);
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Rates";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify product arranged in Rates");
    }
    @Test
    public void verifyBestSellersProductsArrangeByZToA() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersFromHotDealDropDown();
        //1.3 Verify the text “Bestsellers”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Bestsellers";
        Assert.assertEquals(actualText,expectedText,"Verify Bestsellers text");
        //1.4 Mouse hover on “Sort By” and select “Name Z-A”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnNameZtoA();
        //1.5 Verify that the product arrange by Z to A
        Thread.sleep(2000);
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Name Z - A";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify product arranged in Name Z - A");
    }
    @Test
    public void verifyBestSellersProductsPriceArrangeHighToLow() throws InterruptedException {
        //2.1 Mouse hover on the “Hot deals” link
        //2.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersFromHotDealDropDown();
        //2.3 Verify the text “Bestsellers”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Bestsellers";
        Assert.assertEquals(actualText,expectedText,"Verify Bestsellers text");
        //2.4 Mouse hover on “Sort By” and select “Price High-Low”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnHighToLow();
        Thread.sleep(2000);
        //2.5 Verify that the product’s price arrange High to Low
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Price High - Low";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify product arranged in Price High - Low");
    }
    @Test
    public void verifyBestSellersProductsArrangeByRates() throws InterruptedException {
        //3.1 Mouse hover on the “Hot deals” link
        //3.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersFromHotDealDropDown();
        //3.3 Verify the text “Bestsellers”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Bestsellers";
        Assert.assertEquals(actualText,expectedText,"Verify Bestsellers text");
        //3.4 Mouse hover on “Sort By” and select “Rates”
        categoriesPage.mouseHoverToSortBy();
        categoriesPage.clickOnRatesFromSortBestSellersDropdown();
        Thread.sleep(2000);
        //3.5 Verify that the product’s arrange Rates
        String actualDropDownText=categoriesPage.getTextFromSortByDropDown();
        String expectedDropDownText="Rates";
        Assert.assertEquals(actualDropDownText,expectedDropDownText,"Verify product arranged in Rates from Bestsellers");
    }



}
