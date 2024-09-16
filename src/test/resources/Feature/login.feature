Feature: Facebook Login Feature

  Scenario: Login with valid credentials
    Given the user is on the Facebook login page
    When the user enters the username "pravinkumar"
    And the user enters the password "pravin@123"
    And the user clicks on the login button
    Then the user should see the home page
