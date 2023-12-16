@Regression
Feature: Verify login functionality with all posible scenario

  Scenario: Verify login func with valid credential
   Given User click on login link
    When Enter the username as "Vinoth01" and password as "Spring*123"
    And click login button
    Then user get login successfully

  Scenario: Verify error message while login with invalid credential
    #Given user navigate to application in "chrome"
    Given User click on login link
    When Enter the username as "vinoth05555" and password as "Spring*123"
    And click login button
    But user get error message in login page
