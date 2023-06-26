@Profile
Feature: Go to profile page for Student and Mentor
  @ProfileTest1
  Scenario: User go to profile student page (POV Student)
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile student page

  @ProfileTest2
  Scenario: User go to profile mentor page (POV Mentor)
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile mentor page