@Full
Feature: To test Google1

@Sanity @SB
Scenario: To launch Google1
Given The Google website is launched
When Search bar is visible
Then Enter text Hello

@Regression
Scenario: To launch Google2
Given The Google website is launched
When Search bar is visible
Then Enter text Hello

@Sanity
Scenario: To launch Google3
Given The Google website is launched
When Search bar is visible
Then Enter text Hello

@SB
Scenario: To launch Google4
Given The Google website is launched
When Search bar is visible
Then Enter text Hello

@Sanity @SB
Scenario: To launch Google5
Given The Google website is launched
When Search bar is visible
Then Enter text Hello