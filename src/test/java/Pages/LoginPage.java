package Pages;

import Utils.DriverFactory;
import Utils.ElementHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.Properties;

public class LoginPage {
    WebDriver driver;
    ElementHelper elementHelper;
    WebDriverWait wait;

    By loginButton=By.id("login-button");

    By errorMessage=By.cssSelector("h3[data-test='error']");

    By userName=By.id("user-name");

    By password=By.id("password");

    public LoginPage(WebDriver driver) {
        this.driver=driver;
        this.wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        this.elementHelper=new ElementHelper(driver);
    }

    public void userAtHomePage() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void checkMessage(String username) {
        elementHelper.checkVisible(errorMessage);
    }

    public void writeUsername(String username) {
        driver.findElement(userName).click();
        elementHelper.sendKey(userName,"sdadasda");
    }

    public void writePassword(String message) {
        driver.findElement(password).click();
        elementHelper.sendKey(password,"rtrtpvtr");
    }

    public void writeAcceptedUsername(String acceptedUsername) {
        driver.findElement(userName).click();
        elementHelper.sendKey(userName,"standard_user");
    }

    public void writeRejectedPassword(String rejectedPassword) {
        driver.findElement(password).click();
        elementHelper.sendKey(password,"123456789");
    }

    public void writeRejectedUsername(String rejectedUsername) {
        driver.findElement(userName).click();
        elementHelper.sendKey(userName,"standard_user55");
    }
    public void writeAcceptedPassword(String acceptedPassword) {
        driver.findElement(password).click();
        elementHelper.sendKey(password,"secret_sauce");
    }

    public void checkUrlToSuccessLogin() {
        String expectedUrl="https://www.saucedemo.com/v1/inventory.html";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
    }
}
