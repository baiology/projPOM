Feature: Validate successfull Login

  Scenario: Validate login screen

    Given user is in the login screen
    When user enters username and password
    And user clicks on login button
    Then user will be on the Homepage screen
