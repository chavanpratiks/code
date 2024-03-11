package Seleniumpuneclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignmnet3registration2form {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demoqa.com/automation-practice-form");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Abhishek");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("CHAVAN");
		driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7218068647");
		)
//		driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys("English");
//		driver.findElement(By.xpath("(//label[@class='custom-control-label'])[4]")).click();
//		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("204 strawberry building  panvelkar prestige near green city ambernath east");
	}

}
