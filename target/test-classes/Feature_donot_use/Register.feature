@Regression
Feature: Verify user able to register as new user

  Background: 
    Given User click on login link
    And User click on Register button

  Scenario: Verify user able to register new user successfully
    When User enter the first name as "vinoth kumar" Last name as "Kumar" user name as "vinoth08" password as "Spring*123" and conform password as "Spring*123" and click Register button
    Then user register successfully

  Scenario: Verify user not able to register with duplicate user
    When User enter the first name as "vinoth kumar" Last name as "Kumar" user name as "vinoth08" password as "Spring*123" and conform password as "Spring*123" and click Register button
    But user register not successfully
