package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");
		
		//System.out.println(driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected());
		
		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		female.click();
		boolean result = female.isSelected();
		System.out.println(result);
		
	}

}
