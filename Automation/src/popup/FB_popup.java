package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FB_popup {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https:www.facebook.com");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("simasbarde@gmail.com");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sima@93");

		driver.findElement(By.xpath("//button[@value='1']")).click();

		driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();

	}

}
