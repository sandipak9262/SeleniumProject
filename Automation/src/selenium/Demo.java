package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
//		driver.navigate().to("https://www.instagram.com");
//		driver.navigate().back();
//		driver.navigate().forward();
//		Thread.sleep(10000);
//		driver.navigate().refresh();
		
//		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.CONTROL+"t");
//		driver.navigate().to("https://www.instagram.com");
	
		driver.switchTo().newWindow(WindowType.WINDOW);
		
       //to open the new tab
		//driver.switchTo().newWindow(WindowType.TAB);
		//driver.get("https://www.instagram.com");
		Thread.sleep(3000);
		driver.close();
		//driver.quit();
	}

}
