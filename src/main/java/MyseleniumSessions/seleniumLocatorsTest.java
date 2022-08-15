package MyseleniumSessions;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class seleniumLocatorsTest {

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.initDriver("chrome");

		// br.add_argument("window-size=1920,1080");
		// DesiredCapabilities caps = new DesiredCapabilities();
		// caps.setCapability("resolution", "1600x900");
		driver.manage().window().maximize();
		
		br.launchUrl("https://www.angara.com/ie/en/");
		Thread.sleep(500);

		WebElement ele = driver.findElement(By.xpath("//span[text()='Rings']"));
		Thread.sleep(5000);
		// span[contains(text(), 'Rings')]
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		Thread.sleep(500);
		WebElement eye = driver.findElement(By.xpath("//a[text()='Blue Sapphire']"));

		// x-path for checkbox on checkout page .xpath("//span[text()='Billing address
		// same as shipping
		// address']//parent::label[@for='billing-address-same-as-shipping']//preceding-sibling::input[@id='billing-address-same-as-shipping']");
		// domain (www.angara.com)

		Actions action1 = new Actions(driver);
		action1.moveToElement(eye).perform();
		Thread.sleep(500);
		eye.click();

		/*
		 * Thread.sleep(5000); driver.findElement(By.xpath(
		 * "//*[@id=\"sub_navigation\"]/div/div[1]/div/div/div/div[1]/div/ul/li[1]/a"))
		 * .click(); System.out.println(br.isInfoExistInPageSource("angara"));
		 */
		// driver.findElement(By.partialLinkText("tanzanite and diamond"));
		
		ElementUtil e1= new ElementUtil(driver);
		
	
		
		

	}

}
