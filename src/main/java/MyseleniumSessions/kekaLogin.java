package MyseleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class kekaLogin {

	static WebDriver driver;
	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://app.keka.com/Account/Login?ReturnUrl=%2Fconnect%2Fauthorize%2Fcallback%3Fresponse_type%3Dcode%26client_id%3D987cc971-fc22-4454-99f9-16c078fa7ff6%26state%3DdXNIOUxYUWNtRmhtY1AxUkVHdkdGVzBUWUQ3QUl4V3hMYmoxZTgxMmlJME5w%26redirect_uri%3Dhttps%253A%252F%252Fangaraecommerce.keka.com%26scope%3Dopenid%2520offline_access%2520kekahr.api%2520hiro.api%26code_challenge%3Du6AtfZ_bH5Vwo6gRcRWZtPgawVnwGoLeBTQmOnZMpJA%26code_challenge_method%3DS256%26nonce%3DdXNIOUxYUWNtRmhtY1AxUkVHdkdGVzBUWUQ3QUl4V3hMYmoxZTgxMmlJME5w");
		

	}}

//	public void doSendKeys(By locator, String value) {
//		getElement(locator).sendKeys(value);
//		
//		
//}
//	
//	public void doClick(By locator) {
//		getElement(locator).click();
//	}
