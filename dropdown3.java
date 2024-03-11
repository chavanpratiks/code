package Seleniumpuneclass;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		JavascriptExecutor js=  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600)");
		driver.close();

	}

}
