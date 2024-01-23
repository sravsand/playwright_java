package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CodeConverterIssuePage {
    private final Locator codeConverter;
    private final Locator newCode_CodeConverter;
    private final Locator convertBtn_CodeConverter;
    private final Locator cancelBtn_CodeConverter;
    private final Locator xMarkBtn_CodeConverter;

    public CodeConverterIssuePage(Page page) {
    	this.codeConverter = page.locator("//*[@id=\"f78e245f-29c6-4130-b4ee-92902da5f114\"]/div[5]/table/tbody/tr[1]/td[1]/div/ul/li[4]/a");
        this.newCode_CodeConverter = page.locator("//*[@id=\"newCode\"]");
        this.convertBtn_CodeConverter = page.locator("//*[@id=\"modal-footer\"]/div[2]/input");
    	this.cancelBtn_CodeConverter = page.locator("//*[@id=\"modal-footer\"]/div[1]/button");
    	this.xMarkBtn_CodeConverter = page.locator("//*[@id=\"CloseBtn\"]");
    }

    public void codeConverter() {
		codeConverter.click();	
	}

    public void newCode_CodeConverter(String title) {
      String uniqueNumber = String.valueOf(System.currentTimeMillis());
        String titleWithNumber = title + "-" + uniqueNumber;
		newCode_CodeConverter.fill(titleWithNumber);
    }

    public void convertBtn_CodeConverter() {
		convertBtn_CodeConverter.click();	
	}

    public void cancelBtn_CodeConverter() {
		cancelBtn_CodeConverter.click();	
	}

    public void xMarkBtn_CodeConverter() {
		xMarkBtn_CodeConverter.click();	
	}

}
