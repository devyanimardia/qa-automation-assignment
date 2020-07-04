package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;
import com.crossasyst.yourlogo.qa.pages.*;

import org.testng.Assert;

public class HomePageTest extends TestBase{
    public static HomePage homePage;
    public static LoginPage loginPage;
    public static CreateAccPage createAccPage;
    public static MyAccountPage myAccountPage;
    public static WomenSectionPage womenSection;
    public static MyCartPage myCartPage;

    public HomePageTest(){
        super();
    }



    public void validateLogoTest(){
        boolean flag= homePage.validateLogo() ;
        Assert.assertTrue(flag);
    }


    public void navigateToLoginTest(){
        loginPage = homePage.navigateToLogin();
    }
}
