Feature: Add Workflow feature

  Background:
  Background:
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page

  @smoke @addWorkFlow @regression @addRiskSave @smoke4
  Scenario: Validate the add workFlow functionality
    When User navigate to the workflow type page
    And  Verify header text of the workflow page
    When User select all type and add the work flow