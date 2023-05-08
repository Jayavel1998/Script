@LocationMaster
Feature: To Validating the FASoft Location Module

  @FASLocMTC-01
  Scenario Outline: User should verify the Location Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-03
  Scenario Outline: User should click on the parent location and its shows list of child location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  click on the parent Location  and its should show all the list of child Location
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-04
  Scenario Outline: User should click on the active location, it should show details of the location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  click on the Location and its details of Location
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  #When clicked on the icon close, then it should close the directory showing only the parent location
  @FASLocMTC-06
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  click on the close icon and its should close the Parent location directory
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-07
  Scenario Outline: User should verify the Location Module search function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the Location on  "<SearchLocation>" , it should show the Location on the tree structure
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchLocation |
      | admin    | admin    | Kuwait         |

  @FASLocMTC-08
  Scenario Outline: User should verify the Location Module search function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the incorrect Location on  "<InSearchLocation>" and show location should blank
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | InSearchLocation |
      | admin    | admin    | abcd1234         |

  @FASLocMTC-09
  Scenario Outline: User should verify the Location Module search After removing the location name on search
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the Location on  "<SearchLocation>", After removing the location name on search and show all location on the tree structure
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchLocation |
      | admin    | admin    | Kuwait         |

  @FASLocMTC-11
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should not select any format and click Export
    Then Alert should be shown "Please Select Export Type To Export Data"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-12
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  select Docment format of Export To Excel and click Export
    Then After that Excel format of  "Location.xls" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-13
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  select Docment format of Export To PDF and click Export
    Then After that pdf format of  "Location.pdf" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-14
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  select Docment format of Export To CSV and click Export
    Then After that CSV format of  "Location.csv" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-15
  Scenario Outline: User should click on the icon close, it should close the directory showing only the parent location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  select Docment format of Export To XML and click Export
    Then After that XML format of  "Location.xml" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-17
  Scenario Outline: User should create location and verify the location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify the created child Location is present or not
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    |           300 | loc 1       |

  #
  @FASLocMTC-19
  Scenario: User should create Location without any details, then it should show alert
    Given User is on FASoft login page
    When User should login using "admin" and "admin"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and not any fill the details
    Then User should verify Location page error messege of "Location Code is Required" and "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

  #
  @FASLocMTC-20
  Scenario Outline: User should create location and verify the location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify Success alert "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    |           400 | create 20   |

  @FASLocMTC-22
  Scenario Outline: User should create location code is blank and saved, it should show alert
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click create and fill only the details "<Description>"
    Then User should verify Location error messege of "Location Code is Required"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Description |
      | admin    | admin    | description |

  @FASLocMTC-23
  Scenario Outline: User should create location code is duplicate
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify Success alert "Please Change The Location Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    |           300 | duplicate   |

  @FASLocMTC-24
  Scenario Outline: User should create Location with negative code
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify error Alert
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    |            -1 | Negative    |

  #get attribute not done here
  @FASLocMTC-25
  Scenario Outline: User should create Location with decimal code
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify error Alert
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description    |
      | admin    | admin    |           0.1 | Decimal values |

  @FASLocMTC-26
  Scenario Outline: User should create Location with code with value more than 50 values
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify that enter Location code value in field is "12345678910111213141516171819202122232425262728293" without any additional value
    Then User should verify error Alert
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code                                       | Description |
      | admin    | admin    | 123456789101112131415161718192021222324252627282930 | 50values    |

  @FASLocMTC-27
  Scenario Outline: User should create Location with code with value more than  100 words
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>" and "<Description>"
    Then User should verify that enter Location code value in field is "loremipsumloremipsum1234234loremi2342loremipsum111123$%%^&-(^^@-----___+!@++$%!loremipsum$$@%%%@!^&&" without any additional value
    Then User should verify error Alert
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code                                                                                           | Description |
      | admin    | admin    | loremipsumloremipsum1234234loremi2342loremipsum111123$%%^&-(^^@-----___+!@++$%!loremipsum$$@%%%@!^&&123 | 100values   |

  @FASLocMTC-28
  Scenario Outline: User should create without  description, then it should show error
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click parent Location,then click create and fill the details "<Location Code>"
    Then User should verify Description error messege of "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code |
      | admin    | admin    |           001 |

  @FASLocMTC-29
  Scenario Outline: User should enter the Location Description with min 1 word description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location with minimum one letter description "<Location Code>" and "<Description>"
    Then User should verify that enter Location code  and Description value in field is same "<Location Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    |           205 | d           |

  @FASLocMTC-30
  Scenario Outline: User should enter the Location code with alphanumeric
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location code with alphanumeric "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same "<Location Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description  |
      | admin    | admin    | 147f          | alphanumeric |

  @FASLocMTC-31
  Scenario Outline: User should enter the Location code with special characters
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location code with special characters "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same  "<Description>"
    Then User should verify Location error messege of "Location Code is Required"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    | $%^@          | special     |

  @FASLocMTC-32
  Scenario Outline: User should Validate last modify date by should be blank
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location code with alphanumeric "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same "<Location Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should  type the Location on  "<SearchLocation>" and  Check last modify date and last modify by are blank
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description | SearchLocation |
      | admin    | admin    | 04010test     | dtest 400   | dtest          |

  #fishy
  @FASLocMTC-33
  Scenario Outline: User should  edit the Location , then it should be able to edit Location code and description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location code with "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same "<Location Code>" and "<Description>"
    Then User should verify Alert and Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    | 423f          | Check Edit  |

  @FASLocMTC-34
  Scenario Outline: User should  edit the Location , then it should be able to edit Location code and description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should create the Location code with "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same "<Location Code>" and "<Description>"
    Then User should verify Alert and Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description |
      | admin    | admin    | 423f          | Check Edit  |

  @FASLocMTC-35
  Scenario Outline: User should update the Location, then it should have last modify by and last modify date.
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should update the Location code with "<Location Code>" and "<Description>"
    Then User should verify that enter Location code in field is same "<Location Code>" and "<Description>"
    Then User should verify Alert and Success messege of "Record Saved Successfully."
    When User should  type the Location on  "<SearchLocation>" and  Check last modify date and last modify
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Location Code | Description | SearchLocation |
      | admin    | admin    |           350 | Update      | Test Location  |

  @FASLocMTC-36
  Scenario Outline: User should verify the Location Module audit log function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the Location on  "<SearchLocation>" and click Location audit log on next tab
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchLocation |
      | admin    | admin    | Test Location  |

  @FASLocMTC-37
  Scenario Outline: User should verify the Location Module search function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the Location on  "<SearchLocation>" and  Check last modify date and last modify
    Then User should click edit and click cancel button
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchLocation |
      | admin    | admin    | Test Location  |

  #need to run more times
  @FASLocMTC-38
  Scenario Outline: User should delete the location and it should as deleted successfully alert
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should  type the Location on  "<SearchLocation>" and click delete
    Then User should verify delete messege of "Record Deleted Successfully"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchLocation |
      | admin    | admin    | Check Edit     |

  @FASLocMTC-39
  Scenario Outline: User should delete the location and it should as deleted successfully alert
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click the parent location and try to delete the location
    Then User should verify reference messege of "Reference Found"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASLocMTC-40
  Scenario Outline: User should select location and click view,it should show the details of the location
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Location on Master
    Then User should verify the Location list page and title of  "Location List"
    When User should click the parent location and click view
    Then User should verify the field "Location Code"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
