Feature: Mubi - Compare Car Insurance Offers Page

  Scenario: Validate Successful Car OC Insurance Submission - Specific Data
    Given I access Mubi car insurance offer comparison page
    When I choose car insurance
    And I choose none leased
    And I choose a specific year from the drop down list
    And I choose a specific brand from the drop down list
    And I choose a specific model from the drop down list
    And I choose a specific fuel from the drop down list
    And I choose a specific engine size from the drop down list
    And I choose a specific doors amount from the drop down list
    And I choose a specific version from the drop down list
    And I enter a specific date for start of the insurance
    And I choose for personal use
    And I enter a specific mileage
    And I enter a specific 12-month prediction distance
    And I enter a specific date of first registration
    And I choose a specific date of car ownership start
    And I enter a specific registration plate number
    And I choose common garage parking spot from drop down list
    And I choose 'different' as present car insurer from drop down list
    And I choose less amount of offers without providing personal details
    And I enter owner's specific date of birth
    And I choose a specific year of getting driver's licence
    And I enter a specific address postal code
    And I choose male gender
    And I choose single martial status
    And I choose not having children below 26 years old
    And I choose 0 additional owners of the car
    And I no additional users of the car
    And I choose 'at least 6 years' of buying car insurance from drop down list
    And I choose 'no insurance claims' from drop down list
    And I choose no AC insurance history
    And I click on 'Calculate' button
    Then I should be presented with successful offers page



