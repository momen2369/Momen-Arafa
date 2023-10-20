Feature: SauceDemo - Login
  this feature is handling the login functionality to the application

  Scenario Outline: login as a valid user.
    Given the user is on the login screen
    When  the user login using '<username>' and '<password>'
    Then the user should be directed to the inventory page
    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |

  Scenario: login as a locked out user
    Given the user is on the login screen
    When  the user login using "locked_out_user" and "secret_sauce"
    Then  an error message should appear and contain "this user has been locked out"

  Scenario: login without sending credentials
    Given the user is on the login screen
    When  the user login using "" and ""
    Then  an error message should appear and contain "Username is required"

  Scenario: login without sending username
    Given the user is on the login screen
    When  the user login using "" and "secret_sauce"
    Then  an error message should appear and contain "Username is required"

  Scenario: login without sending password
    Given the user is on the login screen
    When  the user login using "standard_user" and ""
    Then  an error message should appear and contain "Password is required"

  Scenario: login with invalid username
    Given the user is on the login screen
    When  the user login using "invalid_username" and "secret_sauce"
    Then  an error message should appear and contain "Username and password do not match any user in this service"

  Scenario: login with invalid password
    Given the user is on the login screen
    When  the user login using "standard_user" and "invalid_password"
    Then  an error message should appear and contain "Username and password do not match any user in this service"
