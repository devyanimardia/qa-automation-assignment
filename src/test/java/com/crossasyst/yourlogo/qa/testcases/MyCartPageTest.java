package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.testng.Assert;

import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.myAccountPage;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.myCartPage;

public class MyCartPageTest extends TestBase {

    MyCartPageTest(){
        super();
    }

    public void validateCartPage(){
        boolean flag = myCartPage.verifyCartPage();
        Assert.assertTrue(flag);
    }

    public void addQuantity() {
        myCartPage.addQty();
    }

    public void validateQty() {
        myCartPage.validateAdd();
    }

    public void checkoutOrder() {
        myCartPage.checkout();
    }

    public void addressDetails() {
        myCartPage.addressCheckout();
    }

    public void shipDetails() {
        myCartPage.shipCheckout();
    }

    public void paymentOption() {
        myCartPage.paymentOption();
    }

    public void orderConfirm() {
        myAccountPage = myCartPage.orderConfirm();
    }

    public void payConfirm() {
        myCartPage.payConfirmation();
    }
}
