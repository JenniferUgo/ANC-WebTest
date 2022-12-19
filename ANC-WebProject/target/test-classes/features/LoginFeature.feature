Feature: Login Screen Testing

   Scenario: Positive Login Test
     Given that browser is up and running
     And user enters url "https://amaninja-concept2.myshopify.com/password"
     And inputs Password "Amaninja!1"
     And clicks on Login button
     Then user should be able to login successfully
