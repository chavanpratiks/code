package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class root {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://www.google.com/search?q=calculator&oq=&gs_lcrp=EgZjaHJvbWUqBggBEEUYOzIPCAAQRRg5GIMBGLEDGIAEMgYIARBFGDsyCggCEAAYsQMYgAQyCggDEAAYsQMYgAQyDQgEEAAYgwEYsQMYgAQyCggFEAAYsQMYgAQyCggGEAAYsQMYgAQyBwgHEAAYgAQyCggIEAAYsQMYgAQyCggJEAAYsQMYgATSAQg1MjIyajBqN6gCALACAA&sourceid=chrome&ie=UTF-8");
JavascriptExecutor js=(JavascriptExecutor) driver;
js.executeScript("window.scrollBy(0,500)");

driver.findElement(By.xpath("//div[@jsname='oQcVc']")).click();
driver.findElement(By.xpath("//div[@jsname='Ax5wH']")).click();
driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
	}

}
