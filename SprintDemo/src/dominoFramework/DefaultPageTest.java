package dominoFramework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;  // Make sure this is from the same group as Before and After or Before and After will not be used.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumGeneralFunctions.OpenLinks;

public class DefaultPageTest {

	private WebDriver driver;
	private String baseURL;
	private DefaultPage homePage;
	private OpenLinks openLinks;
	public static final boolean WAIT = true; 
/*		
Setup Test information, set Chrome driver location, baseURL, and browser properties for driver.

*/
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		baseURL = "https://www.dominos.com/";
//		baseURL = "https://www.dominos.com/en/";
		homePage = new DefaultPage(driver);
		openLinks = new OpenLinks(driver);
		
		// Maximize the browser's window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

/*
	Click the side top coupon button and then return to the default page.
*/
	@Test
	public void ClickSideTopCoupon() throws InterruptedException {
		driver.get(baseURL);

		if (WAIT) {
			Thread.sleep(5000);
		}
		DefaultPage.clickSideTop();
		OpenLinks.goBackPage();		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickSideBottomCoupon() throws InterruptedException {
		driver.get(baseURL);

		if (WAIT) {
			Thread.sleep(5000);
		}
		DefaultPage.clickSideBottom();
		OpenLinks.goBackPage();		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
	/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickMainCoupon() throws InterruptedException {
		driver.get(baseURL);

		if (WAIT) {
			Thread.sleep(5000);
		}
		DefaultPage.clickMainCoupon();
		OpenLinks.goBackPage();		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
/*
Click the Delivery button and return to default page.
*/
	@Test 
	public void ClickDeliveryButton() throws InterruptedException {
		driver.get(baseURL);
		OpenLinks.waitForLoad();

		if (WAIT) {
			Thread.sleep(5000);
		}

		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		
		DefaultPage.clickDeliveryBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Delivery", driver.getCurrentUrl());
		
		OpenLinks.goBackPage();
		OpenLinks.waitForLoad();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());

		if (WAIT) {
			Thread.sleep(5000);
		}
	}
	

/*
	Click the Carry Out button and return to default page.
	
*/
	@Test
	public void ClickCarryOutButton() throws InterruptedException {
		driver.get(baseURL);
		if (WAIT) {
			Thread.sleep(5000);
		}

		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());

		DefaultPage.clickCarryoutBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Carryout", driver.getCurrentUrl());

		OpenLinks.goBackPage();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
/*
Click Sign in and earn button, popup will appear and need to be dealt with.	

*/

	@Test
	public void ClickSignInandEarn() throws InterruptedException {
		driver.get(baseURL);
		if (WAIT) {
			Thread.sleep(5000);
		}
	
		DefaultPage.clickSignInandEarnBtn();
		//OpenLinks.goBackPage(); // Doesn't work since it's a popup
		// Need to close the PopUp instead of going back.
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLink() throws InterruptedException {
		driver.get(baseURL);
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLink();
		DefaultPage.fillCreateOneForm();
		
		//OpenLinks.goBackPage(); // Doesn't work since it's a popup
		// Need to close the PopUp instead of going back.
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewWindow() throws InterruptedException {
		driver.get(baseURL);
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLinkNewWindow();
		
		//OpenLinks.goBackPage(); // Doesn't work since it's a popup
		// Need to close the PopUp instead of going back.
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewTab() throws InterruptedException {
		driver.get(baseURL);
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLinkNewTab();
		
		//OpenLinks.goBackPage(); // Doesn't work since it's a popup
		// Need to close the PopUp instead of going back.
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}

/*
Quit the automated browser.
	
*/
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
}
