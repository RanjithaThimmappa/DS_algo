#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@DataStructure
Feature: Testing the Data Structure feature functionality

  Background: The user is Signed in
    Given The user is on Sign In page
    When The user enters username and password
    And User clicks on the login button
    Then The user is in the home page where user is able to see the Signout button of the user

  @DS1
  Scenario: Checking the Get StartButton functionality
    When The user clicks  Get Started button below the Data structures-Introduction
    Then The user should land in Data Structures- Introduction Page

  @DS2
  Scenario: Checking the Time Complexity button functionality
    When The user clicks Time Complexity button
    Then The user should be redirected to time complexity of Data structures-Introduction page

  @DS3
  Scenario: Checking the functionality of Try here button
    When The user clicks the Try Here button
    Then The user is redirected to the Try Editor page
    And The user clicks the Run button

  @DS4
  Scenario: Checking the Practice Question button functionality
    Given The user navigate back to the Time complexity page
    When The user clicks the Practice Questions button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
