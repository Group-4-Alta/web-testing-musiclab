@TambahLihatJadwal
  Feature: Tambah dan Liat Jadwal Feature
    @TambahLihat1
    Scenario: Tambah Jadwal feature
      Given User already on musiclab website
      And User click login menu on musiclab website
      Then User already in login page
      When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      Then User will get the pop up message "login success"
      And User will direct to homepage
      When User click the profile menu on homepage
      Then User already in profile mentor page
      And User click the Tambah Jadwal option
      And User select "Saturday" as day, input "1130" as start time, input "1230" as end time
      And User click the Upload Jadwal button at Tambah Jadwal option
      Then User will get the pop up message "success post a schedule"

    @TambahLihat2
    Scenario: User check the Lihat Jadwal feature
      Given User already on musiclab website
      And User click login menu on musiclab website
      Then User already in login page
      When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      Then User will get the pop up message "login success"
      And User will direct to homepage
      When User click the profile menu on homepage
      Then User already in profile mentor page
      And User click the Lihat Jadwal feature

    @TambahLihat3
    Scenario: User delete schedule in Lihat Jadwal feature
      Given User already on musiclab website
      And User click login menu on musiclab website
      Then User already in login page
      When User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      Then User will get the pop up message "login success"
      And User will direct to homepage
      When User click the profile menu on homepage
      Then User already in profile mentor page
      And User click the Lihat Jadwal feature
      And User click the X button to delete the Jadwal

