@DSALGO
Feature: Testing the Data Structure feature functionality

  Background: The user is Signed in
    Given User enters homepage url
    And User signs In to the application
    When The user clicks  Get Started button below the Data structures-Introduction
    And The user directed to the DataStructure page and clicks Time Complexity button

  @DS1
  Scenario: Checking the Time Complexity button functionality
    Then The user should be redirected to time complexity of Data structures-Introduction page

  @DS2
  Scenario: Checking the functionality of Try here button
    When The user clicks the Try Here button
    Then The user is redirected to the Try Editor page and user enters the python code

  @DS3
  Scenario: Checking The functionality of Run button
    When The user clicks the Try Here button
    And The user enters the Python script
    And The user clicks the Run button
    Then The user is able to see the output

  @DS4
  Scenario: Checking whethere the error message is showing
    When The user clicks the Try Here button
    And The user enters the wrong python code and clicks Run button
    Then The user is able to see the error message

  @DS5
  Scenario: Checking the Practice Question button functionality
    When The user clicks the Practice Questions button
    Then The user should be redirected to Practice Questions of Data structures-Introduction
