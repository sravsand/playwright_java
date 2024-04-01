Feature: Edit Issue feature

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
    

  @smoke @Editissue @regression @editIssueSave @smoke1
  Scenario: Validate the Edit Issue functionality with save issue
    When User click on the Edit button
    And User input Edit issue Titile "Edit title"
    And User input Edit issue Status "Open"
    And User input Edit issue PublishTo "Portfolio | 3"
    And User click on Contingency Edit issue
    And User input Contingency Edit issue "Issue Edit"
    And User click on Apply Contingency Edit issue
    And User select Severity Edit issue "Medium"
    And User select Expected Resolution Date Edit issue
    And User select Resolution Progress Edit issue "Improving"
    And User click on Edit issue Details
    And User input Edit issue Details "Issue Edit"
    And User click on Apply Details edit issue
    Then User Successfully saved the Edit issue

 @smoke @Editissue @regression @editssueCancel @smoke1
  Scenario: Validate the edit Issue Cancel button functionality 
    When User click on the Edit button
    And User need to Cancel the Edit issue
    Then User Successfully Canceled the Edit issue
