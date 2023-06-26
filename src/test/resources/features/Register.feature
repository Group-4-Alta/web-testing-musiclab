@Register
Feature: Register Account Student & Mentor
  @RegisterTest1
  Scenario: User do register account with valid and complete data (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "monalisa" as namaLengkap, select "Student" as role, input "monalisa123@gmail.com" as email and input "adminmurid7" as password
    And User click the register button
    Then User will get the pop up message "success create account"

  @RegisterTest2
  Scenario: User do register account with email that already registered (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "mona" as namaLengkap, select "Student" as role, input "monalisa123@gmail.com" as email and input "adminsama01" as password
    And User click the register button
    Then User will get the pop up message "email has been registered"

  @RegisterTest3
  Scenario Outline: User do register account with invalid data email (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And User will see error
    Examples:
      | name  |  | role    |  | email        |  | password     |
      | tyler |  | Student |  | tylerxx      |  | adminmurid11 |
      | tyler |  | Student |  | tylerxx@     |  | adminmurid11 |
      | tyler |  | Student |  | tylerxx@.com |  | adminmurid11 |

  @RegisterTest4
  Scenario: User do register account with email which the account already deleted previously (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Bara" as namaLengkap, select "Student" as role, input "barbara@gmail.com" as email and input "adminmurid00" as password
    And User click the register button
    Then User will get the pop up message "error insert data"

  @RegisterTest5
  Scenario Outline: User do register account with invalid data nama lengkap which is using number or special character (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And User click the register button
    Then User will get the pop up message "name must be filled only letters"
    Examples:
      | name     |  | role    |  | email              |  | password     |
      | tyler456 |  | Student |  | tyler456@gmail.com |  | adminmurid33 |
      | tyler@@  |  | Student |  | tyler789@gmail.com |  | adminmurid33 |

  @RegisterTest6
  Scenario: User do register account with valid and complete data (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Harry Potter" as namaLengkap, select "Mentor" as role, input "harrypotter123@gmail.com" as email and input "adminmentor11" as password
    And User click the register button
    Then User will get the pop up message "success create account"

  @RegisterTest7
  Scenario: User do register account with email that already registered (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Potter" as namaLengkap, select "Mentor" as role, input "harrypotter123@gmail.com" as email and input "adminmentorsama10" as password
    And User click the register button
    Then User will get the pop up message "email has been registered"

  @RegisterTest8
  Scenario Outline: User do register account with incorrectly data email (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And User will see error
    Examples:
      | name  |  | role   |  | email        |  | password     |
      | tyler |  | Mentor |  | tylerxx      |  | adminmurid11 |
      | tyler |  | Mentor |  | tylerxx@     |  | adminmurid11 |
      | tyler |  | Mentor |  | tylerxx@.com |  | adminmurid11 |

  @RegisterTest9
  Scenario: User do register account with email which the account already deleted previously (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Barbara" as namaLengkap, select "Mentor" as role, input "barbara@gmail.com" as email and input "adminmentor2" as password
    And User click the register button
    Then User will get the pop up message "error insert data"

  @RegisterTest10
  Scenario Outline: User do register account with invalid data nama lengkap which is using number or special character (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "<name>" as namaLengkap, select "<role>" as role, input "<email>" as email and input "<password>" as password
    And User click the register button
    Then User will get the pop up message "name must be filled only letters"
    Examples:
      | name     |  | role   |  | email              |  | password      |
      | tyler456 |  | Mentor |  | tyler456@gmail.com |  | adminmentor50 |
      | tyler@@  |  | Mentor |  | tyler789@gmail.com |  | adminmentor50 |