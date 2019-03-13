package com.guru99.pages;

import com.guru99.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestPages extends TestBase {
    @FindBy(name = "uid")
    WebElement userid;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(name = "btnLogin")
    WebElement btnlogin;

    @FindBy(name = "btnReset")
    WebElement btnreset;

    @FindBy(xpath="/html/body/div[1]/div[1]/div[1]/div[1]/a/img")
    WebElement image;

    public TestPages(){
        PageFactory.initElements(driver,this);
    }

    public boolean loginPageLogo(){
        return image.isDisplayed();
    }
}
