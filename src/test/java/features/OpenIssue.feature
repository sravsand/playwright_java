Feature: Open Issue feature

  Background: 
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the issues tab
    And User click on the ellipsis button
    And User click on the Open button

  @smoke @openissue @regression @openissueSave
  Scenario: Validate the Open Issue functionality with Save
    When User input Title "OpenIssue"
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
    And User click on Save
    Then User successfully added the new Issue

    @smoke @openissue @regression @openissueSaveAndClose
  Scenario: Validate the Open Issue functionality with Save and Close
    When User input Title "OpenIssue15"
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

    @smoke @openissue @regression @openissueClose
    Scenario: Validate the Open Issue functionality with Close
    When User click on Close
    Then User successfully closed the Issue

    @smoke @openissue @regression @openissueXMark
    Scenario: Validate the Open Issue functionality with X Mark
    When User click on XMark
    Then User successfully closed the Issue
    
