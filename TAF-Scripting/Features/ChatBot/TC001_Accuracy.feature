@Chatbot
Feature: ChatBot accuracy testing

  @Accuracy
  Scenario: Validating the QE360 chatbot
 	  Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
    When I test the chatbot for accuracy using questions in "QE360Scenario" file
    Then I should get the response from chatbot
	@Accuracy
	  Scenario: Validating the chatBot accuracy using phrases Generator
	    Given I am in the login page
	 	  When I enter the credentials and login
	    Then I have QE360 chatbot
	    And I am generating multiple phrases of "How are you"
	    When I test chatbot accuracy using the generated phrases
	    Then I should get the responses from chatbot as below:
	      | Answers                       |
	      | Sorry, I am unable to help with your query at this time, May I help you with another query |
	      | Sorry, this feature is unavailable at this time, May I help you with another query. |
	      | I am doing good, Thank You! |
