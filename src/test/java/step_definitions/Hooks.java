package step_definitions;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Tracing;
import factory.PlaywrightDriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


import java.util.ArrayList;
import java.util.List;

import java.nio.file.Paths;

import static utilities.ConfigFileReader.getProperty;

public class Hooks {
    public PlaywrightDriverFactory driverFactory;
    public Page page;
    static final String cycleId = ResultsStatusUpdate.createTestCycle();
    Scenario scenario;
    public static List<String> scenarioStatus = new ArrayList<String>();
    @Before
    public void launchBrowser() {
        String browserName = getProperty("browser");
        driverFactory = new PlaywrightDriverFactory();
        page = driverFactory.initDriver(browserName);
    }

    @After(order = 0)
    public void quitBrowser() {
        page.close();
    }

    @After(order = 1)
    public void takeScreenshotAndTrace(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replace(" ", "_");
            byte[] sourcePath = page.screenshot();
            scenario.attach(sourcePath, "image/png", screenshotName);
            PlaywrightDriverFactory.context.tracing().stop(new Tracing.StopOptions().setPath(Paths.get("target/" + screenshotName + ".zip")));
        }
    }

    @After
    public void afterAScenario(Scenario scenario) {
        System.out.println("This will run after the Scenario");
        this.scenario = scenario;
        List<String> sourceTagNames = new ArrayList<String>(scenario.getSourceTagNames());
        for (int i = 0; i < sourceTagNames.size(); i++)
            if (sourceTagNames.get(i).contains("Smoke") || sourceTagNames.get(i).contains("ManualTests"))
                scenarioStatus.add(scenario.getStatus().toString());

        String status=scenario.getStatus().toString();
        if(status.equalsIgnoreCase("passed")){
            ResultsStatusUpdate.updateTestCaseStatus(cycleId,sourceTagNames.get(0).replace("@",""), "PASS");
        }else {
            ResultsStatusUpdate.updateTestCaseStatus(cycleId,sourceTagNames.get(0).replace("@",""), "FAIL");
        }
    }
}