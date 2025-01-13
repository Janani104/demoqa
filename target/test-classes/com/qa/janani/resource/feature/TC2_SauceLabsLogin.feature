Feature: User validates the Sauce Labs login page
   @EndToEnd
  Scenario Outline: TC1 Validate the login functionality
    Given the user is on the Home page
    When the user enters the "<username>" and "<password>"
    Then the user clicks the login button
    And the user navigates to the product page
    When the user selects a product from the product list
    And the user clicks on "Add to Cart"
    Then the product should be added to the cart
    And the user navigates to the cart page
    When the user clicks "Back to Products" to continue shopping
    And the user selects another product from the product list
    And the user clicks on "Add to Cart"
    Then the second product should be added to the cart
    And the user checkout the product
    When the user fillup the details "<firstname>","<LastName>","<Postalcode>"
    Then the user order confirmed
    And the validate the order confirmation

  Examples:
    | username        | password        | firstname|LastName|Postalcode|
    | standard_user   | secret_sauce    | Janani| T | 600026|
    
  # # Negative Scenario: Invalid Login
  # Scenario Outline: Validate the login functionality with invalid credentials
  #   Given the user is on the Home page
  #   When the user enters invalid the "<username>" and "<password>"
  #   Then the user clicks the login button
  #   And the user should see an error message

  # Examples:
  #   | username| password        | 
  #   | invalid_user    | wrong_password  |
    

        
    