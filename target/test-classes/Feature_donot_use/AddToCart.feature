@Regression
Feature: add to cart book

  Scenario Outline: Verify user able to add multiple books in cart
    Given User click on login link
    And Enter the username as "Vinoth02" and password as "Spring*123"
    And click login button
    When User search the book "<Book name>" in the search bar and select the suggested options
    When User clik the add to cart button in the search result
    Then Verify books are added in the cart list

    Examples: 
      | Book name            |
      | A Dance with Dragons |
      | Roomies              |
      | The Simple Wild      |
      | The Hookup           |
      | Catching Fire        |
