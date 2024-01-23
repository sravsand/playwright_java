package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EditIssuePage;

public class EditIssueStep {
EditIssuePage editissue = new EditIssuePage(PlaywrightDriverFactory.getPage());

@When("User click on the Edit button")
public void user_click_on_the_edit_button() {
   editissue.clickOnEditIssueButton();
}
@And("User input Edit issue Titile {string}")
public void user_input_edit_issue_titile(String title) {
    editissue.clickOnEditTitle(title);
}
@And("User input Edit issue Status {string}")
public void user_input_edit_issue_status(String status) {
    editissue.selectStatusEditIssue(status);
}
@And("User input Edit issue PublishTo {string}")
public void user_input_edit_issue_publish_to(String prolevl) {
    editissue.publishToEditIssue(prolevl);
}
@And("User click on Contingency Edit issue")
public void user_click_on_contingency() {
    editissue.clickOnContingency();
}
@And("User input Contingency Edit issue {string}")
public void user_input_contingency(String contin) {
   editissue.addonContingency(contin);
}
@And("User click on Apply Contingency Edit issue")
public void user_click_on_apply_contingency() {
    editissue.clickOnContingencyApplyBuuton();
}
@And("User select Severity Edit issue {string}")
public void user_input_severity(String sevirity) {
   editissue.addSeverityEditIssue(sevirity);
}

@And("User select Expected Resolution Date Edit issue")
public void user_select_expected_resolution_date() {
    editissue.selectResolutionDateValueEditIssue();
}
    
@And("User select Resolution Progress Edit issue {string}")
public void user_select_resolution_progress(String prog) {
   editissue.addResolutionProgressEditIssue(prog);
}
@And("User click on Edit issue Details")
public void user_click_on_edit_issue_details() {
   editissue.clickOnDetails();
}
@And("User input Edit issue Details {string}")
public void user_input_edit_issue_details(String detail) {
    editissue.addonDetails(detail);
}
@And("User click on Apply Details edit issue")
public void user_click_on_apply_details_edit_issue() {
 editissue.clickOnDetailsApplyBuuton();
}

@Then("User Successfully saved the Edit issue")
public void user_successfully_saved_the_edit_issue() {
 editissue.clickOnSaveButton();  
}
@And("User need to Cancel the Edit issue")
public void user_need_to_cancel_the_edit_issue() {
    editissue.clickOnCancelEditIssue();
}

@Then("User Successfully Canceled the Edit issue")
public void user_successfully_canceled_the_edit_issue() {
   System.out.println("successfully canceled the issue");
}


}
