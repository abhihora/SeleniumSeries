package MyseleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTest {

	//static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.angara.com/ie-en/");
		
	    Actions action = new Actions(driver);
		//action.moveToElement(driver).perform();

		List<WebElement> eleList = driver.findElements(By.xpath("//div[@class=' pt40 mb10 f-bf1 fthg d-flex dfsb active']"));
		
		System.out.println(eleList.size());
		
		for(WebElement e : eleList) {
			String text = e.getText();
			System.out.println(text);
		 
//		driver.quit();
	}
}
}