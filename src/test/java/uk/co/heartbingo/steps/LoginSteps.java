package uk.co.heartbingo.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import uk.co.heartbingo.pages.LoginPage;

public class LoginSteps {
    @When("User clicks on Accept All Cookies")
    public void userClicksOnAcceptAllCookies() {
        new LoginPage().clickOnCookiesButton();
    }

    @And("User clicks on login link")
    public void userClicksOnLoginLink() {
        new LoginPage().clickOnLoginLink();
    }

    @Then("User should navigate to login page successfully")
    public void userShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Log In to start playing.";
        String actualMessage = new LoginPage().getLogInToStartPlayingText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }
}
