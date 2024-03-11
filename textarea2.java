package Seleniumpuneclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textarea2 {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers");
//		List<WebElement> header =driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
//		for(WebElement h:header)
//			System.out.println(h.getText());
//		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
//		
//			System.out.println(row.size());
//			System.out.println(row.get(9).getText());
			List <WebElement>company=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
			for(WebElement c:company)
				System.out.println(c.getText());

	}

}
