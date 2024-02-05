Feature: Add item to cart
  @happyScenario
  Scenario: Add item to cart and checkout
    Given User opens home page
    When User fill email "mostafamahmoudaboads@gmail.com" and password "AB123456" to can login
    Given User opens home page
    When Select item
    Then Add Item to cart
    Then Select cash payment method
    And Press checkout


