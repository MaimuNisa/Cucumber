Feature: Login Functionality For WebOrder Page

  Scenario: Validate of WebOrder Login Positive Scenarios
    Given the users navigates to WebOrder websites
    When the users provides credentials
    Then the user is on the home pages


  Scenario: Validations of WebOrder Login Negative Scenario 1
    Given the users navigates to WebOrder websites
    When  The users provides correct username and wrong password
    Then  The users validates the "Sign in Failed" error message



  Scenario: Validations of WebOrder Login Negative Scenario 2
    Given the users navigates to WebOrder websites
    When  The user provides wrong "ahmet" and "baldir"
    Then  The users validates the "Sign in Failed" error message



  Scenario:  Validations of WebOrder Login Negative Scenario 3
    Given the users navigates to WebOrder websites
    When  The user provides empty username and password
    Then  The users validates the "Sign in Failed" error message