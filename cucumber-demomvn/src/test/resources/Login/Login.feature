Feature: To validate login Application
Scenario: To test login with credentials

Given Login page
When  enter valid username "Admin"
And enter Valid password "admin123"
And click on submit
Then i should see username "Welcome Paul"

