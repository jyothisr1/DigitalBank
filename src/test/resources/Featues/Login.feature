Feature: Validate login page
  Scenario: verify user can signUp and login
    Given user open the website
    Then verify user is on login page
    When user click on signup
    Then verify user is on signup page
    When user enters all the required details
    Then verify user is on login page
    When user enters username "username.name1" and password "username.name2"
    And user click on login button
    Then verify user is on home page