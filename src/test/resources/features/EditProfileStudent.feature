@EditProfileStudent
Feature: Edit Profile Student
  @EditProfileStudentTest1
  Scenario: User do edit profile student account with valid and complete data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User edit photo profile
    And User input "John K" as nameStudent, select "Male" as gender, input "081299996666" as phone, input "kennedy321@gmail.com" as emailStudent and input "Beverly Hills" as address student
    And User click the update button at edit profile student page
    Then User will get the pop up message "success update student profile"

  @EditProfileStudentTest2
  Scenario: User do update password with valid and completed data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "adminmurid22" as oldPassword, input "adminmurid30" as newPassword and input "adminmurid30" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "success update student password"

  @EditProfileStudentTest3
  Scenario: User do update password with wrong old password
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid30" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "cobacoba333" as oldPassword, input "adminmurid22" as newPassword and input "adminmurid22" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "password not matched"

  @EditProfileStudentTest4
  Scenario: User do update password with unmatched password between new password and confirmation password
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid30" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User input "adminmurid30" as oldPassword, input "adminmurid23" as newPassword and input "cobacoba233" as confirmPassword
    And User click the update password button at edit profile student page
    Then User will get the pop up message "new password and confirmation password is not equal"

  @EditProfileStudentTest5
  Scenario Outline: User do update password with incomplete data
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid30" as password and select "Student" as role
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
    | oldPass      |  | newPass   |  | confirmPass |
    |              |  | cobanew22 |  | cobanew22   |
    | adminmurid30 |  |           |  | cobanew22   |
    | adminmurid30 |  | cobanew22 |  |             |

  @EditProfileStudentTest6
  Scenario: User go to edit profile student account page and verify function of the kembali button
    Given User already on musiclab website
    And User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid30" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the edit profile button at profile student page
    And User already in edit profile student page
    When User click the kembali button at edit profile student page
    Then User will direct back to profile student page