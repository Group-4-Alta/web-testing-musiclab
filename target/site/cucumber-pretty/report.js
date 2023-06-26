$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/UploadEditCourse.feature");
formatter.feature({
  "line": 2,
  "name": "Upload and Edit Course by Mentor",
  "description": "",
  "id": "upload-and-edit-course-by-mentor",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UploadEditCourse"
    }
  ]
});
formatter.before({
  "duration": 6405081799,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User upload new course with complete data",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-complete-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@CourseTest1"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click the Upload New Course menu on Course page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User click the Choose File button to edit profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User input \"Biola Pemula Mahasiswa\" as Judul Kursus, select \"Basic\" on Tingkatan Khusus/Level field, \"Khusus untuk pemula tingkat mahasiswa\" as Deskripsi Khusus, \"Mengetahui kunci dasar biola\" as Apa yang akan dipelajari, \"Mempunyai Biola sendiri\" as Prasyarat Khusus, \"Mahasiswa\" as Untuk siapa khursus ini, \"1000000\" as Harga khusus, \"1\" as duration",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "User click Upload Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "User will get the pop up message \"success make a class\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3483412401,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2268536701,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 11213204301,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 7054370400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2120067400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6202024999,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3046941800,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2170129899,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3036311599,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 101750101,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 1902719400,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheUploadNewCourseMenuOnCoursePage()"
});
formatter.result({
  "duration": 123247199,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 2707782899,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheChooseFileButtonToEditProfilePicture()"
});
formatter.result({
  "duration": 68769799,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Biola Pemula Mahasiswa",
      "offset": 12
    },
    {
      "val": "Basic",
      "offset": 61
    },
    {
      "val": "Khusus untuk pemula tingkat mahasiswa",
      "offset": 102
    },
    {
      "val": "Mengetahui kunci dasar biola",
      "offset": 163
    },
    {
      "val": "Mempunyai Biola sendiri",
      "offset": 223
    },
    {
      "val": "Mahasiswa",
      "offset": 270
    },
    {
      "val": "1000000",
      "offset": 310
    },
    {
      "val": "1",
      "offset": 337
    }
  ],
  "location": "UploadEditCourseSteps.userInput(String,String,String,String,String,String,int,int)"
});
formatter.result({
  "duration": 1988436800,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUploadKursusButton()"
});
formatter.result({
  "duration": 91670000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success make a class",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6500671600,
  "status": "passed"
});
formatter.after({
  "duration": 1061708500,
  "status": "passed"
});
formatter.before({
  "duration": 3425959801,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "User cancel to upload new course",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-cancel-to-upload-new-course",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 23,
      "name": "@CourseTest2"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 28,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "User click the Upload New Course menu on Course page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "User click Cancel on Upload Kursus Page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "User will direct to Course page",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3054924100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2126208600,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 4995470000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 6669561201,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2090264400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6147967100,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3032557600,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2104409401,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3034028001,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 83209601,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 2205778299,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheUploadNewCourseMenuOnCoursePage()"
});
formatter.result({
  "duration": 150668600,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 2422982200,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickCancelOnUploadKursusPage()"
});
formatter.result({
  "duration": 85650700,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 190377800,
  "status": "passed"
});
formatter.after({
  "duration": 1145036900,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 42,
  "name": "User upload new course with uncomplete data",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-uncomplete-data",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 41,
      "name": "@CourseTest3"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User click the Upload New Course menu on Course page",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User click the Choose File button to edit profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User input \"\u003cJudul\u003e\" as Judul Kursus, select \"\u003cLevel\u003e\" on Tingkatan Khusus/Level field, \"\u003cDeskripsi\u003e\" as Deskripsi Khusus, \"\u003cDipelajari\u003e\" as Apa yang akan dipelajari, \"\u003cPrasyarat\u003e\" as Prasyarat Khusus, \"\u003cUntukSiapa\u003e\" as Untuk siapa khursus ini, \"\u003cHarga\u003e\" as Harga khusus, \"\u003cDuration\u003e\" as duration",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User click Upload Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User will get the pop up message \"unable to process data\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 60,
  "name": "",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-uncomplete-data;",
  "rows": [
    {
      "cells": [
        "Judul",
        "",
        "Level",
        "",
        "Deskripsi",
        "",
        "Dipelajari",
        "",
        "Prasyarat",
        "",
        "UntukSiapa",
        "",
        "Harga",
        "",
        "Duration",
        ""
      ],
      "line": 61,
      "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-uncomplete-data;;1"
    },
    {
      "cells": [
        "Biola Pemula Mahasiswa",
        "",
        "Basic",
        "",
        "",
        "",
        "Mengetahui kunci dasar",
        "",
        "Mempunyai Biola",
        "",
        "Mahasiswa",
        "",
        "1000000",
        "",
        "1",
        ""
      ],
      "line": 62,
      "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-uncomplete-data;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2976545800,
  "status": "passed"
});
formatter.scenario({
  "line": 62,
  "name": "User upload new course with uncomplete data",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-upload-new-course-with-uncomplete-data;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@UploadEditCourse"
    },
    {
      "line": 41,
      "name": "@CourseTest3"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 45,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 46,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 47,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 48,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 49,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 50,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "User click the Upload New Course menu on Course page",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "User click the Choose File button to edit profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "User input \"Biola Pemula Mahasiswa\" as Judul Kursus, select \"Basic\" on Tingkatan Khusus/Level field, \"\" as Deskripsi Khusus, \"Mengetahui kunci dasar\" as Apa yang akan dipelajari, \"Mempunyai Biola\" as Prasyarat Khusus, \"Mahasiswa\" as Untuk siapa khursus ini, \"1000000\" as Harga khusus, \"1\" as duration",
  "matchedColumns": [
    0,
    2,
    4,
    6,
    8,
    10,
    12,
    14
  ],
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "User click Upload Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "User will get the pop up message \"unable to process data\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3077484100,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2096067400,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 5057106100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 6542425899,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2081026201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6238232599,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3036726901,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2112943599,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3037181100,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 78348600,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 875025301,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheUploadNewCourseMenuOnCoursePage()"
});
formatter.result({
  "duration": 107783800,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 4440199500,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheChooseFileButtonToEditProfilePicture()"
});
formatter.result({
  "duration": 69580099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Biola Pemula Mahasiswa",
      "offset": 12
    },
    {
      "val": "Basic",
      "offset": 61
    },
    {
      "val": "",
      "offset": 102
    },
    {
      "val": "Mengetahui kunci dasar",
      "offset": 126
    },
    {
      "val": "Mempunyai Biola",
      "offset": 180
    },
    {
      "val": "Mahasiswa",
      "offset": 219
    },
    {
      "val": "1000000",
      "offset": 259
    },
    {
      "val": "1",
      "offset": 286
    }
  ],
  "location": "UploadEditCourseSteps.userInput(String,String,String,String,String,String,int,int)"
});
formatter.result({
  "duration": 1906575100,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUploadKursusButton()"
});
formatter.result({
  "duration": 108640299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unable to process data",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 2465058901,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[unable to process data]\u003e but was:\u003c[success make a class]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat step_definitions.RegisterSteps.verifyPopupMessage(RegisterSteps.java:66)\r\n\tat ✽.Then User will get the pop up message \"unable to process data\"(features/UploadEditCourse.feature:59)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 738035899,
  "status": "passed"
});
formatter.before({
  "duration": 9651325800,
  "status": "passed"
});
formatter.scenario({
  "line": 65,
  "name": "User upload new course without upload picture",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-upload-new-course-without-upload-picture",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 64,
      "name": "@CourseTest4"
    }
  ]
});
formatter.step({
  "line": 66,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 67,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 68,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 69,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 77,
  "name": "User click the Upload New Course menu on Course page",
  "keyword": "And "
});
formatter.step({
  "line": 78,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 79,
  "name": "User input \"Biola Pemula Mahasiswa\" as Judul Kursus, select \"Basic\" on Tingkatan Khusus/Level field, \"Khusus untuk pemula tingkat mahasiswa\" as Deskripsi Khusus, \"Mengetahui kunci dasar biola\" as Apa yang akan dipelajari, \"Mempunyai Biola sendiri\" as Prasyarat Khusus, \"Mahasiswa\" as Untuk siapa khursus ini, \"1000000\" as Harga khusus, \"1\" as duration",
  "keyword": "And "
});
formatter.step({
  "line": 80,
  "name": "User click Upload Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "User will get the pop up message \"success make a class\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3220838300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2111110001,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 3058028300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 14609679699,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2704184700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6165506600,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3043034000,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2109352000,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3033407500,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 73975900,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 3354414599,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheUploadNewCourseMenuOnCoursePage()"
});
formatter.result({
  "duration": 82898600,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 188262600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Biola Pemula Mahasiswa",
      "offset": 12
    },
    {
      "val": "Basic",
      "offset": 61
    },
    {
      "val": "Khusus untuk pemula tingkat mahasiswa",
      "offset": 102
    },
    {
      "val": "Mengetahui kunci dasar biola",
      "offset": 163
    },
    {
      "val": "Mempunyai Biola sendiri",
      "offset": 223
    },
    {
      "val": "Mahasiswa",
      "offset": 270
    },
    {
      "val": "1000000",
      "offset": 310
    },
    {
      "val": "1",
      "offset": 337
    }
  ],
  "location": "UploadEditCourseSteps.userInput(String,String,String,String,String,String,int,int)"
});
formatter.result({
  "duration": 11991350000,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUploadKursusButton()"
});
formatter.result({
  "duration": 107841900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success make a class",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6443030901,
  "status": "passed"
});
formatter.after({
  "duration": 738013900,
  "status": "passed"
});
formatter.before({
  "duration": 10581002900,
  "status": "passed"
});
formatter.scenario({
  "line": 84,
  "name": "User do edit the course data",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-do-edit-the-course-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 83,
      "name": "@CourseTest5"
    }
  ]
});
formatter.step({
  "line": 85,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 86,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 87,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 88,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 92,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "User click edit button for Piano - Advance Class on course list",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "User edit the \"3000000\" as Harga Khusus field",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "User click Update Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "User will get the pop up message \"success edit class\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3047230801,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2099621000,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 3831978701,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 15564142399,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2187092700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6397233299,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3036615200,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2117546100,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3030347900,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 81928900,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 1837961699,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickEditButtonForPianoAdvanceClassOnCourseList()"
});
formatter.result({
  "duration": 105938600,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 1970918500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3000000",
      "offset": 15
    }
  ],
  "location": "UploadEditCourseSteps.userEditTheAsHargaKhususField(int)"
});
formatter.result({
  "duration": 150225701,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUpdateKursusButton()"
});
formatter.result({
  "duration": 83410100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success edit class",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6329478701,
  "status": "passed"
});
formatter.after({
  "duration": 719264699,
  "status": "passed"
});
formatter.before({
  "duration": 2595754901,
  "status": "passed"
});
formatter.scenario({
  "line": 103,
  "name": "User do edit the course data with empty data",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-do-edit-the-course-data-with-empty-data",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 102,
      "name": "@CourseTest6"
    }
  ]
});
formatter.step({
  "line": 104,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 105,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 106,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 107,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "User click edit button for Piano - Advance Class on course list",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "User edit the Harga Khusus field to empty field",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "User click Update Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "User will get the pop up message \"unable to process data\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3054602599,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2137262101,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 7888707099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 7083501601,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2085955901,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6191214501,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3036185800,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2121677901,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3037580900,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 80466900,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 307525800,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickEditButtonForPianoAdvanceClassOnCourseList()"
});
formatter.result({
  "duration": 1734952300,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 2318370199,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userEditTheHargaKhususFieldToEmptyField()"
});
formatter.result({
  "duration": 66596000,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUpdateKursusButton()"
});
formatter.result({
  "duration": 70082600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "unable to process data",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 2934881000,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[unable to process data]\u003e but was:\u003c[success edit class]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat step_definitions.RegisterSteps.verifyPopupMessage(RegisterSteps.java:66)\r\n\tat ✽.Then User will get the pop up message \"unable to process data\"(features/UploadEditCourse.feature:119)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 730599199,
  "status": "passed"
});
formatter.before({
  "duration": 5228558400,
  "status": "passed"
});
formatter.scenario({
  "line": 122,
  "name": "User do edit the profile picture",
  "description": "",
  "id": "upload-and-edit-course-by-mentor;user-do-edit-the-profile-picture",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 121,
      "name": "@CourseTest7"
    }
  ]
});
formatter.step({
  "line": 123,
  "name": "User already on musiclab website",
  "keyword": "Given "
});
formatter.step({
  "line": 124,
  "name": "User click login menu on musiclab website",
  "keyword": "When "
});
formatter.step({
  "line": 125,
  "name": "User already in login page",
  "keyword": "Then "
});
formatter.step({
  "line": 126,
  "name": "User input \"nagita123@gmail.com\" as email, input \"adminmentor3\" as password and select \"Mentor\" as role",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "User click the login button",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "User will get the pop up message \"login success\"",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "User will direct to homepage",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "User click the profile menu on homepage",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "User already in profile mentor page",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "User click Kursus Saya menu on profile page",
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "User will direct to Course page",
  "keyword": "And "
});
formatter.step({
  "line": 134,
  "name": "User click edit button for Piano - Advance Class on course list",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "User will direct to Upload Kursus page",
  "keyword": "And "
});
formatter.step({
  "line": 136,
  "name": "User click the Choose File button to edit profile picture",
  "keyword": "And "
});
formatter.step({
  "line": 137,
  "name": "User click Update Kursus button",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "User will get the pop up message \"success edit class\"",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3066811901,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.clickBtnLoginMenu()"
});
formatter.result({
  "duration": 2106195200,
  "status": "passed"
});
formatter.match({
  "location": "RegisterSteps.verifyLandingLoginPage()"
});
formatter.result({
  "duration": 3047686200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "nagita123@gmail.com",
      "offset": 12
    },
    {
      "val": "adminmentor3",
      "offset": 50
    },
    {
      "val": "Mentor",
      "offset": 88
    }
  ],
  "location": "LoginSteps.loginAccount(String,String,String)"
});
formatter.result({
  "duration": 12034064700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.clickLoginBtn()"
});
formatter.result({
  "duration": 2265181299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login success",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 6174481001,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verifyLandingHomepage()"
});
formatter.result({
  "duration": 3037954400,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.clickProfileMenuForStudent()"
});
formatter.result({
  "duration": 2109230299,
  "status": "passed"
});
formatter.match({
  "location": "ProfileSteps.verifyLandingProfileMentorPage()"
});
formatter.result({
  "duration": 3269781101,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickKursusSayaMenuOnProfilePage()"
});
formatter.result({
  "duration": 80315599,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToCoursePage()"
});
formatter.result({
  "duration": 426635400,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickEditButtonForPianoAdvanceClassOnCourseList()"
});
formatter.result({
  "duration": 1664759500,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userWillDirectToUploadKursusPage()"
});
formatter.result({
  "duration": 423723300,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickTheChooseFileButtonToEditProfilePicture()"
});
formatter.result({
  "duration": 50794700,
  "status": "passed"
});
formatter.match({
  "location": "UploadEditCourseSteps.userClickUpdateKursusButton()"
});
formatter.result({
  "duration": 1722503500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "success edit class",
      "offset": 34
    }
  ],
  "location": "RegisterSteps.verifyPopupMessage(String)"
});
formatter.result({
  "duration": 3143288000,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027swal2-html-container\u0027]\"}\n  (Session info: chrome\u003d114.0.5735.134)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.1.2\u0027, revision: \u00279a5a329c5a\u0027\nSystem info: host: \u0027DINDATASYA\u0027, ip: \u0027192.168.100.33\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_361\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [66448b8f24273e6005537b2881de7838, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027swal2-html-container\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 114.0.5735.134, chrome: {chromedriverVersion: 114.0.5735.90 (386bc09e8f4f..., userDataDir: C:\\Users\\user\\AppData\\Local...}, goog:chromeOptions: {debuggerAddress: localhost:59527}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:59527/devtoo..., se:cdpVersion: 114.0.5735.134, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 66448b8f24273e6005537b2881de7838\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:558)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:382)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:374)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy22.isDisplayed(Unknown Source)\r\n\tat org.example.RegisterPage.verifyMessageBoxMustShow(RegisterPage.java:77)\r\n\tat step_definitions.RegisterSteps.verifyPopupMessage(RegisterSteps.java:64)\r\n\tat ✽.Then User will get the pop up message \"success edit class\"(features/UploadEditCourse.feature:138)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 744995700,
  "status": "passed"
});
});