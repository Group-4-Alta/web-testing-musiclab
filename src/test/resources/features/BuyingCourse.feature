@Buying
Feature: Buying a course in musiclab
  @BuyingTest1
  Scenario: User buying course with valid data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "awan.2@gmail.com" as email, input "diawan123" as password and select "Student" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Buji Coba Aja mentor
    And User will direct to profile detail mentor page
    And User click the Piano - Advance Class course
    And User will direct to detail course page
    And User click the Beli Kursus button
    And User will direct to payment page
    And User input "16122023" and select "Sunday" on check availability section
    And User click the check availability button
    And User will get the pop up message title "Schedules Available"
    And User click the continue payment button
    And User will direct to payment method page in new tab
    And User will select BCA Virtual Account as payment method
    And User will get virtual account number
    And User click the back to merchant button
    And User will get message Your transaction is being processed

  @BuyingTest2
  Scenario: User buying course with invalid past date
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "awan.2@gmail.com" as email, input "diawan123" as password and select "Student" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Buji Coba Aja mentor
    And User will direct to profile detail mentor page
    And User click the Piano - Advance Class course
    And User will direct to detail course page
    And User click the Beli Kursus button
    And User will direct to payment page
    And User input "05062023" and select "Monday" on check availability section
    And User click the check availability button
    And User will get the pop up message "minimum start date input is today"
    And User will stay on payment page

  @BuyingTest3
  Scenario: User buying course with invalid too far date
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "awan.2@gmail.com" as email, input "diawan123" as password and select "Student" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Buji Coba Aja mentor
    And User will direct to profile detail mentor page
    And User click the Piano - Advance Class course
    And User will direct to detail course page
    And User click the Beli Kursus button
    And User will direct to payment page
    And User input "07095766" and select "Monday" on check availability section
    And User click the check availability button
    And User will get the pop up message "schedule not available"
    And User will stay on payment page

  @BuyingTest4
  Scenario: User buying course with mentor account
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "buji.coba@yahoo.com" as email, input "dicoba123" as password and select "Mentor" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage
    And User click the find mentor on homepage
    And User will direct to search mentor page
    And User click Buji Coba Aja mentor
    And User will direct to profile detail mentor page
    And User click the Piano - Advance Class course
    Then User will direct to detail course page
    And Beli Kursus button should not displayed