package com.lloyds.steps;

import com.lloyds.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class HomePageTest {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
        new HomePage().clickOnAccept();
    }

    @When("^I click on Logon$")
    public void iClickOnLogon() {
        new HomePage().clickOnLogon();
    }

    @And("^I enter userid \"([^\"]*)\"$")
    public void iEnterUserid(String id){
        new HomePage().enterUserId(id);
    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password) {
        new HomePage().enterPassword(password);
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new HomePage().clickOnContinue();
    }

    @Then("^I should verify error message \"([^\"]*)\"$")
    public void iShouldVerifyErrorMessage(String msg){
        switch (msg) {
            case "Sorry, we've had to log you off [Error: 1007 ID: 18.558f655f.1677363131.68c45c60]":
                String actualMessage = new HomePage().verifyerror1();
                String expectedMessage = "Sorry, we've had to log you off [Error: 1007 ID: 18.558f655f.1677363131.68c45c60]";
                Assert.assertEquals(actualMessage, expectedMessage);
                break;
            case "There is a problem with some of the information you have submitted.":
                String actualMessage2 = new HomePage().verifyerror2();
                String expectedMessage2 = "There is a problem with some of the information you have submitted.";
                Assert.assertEquals(actualMessage2, expectedMessage2);
                break;
            case "Please enter a value.":
                String actualMessage3 = new HomePage().verifyerror3();
                String expectedMessage3 = "Please enter a value.";
                Assert.assertEquals(actualMessage3, expectedMessage3);
                break;
        }
    }
}
