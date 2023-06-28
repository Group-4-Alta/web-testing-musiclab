@DeleteAccountMentor
Feature: Delete account feature from Teacher side
    Scenario: User delete their account
      Given User already on musiclab website
      And User click login menu on musiclab website
      Then User already in login page
      When User input "nandadummy@gmail.com" as email, input "adminmentor117" as password and select "Mentor" as role
      And User click the login button
      Then User will get the pop up message "login success"
      And User will direct to homepage
      When User click the profile menu on homepage
      Then User already in profile mentor page
      And User click Deactive Account button
      And User will get the pop up message "You Can't Retrieve your Data After Delete your Account"
      And User click the Ya hapus akun button
      Then User will direct back to login page
