package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class radio2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://artoftesting.com/samplesiteforselenium#google_vignette");
        JavascriptExecutor jse= (JavascriptExecutor)driver;
         jse.executeScript("window.scrollBy(0,900)");
         driver.findElement(By.xpath("//input[@id='male']")).click();
         Thread.sleep(2000);
         driver.close();
	}

}
