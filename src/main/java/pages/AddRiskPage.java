package pages;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.microsoft.playwright.FileChooser;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class AddRiskPage {
     private final Page page;
     private final Locator	clickOnRisk;
     private final Locator	addRisk;
     private final Locator	addRiskTitle;
     private final Locator	addRiskProject;
     private final Locator	addRiskOwner;
     private final Locator	addRiskStatus;
     private final Locator	addRiskDateIdentified;
     private final Locator	addRiskImpactDate;
     private final Locator  addRiskPublishTo;
     private final Locator	addRiskLikelihood;
     private final Locator	addRiskImpact;
     private final Locator	addRiskDescriptionNotePad;
     private final Locator	addRiskContingency;
     private final Locator	addRiskContingencyNotePad;
     private final Locator	addRiskMitigationPlanItemTab;
     private final Locator	addRiskNotesTab;
     private final Locator	addRiskaddNotes;
     private final Locator	addRiskaddNotesDetailsNotePad;
     private final Locator	addIRiskAddNoteAddBtn;
     private final Locator	addRiskAttachements;
     private final Locator	addRiskAttachementsAddDocuments;
     private final Locator	addRiskAttachementsAddDocumentsFileUpload;
     private final Locator	addRiskAttachementsAddDocumentsDescription;
     private final Locator riskTitleLink;
     

    public AddRiskPage(Page page) {
        this.page = page;
        this.clickOnRisk = page.locator("//*[@id=\"Risks\"]/span");
        this.addRisk = page.locator("//*[@id=\"widgetActions\"]/div[1]/a[1]");
        this.addRiskTitle = page.locator("//*[@id=\"title\"]");
        this.addRiskProject = page.locator("//*[@id=\"projectCode\"]/div/div/div[3]/input");
        this.addRiskOwner = page.locator("//*[@id=\"ownerCode\"]/div/div/div[3]/input");
        this.addRiskStatus = page.locator("//*[@id=\"status\"]/div/div/div[3]");
        this.addRiskDateIdentified = page.locator("//*[@id=\"dateIdentified\"]");
        this.addRiskImpactDate = page.locator("//*[@id=\"impactDate\"]");
        this.addRiskPublishTo = page.locator("//*[@id=\"publishToProjectLevel\"]/div/div/div[2]");
        this.addRiskLikelihood = page.locator("//*[@id=\"cf166\"]/div/div/div[3]/input");
        this.addRiskImpact = page.locator("//*[@id=\"cf167\"]/div/div/div[3]/input");
        this.addRiskDescriptionNotePad = page.locator("//*[@id=\"mat-tab-content-2-0\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/ng-component/div/div/custom-field-free-text/div/div[3]/div[2]/p");
        this.addRiskContingency = page.locator("//*[@id=\"mat-tab-label-2-1\"]/div");
        this.addRiskContingencyNotePad = page.locator("//*[@id=\"mat-tab-content-2-1\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/ng-component/div/div/custom-field-free-text/div/div[3]/div[2]/p");
        this.addRiskMitigationPlanItemTab = page.locator("//*[@id=\"mat-tab-label-1-1\"]");
        this.addRiskNotesTab = page.locator("//*[@id=\"mat-tab-label-1-2\"]");
        this.addRiskaddNotes = page.locator("//*[@id=\"mat-tab-content-1-2\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/notes-table/div/span");
        this.addRiskaddNotesDetailsNotePad = page.locator("//*[@id=\"mat-tab-content-3-0\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field[4]/ng-component/div/div/custom-field-free-text/div/div[3]/div[2]/p");
        this.addIRiskAddNoteAddBtn = page.locator("//button[@id=\'add\']");
        this.addRiskAttachements = page.locator("//*[@id=\"mat-tab-label-1-3\"]");
        this.addRiskAttachementsAddDocuments = page.locator("//*[@id=\"mat-tab-content-1-3\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/app-attachments-table/div/span");
        this.addRiskAttachementsAddDocumentsFileUpload = page.locator("//*[@id=\"mat-tab-content-1-3\"]/div/formly-field/formly-field-tab/formly-tabs-tab/formly-field/app-attachments-table/div/div/app-file-upload/div/formly-form/formly-field[2]/formly-file-input/div/label");
        this.addRiskAttachementsAddDocumentsDescription = page.locator("//*[@id=\"name\"]");
        this.riskTitleLink = page.locator("//*[@id=\"28ad15b0-4e62-48d0-9eea-db6963ba6900\"]/div[5]/table/tbody/tr[1]/td[3]/a");

        }
    public void clickOnRisk(){
        clickOnRisk.click();
    }

    public void clickOnaddRisk(){
       addRisk.click();
    }

    public void clickOnaddRiskTitle(String title){
        
       addRiskTitle.fill(title);
    }

    public void clickOnaddRiskProject(String Project){
       addRiskProject.fill(Project);
    }

    public void clickOnaddRiskOwner(String Owner){
       addRiskOwner.fill(Owner);
    }

    public void clickOnaddRiskStatus(String Status){
      addRiskStatus.click();	
        addRiskStatus.evaluate("(element, status) => { element.textContent = status; }", Status);
    }

    public void selectaddRiskDateIdentified(int xDaysToAdd) {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate futureDate = today.plusDays(xDaysToAdd);
        String formattedDate = futureDate.format(formatter);
		addRiskDateIdentified.fill(formattedDate);
	}

    public void selectaddRiskImpactDate(int xDaysToAdd) {
         LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate futureDate = today.plusDays(xDaysToAdd);
        String formattedDate = futureDate.format(formatter);
		addRiskImpactDate.fill(formattedDate);
	}

    public void clickOnaddRiskPublishTo(String publishTo){
       addRiskPublishTo.click();
        page.click("xpath=//*[contains(text(), '" + publishTo + "')]");	
    }

    public void clickOnaddRiskLikelihood(String like){
       addRiskLikelihood.click();
       page.click("xpath=//*[contains(text(), '" + like + "')]");
      
    }
    public void clickOnaddRiskImpact(String impact){
       addRiskImpact.click();
       page.click("xpath=//*[contains(text(), '" + impact + "')]");
   //     String xpathExpression = String.format("//div[@role='combobox']//*[contains(text(), '%s')]", impact);
   //  page.click("xpath=" + xpathExpression);
    }
     public void clickOnaddRiskDescriptionNotePad(String desp){
       addRiskDescriptionNotePad.fill(desp);
    }

    public void clickOnaddRiskContingency(){
       addRiskContingency.click();
    }

     public void clickOnaddRiskContingencyNotePad(String cont){
       addRiskContingencyNotePad.fill(cont);
    }
    public void clickOnaddRiskMitigationPlanItemTab(){
       addRiskMitigationPlanItemTab.click();
    }
    public void clickOnaddRiskNotesTab(){
       addRiskNotesTab.click();
    }
    public void clickOnaddRiskaddNotes(){
       addRiskaddNotes.click();
    }
    public void clickOnaddRiskaddNotesDetailsNotePad(String notes){
       addRiskaddNotesDetailsNotePad.fill(notes);
    }
     public void clickOnaddIRiskAddNoteAddBtn(){
       addIRiskAddNoteAddBtn.click();
       page.waitForTimeout(5000);
    }
    public void clickOnaddRiskAttachements(){
       addRiskAttachements.click();
    }
    public void clickOnaddRiskAttachementsAddDocuments(){
       addRiskAttachementsAddDocuments.click();
    }
    public void clickOnaddRiskAttachementsAddDocumentsFileUpload(){
        addRiskAttachementsAddDocumentsFileUpload.click();
    FileChooser fileChooser = page.waitForFileChooser(() -> {
        addRiskAttachementsAddDocumentsFileUpload.click();
    });
   String filePathString = "src/test/resources/testdata.xlsx";
   Path filePath = Paths.get(filePathString);
    fileChooser.setFiles(filePath);
    }
    public void clickOnaddRiskAttachementsAddDocumentsDescription(String desp){
       addRiskAttachementsAddDocumentsDescription.fill(desp);
    }

    public String isRiskAddedSuccessfully() {
      riskTitleLink.waitFor();
        return riskTitleLink.innerText(); // You can return true or false based on your requirements
    }

}



