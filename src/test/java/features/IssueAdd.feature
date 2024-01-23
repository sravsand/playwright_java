Feature: Add Issue feature

  Background: 
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the issues tab
    And User click on the add button

  @KI-T1 @smoke @addissue @regression @addissueSave
  Scenario: Validate the add Issue functionality with Save
    When User input Title "Issue"
    And User select Project " SandProj | SANDPROJECTCODE "
    And User select Owner " SandeepS | RES033 "
    And User select the Status value "Open"
    And User select AssociatedRisk value "SandRisk12"
    And User select the PublishTo value "Project"
    And User select Severity " Medium "
    And User select Expected Resolution Date value 5 days
    And User select Resolution Progress " Improving "
    And User input Description "Found Bug"
    And User click on Solution
    And User input Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Issue

  @smoke @addissue @regression @addissueSaveAndClose
  Scenario: Validate the add Issue functionality with Save and Close
    When User input Title "BugTest01"
    And User select Project " All Company | COMPANY "
    And User select Owner " Terry Rosberry | RES009 "
    And User select the Status value "Open"
    And User select AssociatedRisk value "SandRisk12"
    And User select the PublishTo value "Project"
    And User select Severity " Medium "
    And User select Expected Resolution Date value 5 days
    And User select Resolution Progress " Improving "
    And User input Description "Found Bug"
    And User click on Solution
    And User input Solution "Retest Bug"
    And User click on Save and Close
    Then User successfully added the new Issue

    @smoke @addissue @regression @addissueClose
    Scenario: Validate the add Issue functionality with Close
    When User click on Close
    Then User successfully closed the Issue

      @smoke @addissue @regression @addissueXMark
  Scenario: Validate the add Issue functionality with X Mark
    When User click on XMark
    Then User successfully closed the Issue

    @smoke @addissue @regression @addissueSaveDisabled
   Scenario: Validate the add Issue functionality with save button disabled
    When User able to verify save button is diabled
    Then User successfully verify diabled buttons

    @smoke @addissue @regression @addissueSaveandCloseDisabled
   Scenario: Validate the add Issue functionality with save and button disabled
    When User able to verify save and close button is diabled
    Then User successfully verify diabled buttons
