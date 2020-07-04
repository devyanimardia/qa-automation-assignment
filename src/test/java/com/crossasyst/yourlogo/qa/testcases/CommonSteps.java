package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;
import com.crossasyst.yourlogo.qa.pages.HomePage;
import com.crossasyst.yourlogo.qa.util.TestUtil;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.*;

public class CommonSteps extends TestBase {

    public static HomePageTest homePageTest = new HomePageTest();
    public static LoginPageTest loginPageTest = new LoginPageTest();
    public static CreateAccPageTest createAccPageTest = new CreateAccPageTest();
    public static MyAccountPageTest myAccountPage = new MyAccountPageTest();
    public static MyCartPageTest myCartPageTest = new MyCartPageTest();
    public static WomenSectionPageTest womenSectionPageTest = new WomenSectionPageTest();
    public String title, fname, lname ,days_dob,months_dob,years_dob,fnameAdd,lnameAdd,company,addLine1,addLine2,city,state,postal,country,addInfo,homePhone,mobPhone,addAlias;

    public static String emailId,password;

    String sheetName= prop.getProperty("sheetName");

    CommonSteps() {
        super();
    }

    @BeforeTest
    public void setUp() {
        initialization();
        homePage = new HomePage();
    }

    @DataProvider
    public Object[][] getAccTestData() {
        return TestUtil.getTestData(sheetName);
    }


    @Test(priority=1,dataProvider = "getAccTestData")
    public void getDataFromExcel(String emailId,String title,String fname,String lname,String password,
                                 String days_dob, String months_dob,String years_dob, String fnameAdd,String lnameAdd,
                                 String company, String addLine1,String addLine2,String city,String state,String postal,
                                 String country,String addInfo,String homePhone,String mobPhone,String addAlias){

        CommonSteps.emailId =emailId;this.title = title;this.fname=fname; this.lname=lname;
        CommonSteps.password =password;this.days_dob=days_dob;this.months_dob=months_dob;
        this.years_dob=years_dob;this.fnameAdd=fnameAdd;this.lnameAdd=lnameAdd;this.company=company;this.addLine1=addLine1;this.addLine2=addLine2;this.city=city;
        this.state=state;this.postal=postal;this.country=country;this.addInfo=addInfo;this.homePhone=homePhone;this.mobPhone=mobPhone;this.addAlias=addAlias;

    }

    @Test(priority = 2)
    public void scn1ValidateLogo() {
        homePageTest.validateLogoTest();
    }

    @Test(priority=3)
    public void scn1NavigateLogin() {
        homePageTest.navigateToLoginTest();
    }

    @Test(priority = 4)
    public void scn1EnterEmail() {
        loginPageTest.validateAndEnterEmail(emailId,password);
    }

    @Test(priority = 5)
    public void scn1CreateAcc() {
        createAccPageTest.validateCreateNewAcc(title, fname, lname, password,
                days_dob, months_dob, years_dob, fnameAdd, lnameAdd, company,
                addLine1, addLine2, city, state, postal,
                country, addInfo, homePhone, mobPhone, addAlias);
    }

    @Test(priority = 6)
    public void scn1ValidateNewAcc() {
        myAccountPage.validateAccPage();
    }

    @Test(priority = 7)
    public void scn2AccSignout(){
        myAccountPage.signOut();
    }
    @Test(priority = 8)
    public void scn2ValidateLoginPage(){
        loginPageTest.validateLoginPage();
    }
    @Test(priority = 9)
    public void scn2VerifyLogin(){
        loginPageTest.verifyLogin();
    }
    @Test(priority = 10)
    public void scn2ValidateAcc(){
        myAccountPage.validateAccPage();
    }
    @Test(priority = 11)
    public void scn3ClickOnWomen(){
        myAccountPage.clickOnWomen();
    }
    @Test(priority = 12)
    public void scn3AddItem(){
        womenSectionPageTest.addAnItem();
    }
    @Test(priority = 13)
    public void scn3CartPage(){
        myCartPageTest.validateCartPage();
    }
    @Test(priority = 14)
    public void scn3AddQty(){
        myCartPageTest.addQuantity();
    }
    @Test(priority = 15)
    public void scn3ValidateQty(){
        myCartPageTest.validateQty();
    }
    @Test(priority = 16)
    public void scn4CheckOut(){
        myCartPageTest.checkoutOrder();
    }
    @Test(priority = 17)
    public void scn4AddDetails(){
        myCartPageTest.addressDetails();
    }
    @Test(priority = 18)
    public void scn4ShipDetails(){
        myCartPageTest.shipDetails();
    }
    @Test(priority = 19)
    public void scn4PaymentOption(){
        myCartPageTest.paymentOption();
    }
    @Test(priority = 20)
    public void scn4PayConfirm(){
        myCartPageTest.payConfirm();
    }
    @Test(priority = 21)
    public void scn4OrderConfirm(){
        myCartPageTest.orderConfirm();
    }
    @Test(priority = 22)
    public void scn5ValidateAcc(){
        myAccountPage.validateAccPage();
    }
    @Test(priority = 23)
    public void scn5OrderHistory(){
        myAccountPage.orderHistory();
    }
    @Test(priority = 24)
    public void scn5VerifyAmt(){
        myAccountPage.verifyAmt();
    }

    @AfterSuite
    public void TearDown(){
        driver.quit();
    }
}