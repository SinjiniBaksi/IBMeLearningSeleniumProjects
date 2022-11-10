Feature: Launch website http://elearningm1.upskills.in/

Scenario: Launch Registration page
Given Website is launched
When User clicks on Sign up button
Then Registration page is opened

Scenario: User Registration successful
Given Registration page is launched
When User fills up all the mandatory fields
And Click on Registration button
Then Registration successful and next button is displayed

Scenario: Name of user is visible in dropdown
Given After succussful registration Next button is visible
When Click on Next button
Then On the redirected page name of user is visible in dropdown

Scenario: Launch profile page of user  
Given User is able to view their name in dropdown
When Click on name dropdown
And Click on Profile link
Then User is navigated to profile page

Scenario: User is navigated to Compose Message page
Given User is on profile page
When User clicks on Messages link
And User clicks on Compose message button
Then User is navigated to Compose Message page

Scenario: Send message
Given User is on Compose Message page
When User enters the subject of the message
And Clicks on Send message button
Then Message is sent
