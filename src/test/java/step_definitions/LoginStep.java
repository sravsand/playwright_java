package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;


public class LoginStep {
    LoginPage loginPage = new LoginPage(PlaywrightDriverFactory.getPage());

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        loginPage.navigateToUrl();
        Assert.assertTrue(loginPage.isLoginPageOpen(), "User is not in login page");
    }

    @When("User input username {string}")
    public void userInputUsername(String username) {
        loginPage.setUserName(username);
    }

    @And("User input password {string}")
    public void userInputPassword(String password) {
        loginPage.setPassword(password);

    }

    @And("User click on the login button")
    public void userClickOnTheLoginButton() {
        loginPage.clickOnLogin();

    }

    @Then("User successfully logged in")
    public void userSuccessfullyLoggedIn() {
        Assert.assertEquals(loginPage.getHomePageTitle(), "Home", "Home page does not open");
    }

    @And("User should see the home page")
    public void userShouldSeeTheInventoryPage() {
        Assert.assertEquals(loginPage.getHomePageTitle(), "Home", "Home page does not open");
    }

    @Then("User should be on the log in page")
    public void user_should_be_on_the_log_in_page() {
        Assert.assertEquals(PlaywrightDriverFactory.page.url(), "https://kipstaging.keyedinuat.com/Workflows/Web/Dashboard/Index/MVC-MYWORK-HOME");
    }

    @Then("User should see an error message {string}")
    public void user_should_see_an_error_message(String string) {
        Assert.assertEquals(loginPage.getErrorMessage(), string, "Error message is not matched");
    }
}