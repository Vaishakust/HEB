@Excel
Feature: Excel feature
  Scenarios for excel

  @ColumnWise
  Scenario: Comparing two excel files column wise
    Given I have the following files and sheet names:
      |				 file path					 	|   sheet name   	|
      | C:\Users\194878\Documents\Details1.xlsx 	  | 	Sheet1	  |
      | C:\Users\194878\Documents\Details2.xlsx 	  | 	Sheet1 	  |
    When I compare them column wise
    Then the first file should have all the data from the second file
    
   @RowWise
  Scenario: Comparing two excel files row wise
    Given I have the following files and sheet names:
      |				 file path					 	|   sheet name   	|
      | C:\Users\194878\Documents\Details1.xlsx 	  | 	Sheet1 		  |
      | C:\Users\194878\Documents\Details2.xlsx 	  | 	Sheet1	  |
    When I compare them row wise
    Then the first file should have all the data from the second file