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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: 
    Given The user is in the Array page after logged in
    When The user clicks "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" page
   

  @tag2
  Scenario Outline: Title of your scenario outline
    Given The user is in the Arrays in Python page after logged in
    When  The user clicks "Try Here" button in Arrays in Python page
    Then  The user should be redirected to a page having an tryEditor with a Run button to test

 @tag3
  Scenario: 
    Given The user is in the Array page after logged in
    When The user clicks "Arrays using List" button
    Then The user should be redirected to "Arrays using List" page
    
    
  @tag4
  Scenario: 
    Given The user is in the Arrays using List page after logged in
    When  The user clicks "Try Here" button in Arrays using List page
    Then   The user should be redirected to a page having an tryEditor with a Run button to test   
    
    
  @tag5
  Scenario: 
    Given The user is in the Array page after logged in
    When  The user clicks "Basic Operations in List" button
    Then  The user should be redirected to "Basic Operations in List" page  
    
  @tag6
  Scenario: 
    Given The user is in the Basic Operations in List page after logged in
    When  The user clicks "Try Here" button in Arrays using List page
    Then  The user should be redirected to a page having an tryEditor with a Run button to test
    
  @tag7
  Scenario:  
    Given The user is in the Array page after logged in
    When The user clicks "Applications of Array" button
    Then The user should be redirected to "Applications of Array" page
    
   @tag8
  Scenario:  
    Given The user is in the Applications of Array page after logged in
    When The user is in the Applications of Array page after logged in
    Then The user should be redirected to a page having an tryEditor with a Run button to test
     
    
     
  @tag9
  Scenario:  
    Given The user is in the Array page after logged in
    When The user clicks "Practice Questions" button
    Then The user should be redirected to "Practice" page
      
  @tag10 
  Scenario:  
    Given The user is in the Practice page
    When  The user clicks the "Search the array" link
    Then  The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
     
     
  @tag11
  Scenario: 
  Given The user is in the Practice page
  When The user clicks the "Max Consecutive Ones" link
  Then The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
    
  @tag12
  Scenario: 
  Given The user is in the Practice page
  When The user clicks "Find Numbers with Even Number of Digits" link
  Then  The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
 
    
  @tag13
  Scenario: 
  Given The user is in the Practice page
  When  The user clicks "Squares of a  Sorted Array" link
  Then  The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
       
      