
@tag
Feature: Testing the Home Page  of  Ds Algo application
 
 Scenario: To validate the Home Page
    Given    User enters the  URL 
    Then    User should be able to navigate to  the home page and   see the text-Preparing for the Interviews You are at the right place
    And      User should see the Get  Started button  
    
    Scenario: Testing the Get Started button on the homepage
    Given   User opens the homepage  
    When    User Clicks on Get Started
    Then    Home Page is displayed with the all the seven datastructure modules 
    And     User should also  see the Register and Sign in links 
    And    User should be able to see the datastructures  dropdown
   
  Scenario: To validate the DataStructures dropdown menu
    Given   User is on the homepage
    When    User Clicks on the datastructures dropdown menu
    Then    All the six  datastructure modules should be  displayed
    
    Scenario: To validate Get Started button for every module without sign in 
    Given     User is on the homepage 
    When      User clicks on the Get Started button on any of the module
    Then      It should alert the user with the message-You are not logged in  
    
    Scenario:  To validate the Sign in button
    Given   User is on the Home Page 
    When    User clicks on  the Sign in button 
    Then    User gets redirected to the Sign in page and see the username field and password field
    And     User should be able to see the message If you don't have an account, please Register!
    
    Scenario: To validate the Register button
    Given     User is on homepage 
    When      User clicks on the Register button
    Then      User is redirected on the Register Page  and should be able to see the Register button
    


    
