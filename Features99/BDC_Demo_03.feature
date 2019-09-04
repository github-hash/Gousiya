Feature: Guest user actions in Demo webshop

Background:
Given user launched demo webshop app in chrome browser
Then user searches for the item of his choice
And adds the item to the cart
 
Scenario: Registered user access to cart in Demowebshop
Given user launched demo webshop app in chrome browser
Then user searches for the item of his choice
And adds the item to the cart



Scenario: User access to login page of the demo workshop

Given user has valid account creds for DemoWebshop
And provides the valid creds as inputs for the login process
Then verifies the state for the login status