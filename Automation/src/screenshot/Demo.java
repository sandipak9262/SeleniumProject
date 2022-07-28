package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File desti = new File("C:\\Users\\Dipak Musale\\Desktop\\Screenshots\\dipak1.jpg");

		FileHandler.copy(source, desti);

	}

}
