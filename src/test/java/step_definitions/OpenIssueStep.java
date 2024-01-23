package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import pages.OpenIssuePage;

public class OpenIssueStep {
    OpenIssuePage openIssue = new OpenIssuePage(PlaywrightDriverFactory.getPage());

    @And("User click on the Open button")
    public void userOpenIssue() {
        openIssue.OpenIssue();
    }

}
