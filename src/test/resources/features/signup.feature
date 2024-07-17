#language en
Feature: Signup users

  Scenario Outline: Signup a new user
    Given that "user" has opened the store
    When he enters a name  and password
    Then he should see an alert with the text Signup successful.
    Examples:
      | placeholderUserName | placeholderPassword |
      | pepito              | W6TQoyaR3ba9Fg      |