@Chatbot
Feature: ChatBot Personalize testing

  @Personalization
  Scenario: Validating the chatbot Personalization
    Given I am in the login page
 	  When I enter the credentials and login
    Then I have QE360 chatbot
    When I test the chatbot with questions in "PersonlizeScenaio" file
    Then I should see chatbot response with personalized sentences 
