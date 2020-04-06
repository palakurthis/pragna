Feature: Login
Scenario: Login button with invalid user id and password
Given Enter build path
When  user enters invalid userid and passwrd
Then user should get an error message like "invalid login"