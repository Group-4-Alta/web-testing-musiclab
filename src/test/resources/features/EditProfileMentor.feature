@EditProfileMentor
Feature: Edit Profile Mentor
  @EditProfileMentorTest1
  Scenario: User edit profile mentor with valid and complete data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User will input "Buji Coba Aja" as namaLengkap, input "Guru Harpa" as deskripsi select "Male" as jenisKelamin, "085151595900" as noHp, input "buji.coba@yahoo.com" as email, input "instagram.com/buba2320/" as instagram account link, and input "Jalan Buah" as alamat
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "success update mentor profile"
    And User will direct back to profile mentor page

  @EditProfileMentorTest2
  Scenario: User edit profile mentor by only 1 field
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User input "Jalan Buah No. 92" as alamat
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "success update mentor profile"
    And User will direct back to profile mentor page

  @EditProfileMentorTest3
  Scenario: User edit profile mentor with blank data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User clear all data
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "Please Fill The Form with Correct Format"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest4
  Scenario: User edit profile mentor with invalid data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User type "buji.cobahaha" as email
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "Please Fill The Form with Correct Format"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest5
  Scenario: User upload profile picture with valid format
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User upload profile picture
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "success update mentor profile"
    And User will direct back to profile mentor page

  @EditProfileMentorTest6
  Scenario: User upload profile picture with invalid format
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User edit profile picture with invalid format
    Then User click the update button at edit profile mentor page
    And User will get the pop up message "Please Fill The Form with Correct Format"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest7
  Scenario: User upload sertifikat with valid and complete data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User select "Internasional" as Tipe Sertifikat, input "Sertifikat MGM Awards" as nama sertifikat, choose a file under 500kb
    Then User click the upload sertifikat button at edit profile mentor page
    And User will get the pop up message "success add mentor credential"
    And User will direct back to profile mentor page

  @EditProfileMentorTest8
  Scenario: User upload sertifikat with invalid data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User don't select Tipe Sertifikat, input "%%%" as nama sertifikat, choose a file over 500kb
    Then User click the upload sertifikat button at edit profile mentor page
    And User will get the pop up message "error upload to s3"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest9
  Scenario: User upload sertifikat with blank data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    Then User click the upload sertifikat button at edit profile mentor page
    And User will get the pop up message "error bind data"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest10
  Scenario: User update instruments
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User select "Gitar" as instrument you want to teach
    Then User click the update instruments button at edit profile mentor page
    And User will get the pop up message "success add mentor instrument"
    And User will direct back to profile mentor page

  @EditProfileMentorTest11
  Scenario: User update instruments without select anything
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    Then User click the update instruments button at edit profile mentor page
    And User will get the pop up message "validate: Key: 'MentorInstrumentCore.InstrumentID' Error:Field validation for 'InstrumentID' failed on the 'required' tag"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest12
  Scenario: User update genres
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User select "Classic" as Your Genre Music
    Then User click the update genres button at edit profile mentor page
    And User will get the pop up message "success add mentor genre"
    And User will direct back to profile mentor page

  @EditProfileMentorTest13
  Scenario: User update genres without select anything
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    Then User click the update genres button at edit profile mentor page
    And User will get the pop up message "Failed"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest14
  Scenario: User update password with valid and completed data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User input "dicoba123" as oldPassword, input "dicoba321" as newPassword and input "dicoba321" as confirmationPassword
    Then User click the update password button at edit profile mentor page
    And User will get the pop up message "success update mentor password"
    And User will direct back to profile mentor page

  @EditProfileMentorTest15
  Scenario: User update password with wrong old password
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User input "dicobaaja" as oldPassword, input "dicoba321" as newPassword and input "dicoba321" as confirmationPassword
    Then User click the update password button at edit profile mentor page
    And User will get the pop up message "password not matched"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest16
  Scenario: User update password with unmatched password between new password and confirmation password
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User input "dicoba123" as oldPassword, input "dicoba3" as newPassword and input "dicoba321" as confirmationPassword
    Then User click the update password button at edit profile mentor page
    And User will get the pop up message "new password and confirmation password is not equal"
    And User will stay on edit profile mentor page

  @EditProfileMentorTest17
  Scenario Outline: User update password with incomplete data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User input "<oldpass>" as oldPassword, input "<newpass>" as newPassword and input "<confirmpass>" as confirmationPassword
    Then User click the update password button at edit profile mentor page
    And User will get the pop up message "old password, new password and confirmation password field cannot be empty"
    And User will stay on edit profile mentor page
  Examples:
    | oldpass   | newpass   | confirmpass |
    |           | dicoba321 | dicoba321   |
    | dicoba123 |           | dicoba321   |
    | dicoba123 | dicoba321 |             |

  @EditProfileMentorTest18
  Scenario: User go to edit profile student account page and verify function of the "kembali" button
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile mentor page
    And User click the edit profile button at profile mentor page
    And User already in edit profile mentor page
    And User click the kembali button at edit profile mentor page
    Then User will direct back to profile mentor page