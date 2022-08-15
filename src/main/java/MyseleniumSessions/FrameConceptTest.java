package MyseleniumSessions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameConceptTest {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.angara.com/ie-en/p/oval-sapphire-and-round-diamond-border-ring-sr0169s");

		System.out.println("-----PRODUCT DETAILS ON PDP---");

		
		System.out.println(doElementGetText(By.xpath("(//div[@class='d-flex dfsb']//div//div)")));
		// Product Details on the pdp page first time
		List<String> e1 = ProductDetails(By.xpath("//div[@class='mt10']"));

		By ey = By.xpath("//div[contains(@class,'breadcrumbs')]/a/following-sibling::a");

		getJewelleryType("s", ey);
		waitForElementPresence(ey, 15);
		System.out.println("-----PRODUCT DETAILS ON CART---");
		
		By e4 = By.xpath("//div[contains(text(), 'Add To Cart')]");
		waitForElementPresence(e4, 15);
		doClick(e4);

		// Fetching the product details on Cart page
		
		System.out.println(doElementGetText(By.xpath("(//div[@class='  d-flex  ']/span)[2]")));
		By e5 = By.xpath("//div[@class='mt5 p10 0']/div[text()]");
		ProductDetails(e5);

		waitForElementPresence(e5, 10);

		System.out.println("-----PRODUCT DETAILS ON PDP2---");

		// Clicking on EDIT cart
		By e6 = By.xpath("//div[@class='d-flex dfsb ']/a");
		doClick(e6);

		// Customize the product and capture the Product Details
		//	Thread.sleep(5000);
		//productCustomization(1, 5);
		
		try {
			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[1]"));
			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[5]"));
			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[last()]"));
		} catch (Exception e) {
			System.out.println("less than 3 property not available");
		}
	
		

		By e7 = By.xpath("//div[@class='d-flex pro-price']/div");
		waitForElementPresence(e7, 10);
		doElementGetText(e7);

		// Price of the product
		System.out.println(doElementGetText(By.xpath("(//div[@class='d-flex dfsb']//div//div)")));

		// Product Details on the pdp page Second time

		By e8 = By.xpath("//div[@class='mt10']");
		ProductDetails(e8);

		waitForElementPresence(e8, 10);

		// ADD TO CART the customized product
		doClick(By.xpath("//div[contains(text(),'Update Cart')]"));
		
		System.out.println("-----PRODUCT DETAILS ON CART2---");

		// Fetching the product details on Cart page second time
		System.out.println(doElementGetText(By.xpath("(//div[@class='  d-flex  ']/span)[2]")));
		ProductDetails(By.xpath("//div[@class='mt5 p10 0']/div[text()]"));

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);

	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		return eleText;
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static List<String> ProductDetails(By locator) {

		List<WebElement> e1 = getElements(locator);
	 	List<String> eleTextList = new ArrayList<String>();
		for (WebElement e2 : e1) {
			String text = e2.getText();
			{
				eleTextList.add(text);

				System.out.println(text);
			}
			String stringFromList = eleTextList.toString();
		}
		return eleTextList;
	}
	
	public static String getJewelleryType(String s, By locator) throws InterruptedException {

		s = doElementGetText(locator);

		if (s.equals("Rings")) {
			System.out.println("Ring Product Adding to Cart");
			try {

				By eye = By.xpath("// div[contains(@class,'variation-ringsize')]//div[@data-index='8']");
				waitForElementPresence(eye, 10);
				doClick(eye);
			} catch (Exception e) {
				System.out.println("Ring product but ring size not found");
			}
		}

		else if (s.equals("Bands")) {
			System.out.println("Band Product Adding to Cart");
			By eye = By.xpath("// div[contains(@class,'variation-ringsize')]//div[@data-index='8']");
			waitForElementPresence(eye, 10);
			doClick(eye);
		} else {
			System.out.println("Ring Size Not Reqired");
		}
		return s;
	}

	public static WebElement waitForElementPresence(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
//	public static void productCustomization(int a, int b) {
//		
//		try {
//			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[a]"));
//			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[b]"));
//			doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[last()]"));
//		} catch (Exception e) {
//			System.out.println("less than 3 property not available");
//		}

		
	}


