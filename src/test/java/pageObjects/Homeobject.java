package pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Homeobject {
	
	WebDriver driver;
	
	
	public Homeobject(WebDriver driver) {
		this.driver = driver;
	}

	public void find(String string) throws InterruptedException 
	{
		Thread.sleep(5000);
		WebElement product = driver.findElement(By.xpath("//a[@data-globalnav-item-name='"+string+"']"));
		product.click();
	}
	
	

}
