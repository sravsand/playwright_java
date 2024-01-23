Feature: Copy Issue feature

  Background: 
    Given User is on the login page
    When User input username "SANDEEP@WORKFLOWS.KI"
    And User input password "KatalonSelenium@123"
    And User click on the login button
    Then User successfully logged in
    And User should see the home page
    And User click on the projects menu
    And User click on the issues tab

  @smoke @copyissue @regression @copyIssueCopy 
  Scenario: Validate the copy Issue functionality
    When User click on the copy issues button
   And User input source Project copy issue "SandProj"
    And User input destination Project copy issue "Super Company"
    And User click Include Resolution Plan Items
    And User select Set all Issue Created Dates
    Then User click of copy issue button 
    And User successfully copied the issue

   @smoke @copyissue @regression @copyIssueWithOutSourceProject
   Scenario: Validate the copy Issue functionality without required fields 
    When User click on the copy issues button
    Then User click of copy issue button 
    And User not able to copy the issue

    @smoke @copyissue @regression @copyIssueCancel
    Scenario: Validate the copy Issue functionality cancel button 
    When User click on the copy issues button
    Then User click on Cancel issue button 
    And User successfully cancelled the copy issue

    @smoke @copyissue @regression @copyIssueXMark
    Scenario: Validate the copy Issue functionality X Mark button 
    When User click on the copy issues button
    Then User click on X Mark Cancel issue button 
    And User successfully cancelled the copy issue