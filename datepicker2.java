package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datepicker2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
  WebDriver driver= new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(1000);
  driver.get("https://www.globalsqa.com/demo-site/datepicker/");
  WebElement  frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
  driver.switchTo().frame(frame1);
  driver.findElement(By.xpath("//input[@id='datepicker'])")).click();
  while (true) {
	String s=  driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
	if(!s.equals("May 2026")) {
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
	}
	else {
		break;
	}
  }
	}

}
