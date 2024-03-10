package StepDefinitions;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class LoginPageStepDefinitons {
    WebDriver driver= DriverFactory.getDriver();
    LoginPage loginPage=new LoginPage(driver);

    @Given("User at home page")
    public void userAtHomePage() {
        loginPage.userAtHomePage();
    }

    @When("Click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("Check {string} message about username")
    public void checkMessageAboutUsername(String username) {
        loginPage.checkMessage(username);
    }

    @When("Write {string} for username field")
    public void writeForUsernameField(String username) {
        loginPage.writeUsername(username);
    }

    @Then("Check {string} message about password")
    public void checkMessageAboutPassword(String password) {
        loginPage.checkMessage(password);
    }

    @When("Write {string} for password field")
    public void writeForPasswordField(String password) {
        loginPage.writePassword(password);
    }

    @When("Write correct {string} for username field")
    public void writeCorrectForUsernameField(String acceptedUsername) {
        loginPage.writeAcceptedUsername(acceptedUsername);
    }

    @When("Write false {string} for password field")
    public void writeFalseForPasswordField(String rejectedPassword) {
        loginPage.writeRejectedPassword(rejectedPassword);
    }

    @Then("Check {string} message about correct username and false password")
    public void checkMessageAboutCorrectUsernameAndFalsePassword(String errormessage) {
        loginPage.checkMessage(errormessage);
    }
    @When("Write false {string} for username field")
    public void writeFalseForUsernameField(String rejectedUsername) {
        loginPage.writeRejectedUsername(rejectedUsername);
    }

    @When("Write correct {string} for password field")
    public void writeCorrectForPasswordField(String acceptedPassword) {
        loginPage.writeAcceptedPassword(acceptedPassword);
    }

    @Then("Check the url to understand success login")
    public void checkTheUrlToUnderstandSuccessLogin() {
        loginPage.checkUrlToSuccessLogin();
    }
}
