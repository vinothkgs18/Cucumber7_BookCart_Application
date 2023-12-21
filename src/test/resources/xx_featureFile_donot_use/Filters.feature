
Feature: Verify filters functionality

  Scenario Outline: Verify all failters
    Given User click on filters value "<filterName>"
    When User click on any result
    Then Verify the Catagery that match to the filters value

    Examples: 
      | filterName |
      | Biography  |
