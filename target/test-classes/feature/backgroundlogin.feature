#@smoketest
#Feature: Login Functionality
#
  #Background:
    #Given user is on login page
#
  #Scenario Outline: Check login is successful with valid credentials
    #When user enters valid "<email>" and valid "<password>"
    #And clicks on login button
    #Then user is navigated to language select page
#
    #Examples:
      #| email                          | password  |
      #| sivasreegovindaraj@gmail.com   | SIVAKAVI  |
#
  #Scenario Outline: Check login is unsuccessful with invalid credentials
    #When user enters invalid "<email>" and invalid "<password>"
    #And clicks on login button
    #Then user should see an error message
#
    #Examples:
      #| email                          | password  |
      #| sivasreegovindaraj@gmail.com   | SIVAKAVI1 |
