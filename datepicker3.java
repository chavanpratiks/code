package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/datepicker/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		Thread.sleep(2000);
		while(true){
		String s=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
		if(!s.equals("February2024")) {
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			
		}
		else {
			break;
		}
		}
	
		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a[text()='23']")).click();
//driver.findElement(By.xpath("(//td[@class=' ui-datepicker-week-end ']/a[@class='ui-state-default'])[1]")).click();
	}
	
	

}
