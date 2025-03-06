@HEB @SAM-180 @USTI-22064
Feature: Automate robot process
  I want to automate robot interactions

  @robot
  Scenario: Robot interaction automation
    Given I have triggered endpoint to generate Access token
    And I have logged in to HEB
    Then I have added the items
    And I have initiated the payment
    And I have done the payment using demo card tap
    Then I logout from the system


  
