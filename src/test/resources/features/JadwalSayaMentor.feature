@JadwalSayaMentor
Feature: Jadwal Saya Mentor
  @JadwalSayaMentorTest1
  Scenario: User do check jadwal saya on profile mentor page
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile mentor page
    And User click the jadwal saya button at profile mentor page
    Then User already in Histori Mengajar page

  @JadwalSayaMentorTest2
  Scenario: User do check jadwal saya on profile mentor page
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile mentor page
    And User click the jadwal saya button at profile mentor page
    Then User already in Histori Mengajar page
    And User click the kembali button at histori mengajar page
    Then User will direct back to profile mentor page