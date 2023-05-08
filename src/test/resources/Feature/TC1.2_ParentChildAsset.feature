Feature: To Validating the FASoft Parent and Child  Asset Module

  @child
  Scenario Outline: User should verify the Parent and Child  Asset Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Parent and Child  Asset on Master
    Then User should verify the Parent and Child  Asset list page and title of  "Parent/ Child Asset"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
