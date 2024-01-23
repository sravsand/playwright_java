Feature: Export Issue feature

  Background: 
    Given User is on the login page
   

  @smoke @exportissue @regression 
  Scenario: Validate the add Issue functionality with Save
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the issues tab
    And User click on the export button
    And User successfully exported the issue