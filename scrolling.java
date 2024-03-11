package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.practice-labs.com/login.aspx");
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("chavanabhi");
		driver.findElement(By.xpath("(//input[@class='w-input ptnr-field'])[2]")).sendKeys("Pratik@123");
		driver.findElement(By.xpath("(//input[@class='w-input ptnr-field'])[3]")).sendKeys("Java");
		driver.findElement(By.xpath("//input[@type='button']")).click();
		
		

	}

}
