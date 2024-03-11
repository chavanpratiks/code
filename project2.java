package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class project2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver ;
		js.executeAsyncScript("window.scrollBy(0,1600)");
		Thread.sleep(1000);
		WebElement drag =driver.findElement(By.xpath("//img [@alt='art of testing']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='targetDiv']"));
		Actions ac=new Actions(driver);
		ac.dragAndDrop(drag, drop).perform();
		
		
		

	}

}
