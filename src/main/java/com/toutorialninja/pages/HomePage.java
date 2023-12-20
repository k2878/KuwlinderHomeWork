package com.toutorialninja.pages;

import com.toutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomePage extends Utility {

    By Desktop = By.xpath("//ul[@class='nav navbar-nav']/li[1]/a");
    By LaptopsAndNotebooks = By.xpath("//ul[@class='nav navbar-nav']/li[2]/a");
    By Components = By.xpath("//ul[@class='nav navbar-nav']/li[3]/a");


   public void mouseHoverToDesktop() {mouseHoverToElementAndClick(Desktop);}

    public void mouseHoverToLaptopsAndNotebooks() {mouseHoverToElementAndClick(LaptopsAndNotebooks);}

    public void mouseHoverToComponents() {mouseHoverToElementAndClick(Components);}

    public void selectMenu(String menu){
        WebElement menuLink = driver.findElement(By.linkText(menu));
       menuLink.click();
    }

}


