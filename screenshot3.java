package Seleniumpuneclass;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshot3 {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.get("https://staragile.melimu.com/mod/assign/view.php?id=8693");
		TakesScreenshot tcs=(TakesScreenshot) driver;
		File src=tcs.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\chava\\git\\repository\\eclipsecode1\\Maven123\\src\\main\\java\\Seleniumpuneclass\\screenshot.png\\star.png");
		FileHandler.copy(src, dest);

	}

}
