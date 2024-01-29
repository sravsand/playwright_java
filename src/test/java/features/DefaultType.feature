Feature: Deafault Type feature

  Background:
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page

  @smoke @defaultType @regression4 @copyIssueCopy
  Scenario: Validate Add button Functionality
    When User navigate to the default type page
    And  verify header text of the default type page
    When User click on the different type of dropdown