package TestNG;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_xpath {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
//
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.angara.com/ie-en/p/classic-prong-set-amethyst-and-diamond-three-stone-ring-sr0160amd");
//
//		Thread.sleep(5000);
//
//		List<WebElement> eye=	driver.findElements(By.xpath("(//div[@class='mt10'])"));
//
//		for (int i = 0; i < eye.size(); i++) {
//			String text1 = eye.get(i).getText();
//         	System.out.println(text1);
//
//		try {
//			if (text1.contains("Gemstone Quality")) {
//				doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[1]"));
//			} else if (text1.contains("Total Carat Weight")) {
//				doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[5]"));
//			} else if (text1.contains("Metal Type")) {
//				doClick(By.xpath("(//div[@class='mt20']//div[@class='options p-re']//div[contains(@class,'slick-slide ')])[last()]"));
//			}
//		} catch (Exception e) {
//			System.out.println("any of the 3 property doesn't exist");
//		}
//		}
		
		String s1="aws";
		String s2="zyz";
		String s3="pqr";
		//System.out.println(s1+s2+s3);
		String str = s1.concat(s2).concat(s3);
		System.out.println(str);
		
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static String doElementGetText(By locator) {
		String eleText = getElement(locator).getText();
		return eleText;
	}

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		for (WebElement e : eleList) {
			String text = e.getText();
			{
				eleTextList.add(text);
			}

		}
		return eleTextList;

	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
}