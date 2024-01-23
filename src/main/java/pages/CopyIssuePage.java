package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CopyIssuePage {
    private final Locator copyIssueButton;
    private final Locator copyIssueSourceProject;
    private final Locator copyIssueDestinationProject;
    private final Locator copyIssueIncludeResolutionPlanItems;
    private final Locator copyIssueSetallIssueCreatedDates;
    private final Locator copyIssueCopy;
    private final Locator copyIssueCancel;
    private final Locator copyIssueXMark;
	private Page page;

    public CopyIssuePage(Page page) {
    	this.page = page;
        this.copyIssueButton = page.locator("//*[@id=\"widgetActions\"]/div[1]/a[2]");
    	this.copyIssueSourceProject = page.locator("//*[@id=\"ctl00_phFormContent_pbxTemplateProject_pbxPick_txtValue\"]");
    	this.copyIssueDestinationProject = page.locator("//*[@id=\"ctl00_phFormContent_pbxDestinationProject_pbxPick_txtValue\"]");
    	this.copyIssueIncludeResolutionPlanItems = page.locator("//*[@id=\"ctl00_phFormContent_chkIncludeRiskActions\"]");
        this.copyIssueSetallIssueCreatedDates = page.locator("//*[@id=\"ctl00_phFormContent_dteOffsetDate_txtDate\"]");
        this.copyIssueCopy = page.locator("/html/body/div[16]/div[11]/div[1]/button[1]");
        this.copyIssueCancel = page.locator("/html/body/div[16]/div[11]/div[1]/button[2]");
        this.copyIssueXMark = page.locator("/html/body/div[16]/div[1]/button");
        
}

public void copyIssueButton() {
    copyIssueButton.click();
    page.waitForTimeout(5000);
}

public void copyIssueSourceProject(String sourcePro) {
   copyIssueSourceProject.fill(sourcePro);
}

public void copyIssueDestinationProject(String destinationPro) {
   copyIssueDestinationProject.fill(destinationPro);
}

public void copyIssueIncludeResolutionPlanItems() {
    copyIssueIncludeResolutionPlanItems.click();	
}

  public void copyIssueSetallIssueCreatedDates() {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
		copyIssueSetallIssueCreatedDates.fill(formattedDate);
	}

public void copyIssueCopy() {
    copyIssueCopy.click();	
}

public void copyIssueCancel() {
    copyIssueCancel.click();	
}

public void copyIssueXMark() {
    copyIssueXMark.click();	
}




}
