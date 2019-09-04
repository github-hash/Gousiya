Feature: adding some items to cart in demoWebshop




Background: launch the website demowebshop
 Given click on the login button
 Then enter the user credentials
 And click to continue shopping




Scenario: add item into cart
 Given select the category to select products
 And click on add to cart button




Scenario: add another item to cart
 Given select the item 
 Then add the item to cart

