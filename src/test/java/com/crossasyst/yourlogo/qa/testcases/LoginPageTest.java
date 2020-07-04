package com.crossasyst.yourlogo.qa.testcases;

import org.testng.Assert;


import java.util.Properties;

import static com.crossasyst.yourlogo.qa.testcases.CommonSteps.emailId;
import static com.crossasyst.yourlogo.qa.testcases.CommonSteps.password;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.*;

public class LoginPageTest {

    Properties prop;

    public void validateAndEnterEmail(String emailId,String password)
    {
        prop= new Properties();
        prop.setProperty("Email-id",emailId);
        prop.setProperty("Password",password);
        Assert.assertTrue(loginPage.isValid(emailId));
        createAccPage = loginPage.enterNewEmail(emailId);
    }

        public void validateLoginPage(){
            boolean  flag = loginPage.verifySignOut();
            Assert.assertTrue(flag);
    }

        public MyAccountPageTest verifyLogin(){
            loginPage.setCredentials(emailId,password);
            return new MyAccountPageTest();
    }
}

