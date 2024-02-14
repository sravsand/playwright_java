package pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DefaultTypePage {

    private Page page;
    private final Locator headerText;
    private final Locator dataTypeList;
    private final Locator addButton;
    private final Locator nameTextBox;
    private final Locator descriptionTextBox;
    private final Locator selectWorkFlow;
    private final Locator workflowTextBox;
    private final Locator saveAndCloseButton;
    private final Locator createdDefaultTypeDescription;
    private final Locator defaultTypeListDropdown;
    private final Locator createdDefaultTypeName;
    private final Locator nameTextOfProjectDefaultType;
    private final Locator descriptionTextBoxOfProjectDefaultType;
    private final Locator saveAndCloseButtonOfProjectDefaultType;

    private final Locator inlineButtonOfCreatedDefaultType;
    private final Locator editButtonOfCreatedDefaultType;
    private final Locator headerTextOfEditPopupOfDefaultType;

    public DefaultTypePage(Page page) {
        this.page = page;
        this.headerText = page.locator("#breadcrumb-wrapper > div > ol >li:last-child");
        this.dataTypeList = page.locator("#selectListEditor >option");
        this.addButton = page.locator("//*[@id='widgetActions']/div/a");
        this.nameTextBox = page.locator("#name");
        this.descriptionTextBox = page.locator("#description");
        this.selectWorkFlow = page.locator("//*[@role='listbox']/div/div[2]/div[1]/span");
        this.workflowTextBox = page.locator("//label[@title='Workflow']/ancestor::*[2]/following-sibling::*[1]//ng-select");
        this.saveAndCloseButton = page.locator("//input[@value='Save and Close']");
        this.createdDefaultTypeDescription = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child >  td:nth-child(3) > span");
        this.defaultTypeListDropdown = page.locator("#selectListEditor");
        this.createdDefaultTypeName = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child >  td:nth-child(2) > a");
        this.nameTextOfProjectDefaultType = page.locator("#Name");
        this.descriptionTextBoxOfProjectDefaultType = page.locator("#Description");
        this.saveAndCloseButtonOfProjectDefaultType = page.locator("#ButtonSaveAndClose");
        this.inlineButtonOfCreatedDefaultType = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child >  td:nth-child(1)");
        this.editButtonOfCreatedDefaultType = page.locator("thead[class='bordered-themeprimary']+ tbody > tr:last-child >  td:nth-child(1)  > div > ul > li:first-child > a");
        this.headerTextOfEditPopupOfDefaultType = page.locator("#modal-title");
    }

    public void navigateToDefaultTypePage() {
        page.navigate("https://kipstaging.keyedinuat.com/Workflows/Web/Config/DefaultTypes");
    }

    public String getHeaderTextOfPage() {
        return this.headerText.innerText();
    }

    public void verifyOption() throws Exception {
        List<String> dataType = new ArrayList<>(Arrays.asList("xAction", "xRisk", "xDeliverable", "Issue"));
        boolean value;
        List<String> defaultTypeListText = this.dataTypeList.allInnerTexts();
        for (String typeText : defaultTypeListText) {
            Thread.sleep(2000);
            typeText = typeText.trim();
            this.page.locator("#selectListEditor").click();
            this.page.locator("//select[@id='selectListEditor']").selectOption(typeText);
            Thread.sleep(3000);
            if (dataType.contains(typeText)) {
                value = this.addButton.isVisible();
                if (!value) {
                    throw new Exception("Add Button is not visible for the field: " + typeText);
                }
            } else {
                value = this.addButton.isVisible();
                if (value) {
                    throw new Exception("Add Button is visible for the field: " + typeText);
                }
            }
        }
    }

    public List<String> getDefaultTypeList() {
        return this.dataTypeList.allInnerTexts();
    }

    public Boolean addDefaultTypeData(String defaultDataType, String dataTypeName, String description) throws InterruptedException {
        this.defaultTypeListDropdown.click();
        this.defaultTypeListDropdown.selectOption(defaultDataType);
        Thread.sleep(3000);
        boolean value = this.addButton.isVisible();
        if (value) {
            if (!defaultDataType.contains("Project")) {
                this.addButton.click();
                addDefaultType(dataTypeName, description);
            } else {
                value = false;
            }
        }
        return value;
    }

    public void addDefaultType(String name, String description) {
        nameTextBox.fill(name);
        descriptionTextBox.fill(description);
        workflowTextBox.click();
        selectWorkFlow.click();
        saveAndCloseButton.click();
    }

    public void addDefaultTypeForProject(String name, String description) {
        nameTextOfProjectDefaultType.fill(name);
        descriptionTextBoxOfProjectDefaultType.fill(description);
        saveAndCloseButtonOfProjectDefaultType.click();

    }

    public String getCreatedWorkflowName() {
        this.page.waitForSelector("thead[class='bordered-themeprimary']+ tbody > tr:last-child >  td:nth-child(2) > a");
        return createdDefaultTypeName.innerText();
    }

    public String getCreatedDefaultTypeDescription() {
        return createdDefaultTypeDescription.innerText();
    }

    public void clickOnInlineButton() {
        inlineButtonOfCreatedDefaultType.click();
    }

    public void clickOnEditButton() {
        editButtonOfCreatedDefaultType.click();
    }

    public boolean getHeaderTextOfEditDefaultTypePopUp() {
        return headerTextOfEditPopupOfDefaultType.isVisible();
    }

    public void updateDefaultTypeData(String name, String description) {
        nameTextBox.clear();
        nameTextBox.fill(name);
        descriptionTextBox.clear();
        descriptionTextBox.fill(description);
        saveAndCloseButton.click();
    }
}
