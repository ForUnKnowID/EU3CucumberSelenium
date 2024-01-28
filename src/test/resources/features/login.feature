Feature: User should be able to login

  Scenario: Login as a driven
    Given the user is on the login page
    When  he user enters the dirver information
    Then the user should be able to login


    Scenario: Login as a sales manager
      Given the user is on the login page
      When the user enters the sales manager information
      Then the user should be able to login


      Scenario: Login as a store manager
        Given  the user is on the login page
        When the user enters the store manager information
        Then the user should be able to login
