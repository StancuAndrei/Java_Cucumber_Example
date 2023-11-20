Feature: Place the order for products

  Scenario Outline: Add more items to cart
    Given user is on the correct website
    When user searched with shortname <Name> and extracted actual name of product
    And added "3" items of the selected product to cart
    Then user proceeds to Checkout and validate the <Name> items in checkout page
    And verify user has availability to enter a promo code nad place the order

    Examples:
      | Name  |
      | Tom  |
