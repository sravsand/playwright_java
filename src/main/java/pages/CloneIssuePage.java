package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CloneIssuePage {
    private final Locator CloneIssue;

    public CloneIssuePage(Page page) {
    this.CloneIssue = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[3]/a");
}

public void CloneIssue() {
    CloneIssue.click();	
}
}
