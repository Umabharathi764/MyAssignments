Feature: Create and Verify Account Name in Salesforce application

Scenario: Create And verify Account Name

Given Launch the browser
And Load the Salesforce Url
And Wait for few seconds
And Enter the username as 'vidyar@testleaf.com'
And Enter the password as 'Sales@123' 
When Click on the Salesforce Login button
Then It should navigate to the next page 
And Wait for few seconds
And Click on the Toggle Menu from the left corner
When Click on View All
Then It should open App Launcher Window
And Click on Sales
And Wait for few seconds
And Click on Accounts Tab
When Click on New button
Then It should open New Account Window
And Enter the account name as 'Demo User'
And Click the Ownership dropdown
And Select the Ownership as Public 
When Click on Save
Then Verify the Account Name
