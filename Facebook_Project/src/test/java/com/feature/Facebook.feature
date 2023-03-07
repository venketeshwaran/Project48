@TaggedHooks
Feature: Facebook login Project 

Background:
Given User launch the url    
Scenario: Facebook login functionally 
	When User enter a facebook username 
	And User enter a facebook password 
	And User click the login button 
	Then Next page 
	
Scenario: Facebook login functionally 
	When User enter a facebook username 
	And User enter a facebook password 
	And User click the login button 
	Then Next page 
@sanity
Scenario: Facebook login functionally 
	
	When User enter a facebook username "AAA@gmail.com" 
	And User enter a facebook password "111"
	And User click the login button 
	Then Next page 
@smokeTest	
Scenario: Facebook login functionally 
	When User enter a facebook username "BBB@gmail.com" 
	And User enter a facebook password "222" 
	And User click the login button 
	Then Next page 
@regTest	
Scenario Outline:	Facebook login functionally 
	When User enter a facebook username "<username>" 
	And User enter a facebook password "<password>" 
	And User click the login button 
	Then Next page 

Examples:

   |username|password|
   |Akash123@gmail.com|123|
   |Gokul111@gmail.com|222|
   |Ganesh@gmail.com|4444|

Scenario: create a new facebook account
When  user click the new account button
And user sign up with following details
|Abdul|rehman|1234567820|11122233|1|1|2000|
	
	
	
	
	
	
    