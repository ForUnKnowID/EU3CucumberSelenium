@navigate
Feature: Navigation Menu



  Scenario: Navigation Fleet Vehicles
    Given  the user is on the login page
    And the user enters the sale manager information
    When the user navigates to Fleet, Vehicles
    Then the title should be vehicles


    @db
    Scenario: Navigating Marketing - Campaigns
      Given  the ser is on the login page
      And the user  enters the sales manager informtion
      When the user navigates to Marketing, Compaigns
      Then title shoudl be Campaigns



  Scenario:  Navigating Activities -- Calendar Events
        Given  the user is on the login page
        And the user enters the sales manager information
        When the user navigates to Activities, Calendar Events
        Then title should be Calendars
