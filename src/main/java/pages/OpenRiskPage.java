package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class OpenRiskPage {
    private final Locator OpenRisk;
    private final Locator addMitigationAddBtn;
    private final Locator addMitigationType;
    private final Locator addMitigationOwner;
    private final Locator addMitigationStatus;
    private final Locator addMitigationDueDate;
    private final Locator addMitigationStep;
    private final Locator addMitigationDescription;
    private final Locator addMitigationOnTime;
    private final Locator addMitigationPriority;
    private final Locator addRiskOpenPublishTo;
    
    private Page page;

    public OpenRiskPage(Page page) {
    this.page = page;
    this.OpenRisk = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[1]/a");
    this.addMitigationAddBtn = page.locator("//*[@id=\"mat-tab-content-1-1\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/risk-action-table/div/span");
    this.addMitigationType   = page.locator("//*[@id=\"riskActionType\"]/div/div/div[2]");
    this.addMitigationOwner  = page.locator("//*[@id=\"owner\"]/div/div/div[2]/input");
    this.addMitigationStatus  = page.locator("//*[@id=\"statusValue\"]/div/div/div[3]");
    this.addMitigationDueDate = page.locator("//*[@id=\"dueDate\"]");
    this.addMitigationStep   = page.locator("//*[@id=\"step\"]");
    this.addMitigationDescription = page.locator("//*[@id=\"mat-tab-content-1-1\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/risk-action-table/div/div/app-add-risk-action/div/formly-form/formly-field[16]/ng-component/div/div/custom-field-free-text/div/div[3]/div[2]");
    this.addMitigationOnTime  = page.locator("//*[@id=\"cf183\"]");
    this.addMitigationPriority  = page.locator("//*[@id=\"cf35\"]/div/div/div[2]/input");
    this.addRiskOpenPublishTo = page.locator("//*[@id=\"publishToProjectLevel\"]/div/div/div[3]");
    }
public void OpenRisk() {
    OpenRisk.click();	
}

public void addMitigationAddBtn() {
    addMitigationAddBtn.click();	
}

public void addMitigationType(String type) {
     addMitigationType.click();
        // Find the option and click it (adjust the selector and method based on ng-select behavior)
        page.click("xpath=//*[contains(text(), '" + type + "')]");	
}
public void addMitigationOwner(String type) {
     addMitigationOwner.click();
        // Find the option and click it (adjust the selector and method based on ng-select behavior)
        page.click("xpath=//*[contains(text(), '" + type + "')]");	
}

public void addMitigationStatus(String status) {
    addMitigationStatus.click();	
    addMitigationStatus.evaluate("(element, status) => { element.textContent = status; }", status);
}

public void addMitigationDueDate(int xDaysToAdd) {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate futureDate = today.plusDays(xDaysToAdd);
        String formattedDate = futureDate.format(formatter);
		addMitigationDueDate.fill(formattedDate);
	}

    public void addMitigationStep(String descp) {
		addMitigationStep.fill(descp);
    }

    public void addMitigationDescription(String descp) {
		addMitigationDescription.fill(descp);
    }

    public void addMitigationOnTime(String descp) {
		addMitigationOnTime.fill(descp);
    }

    public void addMitigationPriority(String type) {
     addMitigationPriority.click();
        // Find the option and click it (adjust the selector and method based on ng-select behavior)
        // page.click("xpath=//*[contains(text(), '" + type + "')]");	
        page.locator("//*[@id=\"a1ca298c1c4d\"]").selectOption(type);
}

public void clickOnaddRiskOpenPublishTo(String publishTo){
  addRiskOpenPublishTo.click();
   page.click("xpath=//*[contains(text(), '" + publishTo + "')]");	
}
}
