@tag
Feature: Testing Registration feature in DS Portal.

  @tag1
   Scenario: Register with all fields empty.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user clicks Register button with all fields empty
    Then It should display an error - Please fill out this field - below Username textbox

   Scenario: Register with Password and Password Confirmation fields empty.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user clicks Register button after entering Username with other fields empty
    Then It should display an error - Please fill out this field - below Password textbox
    
    Scenario: Register with Password Confirmation field empty.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user clicks Register button after entering Username and password with Password Confirmation field empty
    Then It should display an error - Please fill out this field - below Password Confirmation textbox
    
    Scenario: Register with invalid Username.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user enters a name with characters other than Letters, digits and @/./+/-/_
    Then It should display an error - Please fill out this field - below Username textbox
    
    Scenario: Register with all fields empty.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user clicks Register button with all fields empty
    Then It should display an error - Please fill out this field - below Username textbox
    
    Scenario: Register with all fields empty.
  
    Given The user opens the Ds Portal
    And The user clicks on Get Started button
    And The user clicks on Register button
    When The user clicks Register button with all fields empty
    Then It should display an error - Please fill out this field - below Username textbox
