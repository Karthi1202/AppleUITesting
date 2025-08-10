package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Modelobject {
	
	WebDriver driver;
	
	By Buytop = By.className("ac-ln-button");
	By BuyBottom = By.className("detail-ctas-link");
	
	
	public Modelobject(WebDriver driver) {
		this.driver = driver;
	}

	public void select(String string2) {
		WebElement model = driver.findElement(By.xpath("//li[contains(@class,'chapternav-item')]/a"
				+ "[@data-analytics-title='"+string2+"']"));
		model.click();
		
		if(driver.findElement(Buytop).isEnabled()) {
			
			driver.findElement(Buytop).click();
			
		}
		else {
			driver.findElement(BuyBottom).click();
		}
	}
	
	

}
