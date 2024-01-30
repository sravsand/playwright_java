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
            Thread.sleep(2000);
            typeText = typeText.trim();
            this.page.locator("#selectListEditor").click();
            this.page.locator("//select[@id='selectListEditor']").selectOption(typeText);
            Thread.sleep(3000);
            if (dataType.contains(typeText)) {
                value = this.addButton.isVisible();
                if (!value) {
                    throw new Exception("Add Button is not visible for the field: " + typeText);
                }
            } else {
                value = this.addButton.isVisible();
                if (value) {
                    throw new Exception("Add Button is visible for the field: " + typeText);
                }
            }
        }
    }
}
