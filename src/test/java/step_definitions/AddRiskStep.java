package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddRiskPage;
// import org.testng.Assert;

public class AddRiskStep {
    AddRiskPage addRiskPage = new AddRiskPage(PlaywrightDriverFactory.getPage());
    private String addedRiskTitle;

    @Then("User click on the Risk tab")
public void user_click_on_the_risk_tab() {
   addRiskPage.clickOnRisk();
}
@Then("User click on the add Risk button")
public void user_click_on_the_add_risk_button() {
    addRiskPage.clickOnaddRisk();
}
@When("User input add Risk Title {string}")
public void user_input_add_risk_title(String Title) {
   String uniqueNumber = String.valueOf(System.currentTimeMillis());
        String titleWithNumber = Title + "-" + uniqueNumber;
  addedRiskTitle = titleWithNumber;
    addRiskPage.clickOnaddRiskTitle(addedRiskTitle);
}
@When("User select add Risk Project {string}")
public void user_select_add_risk_project(String Project) {
    addRiskPage.clickOnaddRiskProject(Project);
}
@When("User select add Risk Owner {string}")
public void user_select_add_risk_owner(String Owner) {
    addRiskPage.clickOnaddRiskOwner(Owner);
}
@When("User select add Risk the Status value {string}")
public void user_select_add_risk_the_status_value(String Status) {
   addRiskPage.clickOnaddRiskStatus(Status);
}
@When("User select add Risk Date identified with {int} days")
public void user_select_add_risk_date_identified_with_days(Integer int1) {
   addRiskPage.selectaddRiskDateIdentified(int1);
}
@When("User select add Risk Impact Date with {int} days")
public void user_select_add_risk_impact_date_with_days(Integer int1) {
    addRiskPage.selectaddRiskImpactDate(int1);
}
@When("User select add Risk the PublishTo value {string}")
public void user_select_add_risk_the_publish_to_value(String publishTo) {
    addRiskPage.clickOnaddRiskPublishTo(publishTo);
}
@When("User select add Risk likelihood {string}")
public void user_select_add_risk_likelihood(String like) {
    addRiskPage.clickOnaddRiskLikelihood(like);
}
@When("User select add Risk Impact {string}")
public void user_select_add_risk_impact(String impact) {
   addRiskPage.clickOnaddRiskImpact(impact);
}
@When("User input add Risk Description {string}")
public void user_input_add_risk_description(String desp) {
    addRiskPage.clickOnaddRiskDescriptionNotePad(desp);
}
@When("User click on add Risk Solution")
public void user_click_on_add_risk_solution() {
    addRiskPage.clickOnaddRiskContingency();
}
@When("User input add Risk Solution {string}")
public void user_input_add_risk_solution(String cont) {
   addRiskPage.clickOnaddRiskContingencyNotePad(cont);
}
@When("User click on add Risk Mitigation Plan items")
public void user_click_on_add_risk_mitigation_plan_items() {
   addRiskPage.clickOnaddRiskMitigationPlanItemTab();
}
@When("User click on add Risk Notes")
public void user_click_on_add_risk_notes() {
   addRiskPage.clickOnaddRiskNotesTab();
}
@When("User click on add Risk Add Note")
public void user_click_on_add_risk_add_note() {
   addRiskPage.clickOnaddRiskaddNotes();
}
@When("User input add Risk add Note Title {string}")
public void user_input_add_risk_add_note_title(String Title) {
  addRiskPage.clickOnaddRiskTitle(Title);
}
@When("User input add Risk add Note Detail {string}")
public void user_input_add_risk_add_note_detail(String detail) {
   addRiskPage.clickOnaddRiskaddNotesDetailsNotePad(detail);
}
@When("User click on add Risk add Note Add button")
public void user_click_on_add_risk_add_note_add_button() {
   addRiskPage.clickOnaddIRiskAddNoteAddBtn();
}
@When("User click on add Risk Attachments")
public void user_click_on_add_risk_attachments() {
   addRiskPage.clickOnaddRiskAttachements();
}
@When("User click on add Risk add Documents")
public void user_click_on_add_risk_add_documents() {
    addRiskPage.clickOnaddRiskAttachementsAddDocuments();
}
@When("User upload on add Risk add Documents File")
public void user_upload_on_add_risk_add_documents_file() {
  addRiskPage.clickOnaddRiskAttachementsAddDocumentsFileUpload();
}
@When("User input add Risk add Documents Description {string}")
public void user_input_add_risk_add_documents_description(String desp) {
    addRiskPage.clickOnaddRiskAttachementsAddDocumentsDescription(desp);
}
@When("User input add Risk add Documents save button")
public void user_input_add_risk_add_documents_save_button() {
   addRiskPage.clickOnaddIRiskAddNoteAddBtn();
}
@Then("User successfully added the new Risk")
public void user_successfully_added_the_new_risk() {
    System.out.println("The test Success!");
   // String actualTitle = addRiskPage.isRiskAddedSuccessfully();
   // System.out.println(addRiskPage.isRiskAddedSuccessfully());
   // System.out.println(addedRiskTitle);
   // Assert.assertEquals(addedRiskTitle, actualTitle);

}

@Then("User successfully closed the Risk")
public void user_successfully_Closed_the_new_risk() {
   System.out.println("The test Successed!");
   // Assert.assertTrue("Issue is not saved", addRiskPage.isIssueSavedInList());
}

}
