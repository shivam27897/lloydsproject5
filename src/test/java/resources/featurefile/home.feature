@regression
Feature: home page Test
  As user I want to login into lloyds bank website

  @smoke
  Scenario Outline: user should verify error message with invalid credentials
    Given I am on homepage
    When I click on Logon
    And I enter userid "<id>"
    And I enter password "<pass>"
    And I click on continue button
    Then I should verify error message "<msg>"
    Examples:
      | id     | pass     | msg                                                                               |
      | qwerty | 12344567 | Sorry, we've had to log you off [Error: 1007 ID: 18.558f655f.1677363131.68c45c60] |
      |        |          | There is a problem with some of the information you have submitted.               |
      | rewrrr |          | Please enter a value.                                                             |
      |        | 434565@  | Please enter a value.                                                             |