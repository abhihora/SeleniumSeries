package MyseleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("edge");
		br.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		br.getPageTitle();
		
		BrowserUtils br2 = new BrowserUtils(driver);

		By fn = By.id("input-firstname");
		By ln = By.id("input-lastname");
		By email = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By cnfrmpwd = By.id("input-confirm");
		
		br2.doSendKeys(fn, "abhiroop");
		br2.doSendKeys(ln, "hora");
		br2.doSendKeys(email, "abhiroop@gmail.com");
		br2.doSendKeys(telephone, "9928091226");
		br2.doSendKeys(password, "abhiroop123");
		br2.doSendKeys(cnfrmpwd, "abhiroop123");
		
		

	}

}
