package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.DefaultTypePage;
import io.cucumber.java.en.And;
import java.util.List;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class DefaultType {

    DefaultTypePage defaultTypePage = new DefaultTypePage(PlaywrightDriverFactory.getPage());
    LoginPage loginPage = new LoginPage(PlaywrightDriverFactory.getPage());

    @When("User navigate to the default type page")
    public void userNavigateToTheDefaultTypePage() throws InterruptedException {
        defaultTypePage.navigateToDefaultTypePage();
    }

    @And("verify header text of the default type page")
    public void verifyHeaderTextOfTheDefaultTypePage() {
        String headerText = defaultTypePage.getHeaderTextOfPage();
        Assert.assertEquals(headerText, "Default Types",
                "Validation Failed: Actual header text does not match with the expected header text");
    }

    @When("User select all dropdown option and verify the add button visibility")
    public void userSelectAllDropDownOptionAndVerifyTheAddButtonVisibility() throws Exception {
        Thread.sleep(10000);
        defaultTypePage.verifyOption();
    }

    @When("User click on the setting")
    public void userClickOnSettingButton() throws InterruptedException {
        loginPage.clickOnSettingButton();
    }

    @Then("User should see the Configuration page")
    public void userShouldSeeTheConfigurationPage() {
        String headerText = defaultTypePage.getHeaderTextOfPage();
        Assert.assertEquals(headerText, "Configuration",
                "Validation Failed: Actual header text does not match with the expected header text");
    }

    @When("User click on the Default type page")
    public void userClickOnTheDefaultTypePage() throws InterruptedException {
        loginPage.clickOnDefaultTypesOption();
        Thread.sleep(4000);
    }

    @Then("User could see the Default type page")
    public void userCouldSeeTheDefaultTypePage() {
        String headerText = defaultTypePage.getHeaderTextOfPage();
        Assert.assertEquals(headerText, "Default Types",
                "Validation Failed: Actual header text does not match with the expected header text");
    }

    @When("Add default data type details and verify default type is added")
    public void addDefaultDataTypeDetailsAndVerifyDefaultTypeIsAdded() throws InterruptedException {
        List<String> defaultTypeList = defaultTypePage.getDefaultTypeList();
        for (String defaultTypeText : defaultTypeList) {
            Thread.sleep(2000);
            defaultTypeText = defaultTypeText.trim();
            String dataTypeName = defaultTypeText + " " + System.nanoTime();
            String description = defaultTypeText + " " + System.nanoTime();
            boolean value = defaultTypePage.addDefaultTypeData(defaultTypeText, dataTypeName, description);
            if (value) {
                Thread.sleep(2000);
                Assert.assertEquals(defaultTypePage.getCreatedWorkflowName().trim(), dataTypeName,
                        "Validation Failed: Actual data type name does not match with the expected data type name");
                Assert.assertEquals(defaultTypePage.getCreatedDefaultTypeDescription().trim(), description,
                        "Validation Failed: Actual data type name does not match with the expected data type name");
            }
        }
    }
}
