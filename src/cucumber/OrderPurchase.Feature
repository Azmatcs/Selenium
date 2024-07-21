
@tag
Feature: Purchase the Order fromE commerce Wbesite
  I want to use this template for my feature file

  Background:
  Given I landed on Ecommerce Page

  @tag2
  Scenario Outline: Positive test for Submitting the Order
    Given Logged in with username <name> ans password <password>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name         | password     | status  |
      | MM@gmail.com |     Aa@00000 | success |
      