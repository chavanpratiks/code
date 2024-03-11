package Seleniumpuneclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class Assignmnet3registration {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("CHAVAN");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7218068647");
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		driver.findElement(By.xpath("//div[@aria-label='Choose Sunday, March 10th, 2024']")).click();
		js.executeScript("window.scrollBy(0,300)");
		
		js.executeScript("arguments[0].value='English'",driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]")));  

	}
	
}
