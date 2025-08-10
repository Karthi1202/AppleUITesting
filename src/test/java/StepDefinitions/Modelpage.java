package StepDefinitions;

import java.io.IOException;
import java.util.HashMap;

import io.cucumber.java.en.Given;
import pageObjects.Modelobject;
import utils.ExcelReader;
import utils.TestContextSetup;

public class Modelpage extends ExcelReader {
	
	TestContextSetup testContextsetup;
	HashMap<String,String> ExcelData = new HashMap<String,String>();
	public Modelobject modelobjet;
	
	public Modelpage(TestContextSetup testContextsetup) throws IOException {
		this.testContextsetup = testContextsetup;
		ExcelData=ReadData();
	}
	
	@Given("Select the Model of the gagets")
	public void select_the_model_of_the_gagets() {
	    // Write code here that turns the phrase above into concrete actions
	    modelobjet = testContextsetup.pageObjectManager.getModelpage();
	    modelobjet.select(ExcelData.get("Model"));
	}

}
