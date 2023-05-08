@DepartmentModule
Feature: To Validating the FASoft Department Module

  @department
  Scenario Outline: User should verify the Department Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-02
  Scenario Outline: User should verify the Department Module Drop drow function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should not select any format and click Export in department
    Then Alert should be shown "Please Select Export Type To Export Data" in department
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-03
  Scenario Outline: User should export the Department as Excel
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should  select Docment format of Export To Excel and click Export in department
    Then After that Excel format of  "Department.xls" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-04
  Scenario Outline: User should export the Department as PDF
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should  select Docment format of Export To PDF and click Export in department
    Then After that pdf format of  "Department.pdf" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-05
  Scenario Outline: User should export the Department as CSV
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should  select Docment format of Export To CSV and click Export in department
    Then After that CSV format of  "Department.csv" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-06
  Scenario Outline: User should export the Department as XML
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should  select Docment format of Export To XML and click Export in department
    Then After that XML format of  "Department.xml" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-08 @may3
  Scenario Outline: User should verify the Department Module create function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-09 @may3
  Scenario Outline: User should enter code and description as blank, then it should show alert.
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User is leaving department code and description as blank and click save
    Then Its shows the alert of "Department Code is Required" and "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASDPMTC-10 @may3
  Scenario Outline: User should enter department code with decimal value, then it should show alert.
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then Verify value is "<Expected>" from department code
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description | Expected |
      | admin    | admin    |             0.1 |             |       01 |

  @FASDPMTC-11 @may3
  Scenario Outline: User should enter department code with decimal value, then it should show alert.
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then Verify value is "<Expected>" from department code
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description | Expected |
      | admin    | admin    |             -10 |             |       10 |

  @FASDPMTC-12 @may3
  Scenario Outline: User should enter department code value as alphanumeric with more than 50 in length, then it should allow only till 50 in length
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then Verify value is "<Expected>" from department code
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code                                       | Description | Expected                                           |
      | admin    | admin    | loremipsumloremipsum1234234loremi2342loremipsum111123 |             | loremipsumloremipsum1234234loremi2342loremipsum111 |

  @FASDPMTC-13 @may3
  Scenario Outline: User should enter department code value as alphanumeric with more than 50 in length, then it should allow only till 50 in length
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then Verify value is "<Expected>" from department code
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description | Expected |
      | admin    | admin    | !$%%            |             |          |

  @FASDPMTC-14 @may3
  Scenario Outline: Whether department code with least value 1, then no error should show
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User is enter "<Department Code>" and it should accept it
    Then Its shows the alert of  "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code |
      | admin    | admin    |               1 |

  @FASDPMTC-15 @may3
  Scenario Outline: User should Check whether description allows to enter alphanumeric with special characters till 100 in length
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then Verify value is "<Expected>" from description
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description                                                                                             | Expected                                                                                             |
      | admin    | admin    |                 | loremipsumloremipsum1234234loremi2342loremipsum111123!$%%^^^!@-----___+!@++!$%!loremipsum$$@%%%@!^&&123 | loremipsumloremipsum1234234loremi2342loremipsum111123!$%%^^^!@-----___+!@++!$%!loremipsum$$@%%%@!^&& |

  @FASDPMTC-16 @may3
  Scenario Outline: User should Check whether able to create department with proper department code and description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then User should verify "<Alert>" and department should be saved
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description        | Alert                      |
      | admin    | admin    | Test1           | Test by Automation | Record Saved Successfully. |

  @FASDPMTC-17 @may3
  Scenario Outline: User should Check whether able to create department with least length field - department code and description, then it should show as Record saved successfully
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then User should verify "<Alert>" and department should be saved
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description | Alert                      |
      | admin    | admin    | T               | T           | Record Saved Successfully. |

  @FASDPMTC-18 @may3
  Scenario Outline: User should Check whether able to create department with least length field - department code and description, then it should show as Record saved successfully
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Department on Master
    Then User should verify the Department list page and title of  "Department List"
    When User should select the Add new record button and its should nevigate to create page
    Then After that user should verify the "Department Create"
    When User should click save , after enter the "<Department Code>" and "<Description>"
    Then User should verify "<Alert>" and department should Not be saved
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Department Code | Description | Alert                          |
      | admin    | admin    | test            | test        | Department Code Already Exists |
