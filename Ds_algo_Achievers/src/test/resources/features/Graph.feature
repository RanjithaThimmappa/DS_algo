@Graph
Feature: Testing Graph Module in DS Portal.

  Background: User is Signed-in.
    Given User enters homepage url
    When User signs In to the application
    And User clicks on Graph - GetStarted button

  @GP1
  Scenario Outline: Testing Various links.
    When User clicks on <pageName> link
    Then The user should be directed to the <pageName> link page

    Examples: 
      | pageName              |
      | Graph                 |
      | Graph Representations |

  Scenario Outline: Testing Various Try here links.
    When User clicks on <pageName> link
    And User clicks on Try here button
    Then User should be redirected to Try Editor Page

    Examples: 
      | pageName              | 
      | Graph                 |
      | Graph Representations |

  Scenario: Testing Try Editor page with correct syntax.
    When User clicks on Graph link
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

  Scenario: Testing Try Editor page with wrong syntax.
    When User clicks on Graph link
    And User clicks on Try here button
    And User enters python code with syntax errors
    And User clicks on Run button
    Then User must be able to see the syntax error alert

  Scenario: Testing dropdown to load Graph page
    When User clicks on Data Structures drop down
    And User clicks on Graph option
    Then User should be redirected to Graph page

  Scenario: Testing Practice Questions link
    When User clicks on Graph link
    And User clicks on Practice Questions Link
    Then User must be redirected to Practice page
