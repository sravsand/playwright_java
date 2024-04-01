Feature: Code Converter Issue feature

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
    

  @smoke @codeConverterissue @regression @codeConverterissueConvert @smoke1
  Scenario: Validate the Code Converter Issue functionality
    When User click on the code converter button
    And User input New Code "NEWCODE01"
    And User click on Convert button
    Then User Successfully converted the code

 @smoke @codeConverterissue @regression @codeConverterissueCancel @smoke1
  Scenario: Validate the Code Converter Cancel button functionality 
    When User click on the code converter button
    And User need to Cancel the code converter issue
    Then User Successfully Canceled the code converter issue

@smoke @codeConverterissue @regression @codeConverterissueXMark @smoke1
  Scenario: Validate the Code Converter XMark button functionality 
    When User click on the code converter button
    And User need to click on X Mark on code converter issue
    Then User Successfully Canceled the code converter issue