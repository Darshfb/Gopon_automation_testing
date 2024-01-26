Feature: User register successfully
  Scenario: User Register with valid email & password
    Given User opens home page
    When User navigate to register page
    Then User fill his data
    And Click on register
    Then Navigate to home page