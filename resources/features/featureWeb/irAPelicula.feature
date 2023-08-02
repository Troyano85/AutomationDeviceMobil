Feature: go to movie
  The user can navigate between the movies on netflix and can validate a specific type of movie


  Scenario: the user wants to go to a suspense movie
    Given  the user is on the main page of netflix
    When  the user enters the data to start the session
      | user    | password |
      | culture |          |
    Then user sees the "supenso"