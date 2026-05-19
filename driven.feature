Feature: login
Scenario: valid login
Given open anybrowser
|chrome|
|firefox|
|ie|
And nevigate to Facebook.com
When i type my valid userId
And i type my valid pass
And i click on login button
Then as a user i should be on login page