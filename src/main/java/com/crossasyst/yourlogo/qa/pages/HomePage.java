package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@title='Log in to your customer account']")
    WebElement signInBtn;

    @FindBy(xpath = "//img[@src='http://automationpractice.com/img/logo.jpg']")
    WebElement logoImg;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public boolean validateLogo(){
        return logoImg.isDisplayed();
    }

    public LoginPage navigateToLogin(){
        signInBtn.click();
        return new LoginPage();
    }
}
