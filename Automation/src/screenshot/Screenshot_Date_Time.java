package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Date_Time {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		Date d = new Date();

		String FileName = d.toString().replace(" ", "-").replace(":", "-") + ".jpg";
		System.out.println(FileName);

		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileHandler.copy(screenshot, new File("C:\\Users\\Dipak Musale\\Desktop\\Screenshots\\dip_" + FileName));

	}
}
