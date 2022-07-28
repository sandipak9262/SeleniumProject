package data_driven;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Without_DDF {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("RY9977");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandipak94@");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("926200");
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String ActualUID = driver.findElement(By.xpath("//span[text()='RY9977']")).getText();

		String ExceptedUID = "RY9977";
		if (ExceptedUID.equals(ActualUID)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case Fail");
		}
	}

}
