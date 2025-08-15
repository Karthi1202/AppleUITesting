package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import StepDefinitions.Modelpage;
import utils.Generics;

public class Modelobject extends Generics{
	
	WebDriver driver;
	
	By option2 = By.className("ac-ln-button");
	By option1 = By.className("detail-ctas-link");
	
	
	public Modelobject(WebDriver driver)
	
	{
		
		super(driver);
		this.driver = driver;
		
	}

	public void select(String string2) {
		WebElement model = driver.findElement(By.xpath("//li[contains(@class,'chapternav-item')]/a"
				+ "[@data-analytics-title='"+string2+"']"));
		model.click();
		
		
		if(IsElementpresent(option1)) {
			driver.findElement(option1).click();
		}
		else {
			driver.findElement(option2).click();
		}
		
	}

}
