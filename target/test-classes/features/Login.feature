@Login
Feature: Login Account Student & Mentor
  @LoginTest1
  Scenario: User do login with available account (POV Student)
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
    And User click the login button
    Then User will get the pop up message "login success"
    And User will direct to homepage

  @LoginTest2
  Scenario Outline: User do login with unavailable account
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "<email>" as email, input "<password>" as password and select "<role>" as role
    And User click the login button
    Then User will get the pop up message "data not found"
    Examples:
      | email               |  | role    |  | password     |
      | alditaher@gmail.com |  | Student |  | adminmurid99 |

  @LoginTest3
  Scenario Outline: User do login with account that has deleted
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "<email>" as email, input "<password>" as password and select "<role>" as role
    And User click the login button
    Then User will get the pop up message "data not found"
    Examples:
      | email             |  | role    |  | password     |
      | barbara@gmail.com |  | Student |  | adminmurid00 |

  @LoginTest4
  Scenario: User do login with available account
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
    And User click the login button
    And User will get the pop up message "login success"
    And User will direct to homepage

  @LoginTest5
  Scenario Outline: User do login with unavailable account
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "<email>" as email, input "<password>" as password and select "<role>" as role
    And User click the login button
    Then User will get the pop up message "data not found"
    Examples:
      | email                 |  | role   |  | password      |
      | nikitawilly@gmail.com |  | Mentor |  | adminmentor99 |

  @LoginTest6
  Scenario Outline: User do login with account that has deleted
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User input "<email>" as email, input "<password>" as password and select "<role>" as role
    And User click the login button
    Then User will get the pop up message "data not found"
    Examples:
      | email              |  | role   |  | password     |
      | johannes@gmail.com |  | Mentor |  | adminmentor1 |

  @LoginTest7
  Scenario: User don't have and account and go to register page
    Given User already on musiclab website
    When User click login menu on musiclab website
    Then User already in login page
    And User click register option on login page
    And User already in register page