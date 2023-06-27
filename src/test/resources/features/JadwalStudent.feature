@JadwalStudent
Feature: Jadwal For Student
  @JadwalStudentTest1
  Scenario: User do check jadwal on student profile page
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile student page
    And User click the jadwal button at profile student page
    Then User already in history belajar page

  @JadwalStudentTest2
  Scenario: User do check jadwal on student profile page and verify function of the kembali button
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile student page
    And User click the jadwal button at profile student page
    Then User already in history belajar page
    And User click the kembali button at history belajar page
    Then User will direct back to profile student page