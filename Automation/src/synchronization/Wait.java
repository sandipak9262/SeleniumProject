package synchronization;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.facebook.com");

		// This method is deprecated (next version se nhi rhega)
		// driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// selenium previous method 3.141.59

		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		// new Version

		// WebDriverWait wait1=new WebDriverWait(driver, 20); //old version

		// driver.findElement(By.xpath("//input[@type='text']")).sendKeys("dipak");
		WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='']")));
		System.out.println("start"); 
	}

}
