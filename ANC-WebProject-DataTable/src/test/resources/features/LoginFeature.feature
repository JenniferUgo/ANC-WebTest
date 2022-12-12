Feature: Login Screen Testing with Data Table

  Scenario: Test Valid Password
    Given that browser is up and running
    And user enters url "https://amaninja-concept2.myshopify.com/password"
    And inputs Password with DataTable
      | Amaninja!2 | Amaninja!1 |
    And clicks on Login button
    Then user should be able to login successfully
