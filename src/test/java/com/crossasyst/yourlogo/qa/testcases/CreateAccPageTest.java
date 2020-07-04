package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;


import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.createAccPage;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.myAccountPage;

public class CreateAccPageTest extends TestBase {

    CreateAccPageTest(){
        super();
    }


    public void validateCreateNewAcc(String title,String fname,String lname,String password,
                                     String days_dob, String months_dob,String years_dob, String fnameAdd,String lnameAdd,String company,
                                     String addLine1,String addLine2,String city,String state,String postal,
                                     String country,String addInfo,String homePhone,String mobPhone,String addAlias) {
        createAccPage.inputDetails(title,fname,lname,password,days_dob,months_dob,years_dob,fnameAdd,lnameAdd,company,addLine1,addLine2,city,state,postal,country,addInfo,homePhone,mobPhone,addAlias);
        myAccountPage = createAccPage.createAccount();
    }
}
