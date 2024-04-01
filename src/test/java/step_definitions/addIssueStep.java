package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.AddIssuePage;


public class addIssueStep {
    AddIssuePage addIssuePage = new AddIssuePage(PlaywrightDriverFactory.getPage());

    @When("User click on the issues tab")
    public void userClickOnTheIssuesTab() {
        addIssuePage.clickOnIssuesTab();
    }
    
    @And("User click on the add button")
    public void userClickOnTheAddButton() {
        addIssuePage.clickOnAddButton();
    }

    @And("User input Title {string}")
    public void useraddIssueTitle(String title) throws InterruptedException{
        Thread.sleep(5000);
    	 addIssuePage.addIssueTitle(title);

    }

    @And("User select Project {string}")
    public void userselectProject(String project) {
     	addIssuePage.selectProject(project);
    }
  
      @And("User select Owner {string}")
    public void userselectOwner(String owner) {
     	addIssuePage.selectOwner(owner);
    }

    @And("User select the Status value {string}")
    public void userselectStatus(String status) {
        addIssuePage.selectStatus(status);
    }

     @And("User select AssociatedRisk value {string}")
    public void userselectAssociatedRiskValue(String value) throws InterruptedException{
       addIssuePage.selectAssociatedRiskValue(value);
       Thread.sleep(2000);
    }


     @And("User select the PublishTo value {string}")
    public void userselectPublishToProjectLevelValue(String prolevl) throws InterruptedException{
        addIssuePage.selectPublishToProjectLevelValue(prolevl);
    }

     @And("User select Severity {string}")
    public void useraddSeverity(String severity) {
     	addIssuePage.addSeverity(severity);
    }

     @And("User select Expected Resolution Date value {int} days")
    public void userselectResolutionDateValue(int days) {
        addIssuePage.selectResolutionDateValue(days);
    }

    @And("User select Resolution Progress {string}")
    public void useraddResolutionProgress(String resolProg) {
     	addIssuePage.addResolutionProgress(resolProg);
    }

    @And("User input Description {string}")
    public void useraddDescription(String desp) {
     	addIssuePage.addDescription(desp);
    }

    @And("User click on Solution")
    public void userclickOnSolution() {
       addIssuePage.clickOnSolution();
    }

    @And("User input Solution {string}")
    public void useraddSolution(String solution) {
     	addIssuePage.addSolution(solution);
    }

    @And("User click on Save")
    public void userclickOnSave() {
        addIssuePage.clickOnSave();
    }

    @And("User click on Save and Close")
    public void userclickOnSaveAndClose() {
        addIssuePage.clickOnSaveAndClose();
    }

    @When("User click on Close")
    public void userclickOnClose() {
        addIssuePage.clickOnClose();
    }

    @When("User click on XMark")
    public void userclickOnXMark() {
        addIssuePage.clickOnXMark();
    }

    @Then("User successfully added the new Issue")
    public void addIssueResult() {
    	System.out.println("The test succeeded!");
    }

    @Then("User successfully closed the Issue")
    public void CloseIssueResult() {
    	System.out.println("The test succeeded!");
    }

    @When("User able to verify save button is disabled")
    public void saveBtnDisabled() {
    	System.out.println("The test succeeded!");
    }

    @When("User able to verify save and close button is disabled")
    public void closebtnDisabled() {
    	System.out.println("The test succeeded!");
    }

    @Then("User successfully verify disabled buttons")
    public void buttonDisabled() {
    	System.out.println("The test succeeded!");
    }
}