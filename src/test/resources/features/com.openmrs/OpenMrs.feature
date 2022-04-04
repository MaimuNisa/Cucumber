Feature:Open Mrs Tests
  @OpenMrs
  Scenario: Register a patient
    Given the user logs in to OpenMrs with following credentials
      | username |admin|
      | password |Admin123|
    When  the user registers a new patient with following information:
      | GivenName    | ahmet            |
      | FamilyName   | Baildir          |
      | Gender       | Female             |
      | Day          | 13               |
      | Month        | August           |
      | Year         | 1991             |
      | Address      | 2200 E Devon ave |
      | PhoneNumber  | 3147148390       |
      | Relative     | Doctor           |
      | RelativeName | Patel            |


