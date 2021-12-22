@add

Feature: Add a user and validate the user 
Scenario Outline: Add a user and validate the user has been added to the table

Given the user naviagtes to  Teladoc homepage
When I click add user
And I enter the "<First Name>"
And I enter my "<Last Name>" 
And I enter my "<Username>" 
And I enter the "<Password>"
And I select Company AAA as customer company
And I select Customer as role
And I ennter my "<E-mail>"
And I entter "<Cell Phone>"
And I click save
Then I can see the added user 

Examples: 
|First Name|Last Name|Username  |Password  |E-mail                  |Cell Phone       |
|Fahim     |Alam     |fahimalam |abcdf     |fahim@gmail.com         |3470901212       |