package com.x_cart.mobile.testsuite;

import com.x_cart.mobile.pages.CategoriesPage;
import com.x_cart.mobile.pages.HomePage;
import com.x_cart.mobile.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
   HomePage homePage=new HomePage();
   CategoriesPage categoriesPage=new CategoriesPage();
   @Test
   public void verifyUserShouldNavigateToShippingPageSuccessfully(){
      // 1.1 Click on the “Shipping” link
      homePage.clickOnShippingTab();
      // 1.2 Verify the text “Shipping”
      String actualText=categoriesPage.getCategoriesText();
      String expectedText="Shipping";
      Assert.assertEquals(actualText,expectedText,"Verify shipping text");
   }
   @Test
   public void verifyUserShouldNavigateToNewPageSuccessfully(){
      //2.1 Click on the “New!” link
      homePage.clickOnNewTab();
      //2.2 Verify the text “New arrivals”
      String actualText=categoriesPage.getCategoriesText();
      String expectedText="New arrivals";
      Assert.assertEquals(actualText,expectedText,"Verify New arrivals text");
   }
   @Test
   public void  verifyUserShouldNavigateToComingSoonPageSuccessfully(){
      //3.1 Click on the “Coming soon” link
      homePage.clickOnComingSoonTab();
      //3.2 Verify the text “Coming soon”
      String actualText=categoriesPage.getCategoriesText();
      String expectedText="Coming soon";
      Assert.assertEquals(actualText,expectedText,"Verify Coming soon text");
   }
   @Test
   public void verifyUserShouldNavigateToContactUsPageSuccessfully(){
      // 4.1 Click on the “Contact us” link
      homePage.clickOnContactUs();
      // 4.2 Verify the text “Contact us”
      String actualText=categoriesPage.getCategoriesText();
      String expectedText="Contact us";
      Assert.assertEquals(actualText,expectedText,"Verify Contact us text");
   }

}
