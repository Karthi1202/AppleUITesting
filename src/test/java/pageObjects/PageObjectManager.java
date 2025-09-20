package pageObjects;

import org.openqa.selenium.WebDriver;

import StepDefinitions.Homepage;

public class PageObjectManager {
	
	WebDriver driver;
	private Homeobject homepageobj;
	private Modelobject modelobj;
	private Detailsobject detailobj;
	
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
