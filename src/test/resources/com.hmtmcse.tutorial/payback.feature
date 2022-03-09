Feature: Test coupon feature

  Background: User launch freshly installed app and logged in
    Given User launch installed app
    When User click button login
    And User submit Kundennummer
    Then User should be logged in

    Scenario: User activate the first enabled Coupon
      Given User navigate to the Coupon Center
      When User filter the coupons by partner
      And User activate the first enabled Coupon
      Then First enabled Coupon should be activated
