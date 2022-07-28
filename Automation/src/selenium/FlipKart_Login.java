package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKart_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9623469262");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandipak94@");

		driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		
	}

}
