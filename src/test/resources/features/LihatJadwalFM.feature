@LihatJadwalFM
Feature: Check a mentor schedule
  @LihatJadwalFMTest1
  Scenario: User check a mentor schedule as student
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Nagita mentor
    Then User will direct to profile detail mentor page
    And User click the Lihat Jadwal Dropdown

  @LihatJadwalFMTest2
  Scenario: User check a mentor schedule as mentor
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Johannes Hoho Mui mentor
    Then User will direct to profile detail mentor page
    And User click the Lihat Jadwal Dropdown