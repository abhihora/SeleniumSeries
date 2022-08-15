package MyseleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverBasics {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\Admin\\Downloads\\chromedriver_win32//chromedriver.exe");

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://www.angara.com/"); // launch URL

		// options.addArguments("start-maximized");
		driver.manage().window().maximize(); // maximise the chrome browser

		// ActionChains(driver).sendkeys(Keys.F12).perform();

		String title = driver.getTitle();
		System.out.println("title of the page is " + driver.getTitle());

		// verification points/check points/assertion/act vs expected result
		if (title.contains("Angara")) {
			System.out.println("Home Page Launch !");
		} else {
			System.out.println("Not launched !");
		}

		driver.get("https://www.angara.com/rings/");

		String title2 = driver.getTitle();
		System.out.println(title2);

		// verification points/check points/assertion/act vs expected result
		if (title2.contains("Angara")) {
			System.out.println("Catalog Page Launch !");
		} else {
			System.out.println("Catalog Page Not launched !");
		}

		driver.get("https://www.angara.com/p/oval-sapphire-and-round-diamond-border-ring-sr0169s");

		String title3 = driver.getTitle();
		System.out.println(title3);
		// Thread.sleep(200); //throws InterruptedException
		// OR
		try {
			Thread.sleep(20);
		} catch (InterruptedException ie) {
		}

		// driver.close();
		driver.quit();

	}

}
