package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CloneRiskPage {
    private final Locator CloneRiskBtn;

    public CloneRiskPage(Page page) {
        this.CloneRiskBtn = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[3]/a");
       
    }
    public void clickOnCloneRiskBtn() {
       CloneRiskBtn.click();	
    }

   
}
