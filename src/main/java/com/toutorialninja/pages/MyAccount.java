package com.toutorialninja.pages;

import com.toutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Random;

public class MyAccount extends Utility {
    By myAccountLink = By.xpath("//nav[@id='top']/div[1]/div[2]/ul/li[2]");

    Random randomnumb= new Random();
    int emailNumber = randomnumb.nextInt();
    String emailRandom= Integer.toString(emailNumber);
  public void MyAccount(){
     clickOnElement(myAccountLink);
  }
    public void selectMyAccount(String register){
        WebElement registerLink = driver.findElement(By.linkText(register));
        registerLink.click();}

    public void fillOutForm(){
        sendTextToElement(By.id("input-firstname"),"Manpreet");
        sendTextToElement(By.id("input-lastname"),"singh");
        sendTextToElement(By.id("input-email"),"jokee"+emailRandom+"@gmail.com");
        sendTextToElement(By.id("input-telephone"),"222-333-3344");
        sendTextToElement(By.id("input-password"),"home22");
        sendTextToElement(By.id("input-confirm"),"home22");
        sendTextToElement(By.name("newsletter"),"95334");
  }
  By privacyPolicy = By.xpath("//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[1]");
  public void privacyPolicyCheckBox(){
      clickOnElement(privacyPolicy);
  }
    By continue1 = By.xpath("//div[@id='account-register']/div[1]/div[1]/form/div[1]/div[1]/input[2]");
    public void Continue(){
        clickOnElement(continue1);
    }
    By continue2 = By.xpath("//div[@id='content']/div[1]/div[1]/a");
    public void ContinueB2(){
        clickOnElement(continue2);
    }
    public void selectMyAccount1(String login){
        WebElement loginLink = driver.findElement(By.linkText(login));
        loginLink.click();
    }

    public void setLogin(){
        sendTextToElement(By.id("input-email"),"jokee"+emailRandom+"@gmail.com");
        sendTextToElement(By.id("input-password"),"home22");
        clickOnElement(By.xpath("//*[@id='content']/div/div[2]/div/form/input"));

    }


    public void logOut() {
        clickOnElement(By.linkText("Logout"));
    }
}




