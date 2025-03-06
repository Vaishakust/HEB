@Polar
Feature: POLAR Automation
  I want to use this feature to automate different capabilities of Polar
 
  Scenario: Change Voyage
    Given the user launches the terminal emulator
    When the user enters the POLAR company code
    Then the user logs in with their credentials
    And enters the function value for change voyage 
    And provides the value for voyage field
    When user enter the GDSWEB value with a valid input
    Then validates the message in the voyage screen page

 
 