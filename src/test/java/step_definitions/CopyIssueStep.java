package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CopyIssuePage;

public class CopyIssueStep {
    CopyIssuePage copyIssue = new CopyIssuePage(PlaywrightDriverFactory.getPage());

    @When("User click on the copy issues button")
public void user_click_on_the_copy_issues_button() {
   copyIssue.copyIssueButton() ;
}
@When("User input source Project copy issue {string}")
public void user_input_source_project_copy_issue(String sourceProject) {
    copyIssue.copyIssueSourceProject(sourceProject) ;
}
@When("User input destination Project copy issue {string}")
public void user_input_destination_project_copy_issue(String destinationProject) {
   copyIssue.copyIssueDestinationProject(destinationProject) ;
}
@When("User click Include Resolution Plan Items")
public void user_click_include_resolution_plan_items() {
    copyIssue.copyIssueIncludeResolutionPlanItems() ;
}
@When("User select Set all Issue Created Dates")
public void user_select_set_all_issue_created_dates() {
    copyIssue.copyIssueSetallIssueCreatedDates() ;
}
@Then("User click of copy issue button")
public void user_click_of_copy_issue_button() {
    copyIssue.copyIssueCopy() ;
}
@Then("User successfully copied the issue")
public void user_successfully_copied_the_issue() {
    System.out.println("Successfully copied the issue");
}


@Then("User not able to copy the issue")
public void user_not_able_to_copy_the_issue() {
    System.out.println("User should not be able to copy the issue");
}

@Then("User click on Cancel issue button")
public void user_click_on_cancel_issue_button() {
    copyIssue.copyIssueCancel() ;
}
@Then("User successfully cancelled the copy issue")
public void user_successfully_cancelled_the_copy_issue() {
    System.out.println("successfully cancelled the issue");
}
@Then("User click on X Mark Cancel issue button")
public void user_click_on_x_mark_cancel_issue_button() {
    copyIssue.copyIssueXMark() ;
}
    
}
