
Feature: Verify User register functionality

  @Regression
  Scenario Outline: Verify User can register sussessfully
    Given User click on login link on header page
    And User click on register button in login page
    When User enter the "<Firstname>" "<Lastname>" "<Username>" "<Password>" and click register button
    Then Verify user register successgully

    Examples: 
      | Firstname | Lastname | Username      | Password |
      | eeeed4    | yyyyd4   | aabbbdyy12344 | Admin123 |
      | eeeed2    | yyyyd2   | aabbbdyy12342 | Admin123 |
      | eeeed3    | yyyyd3   | aabbbdyy12343 | Admin123 |

  #@Regression
  Scenario: Verify User can register sussessfully with random data
    Given User click on login link on header page
    And User click on register button in login page
    When User enter the first name last name user name and password as random data and click register button
    Then Verify user register successgully

   @Regression
  Scenario: Verify user able to create new User with data table
    Given User click on login link on header page
    And User click on register button in login page
    When User enter the all required field
      | FirstName | LastName | UserName | Password   |
      | First01   | Last01   | first01  | Admin@1234 |
      | First02   | Last02   | first02  | Admin@1234 |
    Then Verify user register successgully
