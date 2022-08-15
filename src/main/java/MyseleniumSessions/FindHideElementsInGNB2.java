package MyseleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindHideElementsInGNB2 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://frontend.v2.qa1.angara.com/uk-en");

		WebElement Ring = driver.findElement(By.xpath("//span[normalize-space()='Wedding']"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(Ring).perform();
		List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int i = 0; i < ele1.size(); i++) {
			String text1 = ele1.get(i).getAttribute("href");
			// String text1 = ele1.get(i).getText();

			System.out.println(text1);
			// System.out.println(i + " : " + text + " " + " : " + text1);
		}
		Thread.sleep(2000);

		driver.quit();
	}

//	public static void FindElementInGNB(By locator, WebElement GNB) {
//
//		WebElement GNB = driver.findElement(locator);
//
//		// Creating object of an Actions class
//		Actions action = new Actions(driver);
//
//		// Performing the mouse hover action on the target element.
//		action.moveToElement(GNB).perform();
//		List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
//		for (int i = 0; i < ele1.size(); i++) {
//			String text1 = ele1.get(i).getAttribute("href");
//			System.out.println(text1);
			 
//		}

//	}
}
	

