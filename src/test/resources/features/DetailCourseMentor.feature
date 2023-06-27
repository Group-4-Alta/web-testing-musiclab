@DetailCourseMentor
Feature: Detail Mentor Course
  @DetailCourseMentorTest1
  Scenario: User go to daftar kursus saya page and verify the detail of 1 course
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile mentor page
    And User click the kursus saya button at profile mentor page
    Then User already in daftar kursus saya page
    When User click the course at kursus saya page
    Then User will direct to the detail course page

  @DetailCourseMentorTest2
  Scenario: User go to profile mentor page and verify the detail of 1 course
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile mentor page
    When User click the course at profile mentor page
    Then User will direct to the detail course page