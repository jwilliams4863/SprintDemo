package dominoFramework;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import seleniumGeneralFunctions.OpenLinks;
import seleniumGeneralFunctions.TestBasis;

public class DefaultPageTest extends TestBasis{

	private DefaultPage homePage;
	private OpenLinks openLinks;
	public static final boolean WAIT = true;

	public DefaultPageTest() {
		baseURL = "https://www.dominos.com/";
	}
	
/*
	Click the side top coupon button and then return to the default page.
*/
	@Test
	public void ClickSideTopCoupon() throws InterruptedException {

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
		if (WAIT) {
			Thread.sleep(5000);
		}
	
		DefaultPage.clickSignInandEarnBtn();
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLink() throws InterruptedException {
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLink();
		OpenLinks.fillTextBoxID("First_Name", "Bob");
		OpenLinks.fillTextBoxID("First_Name", "Robert");
		//DefaultPage.fillCreateOneForm();
		
		OpenLinks.goBackPage();
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewWindow() throws InterruptedException {
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLinkNewWindow();
		
		if (WAIT) {
			Thread.sleep(5000);
		}
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewTab() throws InterruptedException {
		if (WAIT) {
			Thread.sleep(5000);
		}

		DefaultPage.clickCreateOneLinkNewTab();
			
		if (WAIT) {
			Thread.sleep(5000);
		}
	}
}
