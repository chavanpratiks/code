package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://artoftesting.com/mouse-hover-in-selenium-webdriver-java#google_vignette");
WebElement dp=driver.findElement(By.linkText("Automation"));
Actions ac= new Actions(driver);
ac.moveToElement(dp).perform();
	}

}
