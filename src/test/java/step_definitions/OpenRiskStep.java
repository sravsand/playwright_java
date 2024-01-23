package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import pages.AddRiskPage;
import pages.OpenRiskPage;

public class OpenRiskStep {
    OpenRiskPage openRisk = new OpenRiskPage(PlaywrightDriverFactory.getPage());
    AddRiskPage addRiskPage = new AddRiskPage(PlaywrightDriverFactory.getPage());



    @And("User click on the Open Risk button")
    public void userOpenRisk() {
        openRisk.OpenRisk();
    }

     @And("User select add Risk Open the PublishTo value {string}")
    public void userclickOnaddRiskOpenPublishTo(String title) {
    	 openRisk.clickOnaddRiskOpenPublishTo(title);

    }

    @And("User click on add Risk add Mitigation Plan items")
    public void useraddMitigationAddBtn() {
        openRisk.addMitigationAddBtn();
    }

    @And("User select add Mitigation Type {string}")
    public void useraddMitigationType(String title) {
    	 openRisk.addMitigationType(title);

    }

    @And("User input add Mitigation Owner {string}")
    public void useraddMitigationOwner(String project) {
     	openRisk.addMitigationOwner(project);
    }
  
      @And("User select add Mitigation Status {string}")
    public void useraddMitigationStatus(String owner) {
     	openRisk.addMitigationStatus(owner);
    }

    @And("User select add Mitigation Due Date {int} days")
    public void useraddMitigationDueDate(int days) {
       openRisk.addMitigationDueDate(days);
    }

     @And("User input add Mitigation Step {string}")
    public void useraddMitigationStep(String title) {
    	 openRisk.addMitigationStep(title);

    }

    @And("User input add Mitigation Description {string}")
    public void useraddMitigationDescription(String project) {
     	openRisk.addMitigationDescription(project);
    }
  
      @And("User input add Mitigation On Time {string}")
    public void useraddMitigationOnTime(String owner) {
     	openRisk.addMitigationOnTime(owner);
    }

     @And("User select add Mitigation Priority {string}")
    public void addMitigationPriority(String owner) {
     	openRisk.addMitigationPriority(owner);
    }

    @And("User click add Mitigation add Button")
    public void userClickOnTheAddButton() {
        addRiskPage.clickOnaddIRiskAddNoteAddBtn();
    }
}
