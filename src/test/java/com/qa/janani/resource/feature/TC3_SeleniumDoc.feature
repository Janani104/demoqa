Feature: Sauce Login and Resource Access
  @document
  Scenario Outline: TC2 Login and view selenium document
    Given I am on the Sauce login page
    When I login with username "<username>" and password "<password>"
    And I choose "About" from the menu
  

  Examples:
    | username      | password    |
    | standard_user   | secret_sauce    |

    
