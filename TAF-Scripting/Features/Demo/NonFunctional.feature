@Smoke @UX_Tests
Feature: Testing applications for smoke tests

  @AccessibilityTest
  Scenario: Perform accessibility test on the given application
    Given I navigate to the application url "http://automationpractice.com/"
    Then I perform accessibility test on the current page with reference "Home Page"
    And I generate the summary report for accessibility

  @ClientPerfTest
  Scenario: Perform client side performance test on the given application
    Given I perform client side performance test on url "http://automationpractice.com/"
    And I generate the summary report for client side performance