package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("Abhishek");
		driver.findElement(By.name("lastname")).sendKeys("Chavan");
		driver.findElement(By.name("reg_email__")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("chavanabhishek724@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Pratik@123");
		driver.findElement(By.name("birthday_day")).sendKeys("18");
		driver.findElement(By.id("month")).sendKeys("july");
		driver.findElement(By.id("year")).sendKeys("2001");
		driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();
		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	}

