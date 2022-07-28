package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");

		// Enter username and password
		driver.findElement(By.id("email")).sendKeys("8412041690");
		driver.findElement(By.id("pass")).sendKeys("sandipak94@");

		// click on login button
		driver.findElement(By.name("login")).click();
		
           driver.findElement(By.xpath("//button[@value='1']")).click();
           

		driver.findElement(By.xpath("//div[@aria-label='Messenger']")).click();

	}
}
