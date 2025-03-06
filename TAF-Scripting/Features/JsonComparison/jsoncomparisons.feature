@test-json 
Feature: Sample GET method API test For Json Comparison

@comparisonjson 
Scenario: Sample GET method API test for json comparison 
	Given I have sample Get API 
	When I send a "Get" Request with "sampleGETApi" properties 
	Then I should get response code 200 
	When I send a "Get" Request with "sampleGetApi2" properties 
	Then I should get response code 200 
	And I Compare the response from apis and generate report
	
@comparejsonFileAndGenerateReport
Scenario: Sample GET method API test for json comparison 
	Given I have  json files "target.json" and "source.json" for comaparison  
  Then I compare the these file and generate report 