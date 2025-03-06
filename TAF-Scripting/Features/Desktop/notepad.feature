@desktop
Feature: DesktopAutomation 
  I want to perform different desktop automation test

  @notepad
  Scenario: notepad write operation
    Given I have a note pad application
    When I Type "hello world" in console 
    Then "hello world" should be displayed