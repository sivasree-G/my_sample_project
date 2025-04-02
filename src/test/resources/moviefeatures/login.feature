Feature:test login functionality
Description:This feature will test the login functionality


@smoke
 Scenario: Check login is successful with valid credentials
    Given user is on sunntx login page
    When user enters valid  "<email>" and valid "<password>"
    And clicks on login button
    Then user is navigated to language select page
  
  Examples:
  | email                           | password  |
  | sivasreegovindaraj@gmail.com | SIVAKAVI   |
@negative
 Scenario: Check login is successful with invalid credentials
    Given user is on sunntx login page1
    When user enters valid  "<email>" and invalid "<password>"
    And clicks on login button1
    Then user is not navigated to language select page1

  Examples:
  | email                           | password  |
  | sivasreegovindaraj@gmail.com | SIVAKAVI1   |
  
  
@negative1
Scenario: Check login is successful with valid credentials
    Given user is on sunntx login page2
    When user enters invalid  "<email>" and valid "<password>"
   And clicks on login button2
    Then user is not navigated to language select page2
 
  Examples:
  | email                           | password  |
  | sivasreegovindaraj@gmail.com.wwwww | SIVAKAVI   |
  