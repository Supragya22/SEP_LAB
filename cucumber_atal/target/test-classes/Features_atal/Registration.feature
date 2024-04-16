Feature: Registration Functionality
 
  Scenario: Successful Registration redirects user to the Payment Method
    Given I am on the Registration page
    When I enter Name collegename email instituteId Mobile Department
    And I click on the registration button
    Then I should be directed to the Payment Method