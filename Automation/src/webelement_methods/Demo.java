package webelement_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver.exe");  
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}

}
