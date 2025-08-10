package StepDefinitions;


import java.io.IOException;
import java.util.HashMap;

import io.cucumber.java.en.Given;
import pageObjects.Homeobject;
import utils.ExcelReader;
import utils.TestBase;
import utils.TestContextSetup;

public class Homepage extends ExcelReader {
	
	TestContextSetup testContextSetup;
	HashMap<String,String> ExcelData = new HashMap<String,String>();
	
	public Homepage(TestContextSetup testContextSetup) throws IOException {
		
		this.testContextSetup = testContextSetup;
		ExcelData=ReadData();
		
	}

	
	@Given("User is on the Homepage and Click the categorey of the gagets")
	public void user_is_on_the_homepage_and_click_the_categorey_of_the_gagets() {
	   
		Homeobject homeobj = testContextSetup.pageObjectManager.getHomepage();
		homeobj.find(ExcelData.get("Product"));
		
	}
	
	
}
