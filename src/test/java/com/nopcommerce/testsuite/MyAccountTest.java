package com.nopcommerce.testsuite;

import com.nopcommerce.testbase.TestBase;
import com.toutorialninja.pages.HomePage;
import com.toutorialninja.pages.MyAccount;
import org.testng.annotations.Test;

public class MyAccountTest extends TestBase {
    HomePage homePage = new HomePage();
    MyAccount myAccount = new MyAccount();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccount.MyAccount();
        myAccount.selectMyAccount("Register");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
        myAccount.MyAccount();
        myAccount.selectMyAccount("Register");
        myAccount.fillOutForm();
        myAccount.privacyPolicyCheckBox();
        myAccount.Continue();
        myAccount.ContinueB2();
    }
    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully(){
        myAccount.MyAccount();
        myAccount.selectMyAccount1("Login");
        myAccount.setLogin();
        myAccount.logOut();
    }

}
