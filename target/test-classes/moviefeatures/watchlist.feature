Feature: Test Watchlist Functionality
@smoke
  Scenario: Verify that the watchlist feature works correctly
    Given the user is on the home page
    When the user hovers over the profile picture
    Then the user clicks on the watchlist
    And the user navigates to the watchlist page
