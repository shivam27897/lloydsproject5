package com.lloyds.pages;

import com.lloyds.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup

    @FindBy(xpath = "//button[@id='accept']")
    WebElement acceptCookies;
    @FindBy(xpath = "/html/body/div[1]/div/div[1]/div/div/div/div/div/div/div[2]/div/div/span/p[1]/a")
    WebElement logonBanking;
    @FindBy(id = "frmLogin:strCustomerLogin_userID")
    WebElement useridField;
    @FindBy(id = "frmLogin:strCustomerLogin_pwd")
    WebElement passwordField;
    @FindBy(id = "frmLogin:btnLogin1")
    WebElement continueButton;
    @FindBy(xpath = "//div[@class='panel']/h1")
    WebElement error1;
    @FindBy(xpath = "//div[@class='formSubmitError']")
    WebElement error2;
    @FindBy(xpath = "//span[@class='error']")
    WebElement error3;
    public void clickOnAccept() {
        clickOnElement(acceptCookies);
    }
    public void clickOnLogon(){
        clickOnElement(logonBanking);
    }
    public String verifyerror1(){
        return getTextFromElement(error1);
    }
    public String verifyerror2(){
        return getTextFromElement(error2);
    }
    public String verifyerror3(){
        return getTextFromElement(error3);
    }
    public void enterUserId(String id){
        sendTextToElement(useridField,id);
    }
    public void enterPassword(String pass){
        sendTextToElement(passwordField,pass);
    }
    public void clickOnContinue(){
        clickOnElement(continueButton);
    }

}
