Feature: Guest user actions in Demo webshop
@Sanity

Scenario: Users choice to opt for an account
Given user access the signup page
And gets the credentials

@Regression
Scenario: User access to login page of the demo workshop

Given user has valid account creds for DemoWebshop
And provides the valid creds as inputs for the login process
Then verifies the state for the login status