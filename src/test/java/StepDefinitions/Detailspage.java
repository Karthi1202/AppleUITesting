package StepDefinitions;

import java.io.IOException;
import java.util.HashMap;

import io.cucumber.java.en.Given;
import pageObjects.Detailsobject;
import utils.ExcelReader;
import utils.TestContextSetup;

public class Detailspage extends ExcelReader{
	
	TestContextSetup testcontextsetup;
	HashMap<String,String> ExcelData = new HashMap<String,String>();
	
	public Detailspage(TestContextSetup testcontextsetup) throws IOException {
		
		this.testcontextsetup = testcontextsetup;	
		ExcelData=ReadData();
	}
	
	@Given("Fill the Details and add to cart")
	public void fill_the_details_and_add_to_cart() {
		
		Detailsobject detailobj = testcontextsetup.pageObjectManager.getdetailpage();
		detailobj.selectmodel(ExcelData.get("Size"));
		detailobj.color(ExcelData.get("Color"));
		detailobj.selectstorage(ExcelData.get("Storage"));
		detailobj.tradein(ExcelData.get("Tradein"));
		detailobj.coverage(ExcelData.get("Coverage"));
		detailobj.addtocart();
	}

}
