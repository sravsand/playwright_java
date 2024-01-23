package pages;

// import com.microsoft.playwright.ElementHandle;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import static utilities.ConfigFileReader.getProperty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AddIssuePage {
    private final Locator issuesTab;
    private final Locator addButton;
    private final Locator addIssueTitle;
    private final Locator selectProject;
    private final Locator selectOwner;
    private final Locator selectStatus;
    private final Locator selectAssociatedRiskValue;
    private final Locator selectPublishToProjectLevelValue;
    private final Locator addSeverity;
    private final Locator selectResolutionDateValue;
    private final Locator addResolutionProgress;
    private final Locator addDescription;
    private final Locator clickOnSolution;
    private final Locator addSolution;
    private final Locator clickOnSave;
    private final Locator clickOnSaveAndClose;
    private final Locator clickOnClose;
    private final Locator clickOnXMark;
    private final Page page;

    public AddIssuePage(Page page) {
        this.page = page;
        this.issuesTab = page.locator("//span[normalize-space()='Issues']");
        this.addButton = page.locator("//a[normalize-space()='Add']");
        this.addIssueTitle = page.locator("//*[@id=\"title\"]");
        this.selectProject = page.locator("#project > div > div > div.ng-input > input[type=text]");
        this.selectOwner = page.locator("//*[@id=\"owner\"]/div/div/div[3]/input");
        this.selectStatus = page.locator("//*[@id=\"status\"]/div/div/div[3]");
        this.selectAssociatedRiskValue = page.locator("//ng-select[@id='associatedRisk']//div[@role='combobox']");
        this.selectPublishToProjectLevelValue = page.locator("//ng-select[@id='publishToProjectLevel']//div[@role='combobox']");
        this.addSeverity = page.locator("//*[@id=\"cf170\"]/div");
        this.selectResolutionDateValue = page.locator("//*[@id=\"cf95\"]");
        this.addResolutionProgress = page.locator("//*[@id=\"cf34\"]/div/div/div[last()]");
        this.addDescription = page.locator("//div[@class='note-editable panel-body']");
        this.clickOnSolution = page.locator("//*[@id=\"mat-tab-label-2-1\"]");
        this.addSolution = page.locator("//div[@class='note-editable panel-body']");
        this.clickOnSave = page.locator("//*[@id=\"modal-footer\"]/div[2]/input[2]");
        this.clickOnSaveAndClose = page.locator("//*[@id=\"modal-footer\"]/div[2]/input[1]");
        this.clickOnClose = page.locator("//*[@id=\"modal-footer\"]/div[1]/button");
        this.clickOnXMark = page.locator("//*[@id=\"CloseBtn\"]");
    }

    public void navigateToUrl() {
        this.page.navigate(getProperty("url"));
    }

    public void clickOnIssuesTab() {
        issuesTab.click();
    }

    public void clickOnAddButton() {
        addButton.click();
    }

    public void addIssueTitle(String title) {
        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyyHH:mm:ss");
        String formattedDate = today.format(formatter);
        String titleWithDate = title + "-" + formattedDate;
        addIssueTitle.fill(titleWithDate);
    }

    public void selectProject(String project) {
        selectProject.fill(project);
    }

    public void selectOwner(String owner) {
        selectOwner.fill(owner);
    }


    public void selectStatus(String status) {
        selectStatus.click();
        selectStatus.evaluate("(element, status) => { element.textContent = status; }", status);
    }


    public void selectAssociatedRiskValue(String value) {
        selectAssociatedRiskValue.click();
        // Find the option and click it (adjust the selector and method based on ng-select behavior)
        page.click("xpath=//*[contains(text(), '" + value + "')]");
    }


    public void selectPublishToProjectLevelValue(String proLvl) {
        selectPublishToProjectLevelValue.click();
        page.click("xpath=//*[contains(text(), '" + proLvl + "')]");
    }

    public void addSeverity(String title) {
        addSeverity.click();
        page.click("xpath=//*[contains(text(), '" + title + "')]");
    }


    public void selectResolutionDateValue(int xDaysToAdd) {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate futureDate = today.plusDays(xDaysToAdd);
        String formattedDate = futureDate.format(formatter);
        selectResolutionDateValue.fill(formattedDate);
    }

    public void addResolutionProgress(String resolutionProg) {
        addResolutionProgress.click();
        page.click("xpath=//*[contains(text(), '" + resolutionProg + "')]");
    }

    public void addDescription(String descp) {
        addDescription.fill(descp);
    }

    public void clickOnSolution() {
        clickOnSolution.click();
    }


    public void addSolution(String solution) {
        addSolution.fill(solution);
    }

    public void clickOnSave() {
        clickOnSave.click();
    }

    public void clickOnSaveAndClose() {
        clickOnSaveAndClose.click();
    }

    public void clickOnClose() {
        clickOnClose.click();
    }

    public void clickOnXMark() {
        clickOnXMark.click();
    }

    public void verifySaveBtnIsDisabled() {
        // ElementHandle saveButton = clickOnSave;

        boolean isDisabled = clickOnSave.isEnabled();

        if (!isDisabled) {
            System.out.println("Button is disabled as expected");
        } else {
            throw new AssertionError("Button should be disabled but it's enabled");
        }
    }

    public void verifySaveCloseBtnIsDisabled() {
        // ElementHandle saveButton = clickOnSave;

        boolean isDisabled = clickOnSaveAndClose.isEnabled();

        if (!isDisabled) {
            System.out.println("Button is disabled as expected");
        } else {
            throw new AssertionError("Button should be disabled but it's enabled");
        }
    }

}
