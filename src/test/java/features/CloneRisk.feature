Feature: Clone Risk feature

  Background: 
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the Risk tab
    And User click on the ellipsis button
    And User click on clone button

   @smoke @CloneRisk @regression @CloneRiskSave
   Scenario: Validate the add Risk functionality with Save
     When User input Clone Risk Title "BugTest01"
    And User select Clone Risk Project " All Company | COMPANY "
    And User select Clone Risk Owner " Terry Rosberry | RES009 "
    And User select Clone Risk the Status value "Open"
    And User select Clone Risk Date identified with 0 days
    And User select Clone Risk Impact Date with 5 days
    And User select Clone Risk the PublishTo value "Project"
    And User select Clone Risk likelihood " Medium "
    And User select Clone Risk Impact " Low "
    And User input Clone Risk Description "Found Bug"
    And User click on Clone Risk Solution
    And User input Clone Risk Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Risk

    @smoke @CloneRisk @regression @CloneRiskSaveandClose
    Scenario: Validate the add Risk functionality with Save and Close
    When User input Clone Risk Title "BugTest01"
    And User select Clone Risk Project " All Company | COMPANY "
    And User select Clone Risk Owner " Terry Rosberry | RES009 "
    And User select Clone Risk the Status value "Open"
    And User select Clone Risk Date identified with 0 days
    And User select Clone Risk Impact Date with 5 days
    And User select Clone Risk the PublishTo value "Project"
    And User select Clone Risk likelihood " Medium "
    And User select Clone Risk Impact " Low "
    And User input Clone Risk Description "Found Bug"
    And User click on Clone Risk Solution
    And User input Clone Risk Solution "Retest Bug"
    And User click on Save and Close
    Then User successfully added the new Risk

    @smoke @CloneRisk @regression @CloneRiskAllTabs
    Scenario: Validate the add Risk functionality with all the tabs
    When User input Clone Risk Title "BugTest01"
    And User select Clone Risk Project " All Company | COMPANY "
    And User select Clone Risk Owner " Terry Rosberry | RES009 "
    And User select Clone Risk the Status value "Open"
    And User select Clone Risk Date identified with 0 days
    And User select Clone Risk Impact Date with 5 days
    And User select Clone Risk the PublishTo value "Project"
    And User select Clone Risk likelihood " Medium "
    And User select Clone Risk Impact " Low "
    And User input Clone Risk Description "Found Bug"
    And User click on Clone Risk Solution
    And User input Clone Risk Solution "Retest Bug"
    And User click on Clone Risk Mitigation Plan items
    And User click on Clone Risk Notes 
    And User click on Clone Risk Add Note
    And User input Clone Risk add Note Title "Add Risk notes"
    And User input Clone Risk add Note Detail "Add Risk notes details"
    And User click on Clone Risk add Note Add button
    And User click on Clone Risk Attachements
    And User click on Clone Risk add Documents
    And User upload on Clone Risk add Documents File 
    And User input Clone Risk add Documents Description "Add documents Description"
    And User input Clone Risk add Documents save button
    And User click on Save and Close
    Then User successfully added the new Risk

    @smoke @CloneRisk @regression @CloneRiskClose
    Scenario: Validate the add Risk functionality with Close
    When User click on Close
    Then User successfully closed the Risk

    @smoke @CloneRisk @regression @CloneRiskXMark
    Scenario: Validate the add Risk functionality with X Mark
    When User click on XMark
    Then User successfully closed the Risk

    @smoke @CloneRisk @regression @CloneRiskSaveDisabled
    Scenario: Validate the add Risk functionality with save button disabled
    When User able to verify save button is diabled
    Then User successfully verify diabled buttons

    @smoke @CloneRisk @regression @CloneRiskSaveandCloseDisabled
    Scenario: Validate the add Risk functionality with save and button disabled
    When User able to verify save and close button is diabled
    Then User successfully verify diabled buttons
