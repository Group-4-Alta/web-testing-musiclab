@EditProfileStudent
Feature: Edit Profile Student
  @EditProfileStudentTest1
  Scenario: User do edit profile student account with valid and complete data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew2" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User edit photo profile
    And User input "Robert Junior" as namaLengkap, select "Male" as JenisKelamin, input "081566667777" as phone, input "cobaauto2@gmail.com" as email and input "Casablanca" as alamat
    And User click the update button at edit profile student page
    Then User will get the pop up message "success update student profile"

  @EditProfileStudentTest2
  Scenario: User do update password with valid and completed data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew2" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "cobacobanew2" as oldPassword, input "cobacobanew22" as newPassword and input "cobacobanew22" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "success update student password"

  @EditProfileStudentTest3
  Scenario: User do update password with wrong old password
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "cobacobanew2333" as oldPassword, input "cobacobanew2" as newPassword and input "cobacobanew2" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "password not matched"

  @EditProfileStudentTest4
  Scenario: User do update password with unmatched password between new password and confirmation password
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "cobacobanew22" as oldPassword, input "cobacobanew22" as newPassword and input "cobacobanew233" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "new password and confirmation password is not equal"

  @EditProfileStudentTest5
  Scenario Outline: User do update password with incomplete data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "<oldPass>" as oldPassword, input "<newPass>" as newPassword and input "<confirmPass>" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "old password, new password and confirmation password field cannot be empty"
  Examples:
    | oldPass      |  | newPass       |  | confirmPass   |
    |              |  | cobacobanew22 |  | cobacobanew22 |
    | cobacobanew2 |  |               |  | cobacobanew22 |
    | cobacobanew2 |  | cobacobanew22 |  |               |

  @EditProfileStudentTest6
  Scenario: User go to edit profile student account page and verify function of the kembali button
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "cobaauto2@gmail.com" as email, input "cobacobanew22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User click the kembali button at edit profile student page
    Then User will direct back to profile student page