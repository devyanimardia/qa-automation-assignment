package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.crossasyst.yourlogo.qa.pages.MyCartPage.totalAmt;

public class MyAccountPage extends TestBase {

    @FindBy(xpath="//p[contains(text(),'Welcome to your account. Here you can manage all of your personal information and orders.')]")
    WebElement welcomeText;

    @FindBy(xpath="//a[@title='Log me out']")
    WebElement signOut;

    @FindBy(xpath ="//a[@title='Women']")
    WebElement womenChoice;

    @FindBy(xpath = "//span[contains(text(),'Order history and details')]")
    WebElement orderHistory;

    @FindBy(xpath = "//span[@class='price']")
    WebElement totalCost;



    public MyAccountPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean validateWelcome(){
        return welcomeText.isDisplayed();
    }

    public LoginPage signOut(){
        signOut.click();
        return new LoginPage();
    }

    public WomenSectionPage goToWomen(){
        womenChoice.click();
        return new WomenSectionPage();
    }

    public void checkHistory() {
        orderHistory.click();
    }

    public boolean checkValue() {
        String value =totalCost.getText();
        boolean flag = value.equals(totalAmt);
        return flag;

    }
}
