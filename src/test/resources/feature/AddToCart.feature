Feature: User can add the product to cart
  @Regression @smoke
  Scenario: User able to add the item to the card
    Given User can search the book as "The Simple Wild" in header search bar
    When User click on the add to cart button on the search result
    And User can click the Cart icon (trolly icon) on the header
    Then Verify the book "The Simple Wild" title that added in the cart
    And User can clear the cart
