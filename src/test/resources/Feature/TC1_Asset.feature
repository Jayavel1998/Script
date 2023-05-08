Feature: To Validating the FASoft Asset Module

  @asset
  Scenario Outline: User should verify the Asset Module
    Given User is on FASoft login page
    When User should login using "<UserName>" and "<Password>"
    Then After login User should verify the total Asset on Dashboard  "Total No Of Asset"
    When User should click Asset on Master
    Then User should verify the Asset list page and title of  "Asset List"
    When User should click Logout button in dashboard
    Then User should  redirects to login page and verify the "Login" button

    Examples: 
      | UserName | Password |
      | admin    | admin    |
