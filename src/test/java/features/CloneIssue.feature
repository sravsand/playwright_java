Feature: Clone Issue feature

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
    And User click on the Clone button

  @smoke @cloneissue @regression @cloneissueSave
  Scenario: Validate the Clone Issue functionality with Save
    When User input Title "DefectClone"
    And User select Project "All Company"
    And User select Owner " Terry Rosberry | RES009 "
    And User select the Status value "Open"
   And User select AssociatedRisk value "SandRisk12"
    And User select the PublishTo value "Project"
   And User select Severity "Medium"
    And User select Expected Resolution Date value 5 days
   And User select Resolution Progress "Improving"
    And User input Description "Found Bug"
    And User click on Solution
    And User input Solution "Retest Bug"
    And User click on Save
    Then User successfully added the new Issue

    @smoke @cloneissue @regression @cloneissueSaveAndClose
  Scenario: Validate the Clone Issue functionality with Save and Close
    When User input Title "DefetcClone15"
    And User select Project "All Company"
    And User select Owner " Terry Rosberry | RES009 "
    And User select the Status value "Open"
   And User select AssociatedRisk value "risk6"
    And User select the PublishTo value "Project"
   And User select Severity " Medium "
    And User select Expected Resolution Date value 5 days
   And User select Resolution Progress " Improving "
    And User input Description "Found Bug"
    And User click on Solution
    And User input Solution "Retest Bug"
    And User click on Save and Close
    Then User successfully added the new Issue

    @smoke @cloneissue @regression @cloneissueClose
    Scenario: Validate the Clone Issue functionality with Close
    When User click on Close
    Then User successfully closed the Issue

    @smoke @cloneissue @regression @cloneissueXMark
     Scenario: Validate the Clone Issue functionality with X Mark
    When User click on XMark
    Then User successfully closed the Issue
