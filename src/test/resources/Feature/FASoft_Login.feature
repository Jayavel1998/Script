@loginModule
Feature: To Validating FASoft Login Page

  @login @FASTCLM-16
  Scenario Outline: Validating FASoft login page with valid credentials
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASTCLM-13
  Scenario Outline: Validating FASoft login page with Invalid credentials
    Given User is on FASoft login page
    When User should login using invalid credentials "<InUserName>" and "<InPassword>"
    Then After User should verify the Error message  "Invalid User name or Password"

    Examples: 
      | InUserName | InPassword |
      | admin123   | admin321   |

  @FASTCLM-08 @logAlpha
  Scenario Outline: Validating FAsoft login page with alphanumeric with special characters credentials
    Given User is on FASoft login page
    When User should login using Alphanumeric with special characters "<UserName>" and "<Password>"
    Then After User should verify the Error message  "Invalid User name or Password"

    Examples: 
      | UserName | Password |
      | FA@123   | FA@123   |

  @FASTCLM-11
  Scenario Outline: Validating  the login with valid username with blank password
    Given User is on FASoft login page
    When User should login using Alphanumeric with special characters "<UserName>"
    Then After User should verify the Error message  "Invalid User name or Password"

    Examples: 
      | UserName |
      | admin    |

  @FASTCLM-12
  Scenario Outline: Validating  the login with  blank username with vaild password
    Given User is on FASoft login page
    When User should login blank username with vaild password "<Password>"
    Then After User should verify the Error message  "Invalid User name or Password"

    Examples: 
      | Password |
      | admin    |

  @FASTCLM-09
  Scenario Outline: Validating FASoft login page Remember Me  function
    Given User is on FASoft login page
    When User should "<UserName>" and "<Password>" click Remember Me check box and Check its clicked

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASTCLM-10
  Scenario Outline: Validating FASoft login page Remember Me  function
    Given User is on FASoft login page
    When User should "<UserName>" and "<Password>" click Remember Me check box and Check its not clicked

    Examples: 
      | UserName | Password |
      | admin    | admin    |

  @FASTCLM-14
  Scenario Outline: Validating FASoft login page with  valid username and  invalid password
    Given User is on FASoft login page
    When User should login using valid username and  invalid password  credentials "<UserName>" and "<InPassword>"
    Then After User should verify the Error message  "Invalid User name or Password"

    Examples: 
      | UserName | InPassword |
      | admin    | admin321   |

  @FASTCLM-15
  Scenario: Validating the login with blank username/password with Enter key
    Given User is on FASoft login page
    When User should click Enter button on keyboard
    Then After User should verify the Error message  "Invalid User name or Password"

  @FASTCLM-17
  Scenario Outline: Validating FASoft login out function  whether able to logout and it redirects to login page
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
