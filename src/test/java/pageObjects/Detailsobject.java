package pageObjects;

import java.time.Duration;
import java.util.List;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.Generics;

public class Detailsobject extends Generics{
	
	public WebDriver driver;
	
	
	By Button = By.className("button-block");
	

	public Detailsobject(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public void selectmodel(String string) {
		WebElement display = driver.findElement(By.xpath("//input[@value='"+string+"']"));
		movetoElement(display);
	}

	public void color(String string) {
		
		WebElement color = driver.findElement(By.xpath("//input[@value='"+string+"']"));
		movetoElement(color);
	}

	public void selectstorage(String string) {
		WebElement storage = driver.findElement(By.xpath("//input[@value='"+string+"']"));
		movetoElement(storage);
		
	}

	public void tradein(String string) {
		WebElement tradein = driver.findElement(By.xpath("//input[@value='"+string+"']"));
		movetoElement(tradein);
		
	}

	public void coverage(String string) {
		// TODO Auto-generated method stub
		WebElement coverage = driver.findElement(By.xpath("//input[@data-autom='"+string+"']"));
		movetoElement(coverage);
	}

	public void addtocart() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(Button));
		movetoElement(element);
	}
	
}
