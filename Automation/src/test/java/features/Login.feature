Feature: Test OrangeHRM

  Scenario: Test login with valid credentials
    Given Open chrome and launch application
    When I enter username and password
    Then user can able to see the home page

  Scenario Outline: Title of your scenario outline
    Given Open chrome and launch application
    When I enter username "username" and password "password"
    #Then user can able to see the home page

    Examples: 
      | username| password | 
      | Admin   | admin123 |
      | Himaja  | 4568     |
      
