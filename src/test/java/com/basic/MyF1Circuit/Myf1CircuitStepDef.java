package com.MyF1Circuit;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;


public class Myf1CircuitStepDef {

	Response res;
	
	@Given("^I want to open ergast site$")
	public void i_want_to_open_ergast_site() {
	    // Write code here that turns the phrase above into concrete actions
		 res =RestAssured.given().get("https://ergast.com/api/f1/2017/circuits.json");
	    
	}

	@Then("^I want to check \"([^\"]*)\" limit$")
	public void i_want_to_check_limit(String arg1)   {
	    // Write code here that turns the phrase above into concrete actions
		String limitvalue =res.getBody().jsonPath().getString("MRData.limit");
		Assert.assertEquals(arg1, limitvalue);
		
	   
	}

	@Then("^check size$")
	public void check_size() {
	    // Write code here that turns the phrase above into concrete actions
		String limitvalue =res.getBody().jsonPath().getString("MRData.limit");
		//Assert.assertThat().body("MRdata.CircuitTable.Circuits.circuitId",hasSize);
		res.then().assertThat().body("MRData.CircuitTable.Circuits.circuitId",hasSize(20));
	}

}
