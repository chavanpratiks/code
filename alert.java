 package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
//		driver.switchTo().alert().accept();
		//prompt alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		driver.switchTo().alert().sendKeys("tester");
		driver.switchTo().alert().accept();

	}

}
