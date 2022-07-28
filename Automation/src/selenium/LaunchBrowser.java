package selenium;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.facebook.com");
		//driver.manage().window().maximize();
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl());
//		driver.close();
//		driver.quit();
//		driver.navigate().to("https://www.instagram.com");
	  
		 String title=driver.getTitle();
		 System.out.println(title);
		 
		 String exp="Facebook – log in or sign up";
		 if(title.equals(exp)) {
			 System.out.println("right page");
		 }else {
			 System.out.println("wrong page");
		 }
		
		driver.close();
	
	}

}
