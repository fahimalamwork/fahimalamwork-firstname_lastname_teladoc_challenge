@delete

Feature: Delete user and validate the user
Scenario: Delete user User Name novak and validate user has been delete

Given the user naviagtes to Teladoc homepage
When I click on cross icon
And I click ok button
Then I see the user has been deleted