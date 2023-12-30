@DSALGO
Feature: Testing the Sign In functionality of Ds Algo application

  Background: 
    Given User enters homepage url
    When User Clicks on Get Started button
    And User clicks on the Sign in link
	
	@Sip1
  Scenario Outline: To validate successfull login message by entering valid username and password
    And Type Valid <Username> and <Password>
    And Clicks on Login
    Then You are logged in message should be displayed

    Examples: 
      | Username  | Password       |
      | Achievers | 34dfSnRzx@QaRH |

	@Sip2
  Scenario Outline: To validate unsuccessfull login message by entering invalid username and password combinations
    And Types Invalid <Username> and <Password>
    And Clicks on Login
    Then It should display a alert message: <alertmessage>

    Examples: 
      | Username   | Password        | alertmessage                  |
      | Achievers1 | 34dfSnRzx@QaRH1 | Invalid Username and Password |

	@Sip3
  Scenario Outline: To validate unsuccessfull login message by entering valid username and invalid password
    And The user Enters valid <Username> and invalid <Password>
    And Clicks on Login
    Then It should display a alert message: <alertmessage>

    Examples: 
      | Achievers | 34dfSnRzx@QaRH1 | Invalid Username and Password |

	@Sip4
  Scenario Outline: To validate unsuccessfull login message by entering invalid username and valid password
    And Types Invalid <Username> and valid<Password>
    And Clicks on Login
    Then It should display a alert message: <alertmessage>

    Examples: 
      | Username   | Password       | alertmessage                  |
      | Achievers1 | 34dfSnRzx@QaRH | Invalid Username and Password |

	@Sip5
  Scenario: To validate Login button providing blank username and password
    And Clicks on Login
    Then Please fill out this field message should be displayed for username field

	@Sip6
  Scenario: To validate Login button providing blank username and valid password
    And Clicks on Login
    Then Please fill out this field message should be displayed for username field

	@Sip7
  Scenario: To validate Login button providing valid username and blank password
    And Clicks on Login
    Then Please fill out this field message should be displayed for password field
