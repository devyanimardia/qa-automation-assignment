package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Properties;


public class LoginPage extends TestBase {


    Properties prop;
    @FindBy(name = "email_create")
    WebElement emailCreate;

    @FindBy(id = "SubmitCreate")
    WebElement createBtn;

    @FindBy(id = "email")
    WebElement email;

    @FindBy(id = "passwd")
    WebElement pass;

    @FindBy(id="SubmitLogin")
    WebElement signinBtn;

    @FindBy(xpath="//h1[contains(text(),'Authentication')]")
    WebElement authverify;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean isValid(String emailId){
        String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return emailId.matches(regex);
    }

    public CreateAccPage enterNewEmail(String emailId){
        emailCreate.sendKeys(emailId);
        createBtn.click();
        return new CreateAccPage();
    }

    public boolean verifySignOut(){
        return authverify.isDisplayed();
    }

    public void setCredentials(String emailId,String password){
        email.sendKeys(emailId);
        pass.sendKeys(password);
        signinBtn.click();
    }

}
