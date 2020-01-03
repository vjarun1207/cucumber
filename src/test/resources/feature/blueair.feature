Feature: checking the login funtionality
Scenario Outline: Verifying login funtionality by vaild credentials
Given user is in login page
When user given the login credential "<userName>"
Then user given the "<passWord>"
And user clicks the loginbutton

Examples: 
|userName|passWord|
|vijay|92048290384|
|ram|023840834|
|vikram|934r8394834|
