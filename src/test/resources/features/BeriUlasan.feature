@BeriUlasan
Feature: Giving feedback with beri ulasan feature
  Scenario: User giving feedback with complete data
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage
    And User click the profile menu on homepage
    And User already in profile student page
    And User click the jadwal button at profile student page
    And User already in Histori Belajar page
    And User click the beri ulasan button
    And User will direct to ulasan page
    And User input "Nice" as comment and click "5" star on rating
    And User click the submit ulasan button
    And User will get pop up message Success Give Rating
    And User will direct back to history belajar page
    Then beri ulasan button should be disabled