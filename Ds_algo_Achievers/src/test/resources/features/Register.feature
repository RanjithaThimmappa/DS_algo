@Register
Feature: Testing Register feature in DS Portal.

  Background: User is on the homepage
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on Register link

  @RP1
  Scenario: Register with all fields empty.
    When User clicks on Register button
    Then It should display an error - Please fill out this field
	@RP2
  Scenario: Register with Password and Password Confirmation fields empty.
    When User enters Username leaving other fields empty
    And User clicks on Register button
    Then It should display an error - Please fill out this field

  Scenario: Register with Password Confirmation field empty.
    When User enters Username, Password leaving other fields empty
    And User clicks on Register button
    Then It should display an error - Please fill out this field

  Scenario Outline: Register with different input combinations.
    When The user enters <username> , <password> , <confirm-password>
    And User clicks on Register button
    Then It should display a message: <status>

    Examples: 
      | username   | password  | confirm-password | status                                                  |
      | hw9%j      | Bq6n34rt  | Bq6n34rt         | Please enter a valid username.                          |
      | Jyothsna1  | Bq6n34@.+ | dummy.@          | password_mismatch:The two password fields didn’t match. |
      | Jyothsna1  | Bq6n      | Bq6n             | Password must contain at least eight characters.        |
      | Jyothsna1  | Jyothsna  | Jyothsna         | Password can not be too similar to your username.       |
      | JyothsnaV1 |  12345678 |         12345678 | Password can not be entirely numeric.                   |
      | JyothsnaV1 | Win23@Jan | Win23@Jan        | New Account Created. You are logged in as username.     |
