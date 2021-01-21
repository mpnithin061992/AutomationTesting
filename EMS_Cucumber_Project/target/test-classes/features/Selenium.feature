Feature: Super Admin Functionality

@SuperAdmin
Scenario: Checking the Plant addition fuctionality
Given User is in Home Page by entering and submitting the email id "nmp1@its.jnj.com" from JJEDS Login and having superadmin access
When User navigates to Settings page
And Clicks Plant icon
And clicks on Add Plant
And provides the below details in Plant Name,Serial Number,Region Name,Country Name,OPCO Name,Sector Name,Primary Owner Email,Secondary Owner Email,Description
|	Test Dummy Plant3	|	800	|	Region-1	|	India	|	Opco-1	|	Sect-1	|	nmp1@its.jnj.com	|	sreji@its.jnj.com	|	Description	|
And click on Submit
Then Esignature page must be displayed with user entering the below details
| nmp1	|	Revolution@900	|	I Acknowledge |	Add Plant	|
And User must able to click on sign
And follwoing success message must be displayed "Plant added successfully"


Scenario: Checking the Valdation of the Plant addition Page
Given User is in Home Page by entering and submitting the email id "nmp1@its.jnj.com" from JJEDS Login and having superadmin access
When User navigates to Settings page
And Clicks Plant icon
And clicks on Add Plant
Then check if the submit button is disabled
And Primary Owner email & Secondary owner email is not accepting normal character like "abcd" 