
Feature: UserLoginSuccessfully
  @debug
  Scenario: To login with valid data
    Given User opens home page
    When User fill email "mostafamahmoudaboads@gmail.com" and password "AB123456" to can login
    Then User should navigate to home page

#    @production
#  Scenario: To login with valid data
#    Given User opens home page
#    When User fill email "mostaf@softlink.com" and password "AB123456" to can login
#    Then User should navigate to home page
#
