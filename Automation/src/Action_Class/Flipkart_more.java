package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_more {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		WebElement more = driver.findElement(By.xpath("//div[text()='More']"));
		Actions act=new Actions(driver);
		act.moveToElement(more).perform();
		WebElement adv = driver.findElement(By.xpath("(//a[@class='_2kxeIr'])[3]"));
		act.click(adv).perform();
		
	}

}
