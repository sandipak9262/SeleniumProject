package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");
		
		WebElement result = driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']"));
		String attribute = result.getAttribute("aria-label");
		System.out.println(attribute);
		
		System.out.println(driver.findElement(By.xpath("//select[@aria-label='Select your pronoun']")).getAttribute("aria-label"));
}
}	
