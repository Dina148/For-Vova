Feature: create new account

  Scenario Outline: Creating new account




    Given the user navigate the "https://demo.espocrm.com/?lang=en_US#"
    When the user open the Accounts
    Then the user clicks the Create Account button
    And the user create 4 new account
    And the user validate the new users is created

    Examples:

      | Admin  | espocrm.demo@gmail.com |
      | Gulya  | edvdv.demo@gmail.com   |
      | Ayhan  | bfdsaaa.demo@gmail.com |
      | Elya   | gispo.demo@gmail.com   |
      | Larisa | espocrm.demo@gmail.com |
      | Aya    | espocrm.demo@gmail.com |
