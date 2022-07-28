package Webpage_Totallinks_TotalData_Fetch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetch_Webtable_Wholedata {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> noofrows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		System.out.println("NO OF ROWS :" + noofrows.size());
		for (int i = 1; i < noofrows.size(); i++) {//i row count krnyasathi
			List<WebElement> noofcell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
			System.out.println("Row No :"+ i +" No of Cell : "+ noofcell.size()); 
			for(int cell=0;cell<noofcell.size();cell++) {
				System.out.print(noofcell.get(cell).getText()+", ");
			} 
			System.out.println();

		}
	}
}
