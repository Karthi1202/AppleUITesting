package pageObjects;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Generics;


public class Homeobject extends Generics{
	
	WebDriver driver;
	
	
	public Homeobject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void find(String string) throws InterruptedException 
	{
		WebElement product = driver.findElement(By.xpath("//a[@data-globalnav-item-name='"+string+"']"));
		
		waitforElement(product);
		
		product.click();
	}
	
	

}
