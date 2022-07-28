package scrollUp_scrollDown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scroll_Up {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		Thread.sleep(2000);
		
		js.executeScript("window.scrollBy(0,-600)");
		
		
		js.executeScript("window.scrollBy(500,0)");
		js.executeScript("window.scrollBy(-500,0)");
		

	}

}
