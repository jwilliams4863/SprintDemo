package dominoFramework.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import seleniumGeneralFunctions.TestBase;

public class DefaultPage extends TestBase {

	@FindBy(how=How.XPATH, using = "//a[@data-quid='start-your-order-delivery']")
	private static WebElement deliveryBtn;

	@FindBy(how=How.XPATH, using = "//a[@class='card--overlay__close js-close-button']")
	private static WebElement defaultOverlay;

	@FindBy(how=How.XPATH, using = "//a[@data-quid='start-your-order-carryout']")
	private static WebElement carryoutBtn;

	@FindBy(how=How.XPATH, using = "//a[@class='site-nav__profile__sign-in js-login c-header-customer-login site-nav__profile__sign-in--loyalty']")
	private static WebElement signInandEarnBtn;

	@FindBy(how=How.XPATH, using = "//a[@class='site-nav__profile__create-account js-createProfile c-header-create-profile']")
	private static WebElement createOneLink;

	@FindBy(how=How.XPATH, using = "//button[@data-quid='btn-599mixmatch']")
	private static WebElement mainCouponBtn;

	@FindBy(how=How.XPATH, using = "//button[@data-quid='btn-Side899Pan']")
	private static WebElement sideTopBtn;
	
/*	@FindBy(how=How.XPATH, using = "//button[@data-quid='btn-WeekLongCarryoutSide']")
	private static WebElement sideBottomBtn;
*/
	@FindBy(how=How.NAME, using = "btn-WeekLongCarryoutSide")
	private static WebElement sideBottomBtn;

	// Click Delivery Button
	public void clickDeliveryBtn() throws InterruptedException {
		checkOverlayClose();

		WaitFor();
		deliveryBtn.click();
	}
	
	// This needs to check to make sure the element exists and is visible otherwise it will return a failure in the test.  **FIX**
	public void checkOverlayClose() {
		// Check to see if the element is present and visible so it can be clicked on without causing a failure.
		if((defaultOverlay != null) && (defaultOverlay.isDisplayed())) {
					defaultOverlay.click();
					System.out.println("Overlay closed");
				}
	}
	
// Click Carry Out Button
	public void clickCarryoutBtn() throws InterruptedException {
		WaitFor();
		carryoutBtn.click();
	}
	

	public void clickSignInandEarnBtn() throws InterruptedException {
		WaitFor();
		signInandEarnBtn.click();
	}


	public void clickCreateOneLink() throws InterruptedException {
		WaitFor();
		createOneLink.click();
	}

	public void clickCreateOneLinkNewWindow() throws InterruptedException {
		WaitFor();
		openNewWindow(createOneLink);
	}

	public void clickCreateOneLinkNewTab() throws InterruptedException {
		WaitFor();
		openNewTab(createOneLink);
	}


	public void hoverMainCoupon() throws InterruptedException {
		waitForLoad();
		
		hoverOver(mainCouponBtn);
	}

	public void clickMainCoupon() throws InterruptedException {
		waitForLoad();

		mainCouponBtn.click();
	}	
	
	public void hoverSideTop() throws InterruptedException {
		waitForLoad();

		hoverOver(sideTopBtn);
	}

	public void clickSideTop() throws InterruptedException {
		waitForLoad();
		sideTopBtn.click();
	}
	
	public void hoverSideBottom() throws InterruptedException {
		waitForLoad();
		hoverOver(sideBottomBtn);
	}

	public void clickSideBottom() throws InterruptedException {
		waitForLoad();
		sideBottomBtn.click();
		
	}
		
}
