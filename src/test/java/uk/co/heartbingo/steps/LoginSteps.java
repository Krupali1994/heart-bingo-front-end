package uk.co.heartbingo.steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static uk.co.heartbingo.browserfactory.ManageBrowser.driver;

public class LoginSteps {
    @When("User clicks on Accept All Cookies")
    public void userClicksOnAcceptAllCookies() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElement(By.id("onetrust-accept-btn-handler")));
    }

    @Then("User clicks on login link")
    public void userClicksOnLoginLink() {
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();",driver.findElement(By.linkText("Log In")));

    }


}
