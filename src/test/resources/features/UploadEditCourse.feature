@UploadEditCourse
  Feature: Upload and Edit Course by Mentor
    @CourseTest1
    Scenario: User upload new course with complete data
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click the Upload New Course menu on Course page
      And User will direct to Upload Kursus page
      And User click the Choose File button to edit profile picture
      And User input "Biola Pemula Mahasiswa" as Judul Kursus, select "Basic" on Tingkatan Khusus/Level field, "Khusus untuk pemula tingkat mahasiswa" as Deskripsi Khusus, "Mengetahui kunci dasar biola" as Apa yang akan dipelajari, "Mempunyai Biola sendiri" as Prasyarat Khusus, "Mahasiswa" as Untuk siapa khursus ini, "1000000" as Harga khusus, "1" as duration
      And User click Upload Kursus button
      Then User will get the pop up message "success make a class"

    @CourseTest2
    Scenario: User cancel to upload new course
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click the Upload New Course menu on Course page
      And User will direct to Upload Kursus page
      And User click Cancel on Upload Kursus Page
      Then User will direct to Course page

    @CourseTest3
    Scenario Outline: User upload new course with uncomplete data
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click the Upload New Course menu on Course page
      And User will direct to Upload Kursus page
      And User click the Choose File button to edit profile picture
      And User input "<Judul>" as Judul Kursus, select "<Level>" on Tingkatan Khusus/Level field, "<Deskripsi>" as Deskripsi Khusus, "<Dipelajari>" as Apa yang akan dipelajari, "<Prasyarat>" as Prasyarat Khusus, "<UntukSiapa>" as Untuk siapa khursus ini, "<Harga>" as Harga khusus, "<Duration>" as duration
      And User click Upload Kursus button
      Then User will get the pop up message "unable to process data"
      Examples:
        | Judul                  |  | Level |  | Deskripsi |  | Dipelajari             |  | Prasyarat       |  | UntukSiapa |  | Harga   |  | Duration |  |
        | Biola Pemula Mahasiswa |  | Basic |  |           |  | Mengetahui kunci dasar |  | Mempunyai Biola |  | Mahasiswa  |  | 1000000 |  | 1        |  |

    @CourseTest4
    Scenario: User upload new course without upload picture
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click the Upload New Course menu on Course page
      And User will direct to Upload Kursus page
      And User input "Biola Pemula Mahasiswa" as Judul Kursus, select "Basic" on Tingkatan Khusus/Level field, "Khusus untuk pemula tingkat mahasiswa" as Deskripsi Khusus, "Mengetahui kunci dasar biola" as Apa yang akan dipelajari, "Mempunyai Biola sendiri" as Prasyarat Khusus, "Mahasiswa" as Untuk siapa khursus ini, "1000000" as Harga khusus, "1" as duration
      And User click Upload Kursus button
      Then User will get the pop up message "success make a class"

    @CourseTest5
    Scenario: User do edit the course data
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click edit button for Piano - Advance Class on course list
      And User will direct to Upload Kursus page
      And User edit the "3000000" as Harga Khusus field
      And User click Update Kursus button
      Then User will get the pop up message "success edit class"

    @CourseTest6
      Scenario: User do edit the course data with empty data
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click edit button for Piano - Advance Class on course list
      And User will direct to Upload Kursus page
      And User edit the Harga Khusus field to empty field
      And User click Update Kursus button
      Then User will get the pop up message "unable to process data"

    @CourseTest7
    Scenario: User do edit the profile picture
      Given User already on musiclab website
      When User click login menu on musiclab website
      Then User already in login page
      And User input "nagita123@gmail.com" as email, input "adminmentor3" as password and select "Mentor" as role
      And User click the login button
      And User will get the pop up message "login success"
      And User will direct to homepage
      And User click the profile menu on homepage
      And User already in profile mentor page
      And User click Kursus Saya menu on profile page
      And User will direct to Course page
      And User click edit button for Piano - Advance Class on course list
      And User will direct to Upload Kursus page
      And User click the Choose File button to edit profile picture
      And User click Update Kursus button
      Then User will get the pop up message "success edit class"



