package com.basic.compareEntireJson;

import org.skyscreamer.jsonassert.JSONAssert;
import org.skyscreamer.jsonassert.JSONCompareMode;

import cucumber.api.java.en.Given;

public class TestCompareJson {
	
	
	//LENIENT : means that even if the actual JSON contains extended fields, the test will still pass
	//STRICT : means that if the actual JSON contains extended fields, the test will still FAIL
	
	
	@Given("^user compare two json string$")
	public void user_compare_two_json_string(){
//		
		//Case1: Extra field in expected : PASS
		String actual1 = "{id:123, name:\"Jerry\", mobile:999}";
		String expected1 = "{id:123, name:\"Jerry\"}";
		JSONAssert.assertEquals(expected1, actual1, JSONCompareMode.LENIENT); //seqence same and extra parameters are allowed
//		
//		//case2 : sequence Change : PASS
//		String actual2 = "{ mobile:999, name:\"Jerry\", id:123}";
//		String expected2 = "{id:123, name:\"Jerry\"}";
//		JSONAssert.assertEquals(expected2, actual2, JSONCompareMode.LENIENT);//sequence and no of parameters can vary and it is acceptable.
		
		
//		//Case3: Extra field in expected : FAIL
//		String actual3 = "{id:123, name:\"Jerry\", mobile:999}";
//		String expected3 = "{id:123, name:\"Jerry\"}";
//		JSONAssert.assertEquals(expected3, actual3, JSONCompareMode.STRICT); //No extra parameters allowed
		
//		//case4 : sequence Change : PASS
//		String actual4 = "{name:\"Jerry\", id:123}";
//		String expected4 = "{id:123, name:\"Jerry\"}";
//		JSONAssert.assertEquals(expected4, actual4, JSONCompareMode.STRICT);// no of parameters should be equal in actual and expected
		
//		//case4 : sequence Change : FAIL
//		String actual5   = "{name:\"Jerry\", id:123, mobile:999}";
//		String expected5 = "{name:\"Jerry\", id:123}";
//		JSONAssert.assertEquals(expected5, actual5, JSONCompareMode.NON_EXTENSIBLE);//No of parameters and sequence both should be same
		
	}

}
