package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OpenIssuePage {
    private final Locator OpenIssue;

    public OpenIssuePage(Page page) {
    this.OpenIssue = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[1]/a");
    }
public void OpenIssue() {
    OpenIssue.click();	
}

}
