package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.*;
import com.x_cart.mobile.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingTest extends TestBase {
    HomePage homePage=new HomePage();
    CategoriesPage categoriesPage=new CategoriesPage();
    BestSellers bestSellers=new BestSellers();
    CartPage cartPage=new CartPage();
    LoginPage loginPage=new LoginPage();
    SecureCheckOut secureCheckOut=new SecureCheckOut();
    @Test
    public void verifyThatUserShouldPlaceOrderSuccessfullyForOllieTheAppControlledRobot() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersFromHotDealDropDown();
        //1.3 Verify the text “Bestsellers”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Bestsellers";
        Assert.assertEquals(actualText,expectedText,"Verify Bestsellers text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        categoriesPage.mouseHoverToSortBy();
        bestSellers.clickOnNameAtoZFromBestSellersDropDown();
        Thread.sleep(2000);
        //1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
        bestSellers.mouseHoverToUnicornMeat();
        bestSellers.mouseHoverAndClickOnAddToCartOnFrame();
        Thread.sleep(2000);
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualText1=bestSellers.verifyProductAddedToCartTextOnBestSellersPage();
        String expectedText1="Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1,"Verify Product has been added to cart");
        //1.7 Click on X sign to close the message
        bestSellers.clickOnXSign();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellers.clickOnCartIconAnsClickOnViewCartButton();
        Thread.sleep(20);
        String actualText2=cartPage.VerifyYourShoppingCartTitle();
        String expectedText2="Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2,"Verify text your shopping cart");
        //1.10 Verify the Subtotal $9.99
        String actualText3=cartPage.VerifySubTotal();
        String expectedText3="$9.99";
        Assert.assertEquals(actualText3,expectedText3,"Verify subtotal");
        //1.11 Verify the total $15.66
        String actualText4=cartPage.verifyTotal();
        String expectedText4="$15.66";
        Assert.assertEquals(actualText4,expectedText4,"verify total");
        //1.12 Click on “Go to checkout” button
        cartPage.clickOnGoToCheckoutButton();
        //1.13 Verify the text “Log in to your account”
        String actualText5=loginPage.verifyLogInToYourAccountText();
        String expectedText5="Log in to your account";
        Assert.assertEquals(actualText5,expectedText5,"Verify log in to your account text");
        Thread.sleep(200);
        //1.14 Enter Email address
        loginPage.sendEmailToEmailIdField();
        Thread.sleep(200);
        //1.15 Click on “Continue” Button
        loginPage.clickOnContinueBtn();
        //1.16 Verify the text “Secure Checkout”
        String actualTitle=secureCheckOut.verifySecureCheckoutTitle();
        String expectedTitle="Secure Checkout";
        Assert.assertEquals(expectedTitle,actualTitle,"Verify secure checkout title");
        //1.17 Fill all the mandatory fields
        secureCheckOut.firstNameField("nik");
        secureCheckOut.lastNameField("polo");
        secureCheckOut.addressField("King street");
        secureCheckOut.stateField("florida");
        Thread.sleep(500);
        secureCheckOut.clickOnCreateAccountCheckBox();
        //1.19 Enter the password
        secureCheckOut.passwordField("Binoke1223$");
        Thread.sleep(5000);
        //1.20 Select the Delivery Method to “Local Shipping
        waitUnitVisibilityOfElementLocated(By.cssSelector("#method128"),10);
        secureCheckOut.clickOnLocalShippingCheckBox();
        Thread.sleep(500);
        //1.21 Select Payment Method “COD
        secureCheckOut.clickOnCodCheckBox();
        Thread.sleep(500);
        //1.22 Verify the total $16.67
        String actualTotal=secureCheckOut.verifyTotal();
        String expectedTotal="$16.67";
        Assert.assertEquals(actualTotal,expectedTotal,"Verify total");
        //1.23 Click on “Place Order” Button
        secureCheckOut.clickOnPlaceOrder();
        Thread.sleep(500);
        //1.24 Verify the text “Thank you for your order”
        String actualText6=secureCheckOut.verifyThankYouText();
        String expectedText6="Thank you for your order";
        Assert.assertEquals(expectedText6,actualText6,"verify Thank you for your order text");
    }
    @Test
    public void verifyThatUserShouldClearShoppingCartSuccessfully() throws InterruptedException {
        //1.1 Mouse hover on the “Hot deals” link
        // 1.2 Mouse hover on the “Bestsellers”  link and click
        homePage.clickOnBestSellersFromHotDealDropDown();
        //1.3 Verify the text “Bestsellers”
        String actualText=categoriesPage.getTextFromHotDealCategoriesPage();
        String expectedText="Bestsellers";
        Assert.assertEquals(actualText,expectedText,"Verify Bestsellers text");
        //1.4 Mouse hover on “Sort By” and select “Name A-Z”
        categoriesPage.mouseHoverToSortBy();
        bestSellers.clickOnNameAtoZFromBestSellersDropDown();
        Thread.sleep(2000);
        //1.5 Click on “Add to cart” button of the product “Ollie - The App Controlled Robot”
        bestSellers.mouseHoverToUnicornMeat();
        bestSellers.mouseHoverAndClickOnAddToCartOnFrame();
        Thread.sleep(2000);
        //1.6 Verify the message “Product has been added to your cart” display in  green bar
        String actualText1=bestSellers.verifyProductAddedToCartTextOnBestSellersPage();
        String expectedText1="Product has been added to your cart";
        Assert.assertEquals(actualText1,expectedText1,"Verify Product has been added to cart");
        //1.7 Click on X sign to close the message
        bestSellers.clickOnXSign();
        //1.8 Click on “Your cart” icon and Click on “View cart” button
        bestSellers.clickOnCartIconAnsClickOnViewCartButton();
        Thread.sleep(20);
        //1.9 Verify the text “Your shopping cart - 1 item”
        String actualText2=cartPage.VerifyYourShoppingCartTitle();
        String expectedText2="Your shopping cart - 1 item";
        Assert.assertEquals(actualText2,expectedText2,"Verify text your shopping cart");
        //1.10 Click on “Empty your cart” link
        cartPage.clickOnEmptyYourCart();
        //1.11 Verify the text “Are you sure you want to clear your cart?” on alert
        Thread.sleep(2000);
        String actualAlert=getTextFromAlert();
        String expectedAlert="Are you sure you want to clear your cart?";
        Assert.assertEquals(actualAlert,expectedAlert,"Error message");
        //1.12 Click “Ok” on alert
        acceptAlert();
        //1.15 Verify the text “Your cart is empty”
        Thread.sleep(2000);
        String actualMsg=cartPage.verifyCartIsEmptyTitle();
        String expectedMsg="Your cart is empty";
        Assert.assertEquals(actualMsg,expectedMsg,"Verify your Cart is empty");
    }

}
