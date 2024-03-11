package Seleniumpuneclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/search?q=calculator&oq=calcu&gs_lcrp=EgZjaHJvbWUqDQgAEAAYgwEYsQMYgAQyDQgAEAAYgwEYsQMYgAQyBggBEEUYOTINCAIQABiDARixAxiABDIKCAMQABixAxiABDINCAQQABiDARixAxiABDIKCAUQABixAxiABDINCAYQABiDARixAxiABDINCAcQABiDARixAxiABDIKCAgQABixAxiABDIHCAkQABiABNIBCDUyMzRqMGo3qAIAsAIA&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//div[@jsname='XoxYJ']")).click();
        driver.findElement(By.xpath("//div[@jsname='XSr6wc']")).click();
        driver.findElement(By.xpath("//div[@jsname='rk7bOd']")).click();
        
        driver.findElement(By.xpath("//div[@jsname='Pt8tGc']")).click();
	}

}
