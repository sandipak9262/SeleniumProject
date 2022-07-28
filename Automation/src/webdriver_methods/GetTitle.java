package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");

		//System.out.println(driver.getTitle());
		
		String title = driver.getTitle();
		System.out.println(title);

		String exp = "Facebook – log in or sign up";
		if (title.equals(exp)) {
			System.out.println("right page");
		} else {
			System.out.println("wrong page");
		}
	}

}
