package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");
		WebElement result = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		result.click();
		WebElement result1 = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		result1.isDisplayed();
		System.out.println(result1);
	}
}
