Feature: Saucedemo login test
  I want to use this template for my feature file

  Scenario: Check login credentials of saucedemo
    Given user is in login page
    When user enters username and password
    And user clicks on login button
    Then user is navigated to new page
