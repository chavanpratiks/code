package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class substraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=calculator&oq=&gs_lcrp=EgZjaHJvbWUqBggBEEUYOzIPCAAQRRg5GIMBGLEDGIAEMgYIARBFGDsyCggCEAAYsQMYgAQyCggDEAAYsQMYgAQyDQgEEAAYgwEYsQMYgAQyCggFEAAYsQMYgAQyCggGEAAYsQMYgAQyBwgHEAAYgAQyCggIEAAYsQMYgAQyCggJEAAYsQMYgATSAQg1MjIyajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
Thread.sleep(1000);
JavascriptExecutor js= (JavascriptExecutor)driver;
js.executeScript("window.scrollBy(0,400)");
	driver.findElement(By.xpath("//div[@jsname='xAP7E']")).click();
	driver.findElement(By.xpath("//div[@jsname='pPHzQc']")).click();
driver.findElement(By.xpath("//div[@jsname='lVjWed']")).click();

driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();

driver.findElement(By.xpath("//div[@jsname='SLn8gc']")).click();
	}

}
