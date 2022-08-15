package MyseleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindHideElementsInGNB {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://frontend.v2.qa.angara.com/ie-en/");

		WebElement Ring = driver.findElement(By.xpath("//span[normalize-space()='Rings']"));
		WebElement Necklaces = driver.findElement(By.xpath("//span[normalize-space()='Necklaces']"));
		WebElement Earrings = driver.findElement(By.xpath("//span[normalize-space()='Earrings']"));
		WebElement Wedding = driver.findElement(By.xpath("//span[normalize-space()='Wedding']"));
		WebElement Bracelets = driver.findElement(By.xpath("//span[normalize-space()='Bracelets']"));
		WebElement Gifts = driver.findElement(By.xpath("//span[normalize-space()='Gifts']"));

		// Creating object of an Actions class
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(Ring).perform();
		Thread.sleep(2000);
		List<WebElement> ele1 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int i = 0; i < ele1.size(); i++) {
			String text1 = ele1.get(i).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text1);
			// System.out.println(i + " : " + text + " " + " : " + text1);
		}
		
		action.moveToElement(Necklaces).perform();
		Thread.sleep(2000);
		List<WebElement> ele2 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int j = 0; j < ele2.size(); j++) {
			String text2 = ele1.get(j).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text2);
		}
		
		action.moveToElement(Earrings).perform();
		Thread.sleep(2000);
		List<WebElement> ele3 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int k = 0; k < ele1.size(); k++) {
			String text3 = ele1.get(k).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text3);
		}
		
		action.moveToElement(Wedding).perform();
		Thread.sleep(2000);
		List<WebElement> ele4 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int l = 0; l < ele1.size(); l++) {
			String text4 = ele1.get(l).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text4);
		}
		
		action.moveToElement(Bracelets).perform();
		Thread.sleep(2000);
		List<WebElement> ele5 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int m = 0; m < ele1.size(); m++) {
			String text5 = ele1.get(m).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text5);
		}
		
		action.moveToElement(Gifts).perform();
		Thread.sleep(2000);
		List<WebElement> ele6 = driver.findElements(By.xpath("//a[@class=' tcp-h']"));
		for (int n = 0; n < ele1.size(); n++) {
			String text6 = ele1.get(n).getAttribute("href");
			//String text1 = ele1.get(i).getText();

			System.out.println(text6);
		
		}
	}}
//
//		for (int i = 0; i < ele1.size(); i++) {
//			String text = ele1.get(i).getAttribute("href");
//			String text1 = ele1.get(i).getText();
//
//			//System.out.println(text);
//			 System.out.println(i + " : " + text + " " + " : " + text1);

		
	

