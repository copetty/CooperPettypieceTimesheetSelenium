Feature: User navigates to Revature timesheet website. User logs in and opens timesheet form. 
User fills out and submits timesheet.

Scenario: User navigates to Revature timesheet website. User logs in and opens timesheet form. 
User fills out and submits timesheet.
Given User navigates to rev2.force.com
And User enters username
And User clicks submit
And User enters password
And User clicks login
And User clicks open timesheets
And User enters Monday hours
And User enters Tuesday hours
And User enters Wednesday hours
And User enters Thursday hours
When User enters Friday hours
Then User confirms submit button is on page 

