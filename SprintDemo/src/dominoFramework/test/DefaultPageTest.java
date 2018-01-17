package dominoFramework.test;

import static org.testng.AssertJUnit.assertEquals;
import org.testng.annotations.Test;

import dominoFramework.page.DefaultPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import seleniumGeneralFunctions.TestBase;

public class DefaultPageTest extends TestBase{

	public DefaultPageTest() {
		baseURL = "https://www.dominos.com/";
		setWaittime(2000);  // Some of the tests are failing when this is set to 1000 (1 second), 
		//have to find some other way to make sure the page is loaded before the checks fail.
	}
	
/*
	Click the side top coupon button and then return to the default page.
*/
	@Test
	public void ClickSideTopCoupon() throws InterruptedException {

		WaitFor();
		DefaultPage.clickSideTop();
		goBackPage();		
		WaitFor();
	}
/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickSideBottomCoupon() throws InterruptedException {

		WaitFor();
		DefaultPage.clickSideBottom();
		goBackPage();		
		WaitFor();
	}
	/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickMainCoupon() throws InterruptedException {

		WaitFor();
		DefaultPage.clickMainCoupon();
		goBackPage();		
		WaitFor();
	}
/*
Click the Delivery button and return to default page.
*/
	@Test 
	public void ClickDeliveryButton() throws InterruptedException {
		waitForLoad();

		WaitFor();

		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		
		DefaultPage.clickDeliveryBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Delivery", driver.getCurrentUrl());
		
		goBackPage();
		waitForLoad();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());

		WaitFor();
	}
	

/*
	Click the Carry Out button and return to default page.
	
*/
	@Test
	public void ClickCarryOutButton() throws InterruptedException {

		WaitFor();

		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());

		DefaultPage.clickCarryoutBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Carryout", driver.getCurrentUrl());

		goBackPage();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		WaitFor();
	}
/*
Click Sign in and earn button, popup will appear and need to be dealt with.	

*/

	@Test
	public void ClickSignInandEarn() throws InterruptedException {
		WaitFor();
	
		DefaultPage.clickSignInandEarnBtn();
		
		WaitFor();
	}
/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLink() throws InterruptedException {
		WaitFor();

		DefaultPage.clickCreateOneLink();
		fillTextBoxID("First_Name", "Bob");
		fillTextBoxID("First_Name", "Robert");
		//DefaultPage.fillCreateOneForm();
		
		goBackPage();
		
		WaitFor();
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewWindow() throws InterruptedException {
		WaitFor();

		DefaultPage.clickCreateOneLinkNewWindow();
		
		WaitFor();
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewTab() throws InterruptedException {
		WaitFor();

		DefaultPage.clickCreateOneLinkNewTab();
			
		WaitFor();
	}
}
