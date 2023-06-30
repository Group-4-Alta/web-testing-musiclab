@DeleteAccountStudent
Feature: User do delete account
  @DeleteAccountStudentTest1
  Scenario: User go to profile student page (POV Student)
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    When User input "barbie123@gmail.com" as email, input "adminmurid88" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    When User click the profile menu on homepage
    Then User already in profile student page
    When User click the delete account button
    Then User will get the pop up message "You Can't Retrieve your Data After Delete your Account"
    And User click the Ya, Hapus Akun button
    Then User will direct back to login page