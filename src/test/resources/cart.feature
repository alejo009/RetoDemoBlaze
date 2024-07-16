#language en
Feature: Cart Operations
  Scenario Outline: Add a product
    Given that "user" has opened the store
    When he select the product from the section
      | categories      | product        |
      | <user_category> | <user_product> |
    And he adds the product to the cart with
    Then he should see the added product in the cart

    Examples:
      | user_category | user_product      |
      | Phones        | Samsung galaxy s6 |
      | Phones        | Nokia lumia 1520  |
      | Laptops       | Sony vaio i5      |
      | Laptops       | MacBook air       |
      | Monitors      | Apple monitor 24  |
      | Monitors      | ASUS Full HD      |

