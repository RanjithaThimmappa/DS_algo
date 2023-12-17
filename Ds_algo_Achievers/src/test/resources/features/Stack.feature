@Stack
Feature: Testing Stack datastructue functionality of Ds Algo application

  Background: 
    Given User enters homepage url
    When User signs In to the application
    And User Clicks on Get Started button of Stack datastructure
 @ST2
  Scenario Outline: to validate three links present in the stack page
    Then User lands on Stack page and user should be able to see three <links> under topics covered

    Examples: 
      | Links               |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: to validate Operations in stack link in the stack page by entering valid code
    And user clicks on "<Link>" in stack link
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

    Examples: 
      | Link                |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: to validate Operations in stack link in the stack page by entering invalid code
    And user clicks on "<Link>" in stack link
    And User clicks on Try here button
    And User enters python code with syntax errors
    And User clicks on Run button
    Then User must be able to see the syntax error alert

    Examples: 
      | Link                |
      | Operations in Stack |
      | Implementation      |
      | Applications        |

  Scenario Outline: to validate Practice questions in the stack page
    And user clicks on "<Link>" in stack link
    And User clicks on Practice Questions Link
    Then User must be redirected to Practice page

    Examples: 
      | Link                |
      | Operations in Stack |

  @stack3
  Scenario Outline: Testing other topics
    And user clicks on "<Link>" in stack link
    And User clicks on Applications option
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

    Examples: 
      | Link         |
      | Applications |

  Scenario: Testing dropdown to select Stack page
    When User clicks on Data Structures drop down
    And User clicks on Stack option
    Then User should be redirected to Stack page
