@Login
Feature: Login Account Student & Mentor
  @Test11
  Scenario: User do login with available account (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage