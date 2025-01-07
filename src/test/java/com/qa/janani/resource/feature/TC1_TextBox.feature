Feature: Elements Functionality

 

  Scenario Outline: Validate each function in elements
    Given the user is on the Home page
    When the user selects the Elements menu
    Then the user clicks the TextBox
    And the user enters the values "<Name>", "<Email>", "<CurrentAddress>", "<PerAddress>"
    Then user Sumbit the details
    And user Validate the outcome

  Examples:
    | Name   | Email            | CurrentAddress | PerAddress  |
    | Janani | j123@gmail.com    | 44, Elanghs    | Chennai     |
    | Krish | j123@gmail.com    | 44, Elanghs    | Chennai     |

    