package Seleniumpuneclass;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class countlink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
//		List<WebElement>links=driver.findElements(By.tagName("a"));
//		System.out.println("Total Link is: "+links.size());
	List<WebElement>links=	driver.findElements(By.tagName("div"));
    System.out.println("Total tagName is :"+ links.size());
    System.out.println(links.get(2).getText());
    for(WebElement l:links)
    	System.out.println(l.getText());
		
	}

}
