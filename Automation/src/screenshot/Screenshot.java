package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Dipak Musale\\Desktop\\Screenshots\\dipak1.jpg");

		FileHandler.copy(source, desti);


	}
}
