package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
driver.get("https://jqueryui.com/draggable/");
WebElement frame1=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
driver.switchTo().frame(frame1);
WebElement dp = driver.findElement(By.xpath("//div[@id='draggable']"));
Actions ac= new Actions(driver);
ac.dragAndDropBy(dp, 100, 100).perform();
	}

}
