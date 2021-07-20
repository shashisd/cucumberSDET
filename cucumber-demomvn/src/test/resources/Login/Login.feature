Feature: To validate login Application

Background: Given Login page
#Scenario: To test login with credentials


#When  enter valid username "Admin"
#And enter Valid password "admin123"
#And click on submit
#Then i should see username "Welcome Paul"

Scenario Outline: To test login with credentials

When  enter valid username "<name>"
And enter Valid password "<pwd>"
And click on submit
Then i should see username "<loginname>"
Examples: 
|name|pwd|loginname|
|Admin|admin123|Welcome Paul|
|Admin|admin123|Welcome Paul|

#Scenario: To test login with Invalid credentials
#When  enter Invalid username "shashi"
#And enter InValid password "shashi123"
#And click on submit
#Then i should see invalid username "Invalid credential"
