@categoryModule
Feature: To Validating the FASoft Category Module

  @cat
  Scenario Outline: User should verify the Category Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-03
  Scenario Outline: User should click on the parent and its shows list of child category
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click on the parent category  and its should show all the list of child category
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-06
  Scenario Outline: User should verify the Category Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click on the parent category  and return click the parent Category
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-07
  Scenario Outline: User should verify the Category Module search function
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  type the Category on  "<SearchCategory>" , it should show the category on the tree structure
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchCategory |
      | admin    | admin    | Test Category  |

  ##no assert is here .
  ##
  @FASCMTC-08
  Scenario Outline: User should verify the Category Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  type the Incorrect Category on  "<SearchCategory>" , then its show the result as no category available
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchCategory |
      | admin    | admin    | abcdefgh       |

  @FASCMTC-09
  Scenario Outline: User should verify the Category Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  type the Category on  "<SearchCategory>" , removing the category name on search
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchCategory |
      | admin    | admin    | Test Category  |

  @FASCMTC-11
  Scenario Outline: User should verify the Category Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should not select any format and click Export
    Then Alert should be shown "Please Select Export Type To Export Data"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-12
  Scenario Outline: User should export the Category as Excel
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  select Docment format of Export To Excel and click Export
    Then After that Excel format of  "category.xls" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-13
  Scenario Outline: User should export the Category as PDF
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  select Docment format of Export To PDF and click Export
    Then After that pdf format of  "category.pdf" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-14
  Scenario Outline: User should export the Category as CSV
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  select Docment format of Export To CSV and click Export
    Then After that CSV format of  "category.csv" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-15
  Scenario Outline: User should export the Category as XML
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  select Docment format of Export To XML and click Export
    Then After that XML format of  "category.xml" should be download
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @creat
  Scenario Outline: User should create Category and verify the Category
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should click create and fill the details "<Category Code>" and "<Description>"
    Then User should verify the created Category is present or not
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |          1111 | Selenium    |

  ## need to add assert
  @childCategory
  Scenario Outline: User should create Category and verify the Category
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should click parent Category,then click create and fill the details "<Category Code>" and "<Description>"
    Then User should verify the created child Category is present or not
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |           012 | Child 1.2   |

  @FASCMTC-19
  Scenario: User should create Category and verify the Category
    Given User is on FASoft login page
    When User should login using "admin" and "admin"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should click parent Category,then click create and not any fill the details
    Then User should verify error messege of "Category Code is Required" and "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

  #category name is accepting dublicate
  @FASCMTC-21
  Scenario Outline: User should create Category with duplicate code and duplicate name
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the category with duplicate name "<Category Code>" and "<Description>"
    Then User should verify alert "Category Code Already Exists"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |          1001 | Selenium    |

  @FASCMTC-25
  Scenario Outline: User should create Category with negative code
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the category with negative Code "<Category Code>" and "<Description>"
    Then User should verify error messege of "Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |            -1 | Negative    |

  @FASCMTC-26
  Scenario Outline: User should create Category code with decimal values
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the category with decimal Code "<Category Code>" and "<Description>"
    Then User should verify error messege of "Category Code Already Exists"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description    |
      | admin    | admin    |           0.1 | Decimal values |

  #since in master setting configuration category code length was set for 20
  @FASCMTC-27
  Scenario Outline: User should create Category code with value more than 20
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the category with greater than twenty letters "<Category Code>" and "<Description>"
    Then User should verify that enter category code value in field is "12345678910111213141" without any additional value
    Then User should verify error messege of "Please Change The Category Code First3characters, Because When Generate Auto Barcode Is Allow Duplicate"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code                   | Description |
      | admin    | admin    | 1234567891011121314151617181920 | 20Values    |

  @FASCMTC-28  #@error
  Scenario Outline: User should  enter the category description with 101 words
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the Description with greater than Hundred  letters "<Category Code>" and "<Description>"
    Then User should verify that enter Description code value in field is "loremipsumloremipsum1234234loremi2342loremipsum111123$%%^&+(^^@-----___+!@++$%!loremipsum$$@%%%@!^&&" without any additional value
    Then User should verify error messege of "Category Code Already Exists"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description                                                                                             |
      | admin    | admin    |           001 | loremipsumloremipsum1234234loremi2342loremipsum111123$%%^&+(^^@-----___+!@++$%!loremipsum$$@%%%@!^&&123 |

  @FASCMTC-29  @error
  Scenario Outline: User should create without  description, then it should show error
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click create and fill  only Category code without description "<Category Code>"
    Then User should  verify the field-validation-error messege  "Description is required."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code |
      | admin    | admin    |           001 |

  @FASCMTC-30  @error
  Scenario Outline: User should enter the Category Description with min 1 word description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the category with minimum one letter description "<Category Code>" and "<Description>"
    Then User should verify that enter Description code value in field is same "<Category Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |           205 | d           |

  @FASCMTC-31 #@error
  Scenario Outline: User should enter the Category code with alphanumeric
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the Category code with alphanumeric "<Category Code>" and "<Description>"
    Then User should verify that enter Category code in field is same "<Category Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description  |
      | admin    | admin    | 147f          | alphanumeric |

  @FASCMTC-33 #@error
  Scenario Outline: User should Validate last modify date by should be blank
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should create the Category code with alphanumeric "<Category Code>" and "<Description>"
    Then User should verify that enter Category code in field is same "<Category Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should  type the Category on  "<SearchCategory>" and  Check last modify date and last modify by are blank
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description | SearchCategory |
      | admin    | admin    | 04010test     | dtest 400   | dtest          |

  @FASCMTC-34 #@error
  Scenario Outline: User should  edit the category , then it should be able to edit category code and description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click on the parent category  and its should show all the list of child category
    When User should create the Category code with "<Category Code>" and "<Description>"
    Then User should verify that enter Category code in field is same "<Category Code>" and "<Description>"
    Then User should verify Alert and Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    | 423f          | Check Edit  |

  @FASCMTC-35 #@error
  Scenario Outline: User should edit the category and save the category
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click Category and edit the category
    When User should edit the Category code with "<Category Code>" and "<Description>"
    Then User should verify Alert and Success messege of "Record Saved Successfully."
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    |           200 | Selenium    |

  @FASCMTC-36 #@error
  Scenario Outline: User should Validate last modify date
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should update the Category code with "<Category Code>" and "<Description>"
    Then User should verify Success messege of "Record Saved Successfully."
    When User should Check last modify date and last modify
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | Category Code | Description |
      | admin    | admin    | test          | dtest 400   |

  @FASCMTC-37 #@error
  Scenario Outline: User should verify the Category Module audit log
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should click Category on  "<SearchCategory>" and click Category audit log
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password | SearchCategory |
      | admin    | admin    | dtest 400      |

  @FASCMTC-38 #@error
  Scenario Outline: User should verify the Category Module edit and click cancel button
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    Then User should click parent category edit and click cancel button
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-39 #@error
  Scenario Outline: User should delete the Category and it should as deleted successfully alert
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Location list page and title of  "Category List"
    When User should click Category and click delete
    Then User should verify Category delete messege of "Record Deleted Successfully"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASCMTC-41  
  Scenario Outline: User should  edit the category , then it should be able to edit category code and description
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Category on Master
    Then User should verify the Category list page and title of  "Category List"
    When User should  click on the parent category
    When User should  click view and shows the details of selected Category
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
