package data_driven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class With_DDF {

	public static void main(String[] args) throws IOException, InterruptedException {
		FileInputStream file = new FileInputStream("C:\\Users\\Dipak Musale\\Desktop\\Excel Data\\Zerodha.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		String UN = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(UN);

		String PWD = sh.getRow(1).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(PWD);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String PIN = sh.getRow(2).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(PIN);

		driver.findElement(By.xpath("//button[@type='submit']")).click();

		String ActualUID = driver.findElement(By.xpath("//span[text()='RY9977']")).getText();

		String ExceptedUID = "RY9977";
		if (ExceptedUID.equals(ActualUID)) {
			System.out.println("Test case pass");
		} else {
			System.out.println("Test case Fail");
		}
	}

}
