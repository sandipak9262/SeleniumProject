package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		WebElement uploadfile = driver.findElement(By.id("uploadfile_0"));
		uploadfile.sendKeys("C:\\Users\\Dipak Musale\\Desktop\\dipak.html");
		Thread.sleep(1000);
		driver.findElement(By.id("terms")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("send")).click();

	}
}
