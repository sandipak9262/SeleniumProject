package Webpage_Totallinks_TotalData_Fetch;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https:www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement more = driver.findElement(By.xpath("(//div[@class='_28p97w'])[2]"));
		Actions a=new Actions(driver);
		a.moveToElement(more).perform();
		WebElement np = driver.findElement(By.xpath("(//a[@class='_2kxeIr'])[1]"));
		a.click(np).perform();
           
}
}