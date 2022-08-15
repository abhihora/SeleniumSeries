package MyseleniumSessions;

public class MainClass {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		brUtil.initDriver("chrome");
		brUtil.launchUrl("https://www.angara.com/ie/en");

		if (brUtil.isUrlFractionExist("angara")) {
			System.out.println("url is correct with angara....PASS");
		} else {
			System.out.println("FAIL");
		}

//		if (brUtil.isInfoExistInPageSource("")) {
//			System.out.println("page source is correct with fraction url....PASS");
//		} else {
//			System.out.println("FAIL");
//		}

		if (brUtil.getPageTitle().contains("agara")) {
			System.out.println("correct title...PASS");
		} else {
			System.out.println("incorrect title....FAIL");
		}

		brUtil.quitBrowser();

	}

}