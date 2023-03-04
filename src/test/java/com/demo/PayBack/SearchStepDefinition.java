package com.demo.PayBack;



import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDefinition {
	WebDriver driver;
	@Given("user is on the Payback homepage")
	public void user_is_on_the_Payback_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
		
	}

	@Then("user click on the I Wish To dropdown menu")
	public void user_click_on_the_I_Wish_To_dropdown_menu() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Searchpagefactory top=new Searchpagefactory(driver);

		  top.Iwishto();
		  Thread.sleep(1000);
		  driver.close();
	}

	@Given("user is on the Paybackk homepage")
	public void user_is_on_the_Paybackk_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
	}

	@When("User click on I wish to dropdown")
	public void user_click_on_I_wish_to_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Searchpagefactory top=new Searchpagefactory(driver);

		  top.Iwishto();
	    
	}

	@When("User select Earn Points")
	public void user_select_Earn_Points() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Searchpagefactory top=new Searchpagefactory(driver);

		  
		top.selectEarnPointsOption();
		  Thread.sleep(1000);
	}

	@Then("User should  search the product")
	public void user_should_search_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

	@Given("user is on the Payyback homepage")
	public void user_is_on_the_Payyback_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
	}

	@When("User click on I wish too dropdown")
	public void user_click_on_I_wish_too_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	     Searchpagefactory top=new Searchpagefactory(driver);

		  top.Iwishto();
	}

	@When("User select Earnn Points")
	public void user_select_Earnn_Points() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Searchpagefactory top=new Searchpagefactory(driver);

		  
		top.selectEarnPointsOption();
		  Thread.sleep(1000);
	    
	}

	@When("User click on the search bar")
	public void user_click_on_the_search_bar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Searchpagefactory top=new Searchpagefactory(driver);
		 top.clickSearchButton();
		  Thread.sleep(1000);
	}

	@When("User type the any keyword")
	public void user_type_the_any_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should see a list of search results related to that keyword")
	public void user_should_see_a_list_of_search_results_related_to_that_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	  driver.close();
	}

	@Given("userr is on the Payback homepage")
	public void userr_is_on_the_Payback_homepage() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
	}

	@When("User click on I wish to droppdown")
	public void user_click_on_I_wish_to_droppdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		 Searchpagefactory top=new Searchpagefactory(driver);

		  top.Iwishto();
	
	    
	}

	@When("User select Earn Pointss")
	public void user_select_Earn_Pointss() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Searchpagefactory top=new Searchpagefactory(driver);

		  
		top.selectEarnPointsOption();
		  Thread.sleep(1000);
	}

	@When("user click on thee search bar")
	public void user_click_on_thee_search_bar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("User type thee any keyword")
	public void user_type_thee_any_keyword() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Searchpagefactory top=new Searchpagefactory(driver);
		 top.clickSearchButton();
		  Thread.sleep(1000);
	    
	}

	@When("User see a list of search results")
	public void user_see_a_list_of_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("User should see a Filter on the page")
	public void user_should_see_a_Filter_on_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("Under filter User should see a list of available filters, such as price, brand, discount, etc.")
	public void under_filter_User_should_see_a_list_of_available_filters_such_as_price_brand_discount_etc() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
	}

	@Then("User should be able to select one or more filters")
	public void user_should_be_able_to_select_one_or_more_filters() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Searchpagefactory top=new Searchpagefactory(driver);
		top.checkbox();
		  Thread.sleep(1000);
	}

	@Then("User should see my search results update to reflect the selected filters")
	public void user_should_see_my_search_results_update_to_reflect_the_selected_filters() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

	@Given("user is onn the Payback homepage")
	public void user_is_onn_the_Payback_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.setProperty("Webdriver.chrome.driver","‪chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.payback.in/rewards");
		driver.manage().window().maximize();
	}

	@When("User clickk on I wish to dropdown")
	public void user_clickk_on_I_wish_to_dropdown() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		 Searchpagefactory top=new Searchpagefactory(driver);

		  top.Iwishto();
	
	}

	@When("User selectt Earn Points")
	public void user_selectt_Earn_Points() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Searchpagefactory top=new Searchpagefactory(driver);

		  
		top.selectEarnPointsOption();
		  Thread.sleep(1000);
	}

	@When("user click on the searchh bar")
	public void user_click_on_the_searchh_bar() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		Searchpagefactory top=new Searchpagefactory(driver);
		 top.clickSearchButton();
		  Thread.sleep(1000);
	}

	@When("Userr type the any keyword")
	public void userr_type_the_any_keyword() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User seee a list of search results")
	public void user_seee_a_list_of_search_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User should be able to click on the Sort by drop-down button")
	public void user_should_be_able_to_click_on_the_Sort_by_drop_down_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	
	}

	@When("User should see a list of available sorting options, such as discount , price, popularity, etc.")
	public void user_should_see_a_list_of_available_sorting_options_such_as_discount_price_popularity_etc() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User should be able to select one sorting options")
	public void user_should_be_able_to_select_one_sorting_options() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	  //  throw new io.cucumber.java.PendingException();
		Searchpagefactory top=new Searchpagefactory(driver);
		top.sorting();
		Thread.sleep(1000);
	}

	@Then("User should see my search results update to reflect the selected sorting options")
	public void user_should_see_my_search_results_update_to_reflect_the_selected_sorting_options() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new io.cucumber.java.PendingException();
		driver.close();
	}

}