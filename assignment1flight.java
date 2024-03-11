package Seleniumpuneclass;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment1flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("(//span[@class='headerIconTextAlignment chNavText darkGreyText'])[1]")).click();
		Thread.sleep(4000);
driver.findElement(By.xpath("//input[@data-cy='fromCity']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("(//div[@class='calc60'])[1]")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//div[@class='flt_fsw_inputBox searchToCity inactiveWidget ']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='calc60'])[2]")).click();
driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
driver.findElement(By.xpath("//div[@aria-label='Fri Mar 29 2024']")).click();
Thread.sleep(2000);
WebElement dp=driver.findElement(By.xpath("//label[@for='travellers']"));
 dp.click();
Thread.sleep(2000);
WebElement to=driver.findElement(By.xpath("//li[@data-cy='travelClass-1']"));
to.click();

WebElement Apply=driver.findElement(By.xpath("//button[contains(text(),'APPLY')]"));
Apply.click();
Thread.sleep(3000);
driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//button[@class='button buttonSecondry buttonBig fontSize12 relative']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[contains(text(),'View Flight Details')])[1]")).click();
JavascriptExecutor js= (JavascriptExecutor) (driver);
js.executeAsyncScript("window.scrollBy(0,500)");
   WebElement flightpriceElement =driver.findElement(By.xpath("(//div[@class='blackText fontSize18 blackFont white-space-no-wrap clusterViewPrice'])[2]"));
	String flightprice=flightpriceElement.getText();
	System.out.println("Total prize per adult" + flightprice);
	}
}