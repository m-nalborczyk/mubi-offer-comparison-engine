@compare-car-insurance
Feature: Mubi - Compare Vehicle Insurance Offers Page

  Background:
    Given I access Mubi insurance offer comparison page
    When I accept cookies popup
    And I choose OC AC Insurance
    And I click on 'Compare offers'

  Scenario: Validate Successful Submission For Car OC Insurance Offers - Specific Data
    And I choose car insurance
    And I choose a specific year from the drop down list 2002
    And I choose a specific brand from the drop down list VOLKSWAGEN
    And I choose a specific model from the drop down list PASSAT
    And I choose a specific fuel from the drop down list DIESEL
    And I choose a specific engine size from the drop down list 1896cm3
    And I choose a specific doors amount from the drop down list 5doors
    And I choose a specific version from the drop down list COMFORTLINE
    And I enter a specific date for start of the insurance 01122023
    And I consent mandatory regulations
    And I choose for private usage
    And I enter a specific mileage 330 thousands km
    And I enter a specific 12-month prediction distance up to 20k km
    And I enter a specific date of first registration 29042002
    And I choose a specific year of car purchase 2003
    And I choose a specific country of first registration Poland
    And I enter a specific registration plate number SB49033
    And I choose common garage parking spot from drop down list
    And I choose a specific previous Insurer Euroins
    And I choose less amount of offers without providing personal details
    And I enter owner's specific date of birth 01.01.1990
    And I choose a specific year of getting driver's licence 2008
    And I enter a specific address postal code 43-300
    And I choose male gender
    And I choose single martial status
    And I choose not having children below 26 years old
    And I choose 0 additional owners of the car
    And I choose no additional users of the car
    And I choose as the owner buying OC insurance for at least 6 years
    And I choose no OC insurance ever claimed
    And I choose no AC insurance history
    And I click on CALCULATE button
    Then I should be presented with successful offers page



