package webdriver_methods;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        Dimension d=new Dimension(200,300);
        driver.manage().window().setSize(d); 
       
       
        
	}

}
