package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.List;

public class AddWorkFlowPage {
    private final Page page;
    private final Locator headerText;
    private final Locator workFlowList;
    private final Locator addButton;
    private final Locator addWorkFlowHeaderText;
    private final Locator workflowNameTextBox;
    private final Locator descriptionTextBox;
    private final Locator saveAndCloseButton;
    private final Locator createdWorkFlowText;
    private final Locator createdWorkFlowDescription;

    public AddWorkFlowPage(Page page) {
        this.page = page;
        this.headerText = page.locator("#breadcrumb-wrapper > div > ol >li:last-child");
        this.workFlowList = page.locator("#selectListEditor >option");
        this.addButton = page.locator("//*[@id='widgetActions']/div/a");
        this.addWorkFlowHeaderText = page.locator("#modal-title");
        this.workflowNameTextBox = page.locator("#name");
        this.descriptionTextBox = page.locator("#description");
        this.saveAndCloseButton = page.locator("input[value='Save and Close']");
        this.createdWorkFlowText = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child > td:nth-child(2) > a");
        this.createdWorkFlowDescription = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child > td:nth-child(3) ");
    }

    public void navigateToDefaultTypePage() {
        page.navigate("https://kipstaging.keyedinuat.com/Workflows/Web/Config/Workflows");
    }

    public String getHeaderTextOfWorkFlowPage() {
        return this.headerText.innerText();
    }

    public List<String> getWorkFLowList() {
        return this.workFlowList.allInnerTexts();
    }

    public void addWorkFlow(String typeText, String workflowName, String description) throws InterruptedException {
        this.page.locator("#selectListEditor").click();
        this.page.locator("//select[@id='selectListEditor']").selectOption(typeText);
        this.addButton.click();
        addWorkFlowForEntity(workflowName, description);
    }

    public void addWorkFlowForEntity(String workflowName, String description) throws InterruptedException {
        this.workflowNameTextBox.fill(workflowName);
        this.descriptionTextBox.fill(description);
        this.saveAndCloseButton.click();
        Thread.sleep(3500);
    }

    public List<String> getCreatedWorkFlowName() {
        this.page.waitForSelector("thead[class='bordered-themeprimary']+ tbody > tr >  td:nth-child(2) > a");
        return this.page.locator("thead[class='bordered-themeprimary']+ tbody > tr >  td:nth-child(2) > a").allInnerTexts();
    }

    public List<String> getCreatedWorkFlowDescription() {
        this.page.waitForSelector("thead[class='bordered-themeprimary']+ tbody > tr >  td:nth-child(3)");
        return this.page.locator("thead[class='bordered-themeprimary']+ tbody > tr >  td:nth-child(3)").allInnerTexts();
    }
}
