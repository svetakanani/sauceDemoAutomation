package util;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;

public class BaseClass {

	public static Page page ;
	@BeforeClass
	public static void setup() {
		Playwright playWrite = Playwright.create();
		Browser browser = playWrite.chromium().launch(new LaunchOptions().setHeadless(false));
		page = browser.newPage();
		page.navigate("https://www.saucedemo.com");
		page.locator("//input[@id='user-name']").fill("standard_user");
		page.locator("//input[@id='password']").fill("secret_sauce");
		page.locator("#login-button").click();
	}
	
	@AfterClass
	public void tearDown() {
		page.close();
	}
}
