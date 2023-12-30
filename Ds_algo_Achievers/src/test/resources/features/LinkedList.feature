@DSALGO
Feature: User validating the various features of Linkedlist modules

  Background: User is Signed-in.
    Given User enters homepage url
    When User signs In to the application
    And User Clicks on the Get Started button for Linkedlist Page

  @LL1
  Scenario Outline: Checking the Linkedlist Links
    When The User clicks on "<name>" link for Linkedlist Page
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

    Examples: 
      | name                            |
      | Introduction                    |
      | Creating Linked LIst            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |

  @LL2
  Scenario: Testing Try Editor page with incorrect code.
    When User clicks on Introduction link
    And User clicks on Try here button
    And User enters incorrect  code
    And User clicks on Run button
    Then User must be able to see the alert message

  @LL3
  Scenario: Testing the dropdown for the Linkedlist
    When The user select Linkedlist from the drop down menu
    And The user clicks on the Linkedlist
    Then The user should be navigated to the Linkedlist Page

  @LL4
  Scenario Outline: Testing Practice Questions for LinkedList
    When User clicks on Linkedlist Introduction link
    And User on the linkedlist Introduction Page and clicks on Practice Questions Link
    Then User must be redirected to Practice page for Linkedlist Introduction
