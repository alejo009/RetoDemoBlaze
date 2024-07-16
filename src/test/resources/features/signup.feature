Feature: Signup users
  Scenario Outline: Signup a new user
    Given that "user" has opened the store
    When he enters a name  and password
    Examples:
      | placeholderUserName | placeholderPassword |
      | pepito              | W6TQoyaR3ba9Fg      |

