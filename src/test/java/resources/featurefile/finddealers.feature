Feature: Find the dealers and verify

  Background: I am on homepage
    And  I mouse hover on buy+sell tab for finddealers

  @smoke
  Scenario Outline: Find the dealers and verify the dealers are in list
    When I click ‘Find a Dealer’
    Then I navigate to ‘car-dealers’ page
    And I should see the dealer names "<dealersName>" are display on page

    Examples:
      | dealersName           |
      | 3 Point Motors Epping |
      | 365 CAR SALES         |
      | 3MT True Value Auto   |
      | 4B4 Warehouse         |




