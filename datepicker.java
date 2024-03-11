package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stube
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		
//		Thread.sleep(1000);
		 WebElement frame1= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		 driver.switchTo().frame(frame1);
		 driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		 while (true) {
			 String s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			 if(!s.equals("August 2025")) {
				 driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				 
			 }
			 else {
				 break;
			 }
		 }
			//driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='23']")).click();
			 driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='25']")).click();
				
 
		 
		

	}

}
