package tests;

import basePage.BaseClass;
import mainpages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BaseClass {

    @Test(priority = 1)
    public void validLogin(){
        LoginPage lpg = new LoginPage(driver);
        lpg.enterUsername("standard_user");
        lpg.enterPassword("secret_sauce");
        lpg.clickOnLoginButton();

        String titleOfThePage = driver.getTitle();
        Assert.assertEquals(titleOfThePage,"Swag Labs");
    }
    @Test(priority = 2)
    public void invalidLogin(){
        LoginPage lpg = new LoginPage(driver);
        lpg.enterUsername("lkdasjfjad");
        lpg.enterPassword("akjdsfjdsa");
        lpg.clickOnLoginButton();
    }}
