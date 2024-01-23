package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ExportIssuePage {
     private final Locator exportIssue;

    public ExportIssuePage(Page page) {
    this.exportIssue = page.locator("//*[@id=\"widgetActions\"]/div[1]/a[3]");
}

public void exportIssue() {
    exportIssue.click();	
}

}
