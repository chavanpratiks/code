package Seleniumpuneclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("hhtps:www.google.com");

		TakesScreenshot tcs=  (TakesScreenshot) driver;
		File src=tcs.getScreenshotAs(OutputType.FILE);
		File Des= new File("C:\\Users\\chava\\eclipse-workspace\\SeleniumAutomation\\Seleniumframewoork\\Maven123\\src\\main\\java\\Seleniumpuneclass\\screenshot.png");
//		FileHandler.copy(src, Des);
		FileHandler.copy(src, Des);

	}

}
//TakesScreenshot tcs= (TakesScreenshot) driver;
//File source =tcs.getScreenshotAs(OutputType.FILE);
//File des=new File("C:\\Users\\chava\\eclipse-workspace\\SeleniumAutomation\\Seleniumframewoork\\Maven123\\src\\main\\java\\Seleniumpuneclass\\screenshot.png\\facebook.png");
//FileHandler.copy(source, des);//