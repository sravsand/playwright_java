package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static utilities.ConfigFileReader.getProperty;

public class ProjectsPage {
    private final Locator homeTitle;
    private final Locator projectsMenu;
    private final Page page;

    public ProjectsPage(Page page) {
        this.page = page;
        this.homeTitle = page.locator("//*[@id='Home']/span");
        this.projectsMenu = page.locator("//i[@class='menu-icon fa fa-briefcase']");
    }

    public void navigateToUrl() {
        this.page.navigate(getProperty("url"));
    }
  
    public void clickOnProjectsMenu() {
    	projectsMenu.click();
    }

    public String getHomePageTitle() {
        return homeTitle.innerText();
    }
}