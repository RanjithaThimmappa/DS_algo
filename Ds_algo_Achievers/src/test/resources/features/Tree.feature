Feature: Testing Tree Module in DS Portal.

  Background: User is Signed-in.
    Given User is on the sign-in page
    When User enters username and password
    And User clicks on Login button
    And User clicks on Tree page - GetStarted button

  Scenario Outline: Testing Various links.
    When User clicks on <pageName> link
    Then The user should be directed to the <pageName> page

    Examples: 
      | pageName                       |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementtion in Python        |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Applications of Binary Trees   |
      | Binary Search Trees            |
      | Implementation of BST          |

  Scenario Outline: Testing Various Try Editors.
    When User clicks on <pageName> link
    And User clicks on Try here button
    And User enters correct python code
    And User clicks on Run button
    Then User must be able to see the program output below the Run button

    Examples: 
      | pageName                       |
      | Overview of Trees              |
      | Terminologies                  |
      | Types of Trees                 |
      | Tree Traversals                |
      | Traversals-illustration        |
      | Binary Trees                   |
      | Types of Binary Trees          |
      | Implementtion in Python        |
      | Binary Tree Traversals         |
      | Implementation of Binary Trees |
      | Applications of Binary Trees   |
      | Binary Search Trees            |
      | Implementation of BST          |

  Scenario: Testing dropdown to load Tree page
    When User clicks on Data Structures drop down
    And User clicks on Tree option
    Then User should be redirected to Tree page

  Scenario: Testing Practice Questions link
    When User clicks on Overview of Trees link
    And User clicks on Practice Questions Link
    Then User must be redirected to Practice page
