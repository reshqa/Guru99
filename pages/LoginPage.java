package com.guru99.pages;

import com.guru99.base.TestBase;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
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

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public boolean loginPageLogo(){
    return image.isDisplayed();
    }

    public String  loginwithoutUsername(String pwd){
        password.sendKeys(pwd);
        btnlogin.click();
        return driver.switchTo().alert().getText();
              }


    public void  loginwithinvalidUser(String uname,String pwd) {
        userid.sendKeys(uname);
        password.sendKeys(pwd);
        btnlogin.click();
    }

    public HomePage loginSuccessfully(String uname, String pwd){
        userid.sendKeys(uname);
        password.sendKeys(pwd);
        btnlogin.click();
       // return driver.switchTo().alert().getText();
       return new HomePage();

    }
}
