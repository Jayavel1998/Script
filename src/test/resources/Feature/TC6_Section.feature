Feature: To Validating the FASoft Section Module

  @section
  Scenario Outline: User should verify the Section Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Section on Master
    Then User should verify the Section page and title of  "Section List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
