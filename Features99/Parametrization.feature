Feature: Parametrization of the credentials
 Background: launch the website demoshop
 Given launch using chrome browser
 
 
Scenario Outline: login with different users
Given login button is clicked
Then enter the user credentials "<email>" and "<password>" and login
And click on login to continue


Examples:
|email||password|
|gousiya.biradar@accenture.com||Demo@123|
|nandhini.senthil@accenture.com||S@141901802|