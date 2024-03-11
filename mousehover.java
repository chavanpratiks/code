package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new 	ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testsigma.com/blog/mouse-hover-in-selenium/");
		Thread.sleep(1000);
		Actions ac = new Actions (driver);
		WebElement hover =driver.findElement(By.xpath("(//span[@class='group-hover:text-primary-400 cursor-pointer'])[1]"));
		ac.moveToElement(hover).perform();

	}

}
