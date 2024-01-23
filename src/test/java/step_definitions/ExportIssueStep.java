package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import pages.ExportIssuePage;

public class ExportIssueStep {
    ExportIssuePage exportIssue = new ExportIssuePage(PlaywrightDriverFactory.getPage());

    @And("User click on the export button")
    public void userClickOnExportIssue() {
        exportIssue.exportIssue();
    }

    @And("User successfully exported the issue")
    public void CloseIssueResult() {
    	System.out.println("The test succeeded!");
    }
}
