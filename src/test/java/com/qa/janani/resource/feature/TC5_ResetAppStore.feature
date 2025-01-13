Feature: Reset the Cart
  @Resetcart
  Scenario Outline: TC5 Reset App store
    Given user login the SaucePage
    When user login with username "<username>" and password "<password>"
    Then user select the Product and addtocart
    And user add the product into the cart
    Then user select the menu "ResetAppStore"
    And product should remove from the cart
Examples:
     | username      | password    |
    | standard_user   | secret_sauce    |
    

