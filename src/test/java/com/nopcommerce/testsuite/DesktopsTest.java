package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import com.toutorialninja.pages.Desktops;
import com.toutorialninja.pages.HomePage;
import org.testng.annotations.Test;

public class DesktopsTest extends TestBase {

    HomePage homePage = new HomePage();
    Desktops desktops = new Desktops();

    @Test
    public void verifyProductSortingInDecendingOrder(){
        homePage.mouseHoverToDesktop();
        homePage.selectMenu("Show AllDesktops");
        desktops.sortByPositionZtoA();
    }

    public void verifyProductSortingInAcendingOrder(){
        homePage.mouseHoverToDesktop();
        homePage.selectMenu("Show AllDesktops");
        desktops.sortByPositionAtoZ();
    }

}
