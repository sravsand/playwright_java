Feature: Add Risk feature

  Background:
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the Risk tab
    And User click on the add Risk button

   @smoke @addRisk @regression @addRiskSave
   Scenario: Validate the add Risk functionality with Save
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk the PublishTo value "Project"
    And User select add Risk likelihood " Medium "
    And User select add Risk Impact " Low "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Risk

    @smoke @addRisk @regression @addRiskSaveandClose
    Scenario: Validate the add Risk functionality with Save and Close
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk the PublishTo value "Project"
    And User select add Risk likelihood " Medium "
    And User select add Risk Impact " Low "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Risk

    @smoke @addRisk @regression @addRiskAllTabs
    Scenario: Validate the add Risk functionality with all the tabs
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk the PublishTo value "Project"
    And User select add Risk likelihood " Medium "
    And User select add Risk Impact " Low "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on add Risk Mitigation Plan items
    And User click on add Risk Notes 
    And User click on add Risk Add Note
    And User input add Risk add Note Title "Add Risk notes"
    And User input add Risk add Note Detail "Add Risk notes details"
    And User click on add Risk add Note Add button
    And User click on add Risk Attachments
    And User click on add Risk add Documents
    And User upload on add Risk add Documents File 
    And User input add Risk add Documents Description "Add documents Description"
    And User input add Risk add Documents save button
    And User click on Save and Close
    Then User successfully added the new Risk

    @smoke @addRisk @regression @addRiskClose
    Scenario: Validate the add Risk functionality with Close
    When User click on Close
    Then User successfully closed the Risk

    @smoke @addRisk @regression @addRiskXMark
    Scenario: Validate the add Risk functionality with X Mark
    When User click on XMark
    Then User successfully closed the Risk

    @smoke @addRisk @regression @addRiskSaveDisabled
    Scenario: Validate the add Risk functionality with save button disabled
    When User able to verify save button is disabled
    Then User successfully verify disabled buttons

    @smoke @addRisk @regression @addRiskSaveandCloseDisabled
    Scenario: Validate the add Risk functionality with save and button disabled
    When User able to verify save and close button is disabled
    Then User successfully verify disabled buttons
