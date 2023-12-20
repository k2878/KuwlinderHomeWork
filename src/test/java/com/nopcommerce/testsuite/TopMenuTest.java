package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import com.toutorialninja.pages.HomePage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverToDesktop();
        homePage.selectMenu("Show AllDesktops");
        String ActualText = getTextFromElement(By.tagName("h2"));
        String ExpectedText = "Desktops";
        Assert.assertEquals(ActualText,ExpectedText);

    }
    @Test
        public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
            homePage.mouseHoverToLaptopsAndNotebooks();
            homePage.selectMenu("Show AllLaptops & Notebooks");
            String ActualText = getTextFromElement(By.tagName("h2"));
            String ExpectedText = "Laptops & Notebooks";
            Assert.assertEquals(ActualText,ExpectedText);
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
        homePage.mouseHoverToComponents();
        homePage.selectMenu("Show AllComponents");
        String ActualText = getTextFromElement(By.tagName("h2"));
        String ExpectedText = "Components";
        Assert.assertEquals(ActualText,ExpectedText);
    }



    }
