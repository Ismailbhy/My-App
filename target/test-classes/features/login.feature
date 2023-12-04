Feature: login to The application

Scenario Outline: login the application with data table

Given I open login page
When I enter my username"<username>"
And I enter my password"<password>"
Then I should be logged in

Examples:

| username | password|
|firoza | firoza123  |
|ismail | ismail123  |
|kamrun | kamrun123  |