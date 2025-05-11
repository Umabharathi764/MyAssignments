Feature: DeleteLead functionality of Leaftaps application
@Lead
Scenario Outline: Delete Lead with multiple data

And Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click on the Login button
Then It should navigate to the next page
When Click on the CRMSFA link
When Click on the Leads link
When Click on the CreateLead link
Given Enter the companyname as <companyName>
Given Enter the firstname as <firstName>
Given Enter the lastname as <lastName>
Given Enter the department name as <deptName>
Given Enter the description as <description>
Given Enter the email address as <email>
And Select the state province as <province>
When Click on the CreateLead button
Then Lead should be created
When Click on the Findleads link
And Search the firstname as <firstName>
And Search the lastname as <lastName>
And Search the companyname as <companyName>
When Click on the FindLeads button
Then CreatedLead should be displayed
And Click on LeadID Link
And Click on Delete button
When Click on the Findleads link
And Search the Lead ID
When Click on the FindLeads button
Then Validate the Lead is deleted successfully

Examples:
|companyName|firstName|lastName|deptName|description|email|province|description|impNote|
|Wipro|Uma|B|IT|This is created by Uma|testdemo01@gmail.com|New York|This is updated by Uma B|Testing Purpose - Uma B|
|Infy|Vasu|S|HR|This is created by Vasu|testdemo02@gmail.com|Texas|This is updated by Vasu S|Testing Purpose - Vasu S|