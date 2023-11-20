Feature: Search and place order for products

  Scenario Outline: Search Experience for product searching bot home and Offer page
    Given user is on the correct website
    When user searched with shortname <Name> and extracted actual name of product
    Then user searhed for same <Name> in offers page to check if the product exists
    And validate product name matches with landing page

    Examples:
      | Name  |
      | Tom  |
      | Straw |