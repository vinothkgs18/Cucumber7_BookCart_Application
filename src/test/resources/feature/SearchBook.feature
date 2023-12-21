Feature: Verify search book functionality

  @Regression
  Scenario: User able to search the book through the search bar
    Given User can search the book in header search bar
    When User click on the top of image once search results on the page
    Then Verify book title in the book details page
@Regression
  Scenario Outline: User can search the multiple books
    Given User can search the "<Book>" in header search bar
    When User click on the top of image once search results on the page
    Then Verify "<Book>" title in the book details page

    Examples: 
      | Book                      |
      | Wicked and the Wallflower |
      | Mrs. Everything           |
      | Magic for Liars           |
      |All of Us with Wings|
