@Chat
  Feature: Chat feature from Student & Mentor side
  @StudentChat
  Scenario: Lihat Chat feature from Student side
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "kennedy321@gmail.com" as email, input "adminmurid22" as password and select "Student" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the find mentor on homepage
      And User will direct to search mentor page
      And User click Nagita mentor
      And User already on mentor profile page
      And User click the Lihat Chat button
      And User input "Good Morning, Mrs Nagita" as message for mentor
      And User click the SEND button for send the message to mentor
      And User click the CLOSE button
      Then User will direct to profile detail mentor page

  @MentorChat
  Scenario: User send message to Student
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click the Chat menu on profile mentor page
      And User will direct to Chat list page
      And User click the See Message button from Bagas
      And User input "Good Morning, too" as message for student
      And User click the SEND button for send the message to student

