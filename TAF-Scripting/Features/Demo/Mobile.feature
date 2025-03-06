@Smoke @pCloudyScenarios
Feature: Testing applications for mobile smoke tests

  @pCloudyWeb @pCloudyWeb-demo @Excel
  Scenario: TC-05-Validating personal information in Automation practice Mobile
    Given I have logged into "Automation Practice" mobile web
    When I navigate to personal information page in mobile web
    Then I validate personal details in personal information page in mobile web:
      | Social title | First name | Last name  | E-mail address                     | dobDay | dobMonth | dobYear |
      | Mr.          | Blessan    | Thomas    | blessanthomas2@gmail.com | 2      | April    | 1927    |


  @PcloudyNative
  Scenario: User books a flight ticket
    Given I open the pcloudy appium demo native application
    And I login to the application
    And I enter the booking details
    When I click on search flights
    Then I should see booking confirmation message "Wishes you a very Happy Journey..."

  @PcloudyNative @Negative
  Scenario:  User books a flight ticket and validates confirmation message
    Given I open the pcloudy appium demo native application
    And I login to the application
    And I enter the booking details
    When I click on search flights
    Then I should see booking confirmation message "Wishes you a very Happy holiday..."
