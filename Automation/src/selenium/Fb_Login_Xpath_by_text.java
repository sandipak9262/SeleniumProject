package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fb_Login_Xpath_by_text {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");

		driver.findElement(By.xpath("//a[text()='Sign up for Facebook']")).click();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dipak");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("musale");
	}

}
 