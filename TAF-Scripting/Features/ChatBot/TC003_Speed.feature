@Chatbot
Feature: ChatBot Speed Testing

  @Speed
  Scenario: Checking the speed of chatbot
    Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
    When I validate the response time taking for scenarios in "PerfSenarioOne" file
    Then I should get the resopnse time matching with provided baseline

  @Speed
  Scenario: Checking the performence of chatbot
    Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
    When I validate the response time taking for scenarios in "PerfSenarioTwo" file
    Then I should get the resopnse time matching with provided baseline

    
    