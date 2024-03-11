package Seleniumpuneclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class text {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://dash.bling-center.com/platform/signIn");
		driver.findElement(By.xpath("//p[contains(text(),'Forgot Password?')]")).click();
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//p[contains(text(),'Reset Password')]")).click();
		
		WebElement text=driver.findElement(By.xpath("//p[@id='resetsuccess']"));
		Thread.sleep(5000);
		String textreset =text.getText();

	}

}
