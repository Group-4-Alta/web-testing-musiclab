@BeriUlasan
Feature: Giving feedback with beri ulasan feature
  @BeriUlasanTest1
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
    And User will get the pop up message "[object Object]"
    Then User will direct back to history belajar page
    And beri ulasan button should be disabled

  @BeriUlasanTest2
  Scenario: User giving feedback with incomplete data
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
    And User input "" as comment and click "5" star on rating
    And User click the submit ulasan button
    And User will get the pop up message "[object Object]"
    And User will stay on ulasan page

  @BeriUlasanTest3
  Scenario: User giving feedback with blank data
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
    And User input "" as comment
    And User click the submit ulasan button
    And User will get the pop up message "[object Object]"
    And User will stay on ulasan page