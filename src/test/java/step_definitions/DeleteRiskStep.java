package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.When;
import pages.DeleteRiskPage;

public class DeleteRiskStep {
    DeleteRiskPage deleteRiskpage = new DeleteRiskPage(PlaywrightDriverFactory.getPage());

     @When("User click on the delete Risk button")
    public void userclickOnclickOnDeleteIssue() {
        deleteRiskpage.clickOnclickOnDeleteIssue();
    }
}
