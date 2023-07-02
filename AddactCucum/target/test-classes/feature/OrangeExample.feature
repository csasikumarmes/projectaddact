@Reg
Feature: Orange HRM

  Background: Login Functionality
    Given provide start time
    Given user provide the url

  @Positive
  Scenario Outline: Login Page
    And user should provide userid and password "<userName>" "<password>"
    And User should click the submit button

    Examples: 
      | userName | password |
      | Admin    | admin123 |

  #   | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin 		| admin123  |
  #  | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin 		| admin123  |
  
  @Negative
  Scenario Outline: Login Page
    
    And user should provide userid and password "<userName>" "<password>"
    And User should click the submit button
 

    Examples: 
     | userName | password  |
     | Admin12  | admin1234 |
   #   | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin 		| admin123  |
    #  | https://opensource-demo.orangehrmlive.com/web/index.php/auth/login | Admin 		| admin123  |
