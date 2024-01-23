package pages;

import static utilities.ConfigFileReader.getProperty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class EditIssuePage {
    private final Page page;
    private final Locator clickOnEditIssue;
    private final Locator clickOnEditTitle;
    private final Locator selectStatusEditIssue ;
    private final Locator publishToEditIssue;
    private final Locator clickOnContingency;
    private final Locator addonContingency;
    private final Locator clickOnContingencyApplyBuuton;
    private final Locator addSeverityEditIssue;
    private final Locator selectResolutionDateValueEditIssue;
    private final Locator addResolutionProgressEditIssue;
    private final Locator clickOnDetails;
    private final Locator addonDetails;
    private final Locator clickOnDetailsApplyBuuton;
    private final Locator clickOnSaveButton;
    private final Locator clickOnCancelEditIssue;
    

    public EditIssuePage(Page page) {
        this.page = page;
        this.clickOnEditIssue = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[2]/a");
       this.clickOnEditTitle = page.locator("//*[@id=\"Title_Value\"]");
        this.selectStatusEditIssue = page.locator("//*[@id=\"Status\"]");
		this.publishToEditIssue = page.locator("//*[@id=\"s2id_PublishTo_Id\"]");
        this.clickOnContingency = page.locator("//*[@id=\"Contingency\"]");
        this.addonContingency = page.locator("//*[@id=\"Contingency-area-wrapper\"]/div[2]/div[3]/div[2]");
        this.clickOnContingencyApplyBuuton = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[8]/div/div[3]/div[2]/button[1]");
        this.addSeverityEditIssue = page.locator("//*[@id=\"CF_Dropdown_170\"]/button");
        this.selectResolutionDateValueEditIssue = page.locator("//*[@id=\"CustomFieldValues_1__Value_CurrentValue\"]");
		this.addResolutionProgressEditIssue = page.locator("//*[@id=\"CF_Dropdown_CustomFieldValues_2__Value_CurrentValue34\"]/button");
        this.clickOnDetails = page.locator("//*[@id=\"Detail\"]");
        this.addonDetails = page.locator("//*[@id=\"Detail-area-wrapper\"]/div[2]/div[3]/div[2]");
        this.clickOnDetailsApplyBuuton = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[13]/div/div[3]/div[2]/button[1]");
        this.clickOnSaveButton = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/a[1]/i");
       	this.clickOnCancelEditIssue = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/a[2]");
        
    }
	
    public void navigateToUrl() {
        this.page.navigate(getProperty("url"));
    }

	public void clickOnEditIssueButton() {
		clickOnEditIssue.click();	
	}
	
	
	public void clickOnEditTitle(String title) {
		clickOnEditTitle.fill(title);
    }
	
	public void selectStatusEditIssue(String status) {
		selectStatusEditIssue .click();
        selectStatusEditIssue.evaluate("(element, status) => { element.textContent = status; }", status);	
	}
	
    public void publishToEditIssue(String proLvl) {
		publishToEditIssue.click();
        page.click("xpath=//*[contains(text(), '" + proLvl + "')]");	
	}

    public void clickOnContingency() {
		clickOnContingency.click();	
	}
	
	public void addonContingency(String details) {
		addonContingency.fill(details);
    }

    public void clickOnContingencyApplyBuuton() {
		clickOnContingencyApplyBuuton.click();	
	}

    public void addSeverityEditIssue(String title) {
        addSeverityEditIssue.click();
        page.click("xpath=//*[contains(text(), '" + title + "')]");
    }

    
    public void selectResolutionDateValueEditIssue() {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);
		selectResolutionDateValueEditIssue.fill(formattedDate);
	}

    public void addResolutionProgressEditIssue(String resolutionProg) {
        addResolutionProgressEditIssue.click();
        page.click("xpath=//*[contains(text(), '" + resolutionProg + "')]");
    }
	
	public void clickOnDetails() {
		clickOnDetails.click();	
	}
	
	public void addonDetails(String details) {
		addonDetails.fill(details);
    }
	
	public void clickOnDetailsApplyBuuton() {
		clickOnDetailsApplyBuuton.click();	
	}
	
	public void clickOnSaveButton() {
		clickOnSaveButton.click();	
	}
	
	public void clickOnCancelEditIssue() {
		clickOnCancelEditIssue.click();	
	}
}
