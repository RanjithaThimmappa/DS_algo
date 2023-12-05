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
Feature: DataStructure 
  

  @DS1
  Scenario: Checking the Get StartButton functionality
    Given The user is in the Home page after logged in
    When The user clicks  "Get Started" button below the "Data structures-Introduction" 
    Then The user should land in "Data Structures- Introduction Page" 
  

  @DS2
  Scenario: Checking the Time Complexity button functionality
    Given The user is in the Data structures-Introduction page
    When The user clicks "Time Complexity" button
    Then The user should be redirected to "time complexity" of Data structures-Introduction

  @DS3
  Scenario: Checking the Practice Question button functionality
    Given The user is in the Time Complexity page of Data structures-Introduction page
    When  The user clicks the "Practice Questions" button
    Then The user should be redirected to "Practice Questions" of Data structures-Introduction


  @DS4
  Scenario: Checking the Practice Question button functionality
    Given The user is in the practice Question page of Data structures-Introduction page
    When  The user clicks "Try Here" button
    Then The user should be redirected to a page having an tryEditor with a Run button to test