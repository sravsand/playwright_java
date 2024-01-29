package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.DefaultTypePage;

public class DefaultType {

    DefaultTypePage defaultTypePage = new DefaultTypePage(PlaywrightDriverFactory.getPage());

    @When("User navigate to the default type page")
    public void userNavigateToTheDefaultTypePage() throws InterruptedException{
        defaultTypePage.navigateToDefaultTypePage();
    }

    @And("verify header text of the default type page")
    public void verifyHeaderTextOfTheDefaultTypePage() {
        String headerText = defaultTypePage.getHeaderTextOfDefaultTypePage();
        Assert.assertEquals(headerText, "Default Types",
                "Validation Failed: Actual header text does not match with the expected header text");
    }

    @When("User click on the different type of dropdown")
    public void userClickOnTheDifferentTypeOfDropdown() throws Exception {
        Thread.sleep(10000);
        defaultTypePage.verifyOption();
    }
}
