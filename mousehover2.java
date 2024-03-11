package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		WebElement hover=driver.findElement(By.linkText("Live for Teams"));
		Actions ac= new Actions (driver);
		ac.moveToElement(hover).perform();

	}

}
