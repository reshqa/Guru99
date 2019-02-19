package com.guru99.pages;

import com.guru99.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
        public HomePage(){
PageFactory.initElements(driver,this);
    }

    public String validateHomepageTitle(){

        return driver.getTitle();

    }

}
