package pages;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DefaultTypePage {

    private Page page;
    private final Locator headerText;
    private final Locator dataTypeList;

    private final Locator addButton;

    public DefaultTypePage(Page page) {
        this.page = page;
        this.headerText = page.locator("#breadcrumb-wrapper > div > ol >li:last-child");
        this.dataTypeList = page.locator("#selectListEditor >option");
        this.addButton = page.locator("//*[@id='widgetActions']/div/a");
    }

    public void navigateToDefaultTypePage() {
        page.navigate("https://kipstaging.keyedinuat.com/Workflows/Web/Config/DefaultTypes");
    }

    public String getHeaderTextOfDefaultTypePage() {
        return this.headerText.innerText();
    }

    public void verifyOption() throws Exception {
        List<String> dataType = new ArrayList<>(Arrays.asList("xAction", "xRisk", "xDeliverable", "Issue"));
        boolean value;
        List<String> defaultTypeListText = this.dataTypeList.allInnerTexts();
        for (String typeText : defaultTypeListText) {
            typeText = typeText.trim();
            this.page.locator("#selectListEditor").click();
            Thread.sleep(3000);
            this.page.locator("//option[normalize-space(text())='" + typeText + "']").click();
            Thread.sleep(2000);
            if (dataType.contains(typeText)) {
                value = this.addButton.isVisible();
                if (!value) {
                    System.out.println("Text 1 is: " + typeText);
                    throw new Exception("Add Button is not visible");
                }
            } else {
                value = this.addButton.isVisible();
                if (value) {
                    System.out.println("Text 2 is: " + typeText);
                    throw new Exception("Add Button is visible");
                }
            }
        }
    }
}
