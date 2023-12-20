package com.toutorialninja.pages;

import com.toutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaptopsAndNotebooks extends Utility {
    By PositionHighToLow = By.id("input-sort");
    By confirmOrder = By.id("button-confirm");
    public void ConfirmOrder(){
    clickOnElement(confirmOrder);}
    By position = By.id("input-sort");
    //By macBook = By.linkText("menu");
    By addToCartButton = By.id("button-cart");

    public void AddToCartButton() {
        clickOnElement(addToCartButton);
    }

    By shoppingCart = By.linkText("shopping cart");

    public void mouseHoverToShoppingCart() {
        mouseHoverToElementAndClick(shoppingCart);
    }


    By quantity = By.xpath("//*[@id='content']/form/div/table/tbody/tr/td[4]/div/input");

       public void setQuantity() {
           WebElement quantityInput = driver.findElement(quantity);
            quantityInput.clear();
           sendTextToElement(quantity,"2");
    }

        By updateButton = By.xpath("//div[@class='input-group btn-block']/span[1]/button[1]");
        public void clickOnUpdateButton(){
            clickOnElement(updateButton);
        }

        By checkout = By.xpath("//div[@id='content']/div[3]/div[2]/a[1]");

        public void clickOnCheckout () {
        clickOnElement(checkout);
    }


        By guestButton = By.xpath("//*[@id='collapse-checkout-option']/div/div/div[1]/div[2]/label/input");
        public void GuestRadioButton(){
            clickOnElement(guestButton);
        }
        By continueButton = By.xpath("//div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/input");
    public void ContinueBotton(){
        clickOnElement(continueButton);
    }
        By firstName = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[2]/input");

        By lastName = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[2]/input");

        By email = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[4]/input");
        By telephone = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/fieldset/div[5]/input");

        By company = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[1]/input");

        By address1 = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[2]/input");

        By address2 = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[3]/input");

        By city = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[4]/input");

        By postCode = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[5]/input");

        By country = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[6]/select");

        By regionState = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/fieldset/div[7]/select");

        By continueButton1 = By.xpath("//div[@id='content']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/input");

        public void contineButtonInBilling(){
            clickOnElement(By.id("button-guest"));
        }
        By comment = By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/p[2]/textarea");

        public void commentAddOrder(){
            sendTextToElement(comment,"Add some thing");
            clickOnElement(By.xpath("//*[@id='collapse-payment-method']/div/div[2]/div/input[1]"));
            clickOnElement(By.id("button-payment-method"));
        }
        By termsAndCondition = By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");


        By continueButton2 = By.xpath("//div[@id='content']/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[2]");

        public void fillOutForm(){
            sendTextToElement(By.id("input-payment-firstname"),"Manpreet");
            sendTextToElement(By.id("input-payment-lastname"),"singh");
            sendTextToElement(By.id("input-payment-email"),"jokeMokes@gmail.com");
            sendTextToElement(By.id("input-payment-telephone"),"222-333-3344");
            sendTextToElement(By.id("input-payment-address-1"),"132445 Rocky Road apt 123");
            sendTextToElement(By.id("input-payment-city"),"Montywill");
            sendTextToElement(By.id("input-payment-postcode"),"95334");
            sendTextToElement(By.id("input-payment-country"),"95334");
            selectByValueFromDropDown(By.id("input-payment-country"),"223");
            selectByValueFromDropDown(By.id("input-payment-zone"),"3624");

        }

        public void selectMenu (String macBook){
            WebElement menuLink = driver.findElement(By.linkText(macBook));
            menuLink.click();
        }

        public void sortByPositionHighToLow () {
            selectByIndexFromDropDown(PositionHighToLow, 4);
        }
    }





