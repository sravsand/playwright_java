package step_definitions;

import factory.PlaywrightDriverFactory;
import org.testng.Assert;
import pages.AddWorkFlowPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

import java.util.List;

public class AddWorkFlowStep {

    AddWorkFlowPage addWorkFlowPage = new AddWorkFlowPage(PlaywrightDriverFactory.getPage());

    @When("User navigate to the workflow type page")
    public void userNavigateToTheDefaultTypePage() throws InterruptedException {
        addWorkFlowPage.navigateToDefaultTypePage();
    }

    @And("Verify header text of the workflow page")
    public void verifyHeaderTextOfTheDefaultTypePage() {
        String headerText = addWorkFlowPage.getHeaderTextOfWorkFlowPage();
        Assert.assertEquals(headerText, "Workflows",
                "Validation Failed: Actual header text does not match with the expected header text");
    }

    @When("User select all type and add the work flow")
    public void userSelectAllTypeAndAddTheWorkFlow() throws InterruptedException {
        List<String> workFlowList = addWorkFlowPage.getWorkFLowList();
        for (String typeText : workFlowList) {
            typeText =typeText.trim();
            String workFlowName, description;
            workFlowName = typeText + " " + System.nanoTime();
            description = typeText + " Description: " + System.nanoTime();
            addWorkFlowPage.addWorkFlow(typeText, workFlowName, description);
            List<String> createdWorkFLowName = addWorkFlowPage.getCreatedWorkFlowName();
            List<String> createdWorkFlowDescription = addWorkFlowPage.getCreatedWorkFlowDescription();
            Assert.assertTrue(createdWorkFLowName.toString().trim().contains(workFlowName));
            Assert.assertTrue(createdWorkFlowDescription.toString().trim().contains(description));
        }
    }
}
