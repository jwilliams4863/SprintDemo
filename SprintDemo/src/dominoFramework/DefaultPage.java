package dominoFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import seleniumGeneralFunctions.OpenLinks;

public class DefaultPage {

	static WebDriver driver;
	public static WebElement element = null;
	
	public DefaultPage(WebDriver driver) {
		DefaultPage.driver = driver;	
	}

	/*Returns the Delivery Button element
	*/
	public static WebElement deliveryBtn() {
		element = driver.findElement(By.xpath("//a[@data-quid='start-your-order-delivery']"));
		return element;
	}
	
	// Click Delivery Button
	public static void clickDeliveryBtn() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		checkOverlayClose();
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		deliveryBtn().click();
	}
	
	// This needs to check to make sure the element exists and is visible otherwise it will return a failure in the test.  **FIX**
	public static void checkOverlayClose() {
		// Check to see if the element is present and visible so it can be clicked on without causing a failure.
		if((driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']")) != null) &&
		   (driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']")).isDisplayed())) {
			element = driver.findElement(By.xpath("//a[@class='card--overlay__close js-close-button']"));
			element.click();
		}
	}
	
	/*Returns the carry-out button element
	*/
	public static WebElement carryoutBtn() {
		element = driver.findElement(By.xpath("//a[@data-quid='start-your-order-carryout']"));
		return element;
	}

	public static void clickCarryoutBtn() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		carryoutBtn().click();
	}
	
	/*Returns the Sign in and Earn Rewards element
	*/
	public static WebElement signInandEarnBtn() {
		element = driver.findElement(By.xpath("//a[@class='site-nav__profile__sign-in js-login c-header-customer-login site-nav__profile__sign-in--loyalty']"));
		return element;
	}

	public static void clickSignInandEarnBtn() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		signInandEarnBtn().click();
	}

	public static WebElement createOneLink() {
		element = driver.findElement(By.xpath("//a[@class='site-nav__profile__create-account js-createProfile c-header-create-profile']"));
		return element;
	}

	public static void clickCreateOneLink() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		createOneLink().click();
		//OpenLinks.openNewWindow(createOneLink());
	}

	public static void clickCreateOneLinkNewWindow() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		OpenLinks.openNewWindow(createOneLink());
	}

	public static void clickCreateOneLinkNewTab() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		OpenLinks.openNewTab(createOneLink());
	}

	public static void fillCreateOneForm() throws InterruptedException {
		if (DefaultPageTest.WAIT) {
			Thread.sleep(5000);
		}
		element = driver.findElement(By.id("First_Name"));
		driver.findElement(By.id("First_Name")).sendKeys("Bob");
		element = driver.findElement(By.id("Last_Name"));
		element = driver.findElement(By.id("Email"));
		element = driver.findElement(By.id("Confirm_Email"));
		element = driver.findElement(By.id("Phone"));
		element = driver.findElement(By.id("Create_Password"));
		element = driver.findElement(By.id("Confirm_Password"));

		/*		
		<input type="text" id="First_Name" name="First_Name" maxlength="40" class="grid__cell--1 grid__cell--3/5@desktop grid__cell--4/5@kiosk c-customerprofile-firstname js-profileFirstName" value="">
		<input type="text" id="Last_Name" name="Last_Name" maxlength="40" class="grid__cell--1 grid__cell--3/5@desktop grid__cell--4/5@kiosk c-customerprofile-lastname js-profileLastName" value="">
		<input type="email" id="Email" name="Email" maxlength="100" class="form__input--block js-email c-customerprofile-email" value="">
		<input type="email" id="Confirm_Email" name="Confirm_Email" maxlength="100" class="form__input--block js-confirmEmail c-customerprofile-confirmemail" value="">
		<input type="tel" id="Phone" name="Phone" maxlength="14" placeholder="Phone" class="grid__cell--3/5 js-phone c-customerprofile-phone" value="" data-error-classes="grid__cell grid__cell--1 customerprofile--error--phone">
		<input type="password" id="Create_Password" name="Create_Password" maxlength="40" class="grid__cell--3/5@desktop grid__cell--1 c-customerprofile-createpassword">
		<input type="password" id="Confirm_Password" name="Confirm_Password" maxlength="40" class="grid__cell--3/5@desktop js-confirmPassword grid__cell--1 c-customerprofile-confirmpassword">
		<input type="checkbox" data-dpz-track-evt-name="Rewards Opt In Checkbox" class="checkbox js-loyaltyOptIn profile--create__loyalty-enroll--checkbox" id="Loyalty_Opt_In" name="Loyalty_Opt_In">
		<input type="checkbox" class="checkbox js-emailOptIn c-customerprofile-emailoptin" id="Email_Opt_In" checked="" name="Email_Opt_In">
		<button class="btn profile--create__cta c-customerprofile-createyourprofile" type="submit"> <span>  Create Your Profile  </span> </button>
*/		
	}
	
	/*Returns Order Now button(s)
	 * 
	*/
	public static WebElement orderNowBtn() {
		element = driver.findElement(By.id("btn-599mixmatch"));
		return element;
	}

	public static void hoverMainCoupon() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-599mixmatch']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickMainCoupon() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-599mixmatch']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}	
	
	public static void hoverSideTop() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-Side899Pan']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickSideTop() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-Side899Pan']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}
	
	public static void hoverSideBottom() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-WeekLongCarryoutSide']"));

		OpenLinks.hoverOver(element);
	}

	public static void clickSideBottom() throws InterruptedException {
		element = driver.findElement(By.xpath("//button[@data-quid='btn-WeekLongCarryoutSide']"));
		OpenLinks.hoverOver(element);
		element.click();
		
	}
		
}
