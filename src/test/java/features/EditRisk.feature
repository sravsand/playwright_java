Feature: Edit Risk feature

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
    

  @smoke @EditRisk @regression @EditRiskSave
  Scenario: Validate the Edit Risk functionality with save issue
    When User click on the Edit Risk button
    And User input Edit issue Titile "Edit title"
    And User select Edit Risk Date identified 0 days
    And User input Edit Risk PublishTo "Portfolio | 3"
    And User click on Contingency Edit Risk
    And User input Contingency Edit Risk "Risk Edit"
    And User click on Apply Contingency Edit Risk
    And User select Edit Risk Likelihood "Low"
    And User select Edit Risk Impact "Medium"
    And User input Edit Risk Impact date 0 days
    And User input Edit Risk Status "Open"
    And User click on Edit Risk Details
    And User input Edit Risk Details "Issue Edit"
    And User click on Apply Details edit Risk
    Then User Successfully saved the Edit Risk

 @smoke @EditRisk @regression @EditRiskCancel
  Scenario: Validate the Risk Issue Cancel button functionality 
    When User click on the Edit Risk button
    And User need to Cancel the Edit Risk
    Then User Successfully Canceled the Edit Risk