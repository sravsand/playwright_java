Feature: Delete Issue feature

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
    

  @smoke @deleteissue @regression @deleteissueOk @smoke1
  Scenario: Validate the Delete Issue functionality
    When User click on the delete button
    And User need to confirm to delete issue
    Then User Successfully deleted the issue

 @smoke @deleteissue @regression @deleteissueCancel @smoke1
  Scenario: Validate the Delete Issue Cancel button functionality 
    When User click on the delete button
    And User need to Cancel the delete issue
    Then User Successfully Canceled the issue

@smoke @deleteissue @regression @deleteissueCancel @smoke1
  Scenario: Validate the Delete Issue XMark button functionality 
    When User click on the delete button
    And User need to click on X Mark on Delete issue
    Then User Successfully Canceled the issue