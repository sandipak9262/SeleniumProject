package popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
      
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		Set<String> ids = driver.getWindowHandles();// child browser cha address findout krnyasathi
		ArrayList<String> al = new ArrayList<String>(ids);// set string cha data arraylist mdhe yenar
		String CWID = al.get(1); // 1 index dili bcoz child browser cha address get krto
		driver.switchTo().window(CWID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();// childbrowser popup automate hoty
		driver.switchTo().window(al.get(0));
		//driver.findElement(By.xpath("//input[@value='Download']")).click();

	}
}
