Feature: User register successfully
  Scenario: User Register with valid email & password
    Given User opens home page
    When User navigate to register page
    Then User fill his data fName "Mostafa", lName "Mahmoud", email "abcdefghighg10023@gmail.com", password "AB123456" and phone 565656
    And Click on register
    Then Navigate to home page

