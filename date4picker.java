package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class date4picker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox dates inactiveWidget ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@aria-label='Fri Mar 29 2024']")).click();
			
		
	}

}
