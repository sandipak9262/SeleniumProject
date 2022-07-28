package Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart_Example {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9623469262");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("sandipak94@");
        driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
        
        
		WebElement login = driver.findElement(By.xpath("(//div[@class='_28p97w'])[1]"));
        Actions act=new Actions(driver); 
		act.moveToElement(login).perform();

 
	}

}
