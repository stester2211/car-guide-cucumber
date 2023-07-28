Feature: Search functionality

  Background: I am on homepage
    And  I mouse hover on buy+sell tab

  @smoke
  Scenario Outline: Search the buy car with model
    When I click ‘Search Cars’ link
    Then I navigate to ‘new and used car search’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<makeResult>" in results

    Examples:
      | make       | model    | location            | price    | makeResult |
      | Audi       | A4       | NSW - All           | $35,000  | Audi       |
      | BMW        | 1 Series | ACT - All           | $80,000  | BMW        |
      | Alfa Romeo | 147      | NSW - Central Coast | $45,000  | Alfa Romeo |
      | Ford       | Capri    | NSW - Central West  | $60,000  | Ford       |
      | Honda      | Accord   | NSW - All           | $90,000  | Honda      |
      | Hyundai    | Elantra  | NSW - Central West  | $150,000 | Hyundai    |

  @sanity
  Scenario Outline: Search the used car with model
    When I click ‘Used’ link
    Then I navigate to ‘Used Cars For Sale’ page
    And I select make "<make>"
    And I select model "<model>"
    And I select location "<location>"
    And I select price "<price>"
    And I click on Find My Next Car tab
    Then I should see the make "<makeResult>" in results

    Examples:
      | make       | model    | location            | price    | makeResult |
      | Audi       | A4       | NSW - All           | $35,000  | Audi       |
      | BMW        | 1 Series | ACT - All           | $80,000  | BMW        |
      | Alfa Romeo | 147      | NSW - Central Coast | $45,000  | Alfa Romeo |
      | Ford       | Capri    | NSW - Central West  | $60,000  | Ford       |
      | Honda      | Accord   | NSW - All           | $90,000  | Honda      |
      | Hyundai    | Elantra  | NSW - Central West  | $150,000 | Hyundai    |

