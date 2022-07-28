package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FB_Login_Locator1_xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("8412041690");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("sandipak94@");

		driver.findElement(By.xpath("//button[@value=\"1\"]")).click();
		

	}

}
