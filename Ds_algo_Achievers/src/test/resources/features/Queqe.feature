@tag
Feature: Queue Feature

  Background: The user is Signed in
    Given User enters homepage url
    And User signs In to the application
    And The user clicks GetStarted button below the Queue

  @Q1
  Scenario Outline: Testing different Links in Queue Page
    When The user clicks the <PageName> link
    Then The user should be directed to the <PageName> page

    Examples: 
      | PageName                               |
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @Q2
  Scenario Outline: Testing different Try Here button  under queue
    When The user clicks the <PageName> link
    And The user should be directed to the <PageName> page
    And User clicks on Try here button
    Then The user should be directed to the TryEditor Page

    Examples: 
      | PageName                               |
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @Q3
  Scenario Outline: Testing different Try Editor page under queue
    When The user clicks the <PageName> link
    And The user should be directed to the <PageName> page
    And User clicks on Try here button
    And The user should be directed to the TryEditor Page
    And The user enter the python script
    And User clicks on Run button
    Then The user is able to see the output of the code

    Examples: 
      | PageName                               |
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @Q4
  Scenario Outline: Testing different Try Editor page under queue by giving Wrong syntax
    When The user clicks the <PageName> link
    And The user should be directed to the <PageName> page
    And User clicks on Try here button
    And The user should be directed to the TryEditor Page
    And The user enters the wrong python script
    And User clicks on Run button
    Then The user is able to see the errormessage in the page

    Examples: 
      | PageName                               |
      | Implementation of Queue in Python      |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |

  @Q5
  Scenario: Testing the practice question link in Implementation of queue in python page
    When The user clicks the Implementation of Queue in Python link
    And The user clicks the practice Question link
    Then The user should be directed to the Practice Question Page

  @Q6
  Scenario Outline: Testing different Links in Implementaion of Queue in Python page under queue
    When The user clicks the Implementation of Queue in Python link
    And The user clicks the link <PageName>
    And The user redircted to the page <PageName>
    And User clicks on Try here button
    And The user should be directed to the TryEditor Page
    And The user enter the python script
    And User clicks on Run button
    Then The user is able to see the output of the code

    Examples: 
      | PageName                               |
      | Implementation using collections.deque |
      | Implementation using array             |
      | Queue Operations                       |
