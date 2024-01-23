package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddRiskPage;
import pages.CloneRiskPage;

public class CloneRiskStep {
    AddRiskPage addRiskPage = new AddRiskPage(PlaywrightDriverFactory.getPage());
    CloneRiskPage cloneRiskPage = new CloneRiskPage(PlaywrightDriverFactory.getPage());


@Then("User click on clone button")
public void user_click_on_the_Clone_risk_button() {
   cloneRiskPage.clickOnCloneRiskBtn();
}
@When("User input Clone Risk Title {string}")
public void user_input_clone_risk_title(String Title) {
    addRiskPage.clickOnaddRiskTitle(Title);
}
@When("User select Clone Risk Project {string}")
public void user_select_clone_risk_project(String Project) {
    addRiskPage.clickOnaddRiskProject(Project);
}
@When("User select Clone Risk Owner {string}")
public void user_select_clone_risk_owner(String Owner) {
    addRiskPage.clickOnaddRiskOwner(Owner);
}
@When("User select Clone Risk the Status value {string}")
public void user_select_clone_risk_the_status_value(String Status) {
   addRiskPage.clickOnaddRiskStatus(Status);
}
@When("User select Clone Risk Date identified with {int} days")
public void user_select_clone_risk_date_identified_with_days(Integer int1) {
   addRiskPage.selectaddRiskDateIdentified(int1);
}
@When("User select Clone Risk Impact Date with {int} days")
public void user_select_clone_risk_impact_date_with_days(Integer int1) {
    addRiskPage.selectaddRiskImpactDate(int1);
}
@When("User select Clone Risk the PublishTo value {string}")
public void user_select_clone_risk_the_publish_to_value(String publishTo) {
    addRiskPage.clickOnaddRiskPublishTo(publishTo);
}
@When("User select Clone Risk likelihood {string}")
public void user_select_clone_risk_likelihood(String like) {
    addRiskPage.clickOnaddRiskLikelihood(like);
}
@When("User select Clone Risk Impact {string}")
public void user_select_clone_risk_impact(String impact) {
   addRiskPage.clickOnaddRiskImpact(impact);
}
@When("User input Clone Risk Description {string}")
public void user_input_clone_risk_description(String desp) {
    addRiskPage.clickOnaddRiskDescriptionNotePad(desp);
}
@When("User click on Clone Risk Solution")
public void user_click_on_clone_risk_solution() {
    addRiskPage.clickOnaddRiskContingency();
}
@When("User input Clone Risk Solution {string}")
public void user_input_clone_risk_solution(String cont) {
   addRiskPage.clickOnaddRiskContingencyNotePad(cont);
}
@When("User click on Clone Risk Mitigation Plan items")
public void user_click_on_clone_risk_mitigation_plan_items() {
   addRiskPage.clickOnaddRiskMitigationPlanItemTab();
}
@When("User click on Clone Risk Notes")
public void user_click_on_clone_risk_notes() {
   addRiskPage.clickOnaddRiskNotesTab();
}
@When("User click on Clone Risk Add Note")
public void user_click_on_clone_risk_add_note() {
   addRiskPage.clickOnaddRiskaddNotes();
}
@When("User input Clone Risk add Note Title {string}")
public void user_input_clone_risk_add_note_title(String Title) {
  addRiskPage.clickOnaddRiskTitle(Title);
}
@When("User input Clone Risk add Note Detail {string}")
public void user_input_clone_risk_add_note_detail(String detail) {
   addRiskPage.clickOnaddRiskaddNotesDetailsNotePad(detail);
}
@When("User click on Clone Risk add Note Add button")
public void user_click_on_clone_risk_add_note_add_button() {
   addRiskPage.clickOnaddIRiskAddNoteAddBtn();
}
@When("User click on Clone Risk Attachements")
public void user_click_on_clone_risk_attachements() {
   addRiskPage.clickOnaddRiskAttachements();
}
@When("User click on Clone Risk add Documents")
public void user_click_on_clone_risk_add_documents() {
    addRiskPage.clickOnaddRiskAttachementsAddDocuments();
}
@When("User upload on Clone Risk add Documents File")
public void user_upload_on_clone_risk_add_documents_file() {
  addRiskPage.clickOnaddRiskAttachementsAddDocumentsFileUpload();
}
@When("User input Clone Risk add Documents Description {string}")
public void user_input_clonerisk_add_documents_description(String desp) {
    addRiskPage.clickOnaddRiskAttachementsAddDocumentsDescription(desp);
}
@When("User input Clone Risk add Documents save button")
public void user_input_clone_risk_add_documents_save_button() {
   addRiskPage.clickOnaddIRiskAddNoteAddBtn();
}
}
