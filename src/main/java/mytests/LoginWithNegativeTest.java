package mytests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithNegativeTest {

	WebDriver driver;

	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.angara.com/ie-en");
		driver.findElement(By.xpath("//div[@class='d-flex']//span[text()='Log In']")).click();
	}

	@DataProvider
	public Object[][] getLoginNegativeData() {

		return new Object[][] {

				{ "              ", "Sele@123456" },{"test@gmail.com", "test123" }, { "abhiroop.hora@angara.in", "test12333" },
				{ "abhiroop.hora@angara.com", "Sele@12345" },
				{ "testttttt@gmail.com", "    " }, { "testttttt+ang@gmail.com", " yy@122" } };

	}

	@Test(dataProvider = "getLoginNegativeData")
	public void loginTestWithNegativeData(String username, String password) throws InterruptedException {
		
		driver.findElement(By.id("email")).clear();
	
		driver.findElement(By.id("email")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//fieldset//button[@type='submit']/span[text()='Log In']")).click();
		Thread.sleep(3000);
		String errorMesg = driver.findElement(By.xpath("//div[@class='error-message']")).getText().trim();
		System.out.println(errorMesg);
		Assert.assertEquals(errorMesg, "Invalid login or password.");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
