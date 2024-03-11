package Seleniumpuneclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().back();
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		driver.navigate().forward();
		driver.close();

	}

}
