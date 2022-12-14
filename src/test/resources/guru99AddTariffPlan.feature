Feature: Guru99 Add Tariff Plan Feature


  @Smoke
  Scenario: VerifyAdd Tariff Plan

    Given The user wants to see Guru demo site
    When The user wants to Add Tariff Plan
    Then The user wants to verify "Add Tariff Plans" header
    Then The user wants to Add Tariff Plan details as
      | Monthly Rental| 10|
      | Free Local Minutes| 12|
      | Free International Minutes| 13|
      | Free SMS Pack| 15|
      | Local Per Minutes Charges| 18|
      | International Per Minutes Charges| 25|
      | SMS Per Charges| 28|
    And The user wants to submit
    Then The user wants to verify message as "Congratulation you add Tariff Plan"

@Smoke
  Scenario Outline: Verify that we can add customers
    Given The user wants to see Guru demo site
    When The user wants to add a customer
    Then The users wants to verify "Add Customer" header
    Then The user wants to enter background check as "<bCheck>"
    Then The user wants to enter billingaddress as "<fName>" and "<lName>" and "<email>" and "<address>" and "<pNumber>"
    And The wants to verify message as "Access Details to Guru99 Telecom"
    Examples:
      |bCheck |fName |lName| email           |address     |pNumber  |
      |Done   |Joe   |Dave |joedave@gmail.com|10 fake st  |123456789|
      |Pending|Jason |Dave |jason@gmail.com  |11 fake st  |789654123|