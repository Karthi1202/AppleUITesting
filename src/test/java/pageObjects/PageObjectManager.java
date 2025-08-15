package pageObjects;

import org.openqa.selenium.WebDriver;

import StepDefinitions.Homepage;

public class PageObjectManager {
	
	public WebDriver driver;
	public Homeobject homepageobj;
	public Modelobject modelobj;
	public Detailsobject detailobj;
	
	public PageObjectManager(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public Homeobject getHomepage() {
		
		homepageobj = new Homeobject(driver);
		return homepageobj;
		
	}
	
	public Modelobject getModelpage() {
		
		modelobj = new Modelobject(driver);
		return modelobj;
	}
	
	public Detailsobject getdetailpage() {
		detailobj = new Detailsobject(driver);
		return detailobj;
	}

}
