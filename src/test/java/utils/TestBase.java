package utils;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase{

	public WebDriver driver;
	
	public WebDriver getDriver() throws IOException {
		
		if(driver == null) 
		
		{
			//driver = new EdgeDriver();
			
			driver = new ChromeDriver();
			driver.get("https://www.apple.com/in/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
		return driver;	
	}
	
	
}
