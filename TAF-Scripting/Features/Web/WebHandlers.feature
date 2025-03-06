@WebHandlersFeature

Feature: Test WebHandlers methods on selectors hub website
  WebHandlers Test

  @SHTableLinkClick #methods covered: TblCelLinkClick, getIndexofVal, getWindowHandles
  Scenario: Testing the method TblCelLinkClick in WebHandlers for clicking a link in a given table
    Given I am in SelectorsHub home page
    When I click on "Jasmine.Morgan" link in users table
    Then the total number of tabs opened should be 2
    
  @SHTblCelEleClick #methods covered: TblCelEleClick, getFirstIndexofVal
  Scenario: Testing the method TblCelEleClick in WebHandlers for clicking an element in a given table
    Given I am in SelectorsHub home page
    When I click on the name link which is in column 2 corresponding to "Admin" element in users table
    Then the total number of tabs opened should be 2
    
  @SHTblCelChkboxClick #methods covered: TblCelChkboxClick, chkboxIsChecked
  Scenario: Testing the method TblCelChkboxClick in WebHandlers for clicking a checkbox in a given table
    Given I am in SelectorsHub home page
    When I click on the checkbox which is in column 1 corresponding to "Admin" element in users table
    Then the checkbox should be selected
    
  @SHenterTxtByJavaScript #methods covered: enterTxtByJavaScript, verifyText
  Scenario: Testing the method enterTxtByJavaScript in WebHandlers for entering text using javascript executor
 	  Given I am in SelectorsHub home page
    When I enter '<username>' in user email field using javascript executor
    Then the text '<username>' should be visible in the user email field
    Examples: 
      | username  	|
      | abc.def.com	|
      
  @SHacceptAlert #methods covered: acceptAlert, click, switchToAlert, webElementToBy
  Scenario: Testing the method acceptAlert in WebHandlers for accepting alert
    Given I am in SelectorsHub home page
    When I click on the Click To Open Window Alert button
    Then the alert should be accepted
    
  @SHdismissAlert #methods covered: dismissAlert, click, switchToAlert, webElementToBy
  Scenario: Testing the method dismissAlert in WebHandlers for dismissing alert
    Given I am in SelectorsHub home page
    When I click on the Click To Open Window Alert button
    Then the alert should be dismissed
    
  @SHWindowHandles #methods covered: GetCurrentWindowHandle, swichToNewWindow, closeCurrentWindow, switchToDefaultWindow, getWindowHandles
  Scenario: Testing the methods GetCurrentWindowHandle, swichToNewWindow, closeCurrentWindow, switchToDefaultWindow and getWindowHandles in WebHandlers for handling window handles
    Given I am in SelectorsHub home page
    When I click on "Jasmine.Morgan" link in users table
    Then I should switch to new window
    When I close the new window
    Then I should switch back to parent window
    
   @SHswitchToFrame #methods covered: switchToFrame, click, webElementToBy
   Scenario: Testing the method switchToFrame in WebHandlers for switching frames
    Given I am in SelectorsHub home page
    When I switch frame to iframe
    Then I should be able to click on radio button in the iframe
    
   @SHelementDisabled #methods covered: @elementDisabled, click
   Scenario: Testing the method elementDisabled in WebHandlers for checking whether an element is disabled
    Given I am in SelectorsHub home page
    Then the first name field should be disabled
    When I click on edit button
    Then the first name field should be enabled
    
   @SHelementExists #methods covered: @elementExists
   Scenario: Testing the method elementExists in WebHandlers for checking whether an element exists
    Given I am in SelectorsHub home page
    Then the email field should exist
    And payment field should not exist
    
  @SHenterText #methods covered: enterText, verifyText
  Scenario: Testing the method enterText in WebHandlers for entering text
 	  Given I am in SelectorsHub home page
    When I enter '<username>' in user email field
    Then the text '<username>' should be visible in the user email field
    Examples: 
      | username  	|
      | abc.def.com	|
  
  @SHverifyText #methods covered: verifyText, compareText
  Scenario: Testing the method verifyText in WebHandlers for verifying text
 	  Given I am in SelectorsHub home page
    Then "Volvo" should be selected in the dropdown
    
  @SHTableValues #methods covered: getColMapByIndxVal, getColMapByHdrVal, getRowMapByHdrVal, getRowMapByIndxVal, getTblHeaderVal, getTblBodyVal
  Scenario: Testing the method getColMapByIndxVal, getColMapByHdrVal, getRowMapByHdrVal, getRowMapByIndxVal in WebHandlers for table value operations
 	  Given I am in SelectorsHub home page
    When I search for column index 3 in the table
    Then I should get the map of values where index 1 is "Jasmine Morgan"
    When I search for column header "User Role" in the table
    Then I should get the map of values where index 3 is "Admin"
  	When I search for row header "Jasmine.Morgan" in the table
    Then I should get the map of values where index 3 is "Jasmine Morgan"
    When I search for row index 3 in the table
    Then I should get the map of values where index 1 is "John.Smith"
    