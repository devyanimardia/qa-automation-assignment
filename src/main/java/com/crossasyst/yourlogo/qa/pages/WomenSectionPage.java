package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenSectionPage extends TestBase {

    @FindBy(xpath=".//*[@id='center_column']/ul/li")
    WebElement productselect;

    @FindBy(xpath=".//*[@id='center_column']/ul/li[1]/div/div[2]/div[2]/a[1]/span")
    WebElement product;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    WebElement checkoutClick;

    public WomenSectionPage(){
        PageFactory.initElements(driver,this);
    }

    public MyCartPage addToCart(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Actions actions = new Actions(driver);
        actions.moveToElement(productselect).build().perform();
        product.click();
        checkoutClick.click();
        return new MyCartPage();
    }
}
