Feature: language select functionality

@smoke 
Scenario: select the language
Given user is on the language selecting page
When user selects the favourite "<language>" language
Then user click on Done button
And user navigate to the home page
Examples:
|language|
|Tamil|


