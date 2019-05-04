package com.basic.Google;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class MyGoogleStepDef {
	
	Response res;
	
	@Given("^I want to open Google$")
	public void i_want_to_open_Google()  {
	    // Write code here that turns the phrase above into concrete actions
		 res =RestAssured.given().get("https://www.google.com");
		
	    
	}

	/*@Then("^I want to check status code$")
	public void i_want_to_check_status_code()  {
		int stcode = res.getStatusCode();
		Assert.assertEquals(200, stcode);*/
		
		@Then("^I want to check \"([^\"]*)\" status code$")
		public void i_want_to_check_status_code(String statuscode)  {
		    // Write code here that turns the phrase above into concrete actions
			int stcode = res.getStatusCode();
			String ssStCode =Integer.toString(stcode); //to change integer to string i.e. 200
			Assert.assertEquals(statuscode, ssStCode);
	    
	 
	    
	}

}
