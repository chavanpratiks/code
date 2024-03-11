package Seleniumpuneclass;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandle3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.online.citibank.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
		System.out.println(driver.getTitle());
		Set <String> window=driver.getWindowHandles();
		Iterator<String>itr=window.iterator();
		String window1=itr.next();
		String window2 = itr.next();
		driver.switchTo().window(window2);
		System.out.println(driver.getTitle());
		driver.findElement(By.name("User_Id")).sendKeys("chavanabhi");
		driver.switchTo().window(window1);
		
		
		
	

	}

}
