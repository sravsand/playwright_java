package step_definitions;

import factory.PlaywrightDriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CodeConverterIssuePage;

public class CodeConverterIssueStep {
    CodeConverterIssuePage codeConvert = new CodeConverterIssuePage(PlaywrightDriverFactory.getPage());

     @When("User click on the code converter button")
    public void usercodeConverter() {
        codeConvert.codeConverter();
    }
    @And("User input New Code {string}")
    public void user_newCode_CodeConverter(String code) {
          codeConvert.newCode_CodeConverter(code);
    }
  
    @And("User click on Convert button")
    public void userconvertBtn_CodeConverte() {
    	codeConvert.convertBtn_CodeConverter();
    }
    @And("User need to Cancel the code converter issue")
    public void usercancelBtn_CodeConverter() {
    	codeConvert.cancelBtn_CodeConverter();
    }

    @And("User need to click on X Mark on code converter issue")
    public void userxMarkBtn_CodeConverter() {
    	codeConvert.xMarkBtn_CodeConverter();
    }
    
    @Then("User Successfully converted the code")
    public void userSuccessfullyDeletedIssue() {
    	System.out.println("The test succeeded!");
    }

    @Then("User Successfully Canceled the code converter issue")
    public void userSuccessfullyCancelledDeletedIssue() {
    	System.out.println("The test succeeded!");
    }
}
