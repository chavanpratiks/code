package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class puneclassproject {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[2]/input")).sendKeys("mngr546102");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("bYtugYz");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("New Customer")).click();
		driver.findElement(By.name("name")).sendKeys("Abhishek chavan");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		driver.findElement(By.id("dob")).sendKeys("02-01-2024");
		driver.findElement(By.name("addr")).sendKeys("204,Strawberry Bldg Near Green City Ambernath (E) Mumbai");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Maharastra");
		driver.findElement(By.name("pinno")).sendKeys("421501");
		driver.findElement(By.name("telephoneno")).sendKeys("7218068647");
		driver.findElement(By.name("emailid")).sendKeys("chavanabhishek724@gmail.com");
		//driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//input[@type='reset']")).click(); 

	}
	

}
