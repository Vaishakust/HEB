@Smoke
Feature: Testing applications for smoke tests

  @web @web-demo @Excel @demo
  Scenario: TC-03-Validating personal information in Automation practice
    Given I launch the application
    When I navigate to personal information page
    Then I validate personal details in personal information page:
      | Social title | First name | Last name | E-mail address           | dobDay | dobMonth | dobYear |
      | Mr.          | Blessan    | Thomas    | blessanthomas2@gmail.com | 2      | April    | 1927    |

  @api @api-demo @demo
  Scenario: Sample GET method API test without parameters
    Given I have sample Get API
    When I send a "Get" Request with "sampleGETApi" properties
    Then I should get response code 200
    And the response should contain:
      | JsonPath        | ExpectedVal                             |
      | data.id         | 2                                       |
      | data.email      | janet.weaver@reqres.in                  |
      | data.first_name | Janet                                   |
      | data.last_name  | Weaver                                  |
      | data.avatar     | https://reqres.in/img/faces/2-image.jpg |
