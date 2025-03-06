@Chatbot
Feature: ChatBot ErrorHandling

  @ErrorHandling
  Scenario: Validating the Static Error Responses from ChatBot
    Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
    When I test chatbot with invalid questions in "InvalidQuestionSetOne" file
    Then I should be able see the chatbot handles the error scenarios by giving below responses:
      | ErrorResponse                            |
      | Sorry, this feature is unavailable at this time, May I help you with another query. |
      
  @ErrorHandling
  Scenario: Validating the Error Responses from ChatBot
    Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
 		When I test chatbot with invalid questions in "InvalidQuestionSetTwo" file
    Then I should be able see the chatbot handles the error scenarios by giving below responses:
      | ErrorResponse                            |
      | Sorry, this feature is unavailable at this time, May I help you with another query. |
      | Well , I didnt get that..Can you rephrase your question please ? For more details enter 'Help' |
