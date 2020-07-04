package com.crossasyst.yourlogo.qa.pages;

import com.crossasyst.yourlogo.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAccPage extends TestBase {

    @FindBy(id= "id_gender1")
    WebElement maleChoice;

    @FindBy(id= "id_gender2")
    WebElement femaleChoice;

    @FindBy(id= "customer_firstname")
    WebElement fname;

    @FindBy(id= "customer_lastname")
    WebElement lname;

    @FindBy(id= "passwd")
    WebElement password;

    @FindBy(id= "days")
    WebElement days;

    @FindBy(id= "months")
    WebElement months;

    @FindBy(id= "years")
    WebElement years;

    @FindBy(id= "firstname")
    WebElement firstname;

    @FindBy(id= "lastname")
    WebElement lastname;

    @FindBy(id= "company")
    WebElement company;

    @FindBy(id= "address1")
    WebElement address1;

    @FindBy(id= "address2")
    WebElement address2;

    @FindBy(id= "city")
    WebElement city;

    @FindBy(id= "id_state")
    WebElement state;

    @FindBy(id= "postcode")
    WebElement postal;

    @FindBy(id= "other")
    WebElement addInfo;

    @FindBy(id= "phone")
    WebElement phone;

    @FindBy(id= "phone_mobile")
    WebElement mobPhone;

    @FindBy(id= "alias")
    WebElement alias;

    @FindBy(id= "submitAccount")
    WebElement submitAcc;

    public CreateAccPage() {
        PageFactory.initElements(driver,this);
    }


    public void inputDetails(String title, String fname, String lname, String password, String daysDob, String monthsDob,
                         String yearsDob, String fnameAdd, String lnameAdd, String company, String addLine1, String addLine2, String city, String state, String postal, String country,
                         String addInfo, String homePhone, String mobPhone, String addAlias) {
        if(title.contains("Mr")){
            maleChoice.click();
        } else {
            femaleChoice.click();
        }
        this.fname.sendKeys(fname);
        this.lname.sendKeys(lname);
        this.password.sendKeys(password);


        Select objSelect1 = new Select(days);
        objSelect1.selectByValue(daysDob);

        Select objselect2 = new Select(months);
        objselect2.selectByValue(monthsDob);

        Select objSelect3 = new Select(years);
        objSelect3.selectByValue(yearsDob);

        this.firstname.sendKeys(fnameAdd);
        this.lastname.sendKeys(lnameAdd);
        this.company.sendKeys(company);
        this.address1.sendKeys(addLine1);
        this.address2.sendKeys(addLine2);
        this.city.sendKeys(city);
        this.state.sendKeys(state);
        this.postal.sendKeys(postal);
        this.addInfo.sendKeys(addInfo);
        this.phone.sendKeys(homePhone);
        this.mobPhone.sendKeys(mobPhone);
        this.alias.sendKeys(addAlias);
    }

    public MyAccountPage createAccount(){
        submitAcc.click();
        return new MyAccountPage();
    }
}
