package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import pages.CloneIssuePage;

public class CloneIssueStep {
    CloneIssuePage cloneIssue = new CloneIssuePage(PlaywrightDriverFactory.getPage());

    @And("User click on the Clone button")
    public void userCloneIssue() {
        cloneIssue.CloneIssue();
    }
}
