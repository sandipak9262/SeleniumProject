package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Dismiss_Method {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
	}

}
