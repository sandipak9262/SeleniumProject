package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");

		System.out.println(driver.findElement(By.xpath("//div[text()='Create a new account']")).getText());

		WebElement text = driver.findElement(By.xpath("//div[text()='Create a new account']"));
		String result = text.getText();

		System.out.println(result);

	}
}
