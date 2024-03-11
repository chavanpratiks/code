package Seleniumpuneclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/railways/");
		
		driver.findElement(By.xpath("//label[@for='fromCity']")).click();
		
		driver.findElement(By.id("react-autowhatever-1-section-0-item-3")).click();
//		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.id("react-autowhatever-1-section-0-item-2")).click();
		driver.findElement(By.xpath("(//span[@tabindex='0'])[2]")).click();
		driver.findElement(By.xpath("(//div[@class='DayPicker-Day'])[15]")).click();
driver.findElement(By.xpath("//li[contains(text(),'Second Seating')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Search')]")).click();
		WebElement trainpriceElement=driver.findElement(By.xpath("(//div[@class='ticket-price justify-flex-end'])[2]"));
		String train=trainpriceElement.getText();
		System.out.println("Price is :"+train);
		driver.findElement(By.xpath("(//div[@id='train_options_15-04-2024_1'])[3]")).click();
		driver.findElement(By.xpath("//div[contains(text(),'OK, GO AHEAD')]")).click();
		driver.findElement(By.xpath("//input[@name='text']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript( "arguments[0].click()", driver.findElement(By.xpath("//*[@id=\"irctcUserName\"]")));
		Thread.sleep(2000);
		
	driver.findElement(By.name("IRCTCUserName")).sendKeys("Abhishek");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
//	Thread.sleep(3000);
//		driver.close();

	}

}
