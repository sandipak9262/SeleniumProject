package select_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/r.php");
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		
		Select s=new Select(year);
		s.selectByIndex(28);
		
//      WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
//      
//      Select s=new Select(month);
     // s.selectByIndex(3);
     // s.selectByVisibleText("Apr");
      //s.selectByValue("11");
	}

}
