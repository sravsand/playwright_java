package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class EditRiskPage {
    private final Page page;
    private final Locator clickOnEditRiskBtn;
    private final Locator editRiskDateIdentified;
    private final Locator editRiskPublishTo;
    private final Locator editRiskContingencyApplyButton;
     private final Locator editRiskLikeHood;
    private final Locator editRiskImpact;
    private final Locator editRiskImpactDate;
    private final Locator editRiskDetailApplyButton;
    private final Locator editRiskSaveBtn;
    private final Locator editRiskCloseBtn;

    public EditRiskPage(Page page) {
    this.page = page;
        this.clickOnEditRiskBtn = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[2]/a");
        this.editRiskDateIdentified=page.locator("//*[@id=\"DateIdentified\"]");
        this.editRiskPublishTo = page.locator("//*[@id=\"s2id_PublishTo_Id\"]/a/span[2]");
        this.editRiskContingencyApplyButton = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[7]/div/div[3]/div[2]/button[1]");
        this.editRiskLikeHood =page.locator("//*[@id=\"CF_Dropdown_166\"]/button");
        this.editRiskImpact = page.locator("//*[@id=\"CF_Dropdown_167\"]/button");
        this.editRiskImpactDate = page.locator("//*[@id=\"ImpactDate\"]");
        this.editRiskDetailApplyButton= page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[15]/div/div[3]/div[2]/button[1]");
        this.editRiskSaveBtn = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/a[1]");
        this.editRiskCloseBtn = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/a[2]/i");

    }
        public void clickOnclickOnEditRiskBtn() {
           clickOnEditRiskBtn.click();	
        }

        public void selecteditRiskDateIdentified(int xDaysToAdd) {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate futureDate = today.plusDays(xDaysToAdd);
        String formattedDate = futureDate.format(formatter);
		editRiskDateIdentified.fill(formattedDate);
	}

    public void clickeditRiskPublishTo(String publishTo){
       editRiskPublishTo.click();
         page.click("xpath=//*[contains(text(), '" + publishTo + "')]");	
     }

     public void clickOneditRiskContingencyApplyButton() {
		editRiskContingencyApplyButton.click();	
	}

    public void editRiskLikeHood(String title) {
        editRiskLikeHood.click();
        page.click("xpath=//*[contains(text(), '" + title + "')]");
    }

    public void editRiskImpact(String title) {
        editRiskImpact.click();
        page.click("xpath=//*[contains(text(), '" + title + "')]");
    }
    public void selecteditRiskImpactDate(int xDaysToAdd) {
        LocalDate today = LocalDate.now();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       LocalDate futureDate = today.plusDays(xDaysToAdd);
       String formattedDate = futureDate.format(formatter);
       editRiskImpactDate.fill(formattedDate);
   }

    public void clickOneditRiskDetailApplyButton() {
		editRiskDetailApplyButton.click();	
	}
 
    public void clickOneditRiskSaveBtn() {
		editRiskSaveBtn.click();	
	}
 
    public void clickOneditRiskCloseBtn() {
		editRiskCloseBtn.click();	
	}
 
}
