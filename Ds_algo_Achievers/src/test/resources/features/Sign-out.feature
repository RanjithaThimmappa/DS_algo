
@SignOut
Feature: Testing the Sign Out functionality of Ds Algo application

Background:

		Given User enters homepage url
    When User Clicks on Get Started button 


  	Scenario: To validate Signout link when user is not logged in
    Then User is not able to see Signout Link Text

  
   Scenario Outline: To validate Signout link when user is logged in
    And User clicks on the Sign in link
    And Enters <Username> and <Password>
    And Clicks on Login 
    And User should be able to see SignOut button and click on it 
    Then  Logged out successfully text should be displayed

 Examples:
 		| Username  | Password  |
 		|Achievers  | 34dfSnRzx@QaRH |
 		
 		 Scenario: To validate Get Started button when user is not logged in
 		 Then clicks on Get Started button from any of the datastaructures then You are not logged in text should be displayed
 		
 		