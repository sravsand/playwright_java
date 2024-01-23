Feature: Open Risk feature

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
    And User click on the Open Risk button

   @smoke @openRisk @regression @openRiskSave
   Scenario: Validate the Open Risk functionality with Save
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk Open the PublishTo value "Project"
    # And User select add Risk likelihood " Low "
    # And User select add Risk Impact " Medium "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Risk

    @smoke @openRisk @regression @openRiskSaveandClose
    Scenario: Validate the Open Risk functionality with Save and Close
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk Open the PublishTo value "Project"
    # And User select add Risk likelihood " Low "
    # And User select add Risk Impact " Medium "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Risk

    @smoke @openRisk @regression @openRiskAllTabs
    Scenario: Validate the Open Risk functionality with all the tabs
    When User input add Risk Title "BugTest01"
    And User select add Risk Project " All Company | COMPANY "
    And User select add Risk Owner " Terry Rosberry | RES009 "
    And User select add Risk the Status value "Open"
    And User select add Risk Date identified with 0 days
    And User select add Risk Impact Date with 5 days
    And User select add Risk Open the PublishTo value "Project"
    # And User select add Risk likelihood " Low "
    # And User select add Risk Impact " Medium "
    And User input add Risk Description "Found Bug"
    And User click on add Risk Solution
    And User input add Risk Solution "Retest Bug"
    And User click on add Risk Mitigation Plan items
    And User click on add Risk add Mitigation Plan items
    And User select add Mitigation Type "Issue Resolution"
    And User input add Mitigation Owner "Paula Morris | RES001"
    And User select add Mitigation Status "Open"
    And User select add Mitigation Due Date 0 days
    And User input add Mitigation Step "Step Mitigation"
    And User input add Mitigation Description "Description Mitigation"
    And User input add Mitigation On Time "On Time Mitigation"
    And User select add Mitigation Priority "Low"
    And User click add Mitigation add Button
    And User click on add Risk Notes 
    And User click on add Risk Add Note
    And User input add Risk add Note Title "Add Risk notes"
    And User input add Risk add Note Detail "Add Risk notes details"
    And User click on add Risk add Note Add button
    And User click on add Risk Attachements
    And User click on add Risk add Documents
    And User upload on add Risk add Documents File 
    And User input add Risk add Documents Description "Add documents Description"
    And User input add Risk add Documents save button
    And User click on Save and Close
    Then User successfully added the new Risk

    @smoke @openRisk @regression @openRiskClose
    Scenario: Validate the Open Risk functionality with Close
    When User click on Close
    Then User successfully closed the Risk

    @smoke @openRisk @regression @openRiskXMark
    Scenario: Validate the Open Risk functionality with X Mark
    When User click on XMark
    Then User successfully closed the Risk

    @smoke @openRisk @regression @openRiskSaveDisabled
    Scenario: Validate the Open Risk functionality with save button disabled
    When User able to verify save button is diabled
    Then User successfully verify diabled buttons

    @smoke @openRisk @regression @openRiskSaveandCloseDisabled
    Scenario: Validate the Open Risk functionality with save and button disabled
    When User able to verify save and close button is diabled
    Then User successfully verify diabled buttons