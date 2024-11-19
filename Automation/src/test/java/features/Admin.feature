@tag
Feature: Verify Admin page 

  @tag1
  Scenario: Verify Username textbox in the Admin page
    Given launch the browser
    And launch the url
    And enter username and password
    Then click on the login button
    And User can able to see the Admin tab in the home page
    When I click on Admin tab
    Then It should display username textbox
    And enter text to the username textbox
    Then logout the browser 

@tag2
  Scenario: Verify Username textbox in the Admin page
    Given launch the browser
    And launch the url
    And enter username and password
    Then click on the login button
    And User can able to see the Admin tab in the home page
    When I click on Admin tab
    Then It should display username textbox
    And enter text to the username textbox
    And click on the Search button
    Then logout the browser 


