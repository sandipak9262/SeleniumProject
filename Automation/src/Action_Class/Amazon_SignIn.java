package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_SignIn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		WebElement acc = driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions act=new Actions(driver);
		act.moveToElement(acc).perform();
		WebElement order = driver.findElement(By.xpath("//span[text()='Orders']"));
		act.click(order).perform();
		

	}

}
