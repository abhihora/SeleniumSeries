package MyseleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		// webelement + click(performing some actions)

		// 1. first method
//		driver.findElement(By.id("input-email")).sendKeys("abhiroop@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("abhiroop123");

		// 2. second method
//		
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));

//		emailId.sendKeys("abhiroop@gmail.com");
//		password.sendKeys("abhiroop123");

		// 3. By locators , Object repository

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		WebElement emailid = driver.findElement(emailId);
//		WebElement pwd = driver.findElement(password);
//
//		emailid.sendKeys("abhiroop@gmail.com");
//		pwd.sendKeys("abhiroop@123");

		// 4. By locator+ generic fn.

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		getElement(emailId).sendKeys("abhiroop@gmail.com");
//		getElement(emailId).sendKeys("abhiroop");
//		getElement(password).sendKeys("abhiroop123");

		// 5. By locator + generic fn. for Find element + sendKeys methods

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		doSendKeys(emailId, "abhiroop@angara.com");
//		doSendKeys(password, "abhiroop123");

		// 6. By locator + generic functions for element and actions in some Util class

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//
//		BrowserUtils br = new BrowserUtils(driver);
//
//		br.doSendKeys(emailId, "abhiroop@angara.com");
//		br.doSendKeys(password, "abhiroop123");
//
//	}
	
		//7. using utils in differnt class
		
		//8. functions + generic functions for element and actions in some Util class
		
		String email_id = "input-email";
		String pwd_id = "input-password";
		
		doSendKeys("id", email_id, "test@gmail.com");
		doSendKeys("id", pwd_id, "test@123");

	}
	 
	public static By getBy(String locatorType, String selector) {

		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(selector);
			break;

		default:
			break;
		}

		return locator;

	}
	
	public static void doSendKeys(String locatorType, String selector, String value) {
		By locator = getBy(locatorType, selector);
		getElement(locator).sendKeys(value);
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
