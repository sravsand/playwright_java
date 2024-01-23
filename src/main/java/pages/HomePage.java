package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;


public class HomePage {
    private final Locator homeTitle;
    private final Locator projectsMenu;
    private final Page page;

    public HomePage(Page pages) {
        this.page = pages;
        this.homeTitle = page.locator("//*[@id='Home']/span");
        this.projectsMenu = page.locator("//i[@class='menu-icon fa fa-briefcase']");
    }

    public void clickOnProjectsMenu() {
    	projectsMenu.click();
    }

    public String getHomePageTitle() {
        return homeTitle.innerText();
    }

}