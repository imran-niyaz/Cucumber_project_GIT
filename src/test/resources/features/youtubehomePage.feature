
Feature: Youtube Verification


  @wip
  Scenario: Verify Youtube Search Box
    Given User is on Youtube HomePage
    When User Enters any name in Search-box
    Then System should display related videos with that name
