package Seleniumpuneclass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmnet2train {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    Thread.sleep(15000);
	    WebElement departureInput = driver.findElement(By.xpath("//input[@id='fromCity']"));
	    departureInput.click();
	    departureInput.sendKeys("blr");
	    WebElement departureOption = driver
	        .findElement(By.xpath("//input[@placeholder='From']/following-sibling::div//p[contains(text(),'Bengaluru')]"));
	    departureOption.click();

	    WebElement arrivalInput = driver.findElement(By.xpath("//input[@id='toCity']"));
	    arrivalInput.click();
	    arrivalInput.sendKeys("del");
	    WebElement delhiOption = driver
	        .findElement(By.xpath("//input[@placeholder='To']/following-sibling::div//p[contains(text(),'New Delhi')]"));
	    delhiOption.click();
	    WebElement datePicker = driver.findElement(By.xpath("(//span[@class='lbl_input appendBottom10'])[3]"));
	    WebElement dates = driver.findElement(By.xpath("(//div[@class='dateInnerCell'])[29]"));
	    dates.click();
	    WebElement searchButton = driver.findElement(By.xpath("//a[text()='Search']"));
	    searchButton.click();
	    Thread.sleep(15000);
	    WebElement popup = driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']"));
	    popup.click();
	}

}
