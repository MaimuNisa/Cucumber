Feature: Testing Amazon SingUp Functionalities

  Scenario:  Amazon SingUp with With database
    When the user clicks the sign in and create your amazon account button
    Then  the user validate the header
      | Create account    |
    And the user provides the information:
      | ahmet           |
      | ahmet@gmail.com |
      | ahmet123        |
      | ahmet123        |
