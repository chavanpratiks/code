package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement click= driver.findElement(By.xpath("//input[@type='checkbox']"));
		click.click();
		Thread.sleep(2000);
	WebElement dp1=	driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[2]"));
	dp1.click();
	Select as = new Select(dp1);
	as.selectByVisibleText("18");
	Thread.sleep(2000);
	WebElement dp2=	driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[3]"));
	dp2.click();
	Select as1 = new Select(dp2);
	as1.selectByVisibleText("JUL");
	Thread.sleep(3000);
	WebElement dp3=	driver.findElement(By.xpath("(//select[@onchange='fieldTrack(this);'])[4]"));
	dp3.click();
	Select as2 = new Select(dp3);
	as2.selectByVisibleText("2001");
	Thread.sleep(2000);
	WebElement gender= driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	gender.click();
	
	
		

	}

}
