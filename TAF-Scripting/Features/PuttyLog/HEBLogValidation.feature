@HEB @SAM-180 @USTI-22064
Feature: Log validation
  I want to validate different logs from the server

  @cashtransaction
  Scenario: Validate the flow of cash transaction
    Given I have a server with logs
    And I connect the server with credential
    When I get the file name for the live logs
    And I send a request for the live logs
   	Then I Search for the Transaction with id "983373"
    Then I validate the flow of transaction for cash

  @cardTransaction
  Scenario Outline: Validate the flow of card transaction
  	Given I have a server with logs
    And I connect the server with credential
    When I get the file name for the live logs
    And I send a request for the live logs
   	Then I Search for the Transaction with id "983374"
    Then I validate the flow of transaction for card
