@happyScenario
Feature: UserLoginSuccessfully

  Scenario: To login with valid data
    Given User opens home page
    When User fill email "mostafamahmoudaboads@gmail.com" and password "AB123456" to can login
    Then User should navigate to home page

  @unHappyScenario
  Scenario: To login with invalid data
    Given User opens home page
    When User fill email "mostafamahmoudaboad@gmail.com" and password "AB123456" to can login
    Then User can't log in

