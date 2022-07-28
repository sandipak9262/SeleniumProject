package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");	
		
		//System.out.println(driver.findElement(By.xpath("//button[@value='1']")).isEnabled());
		
		boolean result = driver.findElement(By.xpath("//button[@value='1']")).isEnabled();
		
		System.out.println(result);
		if(result==true) {
			System.out.println("element is enabled");
		}else {
			System.out.println("element is disabled");
		}
	}

}
