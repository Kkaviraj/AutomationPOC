
@WebTable
Feature: WebTable

   @Webtable_001
  Scenario: Find the Number of column in the table
   Given As a user i want lanch the application
   When Ensure table button in enabled and click 
   Then Find the number of columns present
   When Find the nuber of rows present
   
   @Webtable_002
  Scenario: Find the Number of column in the table
   Given As a user i want lanch the application
   When Row wise get all datas and write in the excel sheet
   
   
   
   