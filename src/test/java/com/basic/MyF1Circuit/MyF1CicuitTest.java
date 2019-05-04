package com.basic.MyF1Circuit;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/com/basic/B17GoogleTest/MyF1CircuitFF.feature"}, //copy feature file in resources folder and give path here
		glue={"com/basic/MyF1Circuit/"} //glue is used for Java file path i.e. step def file
		)

public class MyF1CicuitTest {

}
