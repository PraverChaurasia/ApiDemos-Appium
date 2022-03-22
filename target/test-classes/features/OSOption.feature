Feature:OS

@test7
Scenario Outline: Check one of the option named as SMS messaging
Given App is launched
When User choose os
And User choose SMS Messaging
And User fills data from excel data"<SheetName>" and rownumber <row> and click on send
Then User can see message status

Examples:
|SheetName|row|
|MessageBox|0|
|MessageBox|1|