Feature: Login to Gmail
  The user has valid data to log in


  Scenario: user wants to login to Gmail
    Given  user in the home page Gmail
    When  user into de data
      | user    | password |
      | culture | 123      |
    Then user sees the destination "Recibidos"