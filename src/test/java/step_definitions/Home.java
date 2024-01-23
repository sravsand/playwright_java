package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;

import pages.HomePage;



public class Home {
    HomePage homePage = new HomePage(PlaywrightDriverFactory.getPage());

    @And("User click on the projects menu")
    public void userClickOnTheProjectsMenu() {
        homePage.clickOnProjectsMenu();

    }
}