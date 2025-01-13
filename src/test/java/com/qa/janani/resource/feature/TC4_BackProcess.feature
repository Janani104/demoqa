Feature: Sauce Logout Process
  @LogoutProcess
  Scenario Outline: TC4 Abort process and logout
    Given user on the Sauce login page
    When user login with visual username "<username>" and password "<password>"
    Then user select the product
    And user remove the product
    Then user check the cart and proceed without any item
    And user back to Home
    And user logout the page
    And user should be on login page
Examples:
|username|password|
|visual_user|secret_sauce|
