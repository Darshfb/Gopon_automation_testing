Feature: Edit account details
  @happyScenario
  Scenario: Edit Account Successfully
    Given User opens home page
    When User fill email "mostafatesterabc@gmail.com" and password "AB123456" to can login
    Then User should navigate to home page
    And User goes to my account page
    And User fill his new data and update his data