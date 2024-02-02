package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    @CacheLookup
    @FindBy(id = "onetrust-accept-btn-handler")
    WebElement cookiesButton;

    @CacheLookup
    @FindBy(linkText = "Log In")
    WebElement loginLink;

    @CacheLookup
    @FindBy(xpath = "//p[contains(text(), 'Log In to start playing.')]")
    WebElement logInToStartPlayingText;

    public void clickOnCookiesButton() {
        clickOnElement(cookiesButton);
        log.info("Clicking on accept cookies button: " + cookiesButton.toString());
    }

    public void clickOnLoginLink() {
        clickOnElement(loginLink);
        log.info("Clicking on login link : " + loginLink.toString());
    }

    public String getLogInToStartPlayingText() {
        String message = getTextFromElement(logInToStartPlayingText);
        log.info("Getting text from : " + logInToStartPlayingText.toString());
        return message;
    }
}
