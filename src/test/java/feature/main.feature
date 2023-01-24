Feature:To Automate this controls

Background:User navigate to url
When User needs to navigate the url


  Scenario: To fill Essential Things
    Then User needs to fill all the Details like Username,Password etc..

    Scenario: To fill Name And Click Links
    Then User need to fill name
    When User clicks the checkout link it direct to another Page

      Scenario: To Select Cars
        When user needs to Select car from cars selection
        Then  User needs to print the cars
    Then User needs to click the submit button

        Scenario: User needs verify Testers Food link
          When The user click on the Testers Food link
          Then the link should be opened in another window

  Scenario: User needs to verify password Textbox
    When the user enters password
    Then the password should be "password"

  Scenario: User needs to verify coffee time text box
    When the user enters text in the coffee time textbox
    Then the text should be "yes"

    Scenario: User needs to verify the System Distribution
      When user enters item in search box
      Then it displays in tables related to item



