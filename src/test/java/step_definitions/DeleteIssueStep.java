package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeleteIssuePage;

public class DeleteIssueStep {
    DeleteIssuePage deleteIssue = new DeleteIssuePage(PlaywrightDriverFactory.getPage());

    
    @And("User click on the ellipsis button")
    public void userClickOnEllipsisButton() {
        deleteIssue.clickOnEllipsisButton();
    }
    
    @When("User click on the delete button")
    public void userclickOnDeleteIssueButton() {
        deleteIssue.clickOnDeleteIssueButton();
    }
  
    @And("User need to confirm to delete issue")
    public void userdeleteConfirmationOK() {
    	deleteIssue.deleteConfirmationOK();
    }

    @And("User need to Cancel the delete issue")
    public void userdeleteConfirmationCancel() {
    	deleteIssue.deleteConfirmationCancel();
    }

    @And("User need to click on X Mark on Delete issue")
    public void userdeleteConfirmationXMark() {
    	deleteIssue.deleteConfirmationXMark();
    }
    
    @Then("User Successfully deleted the issue")
    public void userSuccessfullyDeletedIssue() {
    	System.out.println("The test succeeded!");
    }

    @Then("User Successfully Canceled the issue")
    public void userSuccessfullyCancelledDeletedIssue() {
    	System.out.println("The test succeeded!");
    }
    
}
