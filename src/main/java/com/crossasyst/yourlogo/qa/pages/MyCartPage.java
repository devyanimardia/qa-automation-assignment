package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage extends TestBase{

    public static String totalAmt;
    Actions actions;

    @FindBy(xpath = "//span[text()='Your shopping cart']")
    WebElement verifyCart;

    @FindBy(xpath = "//a[@title='Add']")
    WebElement addBtn;

    @FindBy(xpath="//span[@class='ajax_cart_quantity' and text()='2']")
    WebElement qty;

    @FindBy(xpath="//p//a//span[contains(text(),'Proceed to checkout')]")
    WebElement proceedCheckout;

    @FindBy(xpath="//button[@name='processAddress']")
    WebElement checkOut;

    @FindBy(xpath="//button[@name='processCarrier']")
    WebElement carrier;

    @FindBy(xpath= "//input[@id='cgv']")
    WebElement terms;

    @FindBy(xpath="//a[@title='Pay by bank wire']")
    WebElement option;

    @FindBy(xpath="//span[contains(text(),'I confirm my order')]")
    WebElement orderConfirm;

    @FindBy(xpath = "//*[contains(text(),'Your order on My Store is complete.')]")
    WebElement completeOrder;

    @FindBy(xpath = "//a[@title='View my customer account']")
    WebElement custInfo;

    @FindBy(xpath = "//span[@class='price']")
    WebElement amount;

    @FindBy(xpath = "//span[contains(text(),'I confirm my order')]")
    WebElement payConfirmation;

    MyCartPage() {
        PageFactory.initElements(driver,this);
    }

    public boolean verifyCartPage(){
        return verifyCart.isDisplayed();
    }

    public void addQty() {
        addBtn.click();
    }

    public boolean validateAdd() {
        String value =qty.getText();
        boolean flag = value.matches("2");
        return flag;
    }

    public void checkout() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        actions = new Actions(driver);
        actions.moveToElement(proceedCheckout).build().perform();
        proceedCheckout.click();
    }

    public void addressCheckout() {
        checkOut.click();
    }

    public void shipCheckout() {
        terms.click();
        carrier.click();

    }

    public void paymentOption() {
        option.click();
    }

    public MyAccountPage orderConfirm() {
        totalAmt=amount.getText();
        custInfo.click();
        return new MyAccountPage();
    }

    public void payConfirmation() {
        payConfirmation.click();
    }
}
