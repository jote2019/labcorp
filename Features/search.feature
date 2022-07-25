Feature: apply for Job

Scenario: search to A QA automation Developer position

	Given user launches "www.labcorp.com" website 
	When user click on careers link 
	And user search for "QA Automation Developer" 
	And user click on QA Automation Developer 
	Then user verified job title and job location and job id 
	And user verified first suggested tool as selenium 
	And user verified the third requirement as 5+ years 
	And user verified the first sentence third paragraph The right candidate 
	When user click on Apply now 
	Then user verified job title and job location and job id 
	When user click on return to search page 
	Then user is on the search for job page