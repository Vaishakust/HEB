@polar_allApi
Feature: Polar Different API Automation Tests

@demo_xml_api
Scenario: Princess Get API Test
	Given I have send a "Get" Request validation for "XmlDemoApi" 
	Then I Validate Response code for the request 
	And  I Modify "PetsloverInformation/name" to "vivek"
