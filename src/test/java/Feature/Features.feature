Feature: Customer Api Crud Operation TesTing

  Scenario: create new customer using post request
  
    Given user configure Base URI
    And user get RequestSpecification Interface object
    And user add Request Header
    And user create request body using Serialization and Deserialization
    And user add request body for Post request
    When user select HTTP Post request
    Then user capture status code
    And user capture status line
    And user capture response time
    And user capture response body
    And user capture response headers
    And user capture id from response body
