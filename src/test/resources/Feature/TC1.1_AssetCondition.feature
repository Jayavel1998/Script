Feature: To Validating the FASoft Asset Condition Module

  @condition
  Scenario Outline: User should verify the Asset Condition Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Asset Condition on Master
    Then User should verify the Asset Condition list page and title of  "Asset Condition List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
