package dominoFramework.test;

import static org.testng.AssertJUnit.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dominoFramework.page.DefaultPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

import seleniumGeneralFunctions.TestBase;

public class DefaultPageTest extends TestBase{

	private DefaultPage page;
	
	public DefaultPageTest() {
		baseURL = "https://www.dominos.com/";
		setWaittime(3000);  // Some of the tests are failing when this is set to 1000 (1 second), 
		//have to find some other way to make sure the page is loaded before the checks fail.
	}
	
    @BeforeMethod
    public void setupTest () {
        //Set & Get ThreadLocal Driver with Browser
		driver.navigate().to(baseURL);
		page = PageFactory.initElements(driver, DefaultPage.class);

    }

/*
	Click the side top coupon button and then return to the default page.
*/
	@Test
	public void ClickSideTopCoupon() throws InterruptedException {
		WaitFor();
		page.clickSideTop();
		//This assertion is meant to fail for demo, it's expecting the URL from the previous page.
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		WaitFor();
	}
/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickSideBottomCoupon() throws InterruptedException {
		WaitFor();
		page.clickSideBottom();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		WaitFor();
	}
	/*
	Click the main coupon button and then return to the default page.
*/
	@Test
	public void ClickMainCoupon() throws InterruptedException {
		WaitFor();
		page.clickMainCoupon();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
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
		
		page.clickDeliveryBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Delivery", driver.getCurrentUrl());
		
		WaitFor();
	}
	

/*
	Click the Carry Out button and return to default page.
	
*/
	@Test
	public void ClickCarryOutButton() throws InterruptedException {
		WaitFor();

		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());

		page.clickCarryoutBtn();
		assertEquals("https://www.dominos.com/en/pages/order/#/locations/search/?type=Carryout", driver.getCurrentUrl());

		WaitFor();
	}
/*
Click Sign in and earn button, popup will appear and need to be dealt with.	

*/

	@Test
	public void ClickSignInandEarn() throws InterruptedException {
		WaitFor();
	
		page.clickSignInandEarnBtn();
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
		
		WaitFor();
	}
/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLink() throws InterruptedException {
		WaitFor();

		page.clickCreateOneLink();
		fillTextBoxID("First_Name", "Bob");
		fillTextBoxID("First_Name", "Robert");
		//DefaultPage.fillCreateOneForm();
	
		assertEquals("https://www.dominos.com/en/", driver.getCurrentUrl());
	
		WaitFor();
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewWindow() throws InterruptedException {
		WaitFor();

		page.clickCreateOneLinkNewWindow();
		
		WaitFor();
	}

/*
Click Create One Link to go to create Pizza Profile page	

*/
	@Test
	public void ClickCreateOneLinkNewTab() throws InterruptedException {
		WaitFor();

		page.clickCreateOneLinkNewTab();
			
		WaitFor();
	}
}
