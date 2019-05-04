Feature: facebook Login
As a fb user, I want to enter username and pwd as 

Scenario: Validate fb login scenario1
Given the user is on facebook login page
When he enters "Rajani" as user name
And he enters "pwd" as password
Then check username is present in textbox

Scenario: Validate fb login scenario2
Given the user is on facebook login page
When he enters "Thakare" as user name
And he enters "pwd" as password
Then check username is present in textbox