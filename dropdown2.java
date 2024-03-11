package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumbase.io/demo_page");
		WebElement dp=driver.findElement(By.xpath("//select[@id='mySelect']"));dp.click();
		Select as= new Select(dp);
		if(as.isMultiple()) {
			as.selectByIndex(2);
			as.selectByIndex(3);
		}
		else {
			as.selectByIndex(0)	;
			System.out.println("dp is single element printes");
			}
		

	}

	
	
	
}
