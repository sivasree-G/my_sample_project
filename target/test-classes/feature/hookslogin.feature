#Feature: feature to test login functionality
#@smoketest
  #Scenario Outline: Check login is successful with valid credentials
    #Given user is on login page
    #When user enters valid  "<email>" and valid "<password>"
    #And clicks on login button
    #Then user is navigated to language select page
  #Examples:
  #|email |password|
  #|sivasreegovindaraj@gmail.com|SIVAKAVI|
  #Scenario Outline: Check login is successful with invalid credentials
    #Given user is on login page
    #When user enters valid  "<email>" and valid "<password>"
    #And clicks on login button
    #Then user is navigated to language select page
  #Examples:
  #|email |password|
  #|sivasreegovindaraj@gmail.com|SIVAKAVI1|