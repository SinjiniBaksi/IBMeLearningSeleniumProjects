Feature: Launch Twitter Login page
Scenario: Login to Twitter
Given Twitter website is launched
When Username field is visible
Then Enter username
And Click next button
When Password field is visible
Then Enter password