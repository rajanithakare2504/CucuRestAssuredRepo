package com.allfiles;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	WebDriver driver;
	
	@Given("the user is on facebook login page")
	public void the_user_is_on_facebook_login_page(){
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_class_working\\selenium\\chromedriver_win32_B39\\chromedriver.exe");
		  driver= new ChromeDriver();
		 driver.get("https://www.facebook.com");
		
		 }
	
	@When("^he enters \"([^\"]*)\" as user name$")
	public void he_enters_as_user_name(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//table/tbody/tr/td/input[@type='email']")).sendKeys("rajnithakare@gmail.com");
	    
	}

	@When("^he enters \"([^\"]*)\" as password$")
	//"([^\"]*)\- Regular expression- for text eg.- "Rajani"
	public void he_enters_as_password(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//table/tbody/tr/td/input[@type='password']")).sendKeys("rjrobo2504");
	    
	}

	@Then("^check username is present in textbox$")
	public void check_username_is_present_in_textbox()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	@Given("Validate fb login scenario1")
	public void Validate_fb_login_scenario1(){
		
		
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_class_working\\selenium\\chromedriver_win32_B39\\chromedriver.exe");
		  driver= new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  
		 // String bodyText = driver.findElement(By.tagName("body")).getText();
		 // Assert.assertTrue("Text not found!", bodyText.contains(""));
		
		 }
	
	

	
	

}
