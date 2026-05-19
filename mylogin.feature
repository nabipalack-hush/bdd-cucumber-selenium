Feature: login
Background:
Given open browser
And nevigate to Facebook.com
Scenario: valid login

When i type my valid userId
And i type my valid pass
And i click on login button
Then as a user i should be on login page
@smoke
Scenario: invalid login

When i type my invalid userId
And i type my invalid pass
And i click on login button
Then as a user i should not be on login page

