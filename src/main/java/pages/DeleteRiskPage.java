package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class DeleteRiskPage {
    private final Locator clickOnDeleteIssue;

     public DeleteRiskPage(Page page) {
       
        this.clickOnDeleteIssue = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[5]/a");
     }
     public void clickOnclickOnDeleteIssue() {
		clickOnDeleteIssue.click();	
	}
}
