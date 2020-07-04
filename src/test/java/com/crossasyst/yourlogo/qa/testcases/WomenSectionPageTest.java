package com.crossasyst.yourlogo.qa.testcases;

import com.crossasyst.yourlogo.qa.base.TestBase;

import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.womenSection;
import static com.crossasyst.yourlogo.qa.testcases.HomePageTest.myCartPage;

public class WomenSectionPageTest extends TestBase{

    WomenSectionPageTest() {
        super();
    }

    public void addAnItem(){
        myCartPage = womenSection.addToCart();
    }


}
