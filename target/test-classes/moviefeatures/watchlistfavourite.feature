Feature: check the favourite is in watchlist
@smoke
Scenario Outline: user movie is there or not
Given user is on the watchlist page
When favourite  movie is present or not
Then  user watch the movie

