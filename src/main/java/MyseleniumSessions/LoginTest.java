package MyseleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginTest {

	public static void main(String[] args) {

		
		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		BrowserUtils br2 = new BrowserUtils(driver);
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		br2.doSendKeys(emailId, "abhiroop@gmail.com");
		br2.doSendKeys(password, "abhiroop123");
		
	}
	

}
