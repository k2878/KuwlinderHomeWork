package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import com.toutorialninja.pages.HomePage;
import com.toutorialninja.pages.LaptopsAndNotebooks;
import org.testng.annotations.Test;

public class LaptopAndNotebooksTest extends TestBase {
    HomePage homePage = new HomePage();
    LaptopsAndNotebooks laptopsAndNotebooks = new LaptopsAndNotebooks();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully(){
        homePage.mouseHoverToLaptopsAndNotebooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        laptopsAndNotebooks.sortByPositionHighToLow();
    }
    @Test
    public void verifyUserPlaceOrderSuccessfully() {
        homePage.mouseHoverToLaptopsAndNotebooks();
        homePage.selectMenu("Show AllLaptops & Notebooks");
        laptopsAndNotebooks.sortByPositionHighToLow();
       //laptopsAndNotebooks.clickOnMacbook();
        laptopsAndNotebooks.selectMenu("MacBook");
        laptopsAndNotebooks.AddToCartButton();
        laptopsAndNotebooks.mouseHoverToShoppingCart();
        laptopsAndNotebooks.setQuantity();
        laptopsAndNotebooks.clickOnUpdateButton();
        laptopsAndNotebooks.clickOnCheckout();
        laptopsAndNotebooks.GuestRadioButton();
        laptopsAndNotebooks.ContinueBotton();
        laptopsAndNotebooks.fillOutForm();
        laptopsAndNotebooks.contineButtonInBilling();
        laptopsAndNotebooks.commentAddOrder();
        //laptopsAndNotebooks.ConfirmOrder();
    }


}
