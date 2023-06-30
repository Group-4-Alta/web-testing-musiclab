@Logout
Feature: Logout Account as Student & Mentor
  @LogoutTest1
  Scenario: User logout account as student
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "awan.2@gmail.com" as email, input "diawan123" as password and select "Student" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the logout menu on homepage
    And User will get the pop up message "You have been Logged out"
    Then User will direct to login page

  @LogoutTest2
  Scenario: User logout account as mentor
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the logout menu on homepage
    And User will get the pop up message "You have been Logged out"
    Then User will direct to login page