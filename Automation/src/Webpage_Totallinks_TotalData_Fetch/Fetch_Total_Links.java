package Webpage_Totallinks_TotalData_Fetch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Total_Links {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		 List<WebElement> links = driver.findElements(By.xpath("//a")); //multiple link find krnyasathi
		 System.out.println(links.size());
		 for(int i=0;i<links.size();i++) {
			 System.out.println(links.get(i).getText()+":"+links.get(i).getAttribute("href"));
			 
			 
		 }

	}

}
