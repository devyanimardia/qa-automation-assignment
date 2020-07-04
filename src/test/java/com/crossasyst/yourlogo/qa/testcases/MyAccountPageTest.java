package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.testng.Assert;


import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.myAccountPage;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.loginPage;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.womenSection;

public class MyAccountPageTest extends TestBase {

    MyAccountPageTest() {
        super();
    }

    public void validateAccPage() {
        boolean flag = myAccountPage.validateWelcome();
        Assert.assertTrue(flag);
    }

    public void signOut() {
            loginPage = myAccountPage.signOut();
        }

    public void clickOnWomen() {
        womenSection = myAccountPage.goToWomen();
    }

    public void orderHistory() {
        myAccountPage.checkHistory();
    }

    public void verifyAmt() {
        boolean flag=myAccountPage.checkValue();
        Assert.assertTrue(flag);
    }
}
