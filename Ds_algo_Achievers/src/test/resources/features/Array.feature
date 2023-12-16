@tag
Feature: User Navigation to Array page
  
  

  Background: User is Signed-in.
    Given User enters homepage url
    When User signs In to the application
    And Click on the Get Started button for Array  Datastructures

  @tag2
  Scenario Outline: Checking the Topics Covered
    When The User clicks on "<name>" link
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

    Examples: 
      | name                      |
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |

  @tag3
  Scenario: User select Arrays from the drop down menu to load Array Page
    When The user select Arrays from the drop down menu
    Then The user should be navigated to the Array Page

  @tag4
  Scenario Outline: Testing Practice Questions link
    When User clicks on "<name>"  link
    And User clicks on Practice Questions Link
    Then User must be redirected to Practice page

    Examples: 
      | name                      |
      | Arrays in Python          |
      | Arrays Using List         |
      | Basic Operations in Lists |
      | Applications of Array     |
