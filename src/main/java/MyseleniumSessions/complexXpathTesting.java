package MyseleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class complexXpathTesting {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/38306/eng-vs-ind-2nd-t20i-india-tour-of-england-2022");

		getPlayerInfo(" "+"Hardik Pandya"+" ");
		}
	
	
	public static List<String> getPlayerInfo(String Player) {
		
List<WebElement> ele =	By.xpath("//a[text()='"+Player+"']/ancestor::div[contains(@class,'cb-scrd-itms')]/div").findElements(driver);
	List<String> scoreCardList = new ArrayList<String>();
		for(WebElement e: ele) {
			String text = e.getText();
			System.out.println(text);
			scoreCardList.add(text);
		
	}
		return scoreCardList;
	}
}
