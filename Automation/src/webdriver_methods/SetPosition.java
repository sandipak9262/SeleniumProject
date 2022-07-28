package webdriver_methods;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https:\\www.facebook.com");
        
        Point p = new Point(300,200);
        driver.manage().window().setPosition(p);

	}

}
