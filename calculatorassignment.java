package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculatorassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(3000);
	WebElement SearchBox =	driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
	SearchBox.sendKeys("Calculator");
	Thread.sleep(2000);
	SearchBox.sendKeys(Keys.ENTER);
//	WebElement number1=driver.findElement(By.xpath("//div[@jsname='Ax5wH']"));
//	number1.click();
//	WebElement Addition=driver.findElement(By.xpath("//div[@jsname='XSr6wc']"));
//	Addition.click();
//	WebElement number2=driver.findElement(By.xpath("//div[@jsname='rk7bOd']"));
//	number2.click();
//	
//	
//	WebElement Sum=driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
//	Sum.click();
	//////////////////////////////////////////////////////////////////////////////////
//	WebElement number1=driver.findElement(By.xpath("//div[@jsname='N10B9']"));
//	number1.click();
//	WebElement number2=driver.findElement(By.xpath("//div[@jsname='Ax5wH']"));
//	number2.click();
//	WebElement Substraction=driver.findElement(By.xpath("//div[@jsname='pPHzQc']"));
//	Substraction.click();
//	WebElement number3=driver.findElement(By.xpath("//div[@jsname='T7PMFe']"));
//	number3.click();
//	
//	
//	WebElement Substraction1=driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
//	Substraction1.click();
	///////////////////////////////////////////////////////////////////////////////////
//	WebElement number1=driver.findElement(By.xpath("//div[@jsname='N10B9']"));
//	number1.click();
//	WebElement number2=driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));
//	number2.click();
//	WebElement Multiplication=driver.findElement(By.xpath("//div[@jsname='YovRWb']"));
//Multiplication.click();
//	WebElement number3=driver.findElement(By.xpath("//div[@jsname='KN1kY']"));
//	number3.click();
	
	
//	WebElement Multiplication1=driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
//	Multiplication1.click();
//	WebElement clear=driver.findElement(By.xpath("//div[@jsname='SLn8gc']"));
//	clear .click();WebElement number1=driver.findElement(By.xpath("//div[@jsname='N10B9']"));
//	number1.click();
//	WebElement number2=driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));
//	number2.click();
//	WebElement Multiplication=driver.findElement(By.xpath("//div[@jsname='YovRWb']"));
//Multiplication.click();
//	WebElement number3=driver.findElement(By.xpath("//div[@jsname='KN1kY']"));
//	number3.click();
//	
//	
//	WebElement Multiplication1=driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
//	Multiplication1.click();
//	WebElement clear=driver.findElement(By.xpath("//div[@jsname='SLn8gc']"));
//	clear .click();
	//////////////////////////////////////////////////////////////////////////////////////
	WebElement number1=driver.findElement(By.xpath("//div[@jsname='lVjWed']"));
	number1.click();
	WebElement number2=driver.findElement(By.xpath("//div[@jsname='bkEvMb']"));
	number2.click();
	WebElement Division=driver.findElement(By.xpath("//div[@jsname='WxTTNd']"));
Division.click();
	WebElement number3=driver.findElement(By.xpath("//div[@jsname='xAP7E']"));
	number3.click();
	
	
	WebElement Division1=driver.findElement(By.xpath("//div[@jsname='Pt8tGc']"));
	Division1.click();
	WebElement clear=driver.findElement(By.xpath("//div[@jsname='SLn8gc']"));
	clear .click();
	
	
	
	}

}
