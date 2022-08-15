package MyseleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementsPresentOnfooter {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.angara.com/");

		List<WebElement> ele = driver.findElements(By.xpath("//p[contains(@class,'slick-slide')]/child::span"));
		
		// angara.com //p[contains(@class,'slick-slide')]//a
		
		for (int i = 0; i < ele.size(); i++) {
			String text = ele.get(i).getAttribute("href");
			String text1 = ele.get(i).getText();
	
			System.out.println(i + " : " + text + " " + " : " + text1);

			
			}
	}

}
