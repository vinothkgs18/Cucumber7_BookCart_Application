#@Regression
Feature: Verify login functionality with all posible scenario

  Scenario: Verify login func with valid credential
   Given User click on login link on header page
    When Enter the username as "Vinoth01" and password as "Spring*123" and click login button
    Then user login successfully

  
  
