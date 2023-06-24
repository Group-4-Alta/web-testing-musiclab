@Register
Feature: Register Account Student & Mentor
  @Test1
  Scenario: User do register account with valid and complete data (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "coba delapan" as namaLengkap, select "Student" as role, input "cobaauto8@gmail.com" as email and input "cobacoba8" as password
    And User click the register button
    Then User will get the pop up message "success create account"

  @Test2
  Scenario: User do register account with email that already registered (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "coba fika" as namaLengkap, select "Student" as role, input "cobaauto2@gmail.com" as email and input "cobasama1" as password
    And User click the register button
    Then User will get the pop up message "email has been registered"

  @Test3
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

  @Test4
  Scenario: User do register account with email which the account already deleted previously (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Bara" as namaLengkap, select "Student" as role, input "barbara@gmail.com" as email and input "adminmurid00" as password
    And User click the register button
    Then User will get the pop up message "error insert data"

  @Test5
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

  @Test6
  Scenario: User do register account with valid and complete data (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "coba mentor lagi" as namaLengkap, select "Mentor" as role, input "cobamentor5@gmail.com" as email and input "cobacoba5" as password
    And User click the register button
    Then User will get the pop up message "success create account"

  @Test7
  Scenario: User do register account with email that already registered (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "coba mentor fika" as namaLengkap, select "Mentor" as role, input "cobamentor1@gmail.com" as email and input "cobacoba11" as password
    And User click the register button
    Then User will get the pop up message "email has been registered"

  @Test8
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

  @Test9
  Scenario: User do register account with email which the account already deleted previously (POV Mentor)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page
    And User input "Barbara" as namaLengkap, select "Mentor" as role, input "barbara@gmail.com" as email and input "adminmentor2" as password
    And User click the register button
    Then User will get the pop up message "error insert data"

  @Test10
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