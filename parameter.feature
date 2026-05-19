Feature: login
Scenario Outline:
Given open browser
And nevigate to Facebook.com
When i type my valid userId <email>
And i type my valid pass <text>
And i click on login button
Then as a user i should be on login page

Examples:
|email|text|
|"user1"|"1234"|
|"user2"|"3245"|