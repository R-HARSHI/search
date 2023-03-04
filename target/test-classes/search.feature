Feature: Search functionality of Payback website
   I want to test the search functionality of payback website.

   Scenario: Using the I Wish To Dropdown
    Given user is on the Payback homepage
    Then user click on the I Wish To dropdown menu
    
   Scenario: Earn points
		Given user is on the Paybackk homepage
		When  User click on I wish to dropdown
		And User select Earn Points
		Then User should  search the product 
	 
	 Scenario: Searching for a product
    Given user is on the Payyback homepage
    When User click on I wish too dropdown
    And User select Earnn Points		    
		And User click on the search bar
    And User type the any keyword
    Then User should see a list of search results related to that keyword
   
   Scenario: Filtering Results on the Payback website
    Given userr is on the Payback homepage
    When User click on I wish to droppdown
    And User select Earn Pointss		  
    And user click on thee search bar
    And User type thee any keyword
    And User see a list of search results
    Then User should see a Filter on the page
    And Under filter User should see a list of available filters, such as price, brand, discount, etc.
    And User should be able to select one or more filters
    Then User should see my search results update to reflect the selected filters
   
   Scenario: Sorting Results on the Payback website
    Given user is onn the Payback homepage
    When User clickk on I wish to dropdown
    And User selectt Earn Points		  
    And user click on the searchh bar
    And Userr type the any keyword
    And User seee a list of search results
    And User should be able to click on the Sort by drop-down button
    And User should see a list of available sorting options, such as discount , price, popularity, etc.
    And User should be able to select one sorting options
    Then User should see my search results update to reflect the selected sorting options
    
   