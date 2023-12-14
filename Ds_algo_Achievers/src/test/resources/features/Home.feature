@homepage
Feature: Testing the Home Page of Ds Algo application

  Background: User is on the homepage
    Given User enters homepage url

  @HP1
  Scenario: To validate the Home Page
    Then User should be able to navigate to the home page and see the text - Preparing for the Interviews You are at the right place
    And User should see the Get Started button

  Scenario: Testing the Get Started button on the homepage
    When User Clicks on Get Started button
    Then Home Page is displayed with the all the seven datastructure modules
    And User should be able to see the Register link
    And User should be able to see the Sign in link
    And User should be able to see the datastructures dropdown

  Scenario: To validate the DataStructures dropdown menu
    When User Clicks on Get Started button
    And User Clicks on the datastructures dropdown menu
    Then All the six datastructure modules should be displayed

  Scenario: To validate Get Started button for every module without sign in
    When User Clicks on Get Started button
    And User clicks on the Get Started button on any of the modules
    Then It should alert the user with the message - You are not logged in

  Scenario: To validate the Sign in link
    When User Clicks on Get Started button
    And User clicks on the Sign in link
    Then User gets redirected to the Sign in page and see the username field and password field
    And User should be able to see the message - If you don't have an account, please Register!

  Scenario: To validate the Register link
    When User Clicks on Get Started button
    And User clicks on the Register Link
    Then User is redirected on the Register Page and should be able to see the Register button
