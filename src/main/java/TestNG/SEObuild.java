package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SEObuild {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.angara.com/ie-en/p/tahitian-cultured-pearl-and-diamond-split-shank-ring-sr1307thprd?metalType=14k+rose+gold&quality=best&stoneSizes=9mm");
		System.out.println(driver.getPageSource());
	}

}
