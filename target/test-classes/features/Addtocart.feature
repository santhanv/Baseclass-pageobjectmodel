#Author: santhan@your.domain.com
@tag
Feature: Add mobile to cart

  @tag1
  Scenario: Add to cart
    Given User lunch the flipkart application
    And User search a mobile
    When User click the search button
    And User validate the name and cost the mobile
    And User select the mobile
    Then User click the add to cart button
