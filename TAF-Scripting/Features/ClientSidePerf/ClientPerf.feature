
@ClientPerform
Feature: Client side performance
  I want to use this template for Client side performance

  @ClientPerfTest
  Scenario: Client side performance evaluation for WebApp
     Given I perform client side performance test on url "https://www.saucedemo.com/"
     Then I navigate to the HomePage
     And I generate the summary report for Home Page