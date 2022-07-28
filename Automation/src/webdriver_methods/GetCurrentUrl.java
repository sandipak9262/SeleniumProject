package webdriver_methods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.instagram.com");
       
		System.out.println(driver.getCurrentUrl());
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
