package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DeleteIssuePage {

    private final Locator clickEllipsis;
    private final Locator clickOnDeleteIssue;
    private final Locator deleteConfirmationOK;
    private final Locator deleteConfirmationCancel;
    private final Locator deleteConfirmationXMark;


    public DeleteIssuePage(Page page) {
        this.clickEllipsis = page.locator("(//*[@class=\" fas fa-ellipsis-h   themeprimary \"])[1]");
        this.clickOnDeleteIssue = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[5]/a");
        this.deleteConfirmationOK = page.locator("//*[@id=\"angularForm\"]/app-modal-footer-delete/div/div/button[2]");
        this.deleteConfirmationCancel = page.locator("#angularForm > app-modal-footer-delete > div > div > button.btn.btn-secondary");
        this.deleteConfirmationXMark = page.locator("//*[@id=\"CloseBtn\"]");
    }
  
	public void clickOnEllipsisButton() {
		clickEllipsis.click();	
	}
	
	public void clickOnDeleteIssueButton() {
		clickOnDeleteIssue.click();	
	}
	

	public void deleteConfirmationOK() {
		deleteConfirmationOK.click();	
	}

    public void deleteConfirmationCancel() {
		deleteConfirmationCancel.click();	
	}

     public void deleteConfirmationXMark() {
		deleteConfirmationXMark.click();	
	}

}