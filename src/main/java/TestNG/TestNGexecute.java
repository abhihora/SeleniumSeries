package TestNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGexecute {

	static WebDriver driver = null;

	@Test(priority=1)
	public void HomePage() {
		// First session of WebDriver
		String expectedFaviconPath = "https://www.angara.com/ie-en/favicon.ico.png";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.angara.com/ie-en/");

	//	System.out.println(driver.getPageSource().contains("/ie-en/"));
		List<WebElement> eye = driver.findElements(By.xpath("//link[contains(@rel,'icon')]"));

		// System.out.println(eye);
		for (WebElement e : eye) {
			String text = e.getAttribute("href");
			System.out.println(text);
		
			Assert.assertEquals(text, expectedFaviconPath);
			//driver.close();
		}

	}

	@Test(priority=2)
	public void CatalogPage() {
		// Second session of WebDriver
		String expectedFaviconPath = "https://www.angara.com/ie-en/favicon.ico.png";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.angara.com/ie-en/c/rings");
	//	System.out.println(driver.getPageSource().contains("/ie-en/c/rings"));
		List<WebElement> eye = driver.findElements(By.xpath("//link[contains(@rel,'icon')]"));
		for (WebElement e : eye) {
			String text = e.getAttribute("href");
			System.out.println(text);
			
			Assert.assertEquals(text, expectedFaviconPath);
			//driver.close();
		}
	}

	@Test(priority=3)
	public void ProductPage() {
		String expectedFaviconPath = "https://www.angara.com/ie-en/favicon.ico.png";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.angara.com/ie-en/p/oval-sapphire-and-round-diamond-border-ring-sr0169s?caratWeight=1.9&metalType=14k+white+gold&quality=best");
	//	System.out.println(driver.getPageSource().contains("/ie-en/p/oval-sapphire-and-round-diamond-border-ring-sr0169s?caratWeight=1.9&metalType=14k+white+gold&quality=best"));
		List<WebElement> eye = driver.findElements(By.xpath("//link[contains(@rel,'icon')]"));
		for(WebElement e : eye) {
			String text = e.getAttribute("href");
			System.out.println(text);
			
			Assert.assertEquals(text, expectedFaviconPath);
			//driver.close();
		}
	}

	@Test(priority=4)
	public void LandingPage() {
		String expectedFaviconPath = "https://www.angara.com/ie-en/favicon.ico.png";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.angara.com/ie-en/l/jewelry-gifts");
		System.out.println(driver.getPageSource().contains("/ie-en/l/jewelry-gifts"));
		List<WebElement> eye = driver.findElements(By.xpath("//link[contains(@rel,'icon')]"));
		for (WebElement e : eye) {
			String text = e.getAttribute("href");
			System.out.println(text);
			
			Assert.assertEquals(text, expectedFaviconPath);
		//	driver.close();
		}
	}
	
	@Test(priority=5)
	public void CartPage() {
		String expectedFaviconPath = "https://www.angara.com/ie-en/favicon.ico.png";

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.angara.com/ie-en/checkout/cart");
		System.out.println(driver.getPageSource().contains("/ie-en/checkout/cart"));
		List<WebElement> eye = driver.findElements(By.xpath("//link[contains(@rel,'icon')]"));
		for (WebElement e : eye) {
			String text = e.getAttribute("href");
			System.out.println(text);
			
			Assert.assertEquals(text, expectedFaviconPath);
		//	driver.close();
		}
	}
}
