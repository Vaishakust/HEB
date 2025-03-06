
@BrokenLink
Feature: Feature file for brokenlink tests
  Test some of the urls in saucedemo

 @XmlExtractLoc
 Scenario Outline: Extract the URLs inside <loc> tag from the url map and verify that the url map for each page contains the expected number of links
    Given the xml is "src/main/resources/BrokenLink/urlmap.xml"
    When I extract all URLs with loc tags
    Then the total number of HTML links in <url> should be <expectedLinkCount> saved in file.
      | url                               | expectedLinkCount |
      | "https://urlmap-aboutPage.xml" 		| 3             	  |
      | "https://urlmap-loginPage.xml"		| 1           	    |
      | "https://urlmap-inventoryPage.xml"| 3           	    |

@aboutPage
  Scenario: Validate all the URLs in the about page of saucedemo. Expected 200 response code and load full page
    Given I have the xml file "https://urlmap-aboutPage.xml" and parse the XML and extract all the URLs
    When I execute all the URLs in parallel and assert the response status code for each URL
    And I wait for all executions to complete
    Then the report is generated
    
 @ValidateResponse
  Scenario: Validate the response of each and every link from the urlmap
   Given the xml is "src/main/resources/BrokenLink/urlmap.xml"
   When I validate the response of each URL inside loc tag
   Then I should get the report