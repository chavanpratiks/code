package Seleniumpuneclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment3ss {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		TakesScreenshot tcs= (TakesScreenshot)driver;
		File src=tcs.getScreenshotAs(OutputType.FILE);
		File des= new File("C:\\Users\\chava\\git\\repository\\eclipsecode1\\Maven123\\src\\main\\java\\Seleniumpuneclass\\screenshot.png\\makemytrip.png");
        FileHandler.copy(src, des);
	}

}
