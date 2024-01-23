package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static utilities.ConfigFileReader.getProperty;

public class LoginPage {
    private final Locator userName;
    private final Locator password;
    private final Locator loginButton;
    private final Locator error;
    private final Locator homeTitle;
    private final Page page;

    public LoginPage(Page page) {
        this.page = page;
        this.userName = page.locator("//*[@id='txtUserID']");
        this.password = page.locator("//*[@id='txtPassword']");
        this.loginButton = page.locator("//*[@id='btnLogin']");
        this.error = page.locator("//div[contains(text(),'Invalid User ID, Password or IP Address')]");
        this.homeTitle = page.locator("//*[@id='Home']/span");
    }

    public void navigateToUrl() {
        this.page.navigate(getProperty("url"));
    }

    public boolean isLoginPageOpen() {
        return loginButton.isVisible();
    }

    public void setUserName(String user) {
        userName.fill(user);

    }

    public void setPassword(String pass) {
        password.fill(pass);
    }

    public void clickOnLogin() {
        loginButton.click();
    }

    public String getHomePageTitle() {
        return homeTitle.innerText();
    }

    public String getErrorMessage() {
        return error.innerText();
    }
}