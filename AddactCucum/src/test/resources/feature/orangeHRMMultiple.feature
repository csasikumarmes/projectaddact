
Feature: Title of your feature
  I want to use this template for my feature file
Background:
Given Load the URL Orange "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  Scenario: Orange 
    
    And user provide the username and password for ORange HRM
    	 |userName | password |
       |Admin    | admin123 |
      # |Admin1	| admin1234|
       And click the submit for Orange HRM


