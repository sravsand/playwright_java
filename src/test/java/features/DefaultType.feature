Feature: Default Type feature

  Background:
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page

  @smoke @defaultType @regression @copyIssueCopy
  Scenario: Validate Add button Functionality
    When User navigate to the default type page
    And  verify header text of the default type page
    When User select all dropdown option and verify the add button visibility


  @smoke @defaultType @regression @copyIssueCopy @addDefaultType
  Scenario: Validate Add Default type functionality
    When User click on the setting
    Then User should see the Configuration page
    When User click on the Default type page
    Then User could see the Default type page
    When Add default data type details and verify default type is added