Feature: Login feature

  Background: 
    Given User is on the login page

  @smoke @login
  Scenario: Login to the KeyedIn Portal with valid credentials
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    
  @login @negative
  Scenario Outline: User try to login invalid credentials
    When User input username <username>
    And User input password <password>
    And User click on the login button
    And User should see an error message <error_message>
    Examples:
      | username        | password       | error_message                                                               |
      | "standard_user" | "secret"  | "Invalid User ID, Password or IP Address" |
      | "standard_user" | ""             | "Invalid User ID, Password or IP Address"                                        |
      | ""              | "secret_" | "Invalid User ID, Password or IP Address"                                        |
      | ""              | ""             | "Invalid User ID, Password or IP Address"                                        |
      | "standarduse"   | "secret_" | "Invalid User ID, Password or IP Address" |
      | "standarduse"   | "secret"  | "Invalid User ID, Password or IP Address" |
