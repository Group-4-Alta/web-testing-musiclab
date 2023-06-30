@DeleteMentorCourse
Feature: Delete Mentor Course
  @DeleteMentorTest1
  Scenario: Delete mentor course at daftar kursus saya page
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
    When User click the delete button at course
    Then User will direct back to kursus saya page

  @DeleteMentorTest2
  Scenario: User go to daftar kursus saya page and verify function of the kembali button
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
    When User click the kembali button at kursus saya page
    Then User will direct back to profile mentor page