package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Generics {
	
	WebDriver driver;
	WebDriverWait w;
	Actions a;
	
	public Generics(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public boolean IsElementpresent(By FindBy) {
		
		try {
			WebElement find = driver.findElement(FindBy);
			return true;
		}
		catch(org.openqa.selenium.NoSuchElementException exception){
			return false;
		}	
	}
	
	public void waitforElement(WebElement Element) {
		
		 w=new WebDriverWait(driver, Duration.ofSeconds(5));
		 w.until(ExpectedConditions.visibilityOf(Element)); 
	}
	
	public void movetoElement(WebElement element) {
		a=new Actions(driver);
		a.moveToElement(element).click().build().perform();
	}
	
	
	
	

}
