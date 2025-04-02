Feature: Google search functionality
Background:
 Given browser is open
 And user is on the google page

@smoke
Scenario: Searching correct terms on google
 
  When user enters a correct "<text>" and "<row>" in google search box
  And user clicks first searching terms
  Then user is navigated to next login page
  Examples:
  |text|row|
  |Sheet1|1|

@negative
Scenario: Searching incorrect terms on google
 
  When user enters a incorrect "<text>" and "<row>" in google search box
  And user clicks first searching terms1
  Then user is not navigated to next login page
  Examples:
    | text  |row|
    | sun6785678899900000 |1|

