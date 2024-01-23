package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditIssuePage;
import pages.EditRiskPage;

public class EditRiskStep {
    EditRiskPage editRisk = new EditRiskPage(PlaywrightDriverFactory.getPage());
    EditIssuePage editissue = new EditIssuePage(PlaywrightDriverFactory.getPage());

     @When("User click on the Edit Risk button")
    public void user_click_on_the_edit_risk_button() {
       editRisk.clickOnclickOnEditRiskBtn();
    }

    @And("User inputs Edit issue Title {string}")
    public void userInputEditIssueTitle(String title) {
        editissue.clickOnEditTitle(title);
    }

    @And("User select Edit Risk Date identified {int} days")
    public void userSelectsEditRiskDateIdentifiedDays(int days) {
        editRisk.selecteditRiskDateIdentified(days);
    }

    @And("User input Edit Risk PublishTo {string}")
    public void userInputEditRiskPublishTo(String publishTo) {
        editRisk.clickeditRiskPublishTo(publishTo);
    }

    @And("User click on Contingency Edit Risk")
    public void userClicksOnContingencyEditRisk() {
        editissue.clickOnContingency();
    }

    @And("User input Contingency Edit Risk {string}")
    public void userInputContingencyEditRisk(String contingency) {
        editissue.addonContingency(contingency);
    }

    @And("User click on Apply Contingency Edit Risk")
    public void userClicksOnApplyContingencyEditRisk() {
       editRisk.clickOneditRiskContingencyApplyButton();
    }

    @And("User select Edit Risk Likelihood {string}")
    public void userSelectsEditRiskLikelihood(String likelihood) {
        editRisk.editRiskLikeHood(likelihood);
    }

    @And("User select Edit Risk Impact {string}")
    public void userSelectsEditRiskImpact(String impact) {
        editRisk.editRiskImpact(impact);
    }

    @And("User input Edit Risk Impact date {int} days")
    public void userInputEditRiskImpactDateDays(int days) {
        editRisk.selecteditRiskImpactDate(days);
    }

    @And("User input Edit Risk Status {string}")
    public void userInputEditRiskStatus(String status) {
        editissue.selectStatusEditIssue(status);
    }

    @And("User click on Edit Risk Details")
    public void userClicksOnEditRiskDetails() {
        editissue.clickOnDetails();
        
    }

    @And("User input Edit Risk Details {string}")
    public void userInputEditRiskDetails(String details) {
       editissue.addonDetails(details);
    }

    @And("User click on Apply Details edit Risk")
    public void userClicksOnApplyDetailsEditRisk() {
       editRisk.clickOneditRiskDetailApplyButton();
    }

    @Then("User Successfully saved the Edit Risk")
    public void userSuccessfullySavesEditRisk() {
        editRisk.clickOneditRiskSaveBtn();
    }

    @When("User need to Cancel the Edit Risk")
    public void userClicksOnCancelEditRisk() {
        editRisk.clickOneditRiskCloseBtn();
    }

    @Then("User Successfully Canceled the Edit Risk")
    public void userSuccessfullyCancelsEditRisk() {
        System.out.println("successfully canceled the Risk");
    }
}
