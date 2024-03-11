package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/dragabble");
		WebElement dp=driver.findElement(By.xpath("//div[@id='https://demoqa.com/dragabble']"));
		Thread.sleep(1000);
		Actions ac = new Actions(driver);
		ac.dragAndDropBy(dp, 200, 500).perform();
		driver.quit();
	}

}
