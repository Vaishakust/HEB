
Feature: Feature file to test database test cases
  I want to use this template for my feature file
    
  @MongoDB
  Scenario: Scenario to verify MongoDB
    Given User initializes connection to mongoDB
    When User Validate value from DataBase
    And User insert value in database
    And User update value based on the Query
    Then User delete value based on the Query
    
   @MySQL
  Scenario: Scenario to verify MySQLDB
   Given User get value based on the Query from mySQLDB
   And User get value with id="1" from mySQLDB
   
   @SQLServer
   Scenario: Scenario to verify SQLServerDB
   Given User get value based on the Query from SQLServerDB
   And User get value with id="1" from SQLServerDB